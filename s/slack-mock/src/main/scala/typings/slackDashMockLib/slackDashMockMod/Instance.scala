package typings
package slackDashMockLib.slackDashMockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Instance extends js.Object {
  var events: Events[_]
  var incomingWebhooks: IncomingWebhooks[_]
  var interactiveButtons: InteractiveButtons[_]
  var outgoingWebhooks: OutgoingWebhooks[_]
  var rtm: Rtm[_]
  var slashCommands: SlashCommands[_]
  var web: Web[_]
  def reset(): scala.Unit
}

object Instance {
  @scala.inline
  def apply(
    events: Events[_],
    incomingWebhooks: IncomingWebhooks[_],
    interactiveButtons: InteractiveButtons[_],
    outgoingWebhooks: OutgoingWebhooks[_],
    reset: () => scala.Unit,
    rtm: Rtm[_],
    slashCommands: SlashCommands[_],
    web: Web[_]
  ): Instance = {
    val __obj = js.Dynamic.literal(events = events, incomingWebhooks = incomingWebhooks, interactiveButtons = interactiveButtons, outgoingWebhooks = outgoingWebhooks, reset = js.Any.fromFunction0(reset), rtm = rtm, slashCommands = slashCommands, web = web)
  
    __obj.asInstanceOf[Instance]
  }
}

