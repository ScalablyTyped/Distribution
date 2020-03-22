package typings.rcTrigger.popupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopupState extends js.Object {
  var alignClassName: String
  var prevVisible: Boolean
  var status: PopupStatus
  var targetHeight: Double
  var targetWidth: Double
}

object PopupState {
  @scala.inline
  def apply(
    alignClassName: String,
    prevVisible: Boolean,
    targetHeight: Double,
    targetWidth: Double,
    status: PopupStatus = null
  ): PopupState = {
    val __obj = js.Dynamic.literal(alignClassName = alignClassName.asInstanceOf[js.Any], prevVisible = prevVisible.asInstanceOf[js.Any], targetHeight = targetHeight.asInstanceOf[js.Any], targetWidth = targetWidth.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopupState]
  }
}

