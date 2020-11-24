package typings.rotJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<rot-js.rot-js/lib/map/uniform.Options> */
@js.native
trait PartialOptionsRoomDugPercentage extends js.Object {
  
  var roomDugPercentage: js.UndefOr[Double] = js.native
  
  var roomHeight: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  
  var roomWidth: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  
  var timeLimit: js.UndefOr[Double] = js.native
}
object PartialOptionsRoomDugPercentage {
  
  @scala.inline
  def apply(): PartialOptionsRoomDugPercentage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptionsRoomDugPercentage]
  }
  
  @scala.inline
  implicit class PartialOptionsRoomDugPercentageOps[Self <: PartialOptionsRoomDugPercentage] (val x: Self) extends AnyVal {
    
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
    def setRoomDugPercentage(value: Double): Self = this.set("roomDugPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoomDugPercentage: Self = this.set("roomDugPercentage", js.undefined)
    
    @scala.inline
    def setRoomHeight(value: js.Tuple2[Double, Double]): Self = this.set("roomHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoomHeight: Self = this.set("roomHeight", js.undefined)
    
    @scala.inline
    def setRoomWidth(value: js.Tuple2[Double, Double]): Self = this.set("roomWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoomWidth: Self = this.set("roomWidth", js.undefined)
    
    @scala.inline
    def setTimeLimit(value: Double): Self = this.set("timeLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeLimit: Self = this.set("timeLimit", js.undefined)
  }
}
