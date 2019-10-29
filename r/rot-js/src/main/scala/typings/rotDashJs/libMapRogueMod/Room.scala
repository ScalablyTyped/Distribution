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
    val __obj = js.Dynamic.literal(cellx = cellx, celly = celly, connections = connections, height = height, width = width, x = x, y = y)
  
    __obj.asInstanceOf[Room]
  }
}

