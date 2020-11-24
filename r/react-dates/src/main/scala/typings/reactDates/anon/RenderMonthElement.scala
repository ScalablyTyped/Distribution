package typings.reactDates.anon

import typings.moment.mod.Moment
import typings.react.mod.ReactNode
import typings.reactDates.mod.RenderMonthProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderMonthElement extends RenderMonthProps {
  
  var renderMonthElement: js.UndefOr[scala.Nothing] = js.native
  
  var renderMonthText: js.UndefOr[(js.Function1[/* month */ Moment, ReactNode]) | Null] = js.native
}
object RenderMonthElement {
  
  @scala.inline
  def apply(): RenderMonthElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderMonthElement]
  }
  
  @scala.inline
  implicit class RenderMonthElementOps[Self <: RenderMonthElement] (val x: Self) extends AnyVal {
    
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
    def setRenderMonthText(value: /* month */ Moment => ReactNode): Self = this.set("renderMonthText", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRenderMonthText: Self = this.set("renderMonthText", js.undefined)
    
    @scala.inline
    def setRenderMonthTextNull: Self = this.set("renderMonthText", null)
  }
}
