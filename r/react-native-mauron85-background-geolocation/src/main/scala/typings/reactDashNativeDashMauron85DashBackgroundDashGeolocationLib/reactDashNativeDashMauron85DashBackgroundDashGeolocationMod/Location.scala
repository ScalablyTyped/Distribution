package typings
package reactDashNativeDashMauron85DashBackgroundDashGeolocationLib.reactDashNativeDashMauron85DashBackgroundDashGeolocationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Location extends js.Object {
  /** Estimated accuracy of this location, in meters. */
  var accuracy: scala.Double
  /** Altitude if available, in meters above the WGS 84 reference ellipsoid. */
  var altitude: scala.Double
  /** Bearing, in degrees. */
  var bearing: scala.Double
  /** ID of location as stored in DB (or null) */
  var id: scala.Double
  /** True if location was recorded by mock provider. (ANDROID ONLY) */
  var isFromMockProvider: js.UndefOr[scala.Boolean] = js.undefined
  /** Latitude, in degrees. */
  var latitude: scala.Double
  var locationProvider: scala.Double
  /** Longitude, in degrees. */
  var longitude: scala.Double
  /** True if device has mock locations enabled. (ANDROID ONLY) */
  var mockLocationsEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var provider: Provider
  /** Speed if it is available, in meters/second over ground. */
  var speed: scala.Double
  /** UTC time of this fix, in milliseconds since January 1, 1970. */
  var time: scala.Double
}

object Location {
  @scala.inline
  def apply(
    accuracy: scala.Double,
    altitude: scala.Double,
    bearing: scala.Double,
    id: scala.Double,
    latitude: scala.Double,
    locationProvider: scala.Double,
    longitude: scala.Double,
    provider: Provider,
    speed: scala.Double,
    time: scala.Double,
    isFromMockProvider: js.UndefOr[scala.Boolean] = js.undefined,
    mockLocationsEnabled: js.UndefOr[scala.Boolean] = js.undefined
  ): Location = {
    val __obj = js.Dynamic.literal(accuracy = accuracy, altitude = altitude, bearing = bearing, id = id, latitude = latitude, locationProvider = locationProvider, longitude = longitude, provider = provider, speed = speed, time = time)
    if (!js.isUndefined(isFromMockProvider)) __obj.updateDynamic("isFromMockProvider")(isFromMockProvider)
    if (!js.isUndefined(mockLocationsEnabled)) __obj.updateDynamic("mockLocationsEnabled")(mockLocationsEnabled)
    __obj.asInstanceOf[Location]
  }
}

