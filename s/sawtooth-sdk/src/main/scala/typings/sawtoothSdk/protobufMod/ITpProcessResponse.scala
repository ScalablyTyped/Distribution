package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.TpProcessResponse.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITpProcessResponse extends StObject {
  
  /** TpProcessResponse extendedData */
  var extendedData: js.UndefOr[js.typedarray.Uint8Array | Null] = js.undefined
  
  /** TpProcessResponse message */
  var message: js.UndefOr[String | Null] = js.undefined
  
  /** TpProcessResponse status */
  var status: js.UndefOr[Status | Null] = js.undefined
}
object ITpProcessResponse {
  
  inline def apply(): ITpProcessResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITpProcessResponse]
  }
  
  extension [Self <: ITpProcessResponse](x: Self) {
    
    inline def setExtendedData(value: js.typedarray.Uint8Array): Self = StObject.set(x, "extendedData", value.asInstanceOf[js.Any])
    
    inline def setExtendedDataNull: Self = StObject.set(x, "extendedData", null)
    
    inline def setExtendedDataUndefined: Self = StObject.set(x, "extendedData", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageNull: Self = StObject.set(x, "message", null)
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
