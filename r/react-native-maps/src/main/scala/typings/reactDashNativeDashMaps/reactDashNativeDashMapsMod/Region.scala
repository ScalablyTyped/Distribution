package typings.reactDashNativeDashMaps.reactDashNativeDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Region extends js.Object {
  var latitude: Double
  var latitudeDelta: Double
  var longitude: Double
  var longitudeDelta: Double
}

object Region {
  @scala.inline
  def apply(latitude: Double, latitudeDelta: Double, longitude: Double, longitudeDelta: Double): Region = {
    val __obj = js.Dynamic.literal(latitude = latitude, latitudeDelta = latitudeDelta, longitude = longitude, longitudeDelta = longitudeDelta)
  
    __obj.asInstanceOf[Region]
  }
}

