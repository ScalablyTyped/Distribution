package typings.reactDates.anon

import typings.react.mod.ReactNode
import typings.reactDates.mod.RenderMonthProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderMonthText extends RenderMonthProps {
  
  var renderMonthElement: js.UndefOr[(js.Function1[/* props */ IsVisible, ReactNode]) | Null] = js.native
  
  var renderMonthText: js.UndefOr[scala.Nothing] = js.native
}
object RenderMonthText {
  
  @scala.inline
  def apply(): RenderMonthText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderMonthText]
  }
  
  @scala.inline
  implicit class RenderMonthTextMutableBuilder[Self <: RenderMonthText] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRenderMonthElement(value: /* props */ IsVisible => ReactNode): Self = StObject.set(x, "renderMonthElement", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenderMonthElementNull: Self = StObject.set(x, "renderMonthElement", null)
    
    @scala.inline
    def setRenderMonthElementUndefined: Self = StObject.set(x, "renderMonthElement", js.undefined)
  }
}
