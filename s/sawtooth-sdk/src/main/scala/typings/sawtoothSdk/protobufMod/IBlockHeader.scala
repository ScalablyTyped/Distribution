package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBlockHeader extends StObject {
  
  /** BlockHeader batchIds */
  var batchIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /** BlockHeader blockNum */
  var blockNum: js.UndefOr[
    Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any) | Null
  ] = js.undefined
  
  /** BlockHeader consensus */
  var consensus: js.UndefOr[js.typedarray.Uint8Array | Null] = js.undefined
  
  /** BlockHeader previousBlockId */
  var previousBlockId: js.UndefOr[String | Null] = js.undefined
  
  /** BlockHeader signerPublicKey */
  var signerPublicKey: js.UndefOr[String | Null] = js.undefined
  
  /** BlockHeader stateRootHash */
  var stateRootHash: js.UndefOr[String | Null] = js.undefined
}
object IBlockHeader {
  
  inline def apply(): IBlockHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBlockHeader]
  }
  
  extension [Self <: IBlockHeader](x: Self) {
    
    inline def setBatchIds(value: js.Array[String]): Self = StObject.set(x, "batchIds", value.asInstanceOf[js.Any])
    
    inline def setBatchIdsNull: Self = StObject.set(x, "batchIds", null)
    
    inline def setBatchIdsUndefined: Self = StObject.set(x, "batchIds", js.undefined)
    
    inline def setBatchIdsVarargs(value: String*): Self = StObject.set(x, "batchIds", js.Array(value*))
    
    inline def setBlockNum(
      value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any)
    ): Self = StObject.set(x, "blockNum", value.asInstanceOf[js.Any])
    
    inline def setBlockNumNull: Self = StObject.set(x, "blockNum", null)
    
    inline def setBlockNumUndefined: Self = StObject.set(x, "blockNum", js.undefined)
    
    inline def setConsensus(value: js.typedarray.Uint8Array): Self = StObject.set(x, "consensus", value.asInstanceOf[js.Any])
    
    inline def setConsensusNull: Self = StObject.set(x, "consensus", null)
    
    inline def setConsensusUndefined: Self = StObject.set(x, "consensus", js.undefined)
    
    inline def setPreviousBlockId(value: String): Self = StObject.set(x, "previousBlockId", value.asInstanceOf[js.Any])
    
    inline def setPreviousBlockIdNull: Self = StObject.set(x, "previousBlockId", null)
    
    inline def setPreviousBlockIdUndefined: Self = StObject.set(x, "previousBlockId", js.undefined)
    
    inline def setSignerPublicKey(value: String): Self = StObject.set(x, "signerPublicKey", value.asInstanceOf[js.Any])
    
    inline def setSignerPublicKeyNull: Self = StObject.set(x, "signerPublicKey", null)
    
    inline def setSignerPublicKeyUndefined: Self = StObject.set(x, "signerPublicKey", js.undefined)
    
    inline def setStateRootHash(value: String): Self = StObject.set(x, "stateRootHash", value.asInstanceOf[js.Any])
    
    inline def setStateRootHashNull: Self = StObject.set(x, "stateRootHash", null)
    
    inline def setStateRootHashUndefined: Self = StObject.set(x, "stateRootHash", js.undefined)
  }
}
