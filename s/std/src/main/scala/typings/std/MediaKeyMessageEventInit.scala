package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaKeyMessageEventInit
  extends StObject
     with EventInit {
  
  var message: ArrayBuffer
  
  var messageType: MediaKeyMessageType
}
object MediaKeyMessageEventInit {
  
  @scala.inline
  def apply(message: ArrayBuffer, messageType: MediaKeyMessageType): MediaKeyMessageEventInit = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], messageType = messageType.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaKeyMessageEventInit]
  }
  
  @scala.inline
  implicit class MediaKeyMessageEventInitMutableBuilder[Self <: MediaKeyMessageEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: ArrayBuffer): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageType(value: MediaKeyMessageType): Self = StObject.set(x, "messageType", value.asInstanceOf[js.Any])
  }
}
