package typings.reactDashSwipe.reactDashSwipeMod

import typings.swipe.SwipeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var childCount: js.UndefOr[Double] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[Style] = js.undefined
  var swipeOptions: js.UndefOr[SwipeOptions] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    childCount: Int | Double = null,
    className: String = null,
    id: String = null,
    style: Style = null,
    swipeOptions: SwipeOptions = null
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

