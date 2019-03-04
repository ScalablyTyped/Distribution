package typings
package reactDashWaypointLib.reactDashWaypointMod.WaypointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallbackArgs extends js.Object {
  /*
    * The position that the waypoint has at the moment.
    * One of Waypoint.below, Waypoint.above, Waypoint.inside, and Waypoint.invisible.
    */
  var currentPosition: java.lang.String
  /*
    * The native scroll event that triggered the callback.
    * May be missing if the callback wasn't triggered as the result of a scroll
    */
  var event: js.UndefOr[reactLib.Event] = js.undefined
  /*
    * The position that the waypoint had before.
    * One of Waypoint.below, Waypoint.above, Waypoint.inside, and Waypoint.invisible.
    */
  var previousPosition: java.lang.String
  /*
    * The distance from the bottom of the scrollable ancestor to the viewport top.
    */
  var viewportBottom: scala.Double
  /*
    * The distance from the scrollable ancestor to the viewport top.
    */
  var viewportTop: scala.Double
  /*
    * The waypoint's distance to the top of the viewport.
    */
  var waypointTop: scala.Double
}

object CallbackArgs {
  @scala.inline
  def apply(
    currentPosition: java.lang.String,
    previousPosition: java.lang.String,
    viewportBottom: scala.Double,
    viewportTop: scala.Double,
    waypointTop: scala.Double,
    event: reactLib.Event = null
  ): CallbackArgs = {
    val __obj = js.Dynamic.literal(currentPosition = currentPosition, previousPosition = previousPosition, viewportBottom = viewportBottom, viewportTop = viewportTop, waypointTop = waypointTop)
    if (event != null) __obj.updateDynamic("event")(event)
    __obj.asInstanceOf[CallbackArgs]
  }
}

