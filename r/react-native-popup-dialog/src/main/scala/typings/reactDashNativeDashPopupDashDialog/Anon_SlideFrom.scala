package typings.reactDashNativeDashPopupDashDialog

import typings.reactDashNativeDashPopupDashDialog.reactDashNativeDashPopupDashDialogMod.SlideFromTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SlideFrom extends js.Object {
  var slideFrom: js.UndefOr[SlideFromTypes] = js.undefined
  var toValue: js.UndefOr[Double] = js.undefined
}

object Anon_SlideFrom {
  @scala.inline
  def apply(slideFrom: SlideFromTypes = null, toValue: Int | Double = null): Anon_SlideFrom = {
    val __obj = js.Dynamic.literal()
    if (slideFrom != null) __obj.updateDynamic("slideFrom")(slideFrom)
    if (toValue != null) __obj.updateDynamic("toValue")(toValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_SlideFrom]
  }
}

