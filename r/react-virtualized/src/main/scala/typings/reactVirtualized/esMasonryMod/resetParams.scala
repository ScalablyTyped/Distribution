package typings.reactVirtualized.esMasonryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait resetParams extends js.Object {
  
  var columnCount: Double = js.native
  
  var columnWidth: Double = js.native
  
  var spacer: js.UndefOr[Double] = js.native
}
object resetParams {
  
  @scala.inline
  def apply(columnCount: Double, columnWidth: Double): resetParams = {
    val __obj = js.Dynamic.literal(columnCount = columnCount.asInstanceOf[js.Any], columnWidth = columnWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[resetParams]
  }
  
  @scala.inline
  implicit class resetParamsOps[Self <: resetParams] (val x: Self) extends AnyVal {
    
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
    def setColumnCount(value: Double): Self = this.set("columnCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnWidth(value: Double): Self = this.set("columnWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacer(value: Double): Self = this.set("spacer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpacer: Self = this.set("spacer", js.undefined)
  }
}
