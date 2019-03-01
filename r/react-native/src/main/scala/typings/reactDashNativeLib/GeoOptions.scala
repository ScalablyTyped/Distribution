package typings
package reactDashNativeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoOptions extends js.Object {
  var distanceFilter: js.UndefOr[scala.Double] = js.undefined
  var enableHighAccuracy: js.UndefOr[scala.Boolean] = js.undefined
  var maximumAge: js.UndefOr[scala.Double] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var useSignificantChanges: js.UndefOr[scala.Boolean] = js.undefined
}

object GeoOptions {
  @scala.inline
  def apply(
    distanceFilter: scala.Int | scala.Double = null,
    enableHighAccuracy: js.UndefOr[scala.Boolean] = js.undefined,
    maximumAge: scala.Int | scala.Double = null,
    timeout: scala.Int | scala.Double = null,
    useSignificantChanges: js.UndefOr[scala.Boolean] = js.undefined
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

