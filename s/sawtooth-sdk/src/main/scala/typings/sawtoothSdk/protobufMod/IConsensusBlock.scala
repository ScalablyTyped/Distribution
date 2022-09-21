package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IConsensusBlock extends StObject {
  
  /** ConsensusBlock blockId */
  var blockId: js.UndefOr[js.typedarray.Uint8Array | Null] = js.undefined
  
  /** ConsensusBlock blockNum */
  var blockNum: js.UndefOr[
    Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any) | Null
  ] = js.undefined
  
  /** ConsensusBlock payload */
  var payload: js.UndefOr[js.typedarray.Uint8Array | Null] = js.undefined
  
  /** ConsensusBlock previousId */
  var previousId: js.UndefOr[js.typedarray.Uint8Array | Null] = js.undefined
  
  /** ConsensusBlock signerId */
  var signerId: js.UndefOr[js.typedarray.Uint8Array | Null] = js.undefined
  
  /** ConsensusBlock summary */
  var summary: js.UndefOr[js.typedarray.Uint8Array | Null] = js.undefined
}
object IConsensusBlock {
  
  inline def apply(): IConsensusBlock = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusBlock]
  }
  
  extension [Self <: IConsensusBlock](x: Self) {
    
    inline def setBlockId(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blockId", value.asInstanceOf[js.Any])
    
    inline def setBlockIdNull: Self = StObject.set(x, "blockId", null)
    
    inline def setBlockIdUndefined: Self = StObject.set(x, "blockId", js.undefined)
    
    inline def setBlockNum(
      value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any)
    ): Self = StObject.set(x, "blockNum", value.asInstanceOf[js.Any])
    
    inline def setBlockNumNull: Self = StObject.set(x, "blockNum", null)
    
    inline def setBlockNumUndefined: Self = StObject.set(x, "blockNum", js.undefined)
    
    inline def setPayload(value: js.typedarray.Uint8Array): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadNull: Self = StObject.set(x, "payload", null)
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    inline def setPreviousId(value: js.typedarray.Uint8Array): Self = StObject.set(x, "previousId", value.asInstanceOf[js.Any])
    
    inline def setPreviousIdNull: Self = StObject.set(x, "previousId", null)
    
    inline def setPreviousIdUndefined: Self = StObject.set(x, "previousId", js.undefined)
    
    inline def setSignerId(value: js.typedarray.Uint8Array): Self = StObject.set(x, "signerId", value.asInstanceOf[js.Any])
    
    inline def setSignerIdNull: Self = StObject.set(x, "signerId", null)
    
    inline def setSignerIdUndefined: Self = StObject.set(x, "signerId", js.undefined)
    
    inline def setSummary(value: js.typedarray.Uint8Array): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setSummaryNull: Self = StObject.set(x, "summary", null)
    
    inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
  }
}
