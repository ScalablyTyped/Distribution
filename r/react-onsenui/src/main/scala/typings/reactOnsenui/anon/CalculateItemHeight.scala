package typings.reactOnsenui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CalculateItemHeight extends StObject {
  
  def calculateItemHeight(rowIndex: Double): js.Any = js.native
  
  var length: js.UndefOr[Double] = js.native
  
  var modifier: js.UndefOr[String] = js.native
  
  def renderRow(rowIndex: Double): js.Any = js.native
}
object CalculateItemHeight {
  
  @scala.inline
  def apply(calculateItemHeight: Double => js.Any, renderRow: Double => js.Any): CalculateItemHeight = {
    val __obj = js.Dynamic.literal(calculateItemHeight = js.Any.fromFunction1(calculateItemHeight), renderRow = js.Any.fromFunction1(renderRow))
    __obj.asInstanceOf[CalculateItemHeight]
  }
  
  @scala.inline
  implicit class CalculateItemHeightMutableBuilder[Self <: CalculateItemHeight] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCalculateItemHeight(value: Double => js.Any): Self = StObject.set(x, "calculateItemHeight", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    @scala.inline
    def setModifier(value: String): Self = StObject.set(x, "modifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifierUndefined: Self = StObject.set(x, "modifier", js.undefined)
    
    @scala.inline
    def setRenderRow(value: Double => js.Any): Self = StObject.set(x, "renderRow", js.Any.fromFunction1(value))
  }
}
