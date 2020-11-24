package typings.reactSortableHoc.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cancel extends js.Object {
  
  var cancel: js.UndefOr[js.Array[Double]] = js.native
  
  var down: js.UndefOr[js.Array[Double]] = js.native
  
  var drop: js.UndefOr[js.Array[Double]] = js.native
  
  var lift: js.UndefOr[js.Array[Double]] = js.native
  
  var up: js.UndefOr[js.Array[Double]] = js.native
}
object Cancel {
  
  @scala.inline
  def apply(): Cancel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cancel]
  }
  
  @scala.inline
  implicit class CancelOps[Self <: Cancel] (val x: Self) extends AnyVal {
    
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
    def setCancelVarargs(value: Double*): Self = this.set("cancel", js.Array(value :_*))
    
    @scala.inline
    def setCancel(value: js.Array[Double]): Self = this.set("cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    
    @scala.inline
    def setDownVarargs(value: Double*): Self = this.set("down", js.Array(value :_*))
    
    @scala.inline
    def setDown(value: js.Array[Double]): Self = this.set("down", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDown: Self = this.set("down", js.undefined)
    
    @scala.inline
    def setDropVarargs(value: Double*): Self = this.set("drop", js.Array(value :_*))
    
    @scala.inline
    def setDrop(value: js.Array[Double]): Self = this.set("drop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrop: Self = this.set("drop", js.undefined)
    
    @scala.inline
    def setLiftVarargs(value: Double*): Self = this.set("lift", js.Array(value :_*))
    
    @scala.inline
    def setLift(value: js.Array[Double]): Self = this.set("lift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLift: Self = this.set("lift", js.undefined)
    
    @scala.inline
    def setUpVarargs(value: Double*): Self = this.set("up", js.Array(value :_*))
    
    @scala.inline
    def setUp(value: js.Array[Double]): Self = this.set("up", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUp: Self = this.set("up", js.undefined)
  }
}
