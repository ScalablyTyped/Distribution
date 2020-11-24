package typings.qlik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QDimensionCell extends js.Object {
  
  var qElemNumber: Double = js.native
  
  var qNum: js.UndefOr[Double] = js.native
  
  var qState: String = js.native
  
  var qText: String = js.native
  
  def select(): Unit = js.native
}
object QDimensionCell {
  
  @scala.inline
  def apply(qElemNumber: Double, qState: String, qText: String, select: () => Unit): QDimensionCell = {
    val __obj = js.Dynamic.literal(qElemNumber = qElemNumber.asInstanceOf[js.Any], qState = qState.asInstanceOf[js.Any], qText = qText.asInstanceOf[js.Any], select = js.Any.fromFunction0(select))
    __obj.asInstanceOf[QDimensionCell]
  }
  
  @scala.inline
  implicit class QDimensionCellOps[Self <: QDimensionCell] (val x: Self) extends AnyVal {
    
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
    def setQElemNumber(value: Double): Self = this.set("qElemNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQState(value: String): Self = this.set("qState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQText(value: String): Self = this.set("qText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelect(value: () => Unit): Self = this.set("select", js.Any.fromFunction0(value))
    
    @scala.inline
    def setQNum(value: Double): Self = this.set("qNum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQNum: Self = this.set("qNum", js.undefined)
  }
}
