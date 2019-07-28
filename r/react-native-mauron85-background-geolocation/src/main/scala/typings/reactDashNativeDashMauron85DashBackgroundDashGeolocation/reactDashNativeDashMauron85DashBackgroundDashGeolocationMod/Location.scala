package typings.reactDashNativeDashMauron85DashBackgroundDashGeolocation.reactDashNativeDashMauron85DashBackgroundDashGeolocationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Location extends js.Object {
  /** Estimated accuracy of this location, in meters. */
  var accuracy: Double
  /** Altitude if available, in meters above the WGS 84 reference ellipsoid. */
  var altitude: Double
  /** Bearing, in degrees. */
  var bearing: Double
  /** ID of location as stored in DB (or null) */
  var id: Double
  /** True if location was recorded by mock provider. (ANDROID ONLY) */
  var isFromMockProvider: js.UndefOr[Boolean] = js.undefined
  /** Latitude, in degrees. */
  var latitude: Double
  var locationProvider: Double
  /** Longitude, in degrees. */
  var longitude: Double
  /** True if device has mock locations enabled. (ANDROID ONLY) */
  var mockLocationsEnabled: js.UndefOr[Boolean] = js.undefined
  var provider: Provider
  /** Speed if it is available, in meters/second over ground. */
  var speed: Double
  /** UTC time of this fix, in milliseconds since January 1, 1970. */
  var time: Double
}

object Location {
  @scala.inline
  def apply(
    accuracy: Double,
    altitude: Double,
    bearing: Double,
    id: Double,
    latitude: Double,
    locationProvider: Double,
    longitude: Double,
    provider: Provider,
    speed: Double,
    time: Double,
    isFromMockProvider: js.UndefOr[Boolean] = js.undefined,
    mockLocationsEnabled: js.UndefOr[Boolean] = js.undefined
  ): Location = {
    val __obj = js.Dynamic.literal(accuracy = accuracy, altitude = altitude, bearing = bearing, id = id, latitude = latitude, locationProvider = locationProvider, longitude = longitude, provider = provider, speed = speed, time = time)
    if (!js.isUndefined(isFromMockProvider)) __obj.updateDynamic("isFromMockProvider")(isFromMockProvider)
    if (!js.isUndefined(mockLocationsEnabled)) __obj.updateDynamic("mockLocationsEnabled")(mockLocationsEnabled)
    __obj.asInstanceOf[Location]
  }
}

