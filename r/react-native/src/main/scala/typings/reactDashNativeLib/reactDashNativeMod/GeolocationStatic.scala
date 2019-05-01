package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeolocationStatic extends js.Object {
  def clearWatch(watchID: scala.Double): scala.Unit = js.native
  /**
    * Invokes the success callback once with the latest location info.  Supported
    * options: timeout (ms), maximumAge (ms), enableHighAccuracy (bool)
    * On Android, this can return almost immediately if the location is cached or
    * request an update, which might take a while.
    */
  def getCurrentPosition(geo_success: js.Function1[/* position */ GeolocationReturnType, scala.Unit]): scala.Unit = js.native
  def getCurrentPosition(
    geo_success: js.Function1[/* position */ GeolocationReturnType, scala.Unit],
    geo_error: js.Function1[/* error */ GeolocationError, scala.Unit]
  ): scala.Unit = js.native
  def getCurrentPosition(
    geo_success: js.Function1[/* position */ GeolocationReturnType, scala.Unit],
    geo_error: js.Function1[/* error */ GeolocationError, scala.Unit],
    geo_options: GeoOptions
  ): scala.Unit = js.native
  def requestAuthorization(): scala.Unit = js.native
  def setRNConfiguration(config: GeoConfiguration): scala.Unit = js.native
  def stopObserving(): scala.Unit = js.native
  /**
    * Invokes the success callback whenever the location changes.  Supported
    * options: timeout (ms), maximumAge (ms), enableHighAccuracy (bool), distanceFilter(m)
    */
  def watchPosition(success: js.Function1[/* position */ GeolocationReturnType, scala.Unit]): scala.Double = js.native
  def watchPosition(
    success: js.Function1[/* position */ GeolocationReturnType, scala.Unit],
    error: js.Function1[/* error */ GeolocationError, scala.Unit]
  ): scala.Double = js.native
  def watchPosition(
    success: js.Function1[/* position */ GeolocationReturnType, scala.Unit],
    error: js.Function1[/* error */ GeolocationError, scala.Unit],
    options: GeoOptions
  ): scala.Double = js.native
}

