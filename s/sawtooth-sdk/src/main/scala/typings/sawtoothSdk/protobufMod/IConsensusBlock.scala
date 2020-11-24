package typings.sawtoothSdk.protobufMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IConsensusBlock extends js.Object {
  
  /** ConsensusBlock blockId */
  var blockId: js.UndefOr[Uint8Array | Null] = js.native
  
  /** ConsensusBlock blockNum */
  var blockNum: js.UndefOr[
    Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) | Null
  ] = js.native
  
  /** ConsensusBlock payload */
  var payload: js.UndefOr[Uint8Array | Null] = js.native
  
  /** ConsensusBlock previousId */
  var previousId: js.UndefOr[Uint8Array | Null] = js.native
  
  /** ConsensusBlock signerId */
  var signerId: js.UndefOr[Uint8Array | Null] = js.native
  
  /** ConsensusBlock summary */
  var summary: js.UndefOr[Uint8Array | Null] = js.native
}
object IConsensusBlock {
  
  @scala.inline
  def apply(): IConsensusBlock = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusBlock]
  }
  
  @scala.inline
  implicit class IConsensusBlockOps[Self <: IConsensusBlock] (val x: Self) extends AnyVal {
    
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
    def setBlockId(value: Uint8Array): Self = this.set("blockId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockId: Self = this.set("blockId", js.undefined)
    
    @scala.inline
    def setBlockIdNull: Self = this.set("blockId", null)
    
    @scala.inline
    def setBlockNum(
      value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any)
    ): Self = this.set("blockNum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockNum: Self = this.set("blockNum", js.undefined)
    
    @scala.inline
    def setBlockNumNull: Self = this.set("blockNum", null)
    
    @scala.inline
    def setPayload(value: Uint8Array): Self = this.set("payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayload: Self = this.set("payload", js.undefined)
    
    @scala.inline
    def setPayloadNull: Self = this.set("payload", null)
    
    @scala.inline
    def setPreviousId(value: Uint8Array): Self = this.set("previousId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviousId: Self = this.set("previousId", js.undefined)
    
    @scala.inline
    def setPreviousIdNull: Self = this.set("previousId", null)
    
    @scala.inline
    def setSignerId(value: Uint8Array): Self = this.set("signerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignerId: Self = this.set("signerId", js.undefined)
    
    @scala.inline
    def setSignerIdNull: Self = this.set("signerId", null)
    
    @scala.inline
    def setSummary(value: Uint8Array): Self = this.set("summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSummary: Self = this.set("summary", js.undefined)
    
    @scala.inline
    def setSummaryNull: Self = this.set("summary", null)
  }
}
