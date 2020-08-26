package typings.reactWaypoint.mod.Waypoint

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CallbackArgs extends js.Object {
  /*
    * The position that the waypoint has at the moment.
    * One of Waypoint.below, Waypoint.above, Waypoint.inside, and Waypoint.invisible.
    */
  var currentPosition: String = js.native
  /*
    * The native scroll event that triggered the callback.
    * May be missing if the callback wasn't triggered as the result of a scroll
    */
  var event: js.UndefOr[Event] = js.native
  /*
    * The position that the waypoint had before.
    * One of Waypoint.below, Waypoint.above, Waypoint.inside, and Waypoint.invisible.
    */
  var previousPosition: String = js.native
  /*
    * The distance from the bottom of the scrollable ancestor to the viewport top.
    */
  var viewportBottom: Double = js.native
  /*
    * The distance from the scrollable ancestor to the viewport top.
    */
  var viewportTop: Double = js.native
  /*
    * The waypoint's distance to the top of the viewport.
    */
  var waypointTop: Double = js.native
}

object CallbackArgs {
  @scala.inline
  def apply(
    currentPosition: String,
    previousPosition: String,
    viewportBottom: Double,
    viewportTop: Double,
    waypointTop: Double
  ): CallbackArgs = {
    val __obj = js.Dynamic.literal(currentPosition = currentPosition.asInstanceOf[js.Any], previousPosition = previousPosition.asInstanceOf[js.Any], viewportBottom = viewportBottom.asInstanceOf[js.Any], viewportTop = viewportTop.asInstanceOf[js.Any], waypointTop = waypointTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallbackArgs]
  }
  @scala.inline
  implicit class CallbackArgsOps[Self <: CallbackArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCurrentPosition(value: String): Self = this.set("currentPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreviousPosition(value: String): Self = this.set("previousPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewportBottom(value: Double): Self = this.set("viewportBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewportTop(value: Double): Self = this.set("viewportTop", value.asInstanceOf[js.Any])
    @scala.inline
    def setWaypointTop(value: Double): Self = this.set("waypointTop", value.asInstanceOf[js.Any])
    @scala.inline
    def setEvent(value: Event): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
  }
  
}

