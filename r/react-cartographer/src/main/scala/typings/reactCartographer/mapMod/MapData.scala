package typings.reactCartographer.mapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapData extends js.Object {
  var locationLink: js.Any = js.native
  var locationText: String = js.native
}

object MapData {
  @scala.inline
  def apply(locationLink: js.Any, locationText: String): MapData = {
    val __obj = js.Dynamic.literal(locationLink = locationLink.asInstanceOf[js.Any], locationText = locationText.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapData]
  }
  @scala.inline
  implicit class MapDataOps[Self <: MapData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLocationLink(value: js.Any): Self = this.set("locationLink", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocationText(value: String): Self = this.set("locationText", value.asInstanceOf[js.Any])
  }
  
}

