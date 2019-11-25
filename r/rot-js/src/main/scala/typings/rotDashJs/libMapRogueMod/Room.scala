package typings.rotDashJs.libMapRogueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Room extends js.Object {
  var cellx: Double
  var celly: Double
  var connections: js.Array[_]
  var height: Double
  var width: Double
  var x: Double
  var y: Double
}

object Room {
  @scala.inline
  def apply(
    cellx: Double,
    celly: Double,
    connections: js.Array[_],
    height: Double,
    width: Double,
    x: Double,
    y: Double
  ): Room = {
    val __obj = js.Dynamic.literal(cellx = cellx.asInstanceOf[js.Any], celly = celly.asInstanceOf[js.Any], connections = connections.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Room]
  }
}

