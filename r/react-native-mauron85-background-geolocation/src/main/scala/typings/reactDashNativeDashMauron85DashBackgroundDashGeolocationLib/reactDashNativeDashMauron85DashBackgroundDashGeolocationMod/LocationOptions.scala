package typings
package reactDashNativeDashMauron85DashBackgroundDashGeolocationLib.reactDashNativeDashMauron85DashBackgroundDashGeolocationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationOptions extends js.Object {
  /**
    * If true and if the device is able to provide a more accurate position, it will do so.
    */
  var enableHighAccuracy: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Maximum age in milliseconds of a possible cached location that is acceptable to return.
    */
  var maximumAge: js.UndefOr[scala.Double] = js.undefined
  /**
    * Maximum time in milliseconds device will wait for location.
    */
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object LocationOptions {
  @scala.inline
  def apply(
    enableHighAccuracy: js.UndefOr[scala.Boolean] = js.undefined,
    maximumAge: scala.Int | scala.Double = null,
    timeout: scala.Int | scala.Double = null
  ): LocationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableHighAccuracy)) __obj.updateDynamic("enableHighAccuracy")(enableHighAccuracy)
    if (maximumAge != null) __obj.updateDynamic("maximumAge")(maximumAge.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationOptions]
  }
}

