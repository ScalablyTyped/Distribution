package typings.slackMock.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Instance_ extends StObject {
  
  var events: Events[js.Any]
  
  var incomingWebhooks: IncomingWebhooks[js.Any]
  
  var interactiveButtons: InteractiveButtons[js.Any]
  
  var outgoingWebhooks: OutgoingWebhooks[js.Any]
  
  def reset(): Unit
  
  var rtm: Rtm[js.Any]
  
  var slashCommands: SlashCommands[js.Any]
  
  var web: Web[js.Any]
}
object Instance_ {
  
  inline def apply(
    events: Events[js.Any],
    incomingWebhooks: IncomingWebhooks[js.Any],
    interactiveButtons: InteractiveButtons[js.Any],
    outgoingWebhooks: OutgoingWebhooks[js.Any],
    reset: () => Unit,
    rtm: Rtm[js.Any],
    slashCommands: SlashCommands[js.Any],
    web: Web[js.Any]
  ): Instance_ = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], incomingWebhooks = incomingWebhooks.asInstanceOf[js.Any], interactiveButtons = interactiveButtons.asInstanceOf[js.Any], outgoingWebhooks = outgoingWebhooks.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), rtm = rtm.asInstanceOf[js.Any], slashCommands = slashCommands.asInstanceOf[js.Any], web = web.asInstanceOf[js.Any])
    __obj.asInstanceOf[Instance_]
  }
  
  extension [Self <: Instance_](x: Self) {
    
    inline def setEvents(value: Events[js.Any]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setIncomingWebhooks(value: IncomingWebhooks[js.Any]): Self = StObject.set(x, "incomingWebhooks", value.asInstanceOf[js.Any])
    
    inline def setInteractiveButtons(value: InteractiveButtons[js.Any]): Self = StObject.set(x, "interactiveButtons", value.asInstanceOf[js.Any])
    
    inline def setOutgoingWebhooks(value: OutgoingWebhooks[js.Any]): Self = StObject.set(x, "outgoingWebhooks", value.asInstanceOf[js.Any])
    
    inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    inline def setRtm(value: Rtm[js.Any]): Self = StObject.set(x, "rtm", value.asInstanceOf[js.Any])
    
    inline def setSlashCommands(value: SlashCommands[js.Any]): Self = StObject.set(x, "slashCommands", value.asInstanceOf[js.Any])
    
    inline def setWeb(value: Web[js.Any]): Self = StObject.set(x, "web", value.asInstanceOf[js.Any])
  }
}
