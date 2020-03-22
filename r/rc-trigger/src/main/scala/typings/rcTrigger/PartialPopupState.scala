package typings.rcTrigger

import typings.rcTrigger.popupMod.PopupStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<rc-trigger.rc-trigger/lib/Popup.PopupState> */
trait PartialPopupState extends js.Object {
  var alignClassName: js.UndefOr[String] = js.undefined
  var prevVisible: js.UndefOr[Boolean] = js.undefined
  var status: js.UndefOr[PopupStatus] = js.undefined
  var targetHeight: js.UndefOr[Double] = js.undefined
  var targetWidth: js.UndefOr[Double] = js.undefined
}

object PartialPopupState {
  @scala.inline
  def apply(
    alignClassName: String = null,
    prevVisible: js.UndefOr[Boolean] = js.undefined,
    status: PopupStatus = null,
    targetHeight: Int | Double = null,
    targetWidth: Int | Double = null
  ): PartialPopupState = {
    val __obj = js.Dynamic.literal()
    if (alignClassName != null) __obj.updateDynamic("alignClassName")(alignClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(prevVisible)) __obj.updateDynamic("prevVisible")(prevVisible.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (targetHeight != null) __obj.updateDynamic("targetHeight")(targetHeight.asInstanceOf[js.Any])
    if (targetWidth != null) __obj.updateDynamic("targetWidth")(targetWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPopupState]
  }
}

