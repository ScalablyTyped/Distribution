package typings.reactNativeMauron85BackgroundGeolocation.mod

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
    maximumAge: js.UndefOr[Double] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined
  ): LocationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableHighAccuracy)) __obj.updateDynamic("enableHighAccuracy")(enableHighAccuracy.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumAge)) __obj.updateDynamic("maximumAge")(maximumAge.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationOptions]
  }
}

