package typings.reactCartographer.mapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapObject extends js.Object {
  var data: MapData = js.native
  var mapId: String = js.native
}

object MapObject {
  @scala.inline
  def apply(data: MapData, mapId: String): MapObject = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], mapId = mapId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapObject]
  }
  @scala.inline
  implicit class MapObjectOps[Self <: MapObject] (val x: Self) extends AnyVal {
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
    def setData(value: MapData): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setMapId(value: String): Self = this.set("mapId", value.asInstanceOf[js.Any])
  }
  
}

