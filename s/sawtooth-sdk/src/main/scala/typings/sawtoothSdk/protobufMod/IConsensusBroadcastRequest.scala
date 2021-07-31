package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IConsensusBroadcastRequest extends StObject {
  
  /** ConsensusBroadcastRequest message */
  var message: js.UndefOr[IConsensusPeerMessage | Null] = js.undefined
}
object IConsensusBroadcastRequest {
  
  @scala.inline
  def apply(): IConsensusBroadcastRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusBroadcastRequest]
  }
  
  @scala.inline
  implicit class IConsensusBroadcastRequestMutableBuilder[Self <: IConsensusBroadcastRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: IConsensusPeerMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageNull: Self = StObject.set(x, "message", null)
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
