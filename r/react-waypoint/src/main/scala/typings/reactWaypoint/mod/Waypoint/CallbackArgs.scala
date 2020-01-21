package typings.reactWaypoint.mod.Waypoint

import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallbackArgs extends js.Object {
  /*
    * The position that the waypoint has at the moment.
    * One of Waypoint.below, Waypoint.above, Waypoint.inside, and Waypoint.invisible.
    */
  var currentPosition: String
  /*
    * The native scroll event that triggered the callback.
    * May be missing if the callback wasn't triggered as the result of a scroll
    */
  var event: js.UndefOr[Event_] = js.undefined
  /*
    * The position that the waypoint had before.
    * One of Waypoint.below, Waypoint.above, Waypoint.inside, and Waypoint.invisible.
    */
  var previousPosition: String
  /*
    * The distance from the bottom of the scrollable ancestor to the viewport top.
    */
  var viewportBottom: Double
  /*
    * The distance from the scrollable ancestor to the viewport top.
    */
  var viewportTop: Double
  /*
    * The waypoint's distance to the top of the viewport.
    */
  var waypointTop: Double
}

object CallbackArgs {
  @scala.inline
  def apply(
    currentPosition: String,
    previousPosition: String,
    viewportBottom: Double,
    viewportTop: Double,
    waypointTop: Double,
    event: Event_ = null
  ): CallbackArgs = {
    val __obj = js.Dynamic.literal(currentPosition = currentPosition.asInstanceOf[js.Any], previousPosition = previousPosition.asInstanceOf[js.Any], viewportBottom = viewportBottom.asInstanceOf[js.Any], viewportTop = viewportTop.asInstanceOf[js.Any], waypointTop = waypointTop.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallbackArgs]
  }
}

