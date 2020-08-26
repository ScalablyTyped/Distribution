package typings.slackMock.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Instance_ extends js.Object {
  var events: Events[_] = js.native
  var incomingWebhooks: IncomingWebhooks[_] = js.native
  var interactiveButtons: InteractiveButtons[_] = js.native
  var outgoingWebhooks: OutgoingWebhooks[_] = js.native
  var rtm: Rtm[_] = js.native
  var slashCommands: SlashCommands[_] = js.native
  var web: Web[_] = js.native
  def reset(): Unit = js.native
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
  implicit class Instance_Ops[Self <: Instance_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEvents(value: Events[_]): Self = this.set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncomingWebhooks(value: IncomingWebhooks[_]): Self = this.set("incomingWebhooks", value.asInstanceOf[js.Any])
    @scala.inline
    def setInteractiveButtons(value: InteractiveButtons[_]): Self = this.set("interactiveButtons", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutgoingWebhooks(value: OutgoingWebhooks[_]): Self = this.set("outgoingWebhooks", value.asInstanceOf[js.Any])
    @scala.inline
    def setReset(value: () => Unit): Self = this.set("reset", js.Any.fromFunction0(value))
    @scala.inline
    def setRtm(value: Rtm[_]): Self = this.set("rtm", value.asInstanceOf[js.Any])
    @scala.inline
    def setSlashCommands(value: SlashCommands[_]): Self = this.set("slashCommands", value.asInstanceOf[js.Any])
    @scala.inline
    def setWeb(value: Web[_]): Self = this.set("web", value.asInstanceOf[js.Any])
  }
  
}

