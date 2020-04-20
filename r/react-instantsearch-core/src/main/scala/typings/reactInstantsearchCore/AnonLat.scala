package typings.reactInstantsearchCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLat extends js.Object {
  var lat: Double
  var lng: Double
}

object AnonLat {
  @scala.inline
  def apply(lat: Double, lng: Double): AnonLat = {
    val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLat]
  }
}

