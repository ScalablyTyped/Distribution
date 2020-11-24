package typings.reactVirtualized.esArrowKeyStepperMod

import typings.reactVirtualized.esGridMod.RenderedSection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChildProps extends js.Object {
  
  def onSectionRendered(params: RenderedSection): Unit = js.native
  
  var scrollToColumn: Double = js.native
  
  var scrollToRow: Double = js.native
}
object ChildProps {
  
  @scala.inline
  def apply(onSectionRendered: RenderedSection => Unit, scrollToColumn: Double, scrollToRow: Double): ChildProps = {
    val __obj = js.Dynamic.literal(onSectionRendered = js.Any.fromFunction1(onSectionRendered), scrollToColumn = scrollToColumn.asInstanceOf[js.Any], scrollToRow = scrollToRow.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildProps]
  }
  
  @scala.inline
  implicit class ChildPropsOps[Self <: ChildProps] (val x: Self) extends AnyVal {
    
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
    def setOnSectionRendered(value: RenderedSection => Unit): Self = this.set("onSectionRendered", js.Any.fromFunction1(value))
    
    @scala.inline
    def setScrollToColumn(value: Double): Self = this.set("scrollToColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollToRow(value: Double): Self = this.set("scrollToRow", value.asInstanceOf[js.Any])
  }
}
