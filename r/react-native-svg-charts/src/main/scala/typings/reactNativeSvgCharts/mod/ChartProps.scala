package typings.reactNativeSvgCharts.mod

import typings.d3Path.mod.Path_
import typings.d3Scale.mod.ScaleBand_
import typings.d3Shape.mod.CurveFactory
import typings.d3Shape.mod.CurveGenerator
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeSvgCharts.anon.Bottom
import typings.reactNativeSvgCharts.anon.PartialPathProps
import typings.std.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartProps[T] extends StObject {
  
  var animate: js.UndefOr[Boolean] = js.undefined
  
  var animationDuration: js.UndefOr[Double] = js.undefined
  
  var contentInset: js.UndefOr[Bottom] = js.undefined
  
  var curve: js.UndefOr[CurveFactory] = js.undefined
  
  var data: js.Array[T]
  
  var gridMax: js.UndefOr[Double] = js.undefined
  
  var gridMin: js.UndefOr[Double] = js.undefined
  
  var gridProps: js.UndefOr[GridProps[js.Any]] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var numberOfTicks: js.UndefOr[Double] = js.undefined
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var svg: js.UndefOr[PartialPathProps] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
  
  var xAccessor: js.UndefOr[AccessorFunction[T, Double]] = js.undefined
  
  var xMax: js.UndefOr[Double] = js.undefined
  
  var xMin: js.UndefOr[Double] = js.undefined
  
  var xScale: js.UndefOr[ScaleFunction] = js.undefined
  
  var yAccessor: js.UndefOr[AccessorFunction[T, Double]] = js.undefined
  
  var yMax: js.UndefOr[Double] = js.undefined
  
  var yMin: js.UndefOr[Double] = js.undefined
  
  var yScale: js.UndefOr[ScaleFunction] = js.undefined
}
object ChartProps {
  
  @scala.inline
  def apply[T](data: js.Array[T]): ChartProps[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartProps[T]]
  }
  
  @scala.inline
  implicit class ChartPropsMutableBuilder[Self <: ChartProps[?], T] (val x: Self & ChartProps[T]) extends AnyVal {
    
    @scala.inline
    def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    @scala.inline
    def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
    
    @scala.inline
    def setContentInset(value: Bottom): Self = StObject.set(x, "contentInset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentInsetUndefined: Self = StObject.set(x, "contentInset", js.undefined)
    
    @scala.inline
    def setCurve(value: /* context */ CanvasRenderingContext2D | Path_ => CurveGenerator): Self = StObject.set(x, "curve", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCurveUndefined: Self = StObject.set(x, "curve", js.undefined)
    
    @scala.inline
    def setData(value: js.Array[T]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: T*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setGridMax(value: Double): Self = StObject.set(x, "gridMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridMaxUndefined: Self = StObject.set(x, "gridMax", js.undefined)
    
    @scala.inline
    def setGridMin(value: Double): Self = StObject.set(x, "gridMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridMinUndefined: Self = StObject.set(x, "gridMin", js.undefined)
    
    @scala.inline
    def setGridProps(value: GridProps[js.Any]): Self = StObject.set(x, "gridProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridPropsUndefined: Self = StObject.set(x, "gridProps", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setNumberOfTicks(value: Double): Self = StObject.set(x, "numberOfTicks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfTicksUndefined: Self = StObject.set(x, "numberOfTicks", js.undefined)
    
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleNull: Self = StObject.set(x, "style", null)
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setSvg(value: PartialPathProps): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSvgUndefined: Self = StObject.set(x, "svg", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setXAccessor(value: /* props */ AccessorFunctionProps[T] => Double): Self = StObject.set(x, "xAccessor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setXAccessorUndefined: Self = StObject.set(x, "xAccessor", js.undefined)
    
    @scala.inline
    def setXMax(value: Double): Self = StObject.set(x, "xMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXMaxUndefined: Self = StObject.set(x, "xMax", js.undefined)
    
    @scala.inline
    def setXMin(value: Double): Self = StObject.set(x, "xMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXMinUndefined: Self = StObject.set(x, "xMin", js.undefined)
    
    @scala.inline
    def setXScale(value: () => (ScaleType[js.Any, js.Any]) | ScaleBand_[js.Any]): Self = StObject.set(x, "xScale", js.Any.fromFunction0(value))
    
    @scala.inline
    def setXScaleUndefined: Self = StObject.set(x, "xScale", js.undefined)
    
    @scala.inline
    def setYAccessor(value: /* props */ AccessorFunctionProps[T] => Double): Self = StObject.set(x, "yAccessor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setYAccessorUndefined: Self = StObject.set(x, "yAccessor", js.undefined)
    
    @scala.inline
    def setYMax(value: Double): Self = StObject.set(x, "yMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYMaxUndefined: Self = StObject.set(x, "yMax", js.undefined)
    
    @scala.inline
    def setYMin(value: Double): Self = StObject.set(x, "yMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYMinUndefined: Self = StObject.set(x, "yMin", js.undefined)
    
    @scala.inline
    def setYScale(value: () => (ScaleType[js.Any, js.Any]) | ScaleBand_[js.Any]): Self = StObject.set(x, "yScale", js.Any.fromFunction0(value))
    
    @scala.inline
    def setYScaleUndefined: Self = StObject.set(x, "yScale", js.undefined)
  }
}
