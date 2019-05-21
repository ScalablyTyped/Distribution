package typings
package reactDashNativeDashMapsLib.reactDashNativeDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LatLng extends js.Object {
  var latitude: scala.Double
  var longitude: scala.Double
}

object LatLng {
  @scala.inline
  def apply(latitude: scala.Double, longitude: scala.Double): LatLng = {
    val __obj = js.Dynamic.literal(latitude = latitude, longitude = longitude)
  
    __obj.asInstanceOf[LatLng]
  }
}

