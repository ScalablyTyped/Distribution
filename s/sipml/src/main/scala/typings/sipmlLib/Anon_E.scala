package typings
package sipmlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_E extends js.Object {
  var events: sipmlLib.SIPmlNs.SessionNs.EventSubscriptionType | js.Array[sipmlLib.SIPmlNs.SessionNs.EventSubscriptionType]
  def listener(e: sipmlLib.SIPmlNs.SessionNs.Event): scala.Unit
}

object Anon_E {
  @scala.inline
  def apply(
    events: sipmlLib.SIPmlNs.SessionNs.EventSubscriptionType | js.Array[sipmlLib.SIPmlNs.SessionNs.EventSubscriptionType],
    listener: js.Function1[sipmlLib.SIPmlNs.SessionNs.Event, scala.Unit]
  ): Anon_E = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], listener = listener)
  
    __obj.asInstanceOf[Anon_E]
  }
}

