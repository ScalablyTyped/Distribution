package typings.reactNativeMaps

import typings.reactNativeMaps.mod.LatLng
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNorthEast extends js.Object {
  var northEast: LatLng
  var southWest: LatLng
}

object AnonNorthEast {
  @scala.inline
  def apply(northEast: LatLng, southWest: LatLng): AnonNorthEast = {
    val __obj = js.Dynamic.literal(northEast = northEast.asInstanceOf[js.Any], southWest = southWest.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNorthEast]
  }
}

