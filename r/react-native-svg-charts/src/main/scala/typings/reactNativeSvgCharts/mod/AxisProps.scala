package typings.reactNativeSvgCharts.mod

import typings.d3Scale.mod.ScaleBand_
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeSvgCharts.anon.PartialTextProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AxisProps[T] extends js.Object {
  
  var data: js.Array[T] = js.native
  
  var formatLabel: js.UndefOr[js.Function2[/* value */ js.Any, /* index */ Double, Double | String]] = js.native
  
  var numberOfTicks: js.UndefOr[Double] = js.native
  
  var scale: js.UndefOr[ScaleFunction] = js.native
  
  var spacingInner: js.UndefOr[Double] = js.native
  
  var spacingOuter: js.UndefOr[Double] = js.native
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var svg: js.UndefOr[PartialTextProps] = js.native
}
object AxisProps {
  
  @scala.inline
  def apply[T](data: js.Array[T]): AxisProps[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisProps[T]]
  }
  
  @scala.inline
  implicit class AxisPropsOps[Self <: AxisProps[_], T] (val x: Self with AxisProps[T]) extends AnyVal {
    
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
    def setDataVarargs(value: T*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[T]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatLabel(value: (/* value */ js.Any, /* index */ Double) => Double | String): Self = this.set("formatLabel", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFormatLabel: Self = this.set("formatLabel", js.undefined)
    
    @scala.inline
    def setNumberOfTicks(value: Double): Self = this.set("numberOfTicks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberOfTicks: Self = this.set("numberOfTicks", js.undefined)
    
    @scala.inline
    def setScale(value: () => (ScaleType[js.Any, js.Any]) | ScaleBand_[js.Any]): Self = this.set("scale", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    
    @scala.inline
    def setSpacingInner(value: Double): Self = this.set("spacingInner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpacingInner: Self = this.set("spacingInner", js.undefined)
    
    @scala.inline
    def setSpacingOuter(value: Double): Self = this.set("spacingOuter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpacingOuter: Self = this.set("spacingOuter", js.undefined)
    
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
    
    @scala.inline
    def setSvg(value: PartialTextProps): Self = this.set("svg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSvg: Self = this.set("svg", js.undefined)
  }
}
