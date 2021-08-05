package typings.reactOnsenui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalculateItemHeight extends StObject {
  
  def calculateItemHeight(rowIndex: Double): js.Any
  
  var length: js.UndefOr[Double] = js.undefined
  
  var modifier: js.UndefOr[String] = js.undefined
  
  def renderRow(rowIndex: Double): js.Any
}
object CalculateItemHeight {
  
  inline def apply(calculateItemHeight: Double => js.Any, renderRow: Double => js.Any): CalculateItemHeight = {
    val __obj = js.Dynamic.literal(calculateItemHeight = js.Any.fromFunction1(calculateItemHeight), renderRow = js.Any.fromFunction1(renderRow))
    __obj.asInstanceOf[CalculateItemHeight]
  }
  
  extension [Self <: CalculateItemHeight](x: Self) {
    
    inline def setCalculateItemHeight(value: Double => js.Any): Self = StObject.set(x, "calculateItemHeight", js.Any.fromFunction1(value))
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setModifier(value: String): Self = StObject.set(x, "modifier", value.asInstanceOf[js.Any])
    
    inline def setModifierUndefined: Self = StObject.set(x, "modifier", js.undefined)
    
    inline def setRenderRow(value: Double => js.Any): Self = StObject.set(x, "renderRow", js.Any.fromFunction1(value))
  }
}
