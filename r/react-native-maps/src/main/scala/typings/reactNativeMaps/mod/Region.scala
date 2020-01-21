package typings.reactNativeMaps.mod

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
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], latitudeDelta = latitudeDelta.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], longitudeDelta = longitudeDelta.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Region]
  }
}

