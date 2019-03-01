package typings
package reactDashFnsLib.distGeoPositionGeoPositionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoPositionProps extends js.Object {
  var coords: js.UndefOr[reactDashFnsLib.Anon_Latitude] = js.undefined
  var error: js.UndefOr[stdLib.PositionError] = js.undefined
  var isLoading: scala.Boolean
}

object GeoPositionProps {
  @scala.inline
  def apply(
    isLoading: scala.Boolean,
    coords: reactDashFnsLib.Anon_Latitude = null,
    error: stdLib.PositionError = null
  ): GeoPositionProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isLoading")(isLoading)
    if (coords != null) __obj.updateDynamic("coords")(coords)
    if (error != null) __obj.updateDynamic("error")(error)
    __obj.asInstanceOf[GeoPositionProps]
  }
}

