package typings.reactDashDragtastic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Events extends js.Object {
  var events: Anon_OnMouseDown
  /** A boolean representing if the draggable is currently active. */
  var isActive: Boolean
}

object Anon_Events {
  @scala.inline
  def apply(events: Anon_OnMouseDown, isActive: Boolean): Anon_Events = {
    val __obj = js.Dynamic.literal(events = events, isActive = isActive)
  
    __obj.asInstanceOf[Anon_Events]
  }
}

