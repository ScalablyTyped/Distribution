package typings
package sipmlLib.SIPmlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SIPml.EventTarget")
@js.native
class EventTarget[EventSubscriptionType /* <: java.lang.String */, EventType /* <: Event */] () extends js.Object {
  def addEventListener(`type`: EventSubscriptionType, listener: js.Function1[/* e */ EventType, scala.Unit]): scala.Unit = js.native
  def removeEventListener(`type`: EventSubscriptionType): scala.Unit = js.native
}

