package typings.reactVirtualized.esArrowKeyStepperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScrollIndices extends js.Object {
  
  var scrollToColumn: Double = js.native
  
  var scrollToRow: Double = js.native
}
object ScrollIndices {
  
  @scala.inline
  def apply(scrollToColumn: Double, scrollToRow: Double): ScrollIndices = {
    val __obj = js.Dynamic.literal(scrollToColumn = scrollToColumn.asInstanceOf[js.Any], scrollToRow = scrollToRow.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollIndices]
  }
  
  @scala.inline
  implicit class ScrollIndicesOps[Self <: ScrollIndices] (val x: Self) extends AnyVal {
    
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
    def setScrollToColumn(value: Double): Self = this.set("scrollToColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollToRow(value: Double): Self = this.set("scrollToRow", value.asInstanceOf[js.Any])
  }
}
