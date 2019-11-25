package typings.reactDashNativeDashMauron85DashBackgroundDashGeolocation.reactDashNativeDashMauron85DashBackgroundDashGeolocationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationOptions extends js.Object {
  /**
    * If true and if the device is able to provide a more accurate position, it will do so.
    */
  var enableHighAccuracy: js.UndefOr[Boolean] = js.undefined
  /**
    * Maximum age in milliseconds of a possible cached location that is acceptable to return.
    */
  var maximumAge: js.UndefOr[Double] = js.undefined
  /**
    * Maximum time in milliseconds device will wait for location.
    */
  var timeout: js.UndefOr[Double] = js.undefined
}

object LocationOptions {
  @scala.inline
  def apply(
    enableHighAccuracy: js.UndefOr[Boolean] = js.undefined,
    maximumAge: Int | Double = null,
    timeout: Int | Double = null
  ): LocationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableHighAccuracy)) __obj.updateDynamic("enableHighAccuracy")(enableHighAccuracy.asInstanceOf[js.Any])
    if (maximumAge != null) __obj.updateDynamic("maximumAge")(maximumAge.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationOptions]
  }
}

