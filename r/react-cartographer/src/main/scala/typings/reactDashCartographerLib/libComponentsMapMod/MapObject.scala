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
    val __obj = js.Dynamic.literal(data = data, mapId = mapId)
  
    __obj.asInstanceOf[MapObject]
  }
}

