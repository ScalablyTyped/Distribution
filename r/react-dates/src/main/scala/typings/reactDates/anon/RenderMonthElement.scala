package typings.reactDates.anon

import typings.moment.mod.Moment
import typings.react.mod.ReactNode
import typings.reactDates.mod.RenderMonthProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderMonthElement
  extends StObject
     with RenderMonthProps {
  
  var renderMonthElement: js.UndefOr[scala.Nothing] = js.undefined
  
  var renderMonthText: js.UndefOr[(js.Function1[/* month */ Moment, ReactNode]) | Null] = js.undefined
}
object RenderMonthElement {
  
  inline def apply(): RenderMonthElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderMonthElement]
  }
  
  extension [Self <: RenderMonthElement](x: Self) {
    
    inline def setRenderMonthText(value: /* month */ Moment => ReactNode): Self = StObject.set(x, "renderMonthText", js.Any.fromFunction1(value))
    
    inline def setRenderMonthTextNull: Self = StObject.set(x, "renderMonthText", null)
    
    inline def setRenderMonthTextUndefined: Self = StObject.set(x, "renderMonthText", js.undefined)
  }
}
