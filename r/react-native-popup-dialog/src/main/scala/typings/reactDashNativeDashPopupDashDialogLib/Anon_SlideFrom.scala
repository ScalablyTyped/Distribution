package typings
package reactDashNativeDashPopupDashDialogLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SlideFrom extends js.Object {
  var slideFrom: js.UndefOr[
    reactDashNativeDashPopupDashDialogLib.reactDashNativeDashPopupDashDialogMod.SlideFromTypes
  ] = js.undefined
  var toValue: js.UndefOr[scala.Double] = js.undefined
}

object Anon_SlideFrom {
  @scala.inline
  def apply(
    slideFrom: reactDashNativeDashPopupDashDialogLib.reactDashNativeDashPopupDashDialogMod.SlideFromTypes = null,
    toValue: scala.Int | scala.Double = null
  ): Anon_SlideFrom = {
    val __obj = js.Dynamic.literal()
    if (slideFrom != null) __obj.updateDynamic("slideFrom")(slideFrom)
    if (toValue != null) __obj.updateDynamic("toValue")(toValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_SlideFrom]
  }
}

