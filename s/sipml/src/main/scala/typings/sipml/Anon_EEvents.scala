package typings.sipml

import typings.sipml.SIPmlNs.StackNs.Event
import typings.sipml.SIPmlNs.StackNs.EventSubscriptionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EEvents extends js.Object {
  var events: EventSubscriptionType | js.Array[EventSubscriptionType]
  def listener(e: Event): Unit
}

object Anon_EEvents {
  @scala.inline
  def apply(events: EventSubscriptionType | js.Array[EventSubscriptionType], listener: Event => Unit): Anon_EEvents = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], listener = js.Any.fromFunction1(listener))
  
    __obj.asInstanceOf[Anon_EEvents]
  }
}

