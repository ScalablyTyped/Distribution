package typings.slackMock.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Instance_ extends StObject {
  
  var events: Events[Any]
  
  var incomingWebhooks: IncomingWebhooks[Any]
  
  var interactiveButtons: InteractiveButtons[Any]
  
  var outgoingWebhooks: OutgoingWebhooks[Any]
  
  def reset(): Unit
  
  var rtm: Rtm[Any]
  
  var slashCommands: SlashCommands[Any]
  
  var web: Web[Any]
}
object Instance_ {
  
  inline def apply(
    events: Events[Any],
    incomingWebhooks: IncomingWebhooks[Any],
    interactiveButtons: InteractiveButtons[Any],
    outgoingWebhooks: OutgoingWebhooks[Any],
    reset: () => Unit,
    rtm: Rtm[Any],
    slashCommands: SlashCommands[Any],
    web: Web[Any]
  ): Instance_ = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], incomingWebhooks = incomingWebhooks.asInstanceOf[js.Any], interactiveButtons = interactiveButtons.asInstanceOf[js.Any], outgoingWebhooks = outgoingWebhooks.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), rtm = rtm.asInstanceOf[js.Any], slashCommands = slashCommands.asInstanceOf[js.Any], web = web.asInstanceOf[js.Any])
    __obj.asInstanceOf[Instance_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Instance_] (val x: Self) extends AnyVal {
    
    inline def setEvents(value: Events[Any]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setIncomingWebhooks(value: IncomingWebhooks[Any]): Self = StObject.set(x, "incomingWebhooks", value.asInstanceOf[js.Any])
    
    inline def setInteractiveButtons(value: InteractiveButtons[Any]): Self = StObject.set(x, "interactiveButtons", value.asInstanceOf[js.Any])
    
    inline def setOutgoingWebhooks(value: OutgoingWebhooks[Any]): Self = StObject.set(x, "outgoingWebhooks", value.asInstanceOf[js.Any])
    
    inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    inline def setRtm(value: Rtm[Any]): Self = StObject.set(x, "rtm", value.asInstanceOf[js.Any])
    
    inline def setSlashCommands(value: SlashCommands[Any]): Self = StObject.set(x, "slashCommands", value.asInstanceOf[js.Any])
    
    inline def setWeb(value: Web[Any]): Self = StObject.set(x, "web", value.asInstanceOf[js.Any])
  }
}
