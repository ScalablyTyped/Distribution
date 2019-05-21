package typings
package reactDashNativeDashMapsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Coordinate extends js.Object {
  var coordinate: reactDashNativeDashMapsLib.reactDashNativeDashMapsMod.LatLng
  var position: reactDashNativeDashMapsLib.reactDashNativeDashMapsMod.Point
}

object Anon_Coordinate {
  @scala.inline
  def apply(
    coordinate: reactDashNativeDashMapsLib.reactDashNativeDashMapsMod.LatLng,
    position: reactDashNativeDashMapsLib.reactDashNativeDashMapsMod.Point
  ): Anon_Coordinate = {
    val __obj = js.Dynamic.literal(coordinate = coordinate, position = position)
  
    __obj.asInstanceOf[Anon_Coordinate]
  }
}

