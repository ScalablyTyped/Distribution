package typings.reactDashAlert.reactDashAlertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlertCustomOptionsWithType extends AlertCustomOptions {
  var `type`: js.UndefOr[AlertType] = js.undefined
}

object AlertCustomOptionsWithType {
  @scala.inline
  def apply(
    onClose: () => Unit = null,
    onOpen: () => Unit = null,
    timeout: Int | Double = null,
    `type`: AlertType = null
  ): AlertCustomOptionsWithType = {
    val __obj = js.Dynamic.literal()
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction0(onOpen))
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AlertCustomOptionsWithType]
  }
}

