package typings.scratchEnv

import typings.scratchEnv.Scratch.BlockType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** All the metadata needed to register an extension block. */
@js.native
trait ExtensionBlockMetadata extends StObject {
  
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
  implicit class ExtensionBlockMetadataMutableBuilder[Self <: ExtensionBlockMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArguments(value: Record[String, ExtensionArgumentMetadata]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
    
    @scala.inline
    def setBlockType(value: ValueOf[BlockType]): Self = StObject.set(x, "blockType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBranchCount(value: Double): Self = StObject.set(x, "branchCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBranchCountUndefined: Self = StObject.set(x, "branchCount", js.undefined)
    
    @scala.inline
    def setDisableMonitor(value: Boolean): Self = StObject.set(x, "disableMonitor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableMonitorUndefined: Self = StObject.set(x, "disableMonitor", js.undefined)
    
    @scala.inline
    def setFunc(value: String): Self = StObject.set(x, "func", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFuncUndefined: Self = StObject.set(x, "func", js.undefined)
    
    @scala.inline
    def setHideFromPalette(value: Boolean): Self = StObject.set(x, "hideFromPalette", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideFromPaletteUndefined: Self = StObject.set(x, "hideFromPalette", js.undefined)
    
    @scala.inline
    def setIsEdgeActivated(value: Boolean): Self = StObject.set(x, "isEdgeActivated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEdgeActivatedUndefined: Self = StObject.set(x, "isEdgeActivated", js.undefined)
    
    @scala.inline
    def setIsTerminal(value: Boolean): Self = StObject.set(x, "isTerminal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsTerminalUndefined: Self = StObject.set(x, "isTerminal", js.undefined)
    
    @scala.inline
    def setOpcode(value: String): Self = StObject.set(x, "opcode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReporterScope(value: ReporterScope): Self = StObject.set(x, "reporterScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReporterScopeUndefined: Self = StObject.set(x, "reporterScope", js.undefined)
    
    @scala.inline
    def setShouldRestartExistingThreads(value: Boolean): Self = StObject.set(x, "shouldRestartExistingThreads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShouldRestartExistingThreadsUndefined: Self = StObject.set(x, "shouldRestartExistingThreads", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
