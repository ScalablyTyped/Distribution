package typings.pusherJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcCoreConnectionProtocolMessageTypesMod {
  
  trait PusherEvent extends StObject {
    
    var channel: js.UndefOr[String] = js.undefined
    
    var data: js.UndefOr[Any] = js.undefined
    
    var event: String
    
    var user_id: js.UndefOr[String] = js.undefined
  }
  object PusherEvent {
    
    inline def apply(event: String): PusherEvent = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
      __obj.asInstanceOf[PusherEvent]
    }
    
    extension [Self <: PusherEvent](x: Self) {
      
      inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setUser_id(value: String): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
      
      inline def setUser_idUndefined: Self = StObject.set(x, "user_id", js.undefined)
    }
  }
}
