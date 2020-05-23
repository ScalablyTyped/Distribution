package typings.reactNativeMaps.anon

import typings.reactNativeMaps.mod.LatLng
import typings.reactNativeMaps.mod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Coordinate extends js.Object {
  var coordinate: LatLng
  var position: Point
}

object Coordinate {
  @scala.inline
  def apply(coordinate: LatLng, position: Point): Coordinate = {
    val __obj = js.Dynamic.literal(coordinate = coordinate.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Coordinate]
  }
}

