package typings
package reactDashAlertLib.reactDashAlertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlertCustomOptions extends js.Object {
  /**
    * Callback that will be executed after this alert is removed
    */
  var onClose: js.UndefOr[js.Function0[js.UndefOr[scala.Nothing]]] = js.undefined
  /**
    * Callback that will be executed after this alert open
    */
  var onOpen: js.UndefOr[js.Function0[js.UndefOr[scala.Nothing]]] = js.undefined
  /**
    * Custom timeout just for this one alert
    */
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object AlertCustomOptions {
  @scala.inline
  def apply(
    onClose: js.Function0[js.UndefOr[scala.Nothing]] = null,
    onOpen: js.Function0[js.UndefOr[scala.Nothing]] = null,
    timeout: scala.Int | scala.Double = null
  ): AlertCustomOptions = {
    val __obj = js.Dynamic.literal()
    if (onClose != null) __obj.updateDynamic("onClose")(onClose)
    if (onOpen != null) __obj.updateDynamic("onOpen")(onOpen)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlertCustomOptions]
  }
}

