package typings.reactCartographer.mapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapObject extends js.Object {
  var data: MapData
  var mapId: String
}

object MapObject {
  @scala.inline
  def apply(data: MapData, mapId: String): MapObject = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], mapId = mapId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapObject]
  }
}

