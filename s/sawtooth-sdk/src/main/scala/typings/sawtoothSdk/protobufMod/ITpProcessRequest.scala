package typings.sawtoothSdk.protobufMod

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITpProcessRequest extends StObject {
  
  /** TpProcessRequest contextId */
  var contextId: js.UndefOr[String | Null] = js.native
  
  /** TpProcessRequest header */
  var header: js.UndefOr[ITransactionHeader | Null] = js.native
  
  /** TpProcessRequest payload */
  var payload: js.UndefOr[Uint8Array | Null] = js.native
  
  /** TpProcessRequest signature */
  var signature: js.UndefOr[String | Null] = js.native
}
object ITpProcessRequest {
  
  @scala.inline
  def apply(): ITpProcessRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITpProcessRequest]
  }
  
  @scala.inline
  implicit class ITpProcessRequestMutableBuilder[Self <: ITpProcessRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContextId(value: String): Self = StObject.set(x, "contextId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextIdNull: Self = StObject.set(x, "contextId", null)
    
    @scala.inline
    def setContextIdUndefined: Self = StObject.set(x, "contextId", js.undefined)
    
    @scala.inline
    def setHeader(value: ITransactionHeader): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderNull: Self = StObject.set(x, "header", null)
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    @scala.inline
    def setPayload(value: Uint8Array): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadNull: Self = StObject.set(x, "payload", null)
    
    @scala.inline
    def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    @scala.inline
    def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureNull: Self = StObject.set(x, "signature", null)
    
    @scala.inline
    def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
  }
}
