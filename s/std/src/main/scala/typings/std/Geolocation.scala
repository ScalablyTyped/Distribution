package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object able to programmatically obtain the position of the device. It gives Web content access to the location of the device. This allows a Web site or app to offer customized results based on the user's location.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Geolocation)
  */
@js.native
trait Geolocation extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Geolocation/clearWatch) */
  /* standard dom */
  def clearWatch(watchId: Double): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Geolocation/getCurrentPosition) */
  /* standard dom */
  def getCurrentPosition(successCallback: PositionCallback): Unit = js.native
  def getCurrentPosition(successCallback: PositionCallback, errorCallback: Null, options: PositionOptions): Unit = js.native
  def getCurrentPosition(successCallback: PositionCallback, errorCallback: Unit, options: PositionOptions): Unit = js.native
  def getCurrentPosition(successCallback: PositionCallback, errorCallback: PositionErrorCallback): Unit = js.native
  def getCurrentPosition(successCallback: PositionCallback, errorCallback: PositionErrorCallback, options: PositionOptions): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Geolocation/watchPosition) */
  /* standard dom */
  def watchPosition(successCallback: PositionCallback): Double = js.native
  def watchPosition(successCallback: PositionCallback, errorCallback: Null, options: PositionOptions): Double = js.native
  def watchPosition(successCallback: PositionCallback, errorCallback: Unit, options: PositionOptions): Double = js.native
  def watchPosition(successCallback: PositionCallback, errorCallback: PositionErrorCallback): Double = js.native
  def watchPosition(successCallback: PositionCallback, errorCallback: PositionErrorCallback, options: PositionOptions): Double = js.native
}
