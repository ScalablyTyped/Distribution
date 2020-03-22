package typings.sipml

import typings.sipml.SIPml.Session.Event
import typings.sipml.SIPml.Session.EventSubscriptionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEvents extends js.Object {
  var events: EventSubscriptionType | js.Array[EventSubscriptionType]
  def listener(e: Event): Unit
}

object AnonEvents {
  @scala.inline
  def apply(events: EventSubscriptionType | js.Array[EventSubscriptionType], listener: Event => Unit): AnonEvents = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], listener = js.Any.fromFunction1(listener))
  
    __obj.asInstanceOf[AnonEvents]
  }
}

