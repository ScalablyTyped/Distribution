package typings.std.global

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("dispatchEvent")
@js.native
object dispatchEvent extends js.Object {
  /**
    * Dispatches a synthetic event event to target and returns true if either event's cancelable attribute value is false or its preventDefault() method was not invoked, and false otherwise.
    */
  def apply(event: Event): scala.Boolean = js.native
}

