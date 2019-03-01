package typings
package reactDashDragtasticLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Events extends js.Object {
  var events: Anon_Event
  /** A boolean representing if the draggable is currently active. */
  var isActive: scala.Boolean
}

object Anon_Events {
  @scala.inline
  def apply(events: Anon_Event, isActive: scala.Boolean): Anon_Events = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("events")(events)
    __obj.updateDynamic("isActive")(isActive)
    __obj.asInstanceOf[Anon_Events]
  }
}

