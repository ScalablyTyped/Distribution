package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IConsensusSendToRequest extends StObject {
  
  /** ConsensusSendToRequest message */
  var message: js.UndefOr[IConsensusPeerMessage | Null] = js.undefined
  
  /** ConsensusSendToRequest peerId */
  var peerId: js.UndefOr[js.typedarray.Uint8Array | Null] = js.undefined
}
object IConsensusSendToRequest {
  
  inline def apply(): IConsensusSendToRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusSendToRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IConsensusSendToRequest] (val x: Self) extends AnyVal {
    
    inline def setMessage(value: IConsensusPeerMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageNull: Self = StObject.set(x, "message", null)
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setPeerId(value: js.typedarray.Uint8Array): Self = StObject.set(x, "peerId", value.asInstanceOf[js.Any])
    
    inline def setPeerIdNull: Self = StObject.set(x, "peerId", null)
    
    inline def setPeerIdUndefined: Self = StObject.set(x, "peerId", js.undefined)
  }
}
