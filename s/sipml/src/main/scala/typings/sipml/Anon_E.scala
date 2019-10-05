package typings.sipml

import typings.sipml.SIPml.Session.Event
import typings.sipml.SIPml.Session.EventSubscriptionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_E extends js.Object {
  var events: EventSubscriptionType | js.Array[EventSubscriptionType]
  def listener(e: Event): Unit
}

object Anon_E {
  @scala.inline
  def apply(events: EventSubscriptionType | js.Array[EventSubscriptionType], listener: Event => Unit): Anon_E = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], listener = js.Any.fromFunction1(listener))
  
    __obj.asInstanceOf[Anon_E]
  }
}

