package typings.reactNativePopupDialog

import typings.reactNativePopupDialog.mod.SlideFromTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSlideFrom extends js.Object {
  var slideFrom: js.UndefOr[SlideFromTypes] = js.undefined
  var toValue: js.UndefOr[Double] = js.undefined
}

object AnonSlideFrom {
  @scala.inline
  def apply(slideFrom: SlideFromTypes = null, toValue: Int | Double = null): AnonSlideFrom = {
    val __obj = js.Dynamic.literal()
    if (slideFrom != null) __obj.updateDynamic("slideFrom")(slideFrom.asInstanceOf[js.Any])
    if (toValue != null) __obj.updateDynamic("toValue")(toValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSlideFrom]
  }
}

