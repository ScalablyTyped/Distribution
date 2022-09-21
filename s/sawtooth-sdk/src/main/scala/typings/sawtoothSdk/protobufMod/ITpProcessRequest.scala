package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITpProcessRequest extends StObject {
  
  /** TpProcessRequest contextId */
  var contextId: js.UndefOr[String | Null] = js.undefined
  
  /** TpProcessRequest header */
  var header: js.UndefOr[ITransactionHeader | Null] = js.undefined
  
  /** TpProcessRequest payload */
  var payload: js.UndefOr[js.typedarray.Uint8Array | Null] = js.undefined
  
  /** TpProcessRequest signature */
  var signature: js.UndefOr[String | Null] = js.undefined
}
object ITpProcessRequest {
  
  inline def apply(): ITpProcessRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITpProcessRequest]
  }
  
  extension [Self <: ITpProcessRequest](x: Self) {
    
    inline def setContextId(value: String): Self = StObject.set(x, "contextId", value.asInstanceOf[js.Any])
    
    inline def setContextIdNull: Self = StObject.set(x, "contextId", null)
    
    inline def setContextIdUndefined: Self = StObject.set(x, "contextId", js.undefined)
    
    inline def setHeader(value: ITransactionHeader): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderNull: Self = StObject.set(x, "header", null)
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setPayload(value: js.typedarray.Uint8Array): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadNull: Self = StObject.set(x, "payload", null)
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureNull: Self = StObject.set(x, "signature", null)
    
    inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
  }
}
