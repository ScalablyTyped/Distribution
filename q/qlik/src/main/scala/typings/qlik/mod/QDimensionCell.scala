package typings.qlik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QDimensionCell extends StObject {
  
  var qElemNumber: Double
  
  var qNum: js.UndefOr[Double] = js.undefined
  
  var qState: String
  
  var qText: String
  
  def select(): Unit
}
object QDimensionCell {
  
  inline def apply(qElemNumber: Double, qState: String, qText: String, select: () => Unit): QDimensionCell = {
    val __obj = js.Dynamic.literal(qElemNumber = qElemNumber.asInstanceOf[js.Any], qState = qState.asInstanceOf[js.Any], qText = qText.asInstanceOf[js.Any], select = js.Any.fromFunction0(select))
    __obj.asInstanceOf[QDimensionCell]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QDimensionCell] (val x: Self) extends AnyVal {
    
    inline def setQElemNumber(value: Double): Self = StObject.set(x, "qElemNumber", value.asInstanceOf[js.Any])
    
    inline def setQNum(value: Double): Self = StObject.set(x, "qNum", value.asInstanceOf[js.Any])
    
    inline def setQNumUndefined: Self = StObject.set(x, "qNum", js.undefined)
    
    inline def setQState(value: String): Self = StObject.set(x, "qState", value.asInstanceOf[js.Any])
    
    inline def setQText(value: String): Self = StObject.set(x, "qText", value.asInstanceOf[js.Any])
    
    inline def setSelect(value: () => Unit): Self = StObject.set(x, "select", js.Any.fromFunction0(value))
  }
}
