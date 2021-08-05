package typings.reactBootstrapTableNext.anon

import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TooltipFormatter[T /* <: js.Object */] extends StObject {
  
  var tooltipFormatter: js.UndefOr[js.Function1[/* row */ T, Element]] = js.undefined
}
object TooltipFormatter {
  
  inline def apply[T /* <: js.Object */](): TooltipFormatter[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipFormatter[T]]
  }
  
  extension [Self <: TooltipFormatter[?], T /* <: js.Object */](x: Self & TooltipFormatter[T]) {
    
    inline def setTooltipFormatter(value: /* row */ T => Element): Self = StObject.set(x, "tooltipFormatter", js.Any.fromFunction1(value))
    
    inline def setTooltipFormatterUndefined: Self = StObject.set(x, "tooltipFormatter", js.undefined)
  }
}
