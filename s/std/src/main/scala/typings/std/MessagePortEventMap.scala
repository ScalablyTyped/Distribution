package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessagePortEventMap extends StObject {
  
  var message: MessageEvent[_] = js.native
  
  var messageerror: MessageEvent[_] = js.native
}
object MessagePortEventMap {
  
  @scala.inline
  def apply(message: MessageEvent[_], messageerror: MessageEvent[_]): MessagePortEventMap = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], messageerror = messageerror.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagePortEventMap]
  }
  
  @scala.inline
  implicit class MessagePortEventMapMutableBuilder[Self <: MessagePortEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: MessageEvent[_]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageerror(value: MessageEvent[_]): Self = StObject.set(x, "messageerror", value.asInstanceOf[js.Any])
  }
}
