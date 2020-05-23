package typings.reactNativePopupDialog.anon

import typings.reactNativePopupDialog.mod.SlideFromTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlideFrom extends js.Object {
  var slideFrom: js.UndefOr[SlideFromTypes] = js.undefined
  var toValue: js.UndefOr[Double] = js.undefined
}

object SlideFrom {
  @scala.inline
  def apply(slideFrom: SlideFromTypes = null, toValue: js.UndefOr[Double] = js.undefined): SlideFrom = {
    val __obj = js.Dynamic.literal()
    if (slideFrom != null) __obj.updateDynamic("slideFrom")(slideFrom.asInstanceOf[js.Any])
    if (!js.isUndefined(toValue)) __obj.updateDynamic("toValue")(toValue.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlideFrom]
  }
}

