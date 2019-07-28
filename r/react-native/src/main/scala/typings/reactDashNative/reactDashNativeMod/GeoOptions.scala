package typings.reactDashNative.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoOptions extends js.Object {
  var distanceFilter: js.UndefOr[Double] = js.undefined
  var enableHighAccuracy: js.UndefOr[Boolean] = js.undefined
  var maximumAge: js.UndefOr[Double] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var useSignificantChanges: js.UndefOr[Boolean] = js.undefined
}

object GeoOptions {
  @scala.inline
  def apply(
    distanceFilter: Int | Double = null,
    enableHighAccuracy: js.UndefOr[Boolean] = js.undefined,
    maximumAge: Int | Double = null,
    timeout: Int | Double = null,
    useSignificantChanges: js.UndefOr[Boolean] = js.undefined
  ): GeoOptions = {
    val __obj = js.Dynamic.literal()
    if (distanceFilter != null) __obj.updateDynamic("distanceFilter")(distanceFilter.asInstanceOf[js.Any])
    if (!js.isUndefined(enableHighAccuracy)) __obj.updateDynamic("enableHighAccuracy")(enableHighAccuracy)
    if (maximumAge != null) __obj.updateDynamic("maximumAge")(maximumAge.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(useSignificantChanges)) __obj.updateDynamic("useSignificantChanges")(useSignificantChanges)
    __obj.asInstanceOf[GeoOptions]
  }
}

