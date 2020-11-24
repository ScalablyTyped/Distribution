package typings.reactVirtualized.esColumnSizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SizedColumnProps extends js.Object {
  
  var adjustedWidth: Double = js.native
  
  var columnWidth: Double = js.native
  
  def getColumnWidth(): Double = js.native
  
  var registerChild: js.Any = js.native
}
object SizedColumnProps {
  
  @scala.inline
  def apply(adjustedWidth: Double, columnWidth: Double, getColumnWidth: () => Double, registerChild: js.Any): SizedColumnProps = {
    val __obj = js.Dynamic.literal(adjustedWidth = adjustedWidth.asInstanceOf[js.Any], columnWidth = columnWidth.asInstanceOf[js.Any], getColumnWidth = js.Any.fromFunction0(getColumnWidth), registerChild = registerChild.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizedColumnProps]
  }
  
  @scala.inline
  implicit class SizedColumnPropsOps[Self <: SizedColumnProps] (val x: Self) extends AnyVal {
    
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
    def setAdjustedWidth(value: Double): Self = this.set("adjustedWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnWidth(value: Double): Self = this.set("columnWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetColumnWidth(value: () => Double): Self = this.set("getColumnWidth", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRegisterChild(value: js.Any): Self = this.set("registerChild", value.asInstanceOf[js.Any])
  }
}
