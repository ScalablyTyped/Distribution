package typings.sipml.SIPml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventTarget[EventSubscriptionType /* <: String */, EventType /* <: Event */] extends js.Object {
  def addEventListener(`type`: EventSubscriptionType, listener: js.Function1[/* e */ EventType, Unit]): Unit
  def removeEventListener(`type`: EventSubscriptionType): Unit
}

object EventTarget {
  @scala.inline
  def apply[EventSubscriptionType, EventType](
    addEventListener: (EventSubscriptionType, js.Function1[/* e */ EventType, Unit]) => Unit,
    removeEventListener: EventSubscriptionType => Unit
  ): EventTarget[EventSubscriptionType, EventType] = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), removeEventListener = js.Any.fromFunction1(removeEventListener))
    __obj.asInstanceOf[EventTarget[EventSubscriptionType, EventType]]
  }
}

