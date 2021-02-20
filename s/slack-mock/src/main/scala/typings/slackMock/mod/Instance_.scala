package typings.slackMock.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Instance_ extends StObject {
  
  var events: Events[_] = js.native
  
  var incomingWebhooks: IncomingWebhooks[_] = js.native
  
  var interactiveButtons: InteractiveButtons[_] = js.native
  
  var outgoingWebhooks: OutgoingWebhooks[_] = js.native
  
  def reset(): Unit = js.native
  
  var rtm: Rtm[_] = js.native
  
  var slashCommands: SlashCommands[_] = js.native
  
  var web: Web[_] = js.native
}
object Instance_ {
  
  @scala.inline
  def apply(
    events: Events[_],
    incomingWebhooks: IncomingWebhooks[_],
    interactiveButtons: InteractiveButtons[_],
    outgoingWebhooks: OutgoingWebhooks[_],
    reset: () => Unit,
    rtm: Rtm[_],
    slashCommands: SlashCommands[_],
    web: Web[_]
  ): Instance_ = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], incomingWebhooks = incomingWebhooks.asInstanceOf[js.Any], interactiveButtons = interactiveButtons.asInstanceOf[js.Any], outgoingWebhooks = outgoingWebhooks.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), rtm = rtm.asInstanceOf[js.Any], slashCommands = slashCommands.asInstanceOf[js.Any], web = web.asInstanceOf[js.Any])
    __obj.asInstanceOf[Instance_]
  }
  
  @scala.inline
  implicit class Instance_MutableBuilder[Self <: Instance_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvents(value: Events[_]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncomingWebhooks(value: IncomingWebhooks[_]): Self = StObject.set(x, "incomingWebhooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInteractiveButtons(value: InteractiveButtons[_]): Self = StObject.set(x, "interactiveButtons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutgoingWebhooks(value: OutgoingWebhooks[_]): Self = StObject.set(x, "outgoingWebhooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRtm(value: Rtm[_]): Self = StObject.set(x, "rtm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlashCommands(value: SlashCommands[_]): Self = StObject.set(x, "slashCommands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeb(value: Web[_]): Self = StObject.set(x, "web", value.asInstanceOf[js.Any])
  }
}
