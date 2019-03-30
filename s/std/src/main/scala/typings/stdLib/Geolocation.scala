package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The Geolocation interface represents an object able to programmatically obtain the position of the device. It gives Web content access to the location of the device. This allows a Web site or app to offer customized results based on the user's location. */
@js.native
trait Geolocation extends js.Object {
  def clearWatch(watchId: scala.Double): scala.Unit = js.native
  def getCurrentPosition(successCallback: PositionCallback): scala.Unit = js.native
  def getCurrentPosition(successCallback: PositionCallback, errorCallback: PositionErrorCallback): scala.Unit = js.native
  def getCurrentPosition(successCallback: PositionCallback, errorCallback: PositionErrorCallback, options: PositionOptions): scala.Unit = js.native
  def watchPosition(successCallback: PositionCallback): scala.Double = js.native
  def watchPosition(successCallback: PositionCallback, errorCallback: PositionErrorCallback): scala.Double = js.native
  def watchPosition(successCallback: PositionCallback, errorCallback: PositionErrorCallback, options: PositionOptions): scala.Double = js.native
}

