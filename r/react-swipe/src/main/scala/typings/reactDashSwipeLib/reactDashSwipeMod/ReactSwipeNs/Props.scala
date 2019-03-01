package typings
package reactDashSwipeLib.reactDashSwipeMod.ReactSwipeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var childCount: js.UndefOr[scala.Double] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[Style] = js.undefined
  var swipeOptions: js.UndefOr[swipeLib.SwipeOptions] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    childCount: scala.Int | scala.Double = null,
    className: java.lang.String = null,
    id: java.lang.String = null,
    style: Style = null,
    swipeOptions: swipeLib.SwipeOptions = null
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (childCount != null) __obj.updateDynamic("childCount")(childCount.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (id != null) __obj.updateDynamic("id")(id)
    if (style != null) __obj.updateDynamic("style")(style)
    if (swipeOptions != null) __obj.updateDynamic("swipeOptions")(swipeOptions)
    __obj.asInstanceOf[Props]
  }
}

