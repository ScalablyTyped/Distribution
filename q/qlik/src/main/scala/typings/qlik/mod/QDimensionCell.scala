package typings.qlik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QDimensionCell extends StObject {
  
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
  implicit class QDimensionCellMutableBuilder[Self <: QDimensionCell] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQElemNumber(value: Double): Self = StObject.set(x, "qElemNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQNum(value: Double): Self = StObject.set(x, "qNum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQNumUndefined: Self = StObject.set(x, "qNum", js.undefined)
    
    @scala.inline
    def setQState(value: String): Self = StObject.set(x, "qState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQText(value: String): Self = StObject.set(x, "qText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelect(value: () => Unit): Self = StObject.set(x, "select", js.Any.fromFunction0(value))
  }
}
