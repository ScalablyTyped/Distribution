package typings.reactVis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HexbinSeriesProps extends AbstractSeriesProps[ContourSeriesPoint] {
  
  var radius: js.UndefOr[Double] = js.native
  
  var sizeHexagonsWithCount: js.UndefOr[Boolean] = js.native
  
  var xOffset: js.UndefOr[Double] = js.native
  
  var yOffset: js.UndefOr[Double] = js.native
}
object HexbinSeriesProps {
  
  @scala.inline
  def apply(): HexbinSeriesProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HexbinSeriesProps]
  }
  
  @scala.inline
  implicit class HexbinSeriesPropsOps[Self <: HexbinSeriesProps] (val x: Self) extends AnyVal {
    
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
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
    
    @scala.inline
    def setSizeHexagonsWithCount(value: Boolean): Self = this.set("sizeHexagonsWithCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizeHexagonsWithCount: Self = this.set("sizeHexagonsWithCount", js.undefined)
    
    @scala.inline
    def setXOffset(value: Double): Self = this.set("xOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXOffset: Self = this.set("xOffset", js.undefined)
    
    @scala.inline
    def setYOffset(value: Double): Self = this.set("yOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYOffset: Self = this.set("yOffset", js.undefined)
  }
}
