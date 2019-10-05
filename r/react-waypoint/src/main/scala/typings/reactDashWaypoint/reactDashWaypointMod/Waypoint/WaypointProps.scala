package typings.reactDashWaypoint.reactDashWaypointMod.Waypoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaypointProps extends js.Object {
  /**
    * `bottomOffset` is like `topOffset`, but for the bottom of the container.
    */
  var bottomOffset: js.UndefOr[String | Double] = js.undefined
  /**
    * Use this prop to get debug information in the console log. This slows
    * things down significantly, so it should only be used during development.
    */
  var debug: js.UndefOr[Boolean] = js.undefined
  /**
    * If the onEnter/onLeave events are to be fired on rapid scrolling.
    * This has no effect on onPositionChange -- it will fire anyway.
    */
  var fireOnRapidScroll: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to activate on horizontal scrolling instead of vertical
    */
  var horizontal: js.UndefOr[Boolean] = js.undefined
  /**
    * Function called when waypoint enters viewport
    * @param {CallbackArgs} args
    */
  var onEnter: js.UndefOr[js.Function1[/* args */ CallbackArgs, Unit]] = js.undefined
  /**
    * Function called when waypoint leaves viewport
    * @param {CallbackArgs} args
    */
  var onLeave: js.UndefOr[js.Function1[/* args */ CallbackArgs, Unit]] = js.undefined
  /**
    * Function called when waypoint position changes
    * @param {CallbackArgs} args
    */
  var onPositionChange: js.UndefOr[js.Function1[/* args */ CallbackArgs, Unit]] = js.undefined
  /**
    * A custom ancestor to determine if the target is visible in it.
    * This is useful in cases where you do not want the immediate scrollable
    * ancestor to be the container. For example, when your target is in a div
    * that has overflow auto but you are detecting onEnter based on the window.
    */
  var scrollableAncestor: js.UndefOr[js.Any] = js.undefined
  /**
    * `topOffset` can either be a number, in which case its a distance from the
    * top of the container in pixels, or a string value. Valid string values are
    * of the form "20px", which is parsed as pixels, or "20%", which is parsed
    * as a percentage of the height of the containing element.
    * For instance, if you pass "-20%", and the containing element is 100px tall,
    * then the waypoint will be triggered when it has been scrolled 20px beyond
    * the top of the containing element.
    */
  var topOffset: js.UndefOr[String | Double] = js.undefined
}

object WaypointProps {
  @scala.inline
  def apply(
    bottomOffset: String | Double = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    fireOnRapidScroll: js.UndefOr[Boolean] = js.undefined,
    horizontal: js.UndefOr[Boolean] = js.undefined,
    onEnter: /* args */ CallbackArgs => Unit = null,
    onLeave: /* args */ CallbackArgs => Unit = null,
    onPositionChange: /* args */ CallbackArgs => Unit = null,
    scrollableAncestor: js.Any = null,
    topOffset: String | Double = null
  ): WaypointProps = {
    val __obj = js.Dynamic.literal()
    if (bottomOffset != null) __obj.updateDynamic("bottomOffset")(bottomOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (!js.isUndefined(fireOnRapidScroll)) __obj.updateDynamic("fireOnRapidScroll")(fireOnRapidScroll)
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal)
    if (onEnter != null) __obj.updateDynamic("onEnter")(js.Any.fromFunction1(onEnter))
    if (onLeave != null) __obj.updateDynamic("onLeave")(js.Any.fromFunction1(onLeave))
    if (onPositionChange != null) __obj.updateDynamic("onPositionChange")(js.Any.fromFunction1(onPositionChange))
    if (scrollableAncestor != null) __obj.updateDynamic("scrollableAncestor")(scrollableAncestor)
    if (topOffset != null) __obj.updateDynamic("topOffset")(topOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[WaypointProps]
  }
}

