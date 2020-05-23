package typings.reactInstantsearchCore.mod

import typings.reactInstantsearchCore.anon.Lat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NESW extends js.Object {
  var northEast: Lat
  var southWest: Lat
}

object NESW {
  @scala.inline
  def apply(northEast: Lat, southWest: Lat): NESW = {
    val __obj = js.Dynamic.literal(northEast = northEast.asInstanceOf[js.Any], southWest = southWest.asInstanceOf[js.Any])
    __obj.asInstanceOf[NESW]
  }
}

