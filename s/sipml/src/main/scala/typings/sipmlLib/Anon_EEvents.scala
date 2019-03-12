package typings
package sipmlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EEvents extends js.Object {
  var events: sipmlLib.SIPmlNs.StackNs.EventSubscriptionType | js.Array[sipmlLib.SIPmlNs.StackNs.EventSubscriptionType]
  def listener(e: sipmlLib.SIPmlNs.StackNs.Event): scala.Unit
}

object Anon_EEvents {
  @scala.inline
  def apply(
    events: sipmlLib.SIPmlNs.StackNs.EventSubscriptionType | js.Array[sipmlLib.SIPmlNs.StackNs.EventSubscriptionType],
    listener: sipmlLib.SIPmlNs.StackNs.Event => scala.Unit
  ): Anon_EEvents = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], listener = js.Any.fromFunction1(listener))
  
    __obj.asInstanceOf[Anon_EEvents]
  }
}

