package typings.reactNativeMauron85BackgroundGeolocation.mod

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
  /**
    * True if location was recorded by mock provider. (ANDROID ONLY)
    *
    * Note: this property is not enabled by default!
    * You can enable it "postTemplate" configure option.
    */
  var isFromMockProvider: js.UndefOr[Boolean] = js.undefined
  /** Latitude, in degrees. */
  var latitude: Double
  /** Configured location provider. */
  var locationProvider: Double
  /** Longitude, in degrees. */
  var longitude: Double
  /**
    * True if device has mock locations enabled. (ANDROID ONLY)
    *
    * Note: this property is not enabled by default!
    * You can enable it "postTemplate" configure option.
    */
  var mockLocationsEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Native provider reponsible for location.
    *
    * Possible values:
    * "gps", "network", "passive" or "fused"
    */
  var provider: NativeProvider
  /**
    * Speed if it is available, in meters/second over ground.
    *
    * Note: Not all providers are capable of providing speed.
    * Typically network providers are not able to do so.
    */
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
    provider: NativeProvider,
    speed: Double,
    time: Double,
    isFromMockProvider: js.UndefOr[Boolean] = js.undefined,
    mockLocationsEnabled: js.UndefOr[Boolean] = js.undefined
  ): Location = {
    val __obj = js.Dynamic.literal(accuracy = accuracy.asInstanceOf[js.Any], altitude = altitude.asInstanceOf[js.Any], bearing = bearing.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], locationProvider = locationProvider.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    if (!js.isUndefined(isFromMockProvider)) __obj.updateDynamic("isFromMockProvider")(isFromMockProvider.asInstanceOf[js.Any])
    if (!js.isUndefined(mockLocationsEnabled)) __obj.updateDynamic("mockLocationsEnabled")(mockLocationsEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Location]
  }
}

