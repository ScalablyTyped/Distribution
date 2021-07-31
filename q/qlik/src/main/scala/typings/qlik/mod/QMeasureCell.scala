package typings.qlik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QMeasureCell extends StObject {
  
  def getPercent(): Double
  
  def getPercentOfMax(): Double
  
  var qNum: js.UndefOr[Double] = js.undefined
  
  var qText: String
}
object QMeasureCell {
  
  @scala.inline
  def apply(getPercent: () => Double, getPercentOfMax: () => Double, qText: String): QMeasureCell = {
    val __obj = js.Dynamic.literal(getPercent = js.Any.fromFunction0(getPercent), getPercentOfMax = js.Any.fromFunction0(getPercentOfMax), qText = qText.asInstanceOf[js.Any])
    __obj.asInstanceOf[QMeasureCell]
  }
  
  @scala.inline
  implicit class QMeasureCellMutableBuilder[Self <: QMeasureCell] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetPercent(value: () => Double): Self = StObject.set(x, "getPercent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPercentOfMax(value: () => Double): Self = StObject.set(x, "getPercentOfMax", js.Any.fromFunction0(value))
    
    @scala.inline
    def setQNum(value: Double): Self = StObject.set(x, "qNum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQNumUndefined: Self = StObject.set(x, "qNum", js.undefined)
    
    @scala.inline
    def setQText(value: String): Self = StObject.set(x, "qText", value.asInstanceOf[js.Any])
  }
}
