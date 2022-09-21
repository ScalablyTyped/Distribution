package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ConsensusFinalizeBlockResponse.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IConsensusFinalizeBlockResponse extends StObject {
  
  /** ConsensusFinalizeBlockResponse blockId */
  var blockId: js.UndefOr[js.typedarray.Uint8Array | Null] = js.undefined
  
  /** ConsensusFinalizeBlockResponse status */
  var status: js.UndefOr[Status | Null] = js.undefined
}
object IConsensusFinalizeBlockResponse {
  
  inline def apply(): IConsensusFinalizeBlockResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusFinalizeBlockResponse]
  }
  
  extension [Self <: IConsensusFinalizeBlockResponse](x: Self) {
    
    inline def setBlockId(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blockId", value.asInstanceOf[js.Any])
    
    inline def setBlockIdNull: Self = StObject.set(x, "blockId", null)
    
    inline def setBlockIdUndefined: Self = StObject.set(x, "blockId", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
