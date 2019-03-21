package typings
package reactDashAlertLib.reactDashAlertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlertCustomOptions extends js.Object {
  /**
    * Callback that will be executed after this alert is removed
    */
  var onClose: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Callback that will be executed after this alert open
    */
  var onOpen: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Custom timeout just for this one alert
    */
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object AlertCustomOptions {
  @scala.inline
  def apply(
    onClose: () => scala.Unit = null,
    onOpen: () => scala.Unit = null,
    timeout: scala.Int | scala.Double = null
  ): AlertCustomOptions = {
    val __obj = js.Dynamic.literal()
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction0(onOpen))
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlertCustomOptions]
  }
}

