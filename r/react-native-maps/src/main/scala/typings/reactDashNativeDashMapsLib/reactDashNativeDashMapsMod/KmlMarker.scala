package typings
package reactDashNativeDashMapsLib.reactDashNativeDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KmlMarker extends js.Object {
  var coordinate: LatLng
  var description: java.lang.String
  var id: java.lang.String
  var position: Point
  var title: java.lang.String
}

object KmlMarker {
  @scala.inline
  def apply(
    coordinate: LatLng,
    description: java.lang.String,
    id: java.lang.String,
    position: Point,
    title: java.lang.String
  ): KmlMarker = {
    val __obj = js.Dynamic.literal(coordinate = coordinate, description = description, id = id, position = position, title = title)
  
    __obj.asInstanceOf[KmlMarker]
  }
}

