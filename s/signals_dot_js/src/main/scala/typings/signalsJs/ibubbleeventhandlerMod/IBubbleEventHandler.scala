package typings.signalsJs.ibubbleeventhandlerMod

import typings.signalsJs.ieventMod.IEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBubbleEventHandler extends js.Object {
  /**
    * Handler for event bubbling.
    * It's left to the IBubbleEventHandler to decide what to do with the event.
    * @param    event The event that bubbled up.
    * @return whether to continue bubbling this event
    */
  def onEventBubbled(event: IEvent): Boolean = js.native
}

object IBubbleEventHandler {
  @scala.inline
  def apply(onEventBubbled: IEvent => Boolean): IBubbleEventHandler = {
    val __obj = js.Dynamic.literal(onEventBubbled = js.Any.fromFunction1(onEventBubbled))
    __obj.asInstanceOf[IBubbleEventHandler]
  }
  @scala.inline
  implicit class IBubbleEventHandlerOps[Self <: IBubbleEventHandler] (val x: Self) extends AnyVal {
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
    def setOnEventBubbled(value: IEvent => Boolean): Self = this.set("onEventBubbled", js.Any.fromFunction1(value))
  }
  
}

