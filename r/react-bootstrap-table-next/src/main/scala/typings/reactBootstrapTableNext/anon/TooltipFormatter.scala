package typings.reactBootstrapTableNext.anon

import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TooltipFormatter[T /* <: js.Object */] extends StObject {
  
  var tooltipFormatter: js.UndefOr[js.Function1[/* row */ T, Element]] = js.undefined
}
object TooltipFormatter {
  
  @scala.inline
  def apply[T /* <: js.Object */](): TooltipFormatter[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipFormatter[T]]
  }
  
  @scala.inline
  implicit class TooltipFormatterMutableBuilder[Self <: TooltipFormatter[?], T /* <: js.Object */] (val x: Self & TooltipFormatter[T]) extends AnyVal {
    
    @scala.inline
    def setTooltipFormatter(value: /* row */ T => Element): Self = StObject.set(x, "tooltipFormatter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTooltipFormatterUndefined: Self = StObject.set(x, "tooltipFormatter", js.undefined)
  }
}
