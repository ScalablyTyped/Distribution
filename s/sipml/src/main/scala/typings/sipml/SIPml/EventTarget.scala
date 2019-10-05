package typings.sipml.SIPml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SIPml.EventTarget")
@js.native
class EventTarget[EventSubscriptionType /* <: String */, EventType /* <: Event */] () extends js.Object {
  def addEventListener(`type`: EventSubscriptionType, listener: js.Function1[/* e */ EventType, Unit]): Unit = js.native
  def removeEventListener(`type`: EventSubscriptionType): Unit = js.native
}

