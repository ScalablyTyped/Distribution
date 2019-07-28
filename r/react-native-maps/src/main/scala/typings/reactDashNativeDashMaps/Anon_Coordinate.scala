package typings.reactDashNativeDashMaps

import typings.reactDashNativeDashMaps.reactDashNativeDashMapsMod.LatLng
import typings.reactDashNativeDashMaps.reactDashNativeDashMapsMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Coordinate extends js.Object {
  var coordinate: LatLng
  var position: Point
}

object Anon_Coordinate {
  @scala.inline
  def apply(coordinate: LatLng, position: Point): Anon_Coordinate = {
    val __obj = js.Dynamic.literal(coordinate = coordinate, position = position)
  
    __obj.asInstanceOf[Anon_Coordinate]
  }
}

