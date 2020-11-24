package typings.scratchEnv

import typings.scratchEnv.Scratch.BlockType
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** All the metadata needed to register an extension block. */
@js.native
trait ExtensionBlockMetadata extends js.Object {
  
  /** Map of argument placeholder to metadata about each arg. */
  var arguments: js.UndefOr[Record[String, ExtensionArgumentMetadata]] = js.native
  
  /** The type of block (command, reporter, etc.) being described. */
  var blockType: ValueOf[BlockType] = js.native
  
  /** For flow control blocks, the number of branches/substacks for this block. */
  var branchCount: js.UndefOr[Double] = js.native
  
  /** Whether this block is a reporter but should not allow a monitor. */
  var disableMonitor: js.UndefOr[Boolean] = js.native
  
  /** The name of the function implementing this block. Can be shared by other blocks/opcodes. */
  var func: js.UndefOr[String] = js.native
  
  /** Whether this block should not appear in the block palette. */
  var hideFromPalette: js.UndefOr[Boolean] = js.native
  
  /** Whether a hat block is edge-activated. */
  var isEdgeActivated: js.UndefOr[Boolean] = js.native
  
  /** Whether the block ends a stack - no blocks can be connected after it. */
  var isTerminal: js.UndefOr[Boolean] = js.native
  
  /** A unique alphanumeric identifier for this block. No special characters allowed. */
  var opcode: String = js.native
  
  /** If this block is a reporter, this is the scope/context for its value. */
  var reporterScope: js.UndefOr[ReporterScope] = js.native
  
  /** Whether a hat/event block should restart existing threads. */
  var shouldRestartExistingThreads: js.UndefOr[Boolean] = js.native
  
  /** The text on the block, with [PLACEHOLDERS] for arguments. */
  var text: String = js.native
}
object ExtensionBlockMetadata {
  
  @scala.inline
  def apply(blockType: ValueOf[BlockType], opcode: String, text: String): ExtensionBlockMetadata = {
    val __obj = js.Dynamic.literal(blockType = blockType.asInstanceOf[js.Any], opcode = opcode.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionBlockMetadata]
  }
  
  @scala.inline
  implicit class ExtensionBlockMetadataOps[Self <: ExtensionBlockMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBlockType(value: ValueOf[BlockType]): Self = this.set("blockType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpcode(value: String): Self = this.set("opcode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArguments(value: Record[String, ExtensionArgumentMetadata]): Self = this.set("arguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArguments: Self = this.set("arguments", js.undefined)
    
    @scala.inline
    def setBranchCount(value: Double): Self = this.set("branchCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBranchCount: Self = this.set("branchCount", js.undefined)
    
    @scala.inline
    def setDisableMonitor(value: Boolean): Self = this.set("disableMonitor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableMonitor: Self = this.set("disableMonitor", js.undefined)
    
    @scala.inline
    def setFunc(value: String): Self = this.set("func", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFunc: Self = this.set("func", js.undefined)
    
    @scala.inline
    def setHideFromPalette(value: Boolean): Self = this.set("hideFromPalette", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideFromPalette: Self = this.set("hideFromPalette", js.undefined)
    
    @scala.inline
    def setIsEdgeActivated(value: Boolean): Self = this.set("isEdgeActivated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsEdgeActivated: Self = this.set("isEdgeActivated", js.undefined)
    
    @scala.inline
    def setIsTerminal(value: Boolean): Self = this.set("isTerminal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsTerminal: Self = this.set("isTerminal", js.undefined)
    
    @scala.inline
    def setReporterScope(value: ReporterScope): Self = this.set("reporterScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReporterScope: Self = this.set("reporterScope", js.undefined)
    
    @scala.inline
    def setShouldRestartExistingThreads(value: Boolean): Self = this.set("shouldRestartExistingThreads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShouldRestartExistingThreads: Self = this.set("shouldRestartExistingThreads", js.undefined)
  }
}
