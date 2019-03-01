package typings
package slackDashMockLib.slackDashMockMod.SlackMockNs

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
    reset: js.Function0[scala.Unit],
    rtm: Rtm[_],
    slashCommands: SlashCommands[_],
    web: Web[_]
  ): Instance = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("events")(events)
    __obj.updateDynamic("incomingWebhooks")(incomingWebhooks)
    __obj.updateDynamic("interactiveButtons")(interactiveButtons)
    __obj.updateDynamic("outgoingWebhooks")(outgoingWebhooks)
    __obj.updateDynamic("reset")(reset)
    __obj.updateDynamic("rtm")(rtm)
    __obj.updateDynamic("slashCommands")(slashCommands)
    __obj.updateDynamic("web")(web)
    __obj.asInstanceOf[Instance]
  }
}

