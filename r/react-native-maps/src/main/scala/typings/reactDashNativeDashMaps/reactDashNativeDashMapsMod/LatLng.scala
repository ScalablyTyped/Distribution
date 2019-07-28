package typings.reactDashNativeDashMaps.reactDashNativeDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LatLng extends js.Object {
  var latitude: Double
  var longitude: Double
}

object LatLng {
  @scala.inline
  def apply(latitude: Double, longitude: Double): LatLng = {
    val __obj = js.Dynamic.literal(latitude = latitude, longitude = longitude)
  
    __obj.asInstanceOf[LatLng]
  }
}

