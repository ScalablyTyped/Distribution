package typings
package reactDashNativeDashMapsLib.reactDashNativeDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Camera extends js.Object {
  var altitude: scala.Double
  var center: LatLng
  var heading: scala.Double
  var pitch: scala.Double
  var zoom: scala.Double
}

object Camera {
  @scala.inline
  def apply(
    altitude: scala.Double,
    center: LatLng,
    heading: scala.Double,
    pitch: scala.Double,
    zoom: scala.Double
  ): Camera = {
    val __obj = js.Dynamic.literal(altitude = altitude, center = center, heading = heading, pitch = pitch, zoom = zoom)
  
    __obj.asInstanceOf[Camera]
  }
}

