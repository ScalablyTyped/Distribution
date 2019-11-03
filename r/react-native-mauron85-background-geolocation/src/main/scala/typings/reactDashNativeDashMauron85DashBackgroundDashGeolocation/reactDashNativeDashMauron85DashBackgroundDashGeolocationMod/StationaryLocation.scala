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
    val __obj = js.Dynamic.literal(accuracy = accuracy, altitude = altitude, bearing = bearing, id = id, latitude = latitude, locationProvider = locationProvider, longitude = longitude, provider = provider, radius = radius, speed = speed, time = time)
    if (!js.isUndefined(isFromMockProvider)) __obj.updateDynamic("isFromMockProvider")(isFromMockProvider)
    if (!js.isUndefined(mockLocationsEnabled)) __obj.updateDynamic("mockLocationsEnabled")(mockLocationsEnabled)
    __obj.asInstanceOf[StationaryLocation]
  }
}

