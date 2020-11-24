package typings.reactNativeDraggableFlatlist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnMoveEndInfo[ItemM] extends js.Object {
  
  var data: js.Array[ItemM] | Null = js.native
  
  var from: Double = js.native
  
  var row: ItemM = js.native
  
  var to: Double = js.native
}
object OnMoveEndInfo {
  
  @scala.inline
  def apply[ItemM](from: Double, row: ItemM, to: Double): OnMoveEndInfo[ItemM] = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnMoveEndInfo[ItemM]]
  }
  
  @scala.inline
  implicit class OnMoveEndInfoOps[Self <: OnMoveEndInfo[_], ItemM] (val x: Self with OnMoveEndInfo[ItemM]) extends AnyVal {
    
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
    def setFrom(value: Double): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRow(value: ItemM): Self = this.set("row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTo(value: Double): Self = this.set("to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: ItemM*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[ItemM]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataNull: Self = this.set("data", null)
  }
}
