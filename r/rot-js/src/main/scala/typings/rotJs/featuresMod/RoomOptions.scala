package typings.rotJs.featuresMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoomOptions extends js.Object {
  
  var roomHeight: js.Tuple2[Double, Double] = js.native
  
  var roomWidth: js.Tuple2[Double, Double] = js.native
}
object RoomOptions {
  
  @scala.inline
  def apply(roomHeight: js.Tuple2[Double, Double], roomWidth: js.Tuple2[Double, Double]): RoomOptions = {
    val __obj = js.Dynamic.literal(roomHeight = roomHeight.asInstanceOf[js.Any], roomWidth = roomWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoomOptions]
  }
  
  @scala.inline
  implicit class RoomOptionsOps[Self <: RoomOptions] (val x: Self) extends AnyVal {
    
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
    def setRoomHeight(value: js.Tuple2[Double, Double]): Self = this.set("roomHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoomWidth(value: js.Tuple2[Double, Double]): Self = this.set("roomWidth", value.asInstanceOf[js.Any])
  }
}
