package typings.reactInstantsearchCore.mod

import typings.reactInstantsearchCore.AnonLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NESW extends js.Object {
  var northEast: AnonLat
  var southWest: AnonLat
}

object NESW {
  @scala.inline
  def apply(northEast: AnonLat, southWest: AnonLat): NESW = {
    val __obj = js.Dynamic.literal(northEast = northEast.asInstanceOf[js.Any], southWest = southWest.asInstanceOf[js.Any])
    __obj.asInstanceOf[NESW]
  }
}

