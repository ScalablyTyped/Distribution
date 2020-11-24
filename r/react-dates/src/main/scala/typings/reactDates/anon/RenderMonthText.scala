package typings.reactDates.anon

import typings.react.mod.ReactNode
import typings.reactDates.mod.RenderMonthProps
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
  implicit class RenderMonthTextOps[Self <: RenderMonthText] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRenderMonthElement(value: /* props */ IsVisible => ReactNode): Self = this.set("renderMonthElement", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRenderMonthElement: Self = this.set("renderMonthElement", js.undefined)
    
    @scala.inline
    def setRenderMonthElementNull: Self = this.set("renderMonthElement", null)
  }
}
