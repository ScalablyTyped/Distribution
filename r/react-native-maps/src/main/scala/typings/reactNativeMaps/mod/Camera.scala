package typings.reactNativeMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Camera extends js.Object {
  var altitude: Double
  var center: LatLng
  var heading: Double
  var pitch: Double
  var zoom: Double
}

object Camera {
  @scala.inline
  def apply(altitude: Double, center: LatLng, heading: Double, pitch: Double, zoom: Double): Camera = {
    val __obj = js.Dynamic.literal(altitude = altitude.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], heading = heading.asInstanceOf[js.Any], pitch = pitch.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Camera]
  }
}

