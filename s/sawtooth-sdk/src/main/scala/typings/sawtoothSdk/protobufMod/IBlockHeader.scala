package typings.sawtoothSdk.protobufMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBlockHeader extends js.Object {
  
  /** BlockHeader batchIds */
  var batchIds: js.UndefOr[js.Array[String] | Null] = js.native
  
  /** BlockHeader blockNum */
  var blockNum: js.UndefOr[
    Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) | Null
  ] = js.native
  
  /** BlockHeader consensus */
  var consensus: js.UndefOr[Uint8Array | Null] = js.native
  
  /** BlockHeader previousBlockId */
  var previousBlockId: js.UndefOr[String | Null] = js.native
  
  /** BlockHeader signerPublicKey */
  var signerPublicKey: js.UndefOr[String | Null] = js.native
  
  /** BlockHeader stateRootHash */
  var stateRootHash: js.UndefOr[String | Null] = js.native
}
object IBlockHeader {
  
  @scala.inline
  def apply(): IBlockHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBlockHeader]
  }
  
  @scala.inline
  implicit class IBlockHeaderOps[Self <: IBlockHeader] (val x: Self) extends AnyVal {
    
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
    def setBatchIdsVarargs(value: String*): Self = this.set("batchIds", js.Array(value :_*))
    
    @scala.inline
    def setBatchIds(value: js.Array[String]): Self = this.set("batchIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBatchIds: Self = this.set("batchIds", js.undefined)
    
    @scala.inline
    def setBatchIdsNull: Self = this.set("batchIds", null)
    
    @scala.inline
    def setBlockNum(
      value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any)
    ): Self = this.set("blockNum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockNum: Self = this.set("blockNum", js.undefined)
    
    @scala.inline
    def setBlockNumNull: Self = this.set("blockNum", null)
    
    @scala.inline
    def setConsensus(value: Uint8Array): Self = this.set("consensus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConsensus: Self = this.set("consensus", js.undefined)
    
    @scala.inline
    def setConsensusNull: Self = this.set("consensus", null)
    
    @scala.inline
    def setPreviousBlockId(value: String): Self = this.set("previousBlockId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviousBlockId: Self = this.set("previousBlockId", js.undefined)
    
    @scala.inline
    def setPreviousBlockIdNull: Self = this.set("previousBlockId", null)
    
    @scala.inline
    def setSignerPublicKey(value: String): Self = this.set("signerPublicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignerPublicKey: Self = this.set("signerPublicKey", js.undefined)
    
    @scala.inline
    def setSignerPublicKeyNull: Self = this.set("signerPublicKey", null)
    
    @scala.inline
    def setStateRootHash(value: String): Self = this.set("stateRootHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStateRootHash: Self = this.set("stateRootHash", js.undefined)
    
    @scala.inline
    def setStateRootHashNull: Self = this.set("stateRootHash", null)
  }
}
