package typings
package reactDashCartographerLib.libComponentsMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapObject extends js.Object {
  var data: MapData
  var mapId: java.lang.String
}

object MapObject {
  @scala.inline
  def apply(data: MapData, mapId: java.lang.String): MapObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("mapId")(mapId)
    __obj.asInstanceOf[MapObject]
  }
}

