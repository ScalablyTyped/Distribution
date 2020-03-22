package typings.reactSwipeableViewsUtils.mod

import typings.reactSwipeableViews.mod.OnChangeIndexCallback
import typings.reactSwipeableViewsUtils.reactSwipeableViewsUtilsStrings.`x-reverse`
import typings.reactSwipeableViewsUtils.reactSwipeableViewsUtilsStrings.`y-reverse`
import typings.reactSwipeableViewsUtils.reactSwipeableViewsUtilsStrings.x
import typings.reactSwipeableViewsUtils.reactSwipeableViewsUtilsStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithBindKeyboardProps extends js.Object {
  var axis: js.UndefOr[x | `x-reverse` | y | `y-reverse`] = js.undefined
  var index: Double
  var onChangeIndex: OnChangeIndexCallback
  var slidecount: js.UndefOr[Double] = js.undefined
}

object WithBindKeyboardProps {
  @scala.inline
  def apply(
    index: Double,
    onChangeIndex: (/* index */ Double, /* indexLatest */ Double) => Unit,
    axis: x | `x-reverse` | y | `y-reverse` = null,
    slidecount: Int | Double = null
  ): WithBindKeyboardProps = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], onChangeIndex = js.Any.fromFunction2(onChangeIndex))
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (slidecount != null) __obj.updateDynamic("slidecount")(slidecount.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithBindKeyboardProps]
  }
}

