package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaKeyMessageEventInit extends EventInit {
  
  var message: ArrayBuffer = js.native
  
  var messageType: MediaKeyMessageType = js.native
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
