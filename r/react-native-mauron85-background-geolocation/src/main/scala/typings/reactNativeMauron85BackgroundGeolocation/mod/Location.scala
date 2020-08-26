package typings.reactNativeMauron85BackgroundGeolocation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Location extends js.Object {
  /** Estimated accuracy of this location, in meters. */
  var accuracy: Double = js.native
  /** Altitude if available, in meters above the WGS 84 reference ellipsoid. */
  var altitude: Double = js.native
  /** Bearing, in degrees. */
  var bearing: Double = js.native
  /** ID of location as stored in DB (or null) */
  var id: Double = js.native
  /**
    * True if location was recorded by mock provider. (ANDROID ONLY)
    *
    * Note: this property is not enabled by default!
    * You can enable it "postTemplate" configure option.
    */
  var isFromMockProvider: js.UndefOr[Boolean] = js.native
  /** Latitude, in degrees. */
  var latitude: Double = js.native
  /** Configured location provider. */
  var locationProvider: Double = js.native
  /** Longitude, in degrees. */
  var longitude: Double = js.native
  /**
    * True if device has mock locations enabled. (ANDROID ONLY)
    *
    * Note: this property is not enabled by default!
    * You can enable it "postTemplate" configure option.
    */
  var mockLocationsEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Native provider reponsible for location.
    *
    * Possible values:
    * "gps", "network", "passive" or "fused"
    */
  var provider: NativeProvider = js.native
  /**
    * Speed if it is available, in meters/second over ground.
    *
    * Note: Not all providers are capable of providing speed.
    * Typically network providers are not able to do so.
    */
  var speed: Double = js.native
  /** UTC time of this fix, in milliseconds since January 1, 1970. */
  var time: Double = js.native
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
    time: Double
  ): Location = {
    val __obj = js.Dynamic.literal(accuracy = accuracy.asInstanceOf[js.Any], altitude = altitude.asInstanceOf[js.Any], bearing = bearing.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], locationProvider = locationProvider.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Location]
  }
  @scala.inline
  implicit class LocationOps[Self <: Location] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccuracy(value: Double): Self = this.set("accuracy", value.asInstanceOf[js.Any])
    @scala.inline
    def setAltitude(value: Double): Self = this.set("altitude", value.asInstanceOf[js.Any])
    @scala.inline
    def setBearing(value: Double): Self = this.set("bearing", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLatitude(value: Double): Self = this.set("latitude", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocationProvider(value: Double): Self = this.set("locationProvider", value.asInstanceOf[js.Any])
    @scala.inline
    def setLongitude(value: Double): Self = this.set("longitude", value.asInstanceOf[js.Any])
    @scala.inline
    def setProvider(value: NativeProvider): Self = this.set("provider", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpeed(value: Double): Self = this.set("speed", value.asInstanceOf[js.Any])
    @scala.inline
    def setTime(value: Double): Self = this.set("time", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsFromMockProvider(value: Boolean): Self = this.set("isFromMockProvider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsFromMockProvider: Self = this.set("isFromMockProvider", js.undefined)
    @scala.inline
    def setMockLocationsEnabled(value: Boolean): Self = this.set("mockLocationsEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMockLocationsEnabled: Self = this.set("mockLocationsEnabled", js.undefined)
  }
  
}

