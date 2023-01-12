package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IConsensusBroadcastRequest extends StObject {
  
  /** ConsensusBroadcastRequest message */
  var message: js.UndefOr[IConsensusPeerMessage | Null] = js.undefined
}
object IConsensusBroadcastRequest {
  
  inline def apply(): IConsensusBroadcastRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusBroadcastRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IConsensusBroadcastRequest] (val x: Self) extends AnyVal {
    
    inline def setMessage(value: IConsensusPeerMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageNull: Self = StObject.set(x, "message", null)
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
