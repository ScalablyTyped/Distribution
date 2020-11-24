package typings.reactVis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RectSeriesProps extends AbstractSeriesProps[RectSeriesPoint] {
  
  var linePosAttr: js.UndefOr[String] = js.native
  
  var lineSizeAttr: js.UndefOr[String] = js.native
  
  var valuePosAttr: js.UndefOr[String] = js.native
  
  var valueSizeAttr: js.UndefOr[String] = js.native
}
object RectSeriesProps {
  
  @scala.inline
  def apply(): RectSeriesProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RectSeriesProps]
  }
  
  @scala.inline
  implicit class RectSeriesPropsOps[Self <: RectSeriesProps] (val x: Self) extends AnyVal {
    
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
    def setLinePosAttr(value: String): Self = this.set("linePosAttr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinePosAttr: Self = this.set("linePosAttr", js.undefined)
    
    @scala.inline
    def setLineSizeAttr(value: String): Self = this.set("lineSizeAttr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineSizeAttr: Self = this.set("lineSizeAttr", js.undefined)
    
    @scala.inline
    def setValuePosAttr(value: String): Self = this.set("valuePosAttr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValuePosAttr: Self = this.set("valuePosAttr", js.undefined)
    
    @scala.inline
    def setValueSizeAttr(value: String): Self = this.set("valueSizeAttr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueSizeAttr: Self = this.set("valueSizeAttr", js.undefined)
  }
}
