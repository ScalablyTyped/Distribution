package typings.reactNativeChartsWrapper.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AxisDependency extends js.Object {
  
  var axisDependency: js.UndefOr[typings.reactNativeChartsWrapper.mod.AxisDependency] = js.native
  
  var scaleX: Double = js.native
  
  var scaleY: Double = js.native
  
  var xValue: Double = js.native
  
  var yValue: Double = js.native
}
object AxisDependency {
  
  @scala.inline
  def apply(scaleX: Double, scaleY: Double, xValue: Double, yValue: Double): AxisDependency = {
    val __obj = js.Dynamic.literal(scaleX = scaleX.asInstanceOf[js.Any], scaleY = scaleY.asInstanceOf[js.Any], xValue = xValue.asInstanceOf[js.Any], yValue = yValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisDependency]
  }
  
  @scala.inline
  implicit class AxisDependencyOps[Self <: AxisDependency] (val x: Self) extends AnyVal {
    
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
    def setScaleX(value: Double): Self = this.set("scaleX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleY(value: Double): Self = this.set("scaleY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXValue(value: Double): Self = this.set("xValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYValue(value: Double): Self = this.set("yValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisDependency(value: typings.reactNativeChartsWrapper.mod.AxisDependency): Self = this.set("axisDependency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxisDependency: Self = this.set("axisDependency", js.undefined)
  }
}
