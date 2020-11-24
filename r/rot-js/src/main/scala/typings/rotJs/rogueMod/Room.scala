package typings.rotJs.rogueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Room extends js.Object {
  
  var cellx: Double = js.native
  
  var celly: Double = js.native
  
  var connections: js.Array[_] = js.native
  
  var height: Double = js.native
  
  var width: Double = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
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
  
  @scala.inline
  implicit class RoomOps[Self <: Room] (val x: Self) extends AnyVal {
    
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
    def setCellx(value: Double): Self = this.set("cellx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCelly(value: Double): Self = this.set("celly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionsVarargs(value: js.Any*): Self = this.set("connections", js.Array(value :_*))
    
    @scala.inline
    def setConnections(value: js.Array[_]): Self = this.set("connections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
}
