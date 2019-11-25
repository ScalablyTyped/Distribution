package typings.reactDashNativeDashMauron85DashBackgroundDashGeolocation.reactDashNativeDashMauron85DashBackgroundDashGeolocationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StationaryLocation extends Location {
  var radius: Double
}

object StationaryLocation {
  @scala.inline
  def apply(
    accuracy: Double,
    altitude: Double,
    bearing: Double,
    id: Double,
    latitude: Double,
    locationProvider: Double,
    longitude: Double,
    provider: NativeProvider,
    radius: Double,
    speed: Double,
    time: Double,
    isFromMockProvider: js.UndefOr[Boolean] = js.undefined,
    mockLocationsEnabled: js.UndefOr[Boolean] = js.undefined
  ): StationaryLocation = {
    val __obj = js.Dynamic.literal(accuracy = accuracy.asInstanceOf[js.Any], altitude = altitude.asInstanceOf[js.Any], bearing = bearing.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], locationProvider = locationProvider.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    if (!js.isUndefined(isFromMockProvider)) __obj.updateDynamic("isFromMockProvider")(isFromMockProvider.asInstanceOf[js.Any])
    if (!js.isUndefined(mockLocationsEnabled)) __obj.updateDynamic("mockLocationsEnabled")(mockLocationsEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[StationaryLocation]
  }
}

