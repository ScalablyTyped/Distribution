package typings.reactNativeMaps.anon

import typings.reactNativeMaps.mod.LatLng
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NorthEast extends js.Object {
  var northEast: LatLng
  var southWest: LatLng
}

object NorthEast {
  @scala.inline
  def apply(northEast: LatLng, southWest: LatLng): NorthEast = {
    val __obj = js.Dynamic.literal(northEast = northEast.asInstanceOf[js.Any], southWest = southWest.asInstanceOf[js.Any])
    __obj.asInstanceOf[NorthEast]
  }
}

