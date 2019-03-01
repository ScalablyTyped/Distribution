package typings
package reactDashNativeDashSortableDashGridLib.reactDashNativeDashSortableDashGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortableGridItemProps extends js.Object {
  /**
    * Flag to mark a child node as being inactive. If set, no touch events
    * will be fired when users interact with the node.
    */
  var inactive: js.UndefOr[scala.Boolean] = js.undefined
  var key: java.lang.String
  /**
    * Function that is executed when the block is double tapped within a
    * timeframe of doubleTapTreshold (default 150ms). Assigning this will
    * delay the execution of onTap. Omitting this will cause all taps to be
    * handled as single taps, regardless of their frequency.
    */
  var onDoubleTap: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Function that is executed when the block is tapped once, but not pressed
    *  for long enough to activate the drag.
    */
  var onTap: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object SortableGridItemProps {
  @scala.inline
  def apply(
    key: java.lang.String,
    inactive: js.UndefOr[scala.Boolean] = js.undefined,
    onDoubleTap: js.Function0[scala.Unit] = null,
    onTap: js.Function0[scala.Unit] = null
  ): SortableGridItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("key")(key)
    if (!js.isUndefined(inactive)) __obj.updateDynamic("inactive")(inactive)
    if (onDoubleTap != null) __obj.updateDynamic("onDoubleTap")(onDoubleTap)
    if (onTap != null) __obj.updateDynamic("onTap")(onTap)
    __obj.asInstanceOf[SortableGridItemProps]
  }
}

