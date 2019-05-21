package typings
package reactDashNativeDashMapsLib.reactDashNativeDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Region extends js.Object {
  var latitude: scala.Double
  var latitudeDelta: scala.Double
  var longitude: scala.Double
  var longitudeDelta: scala.Double
}

object Region {
  @scala.inline
  def apply(
    latitude: scala.Double,
    latitudeDelta: scala.Double,
    longitude: scala.Double,
    longitudeDelta: scala.Double
  ): Region = {
    val __obj = js.Dynamic.literal(latitude = latitude, latitudeDelta = latitudeDelta, longitude = longitude, longitudeDelta = longitudeDelta)
  
    __obj.asInstanceOf[Region]
  }
}

