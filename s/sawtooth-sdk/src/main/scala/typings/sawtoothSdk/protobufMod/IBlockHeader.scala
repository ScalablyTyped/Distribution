package typings.sawtoothSdk.protobufMod

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBlockHeader extends StObject {
  
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
  implicit class IBlockHeaderMutableBuilder[Self <: IBlockHeader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatchIds(value: js.Array[String]): Self = StObject.set(x, "batchIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchIdsNull: Self = StObject.set(x, "batchIds", null)
    
    @scala.inline
    def setBatchIdsUndefined: Self = StObject.set(x, "batchIds", js.undefined)
    
    @scala.inline
    def setBatchIdsVarargs(value: String*): Self = StObject.set(x, "batchIds", js.Array(value :_*))
    
    @scala.inline
    def setBlockNum(
      value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any)
    ): Self = StObject.set(x, "blockNum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockNumNull: Self = StObject.set(x, "blockNum", null)
    
    @scala.inline
    def setBlockNumUndefined: Self = StObject.set(x, "blockNum", js.undefined)
    
    @scala.inline
    def setConsensus(value: Uint8Array): Self = StObject.set(x, "consensus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsensusNull: Self = StObject.set(x, "consensus", null)
    
    @scala.inline
    def setConsensusUndefined: Self = StObject.set(x, "consensus", js.undefined)
    
    @scala.inline
    def setPreviousBlockId(value: String): Self = StObject.set(x, "previousBlockId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousBlockIdNull: Self = StObject.set(x, "previousBlockId", null)
    
    @scala.inline
    def setPreviousBlockIdUndefined: Self = StObject.set(x, "previousBlockId", js.undefined)
    
    @scala.inline
    def setSignerPublicKey(value: String): Self = StObject.set(x, "signerPublicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignerPublicKeyNull: Self = StObject.set(x, "signerPublicKey", null)
    
    @scala.inline
    def setSignerPublicKeyUndefined: Self = StObject.set(x, "signerPublicKey", js.undefined)
    
    @scala.inline
    def setStateRootHash(value: String): Self = StObject.set(x, "stateRootHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateRootHashNull: Self = StObject.set(x, "stateRootHash", null)
    
    @scala.inline
    def setStateRootHashUndefined: Self = StObject.set(x, "stateRootHash", js.undefined)
  }
}
