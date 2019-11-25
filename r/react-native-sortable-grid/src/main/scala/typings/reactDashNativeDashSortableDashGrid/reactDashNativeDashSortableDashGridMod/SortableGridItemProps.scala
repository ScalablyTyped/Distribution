package typings.reactDashNativeDashSortableDashGrid.reactDashNativeDashSortableDashGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortableGridItemProps extends js.Object {
  /**
    * Flag to mark a child node as being inactive. If set, no touch events
    * will be fired when users interact with the node.
    */
  var inactive: js.UndefOr[Boolean] = js.undefined
  var key: String
  /**
    * Function that is executed when the block is double tapped within a
    * timeframe of doubleTapTreshold (default 150ms). Assigning this will
    * delay the execution of onTap. Omitting this will cause all taps to be
    * handled as single taps, regardless of their frequency.
    */
  var onDoubleTap: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Function that is executed when the block is tapped once, but not pressed
    *  for long enough to activate the drag.
    */
  var onTap: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object SortableGridItemProps {
  @scala.inline
  def apply(
    key: String,
    inactive: js.UndefOr[Boolean] = js.undefined,
    onDoubleTap: () => Unit = null,
    onTap: () => Unit = null
  ): SortableGridItemProps = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (!js.isUndefined(inactive)) __obj.updateDynamic("inactive")(inactive.asInstanceOf[js.Any])
    if (onDoubleTap != null) __obj.updateDynamic("onDoubleTap")(js.Any.fromFunction0(onDoubleTap))
    if (onTap != null) __obj.updateDynamic("onTap")(js.Any.fromFunction0(onTap))
    __obj.asInstanceOf[SortableGridItemProps]
  }
}

