package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BroadcastChannelEventMap extends StObject {
  
  var message: MessageEvent[js.Any]
  
  var messageerror: MessageEvent[js.Any]
}
object BroadcastChannelEventMap {
  
  @scala.inline
  def apply(message: MessageEvent[js.Any], messageerror: MessageEvent[js.Any]): BroadcastChannelEventMap = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], messageerror = messageerror.asInstanceOf[js.Any])
    __obj.asInstanceOf[BroadcastChannelEventMap]
  }
  
  @scala.inline
  implicit class BroadcastChannelEventMapMutableBuilder[Self <: BroadcastChannelEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: MessageEvent[js.Any]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageerror(value: MessageEvent[js.Any]): Self = StObject.set(x, "messageerror", value.asInstanceOf[js.Any])
  }
}
