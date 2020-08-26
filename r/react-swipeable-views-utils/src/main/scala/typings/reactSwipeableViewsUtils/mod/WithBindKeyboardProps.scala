package typings.reactSwipeableViewsUtils.mod

import typings.reactSwipeableViews.mod.OnChangeIndexCallback
import typings.reactSwipeableViewsUtils.reactSwipeableViewsUtilsStrings.`x-reverse`
import typings.reactSwipeableViewsUtils.reactSwipeableViewsUtilsStrings.`y-reverse`
import typings.reactSwipeableViewsUtils.reactSwipeableViewsUtilsStrings.x
import typings.reactSwipeableViewsUtils.reactSwipeableViewsUtilsStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WithBindKeyboardProps extends js.Object {
  var axis: js.UndefOr[x | `x-reverse` | y | `y-reverse`] = js.native
  var index: Double = js.native
  var onChangeIndex: OnChangeIndexCallback = js.native
  var slidecount: js.UndefOr[Double] = js.native
}

object WithBindKeyboardProps {
  @scala.inline
  def apply(index: Double, onChangeIndex: (/* index */ Double, /* indexLatest */ Double) => Unit): WithBindKeyboardProps = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], onChangeIndex = js.Any.fromFunction2(onChangeIndex))
    __obj.asInstanceOf[WithBindKeyboardProps]
  }
  @scala.inline
  implicit class WithBindKeyboardPropsOps[Self <: WithBindKeyboardProps] (val x: Self) extends AnyVal {
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
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnChangeIndex(value: (/* index */ Double, /* indexLatest */ Double) => Unit): Self = this.set("onChangeIndex", js.Any.fromFunction2(value))
    @scala.inline
    def setAxis(
      value: typings.reactSwipeableViewsUtils.reactSwipeableViewsUtilsStrings.x | `x-reverse` | y | `y-reverse`
    ): Self = this.set("axis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxis: Self = this.set("axis", js.undefined)
    @scala.inline
    def setSlidecount(value: Double): Self = this.set("slidecount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlidecount: Self = this.set("slidecount", js.undefined)
  }
  
}

