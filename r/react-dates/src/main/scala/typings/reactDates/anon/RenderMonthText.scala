package typings.reactDates.anon

import typings.react.mod.ReactNode
import typings.reactDates.mod.RenderMonthProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderMonthText
  extends StObject
     with RenderMonthProps {
  
  var renderMonthElement: js.UndefOr[(js.Function1[/* props */ IsVisible, ReactNode]) | Null] = js.undefined
  
  var renderMonthText: js.UndefOr[scala.Nothing] = js.undefined
}
object RenderMonthText {
  
  inline def apply(): RenderMonthText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderMonthText]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RenderMonthText] (val x: Self) extends AnyVal {
    
    inline def setRenderMonthElement(value: /* props */ IsVisible => ReactNode): Self = StObject.set(x, "renderMonthElement", js.Any.fromFunction1(value))
    
    inline def setRenderMonthElementNull: Self = StObject.set(x, "renderMonthElement", null)
    
    inline def setRenderMonthElementUndefined: Self = StObject.set(x, "renderMonthElement", js.undefined)
  }
}
