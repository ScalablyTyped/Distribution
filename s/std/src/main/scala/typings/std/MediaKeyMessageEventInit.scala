package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaKeyMessageEventInit
  extends StObject
     with EventInit {
  
  /* standard dom */
  var message: js.typedarray.ArrayBuffer
  
  /* standard dom */
  var messageType: MediaKeyMessageType
}
object MediaKeyMessageEventInit {
  
  inline def apply(message: js.typedarray.ArrayBuffer, messageType: MediaKeyMessageType): MediaKeyMessageEventInit = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], messageType = messageType.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaKeyMessageEventInit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaKeyMessageEventInit] (val x: Self) extends AnyVal {
    
    inline def setMessage(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageType(value: MediaKeyMessageType): Self = StObject.set(x, "messageType", value.asInstanceOf[js.Any])
  }
}
