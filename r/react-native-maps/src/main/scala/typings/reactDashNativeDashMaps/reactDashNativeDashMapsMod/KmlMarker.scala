package typings.reactDashNativeDashMaps.reactDashNativeDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KmlMarker extends js.Object {
  var coordinate: LatLng
  var description: String
  var id: String
  var position: Point
  var title: String
}

object KmlMarker {
  @scala.inline
  def apply(coordinate: LatLng, description: String, id: String, position: Point, title: String): KmlMarker = {
    val __obj = js.Dynamic.literal(coordinate = coordinate, description = description, id = id, position = position, title = title)
  
    __obj.asInstanceOf[KmlMarker]
  }
}

