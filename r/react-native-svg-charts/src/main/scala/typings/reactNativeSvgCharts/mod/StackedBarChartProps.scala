package typings.reactNativeSvgCharts.mod

import typings.d3Shape.mod.Series
import typings.react.mod.Component
import typings.reactNativeSvg.mod.LinearGradientProps
import typings.reactNativeSvg.mod.RadialGradientProps
import typings.reactNativeSvgCharts.anon.Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StackedBarChartProps[T] extends ChartProps[T] {
  
  var colors: js.Array[String] = js.native
  
  var extra: js.UndefOr[js.Function0[js.Object]] = js.native
  
  var extras: js.UndefOr[js.Array[_]] = js.native
  
  var horizontal: js.UndefOr[Boolean] = js.native
  
  var keys: js.Array[/* keyof T */ String] = js.native
  
  var offset: js.UndefOr[OffsetFunction] = js.native
  
  var order: js.UndefOr[OrderFunction] = js.native
  
  var renderGradient: js.UndefOr[
    js.Function1[/* props */ Id, Component[LinearGradientProps | RadialGradientProps, js.Object, _]]
  ] = js.native
  
  var showGrid: js.UndefOr[Boolean] = js.native
  
  var spacingInner: js.UndefOr[Double] = js.native
  
  var spacingOuter: js.UndefOr[Double] = js.native
  
  var strokeColor: js.UndefOr[String] = js.native
}
object StackedBarChartProps {
  
  @scala.inline
  def apply[T](colors: js.Array[String], data: js.Array[T], keys: js.Array[/* keyof T */ String]): StackedBarChartProps[T] = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackedBarChartProps[T]]
  }
  
  @scala.inline
  implicit class StackedBarChartPropsOps[Self <: StackedBarChartProps[_], T] (val x: Self with StackedBarChartProps[T]) extends AnyVal {
    
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
    def setColorsVarargs(value: String*): Self = this.set("colors", js.Array(value :_*))
    
    @scala.inline
    def setColors(value: js.Array[String]): Self = this.set("colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeysVarargs(value: (/* keyof T */ String)*): Self = this.set("keys", js.Array(value :_*))
    
    @scala.inline
    def setKeys(value: js.Array[/* keyof T */ String]): Self = this.set("keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtra(value: () => js.Object): Self = this.set("extra", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteExtra: Self = this.set("extra", js.undefined)
    
    @scala.inline
    def setExtrasVarargs(value: js.Any*): Self = this.set("extras", js.Array(value :_*))
    
    @scala.inline
    def setExtras(value: js.Array[_]): Self = this.set("extras", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtras: Self = this.set("extras", js.undefined)
    
    @scala.inline
    def setHorizontal(value: Boolean): Self = this.set("horizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontal: Self = this.set("horizontal", js.undefined)
    
    @scala.inline
    def setOffset(value: (/* series */ Series[js.Any, js.Any], /* order */ js.Array[Double]) => Unit): Self = this.set("offset", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setOrder(value: /* series */ Series[js.Any, js.Any] => js.Array[Double]): Self = this.set("order", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    
    @scala.inline
    def setRenderGradient(value: /* props */ Id => Component[LinearGradientProps | RadialGradientProps, js.Object, _]): Self = this.set("renderGradient", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRenderGradient: Self = this.set("renderGradient", js.undefined)
    
    @scala.inline
    def setShowGrid(value: Boolean): Self = this.set("showGrid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowGrid: Self = this.set("showGrid", js.undefined)
    
    @scala.inline
    def setSpacingInner(value: Double): Self = this.set("spacingInner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpacingInner: Self = this.set("spacingInner", js.undefined)
    
    @scala.inline
    def setSpacingOuter(value: Double): Self = this.set("spacingOuter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpacingOuter: Self = this.set("spacingOuter", js.undefined)
    
    @scala.inline
    def setStrokeColor(value: String): Self = this.set("strokeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeColor: Self = this.set("strokeColor", js.undefined)
  }
}
