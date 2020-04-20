package typings.reactCartographer.mapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapData extends js.Object {
  var locationLink: js.Any
  var locationText: String
}

object MapData {
  @scala.inline
  def apply(locationLink: js.Any, locationText: String): MapData = {
    val __obj = js.Dynamic.literal(locationLink = locationLink.asInstanceOf[js.Any], locationText = locationText.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapData]
  }
}

