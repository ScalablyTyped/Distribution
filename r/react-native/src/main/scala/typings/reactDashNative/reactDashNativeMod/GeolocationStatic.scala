package typings.reactDashNative.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeolocationStatic extends js.Object {
  def clearWatch(watchID: Double): Unit = js.native
  /**
    * Invokes the success callback once with the latest location info.  Supported
    * options: timeout (ms), maximumAge (ms), enableHighAccuracy (bool)
    * On Android, this can return almost immediately if the location is cached or
    * request an update, which might take a while.
    */
  def getCurrentPosition(geo_success: js.Function1[/* position */ GeolocationReturnType, Unit]): Unit = js.native
  def getCurrentPosition(
    geo_success: js.Function1[/* position */ GeolocationReturnType, Unit],
    geo_error: js.Function1[/* error */ GeolocationError, Unit]
  ): Unit = js.native
  def getCurrentPosition(
    geo_success: js.Function1[/* position */ GeolocationReturnType, Unit],
    geo_error: js.Function1[/* error */ GeolocationError, Unit],
    geo_options: GeoOptions
  ): Unit = js.native
  def requestAuthorization(): Unit = js.native
  def setRNConfiguration(config: GeoConfiguration): Unit = js.native
  def stopObserving(): Unit = js.native
  /**
    * Invokes the success callback whenever the location changes.  Supported
    * options: timeout (ms), maximumAge (ms), enableHighAccuracy (bool), distanceFilter(m)
    */
  def watchPosition(success: js.Function1[/* position */ GeolocationReturnType, Unit]): Double = js.native
  def watchPosition(
    success: js.Function1[/* position */ GeolocationReturnType, Unit],
    error: js.Function1[/* error */ GeolocationError, Unit]
  ): Double = js.native
  def watchPosition(
    success: js.Function1[/* position */ GeolocationReturnType, Unit],
    error: js.Function1[/* error */ GeolocationError, Unit],
    options: GeoOptions
  ): Double = js.native
}

