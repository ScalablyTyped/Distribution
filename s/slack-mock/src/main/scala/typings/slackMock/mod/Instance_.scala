package typings.slackMock.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Instance_ extends js.Object {
  var events: Events[_]
  var incomingWebhooks: IncomingWebhooks[_]
  var interactiveButtons: InteractiveButtons[_]
  var outgoingWebhooks: OutgoingWebhooks[_]
  var rtm: Rtm[_]
  var slashCommands: SlashCommands[_]
  var web: Web[_]
  def reset(): Unit
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
}

