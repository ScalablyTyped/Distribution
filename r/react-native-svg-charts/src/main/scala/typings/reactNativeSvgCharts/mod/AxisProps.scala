package typings.reactNativeSvgCharts.mod

import typings.d3Scale.mod.ScaleBand_
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeSvgCharts.anon.PartialTextProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AxisProps[T] extends StObject {
  
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
  implicit class AxisPropsMutableBuilder[Self <: AxisProps[_], T] (val x: Self with AxisProps[T]) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[T]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: T*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setFormatLabel(value: (/* value */ js.Any, /* index */ Double) => Double | String): Self = StObject.set(x, "formatLabel", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFormatLabelUndefined: Self = StObject.set(x, "formatLabel", js.undefined)
    
    @scala.inline
    def setNumberOfTicks(value: Double): Self = StObject.set(x, "numberOfTicks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfTicksUndefined: Self = StObject.set(x, "numberOfTicks", js.undefined)
    
    @scala.inline
    def setScale(value: () => (ScaleType[js.Any, js.Any]) | ScaleBand_[js.Any]): Self = StObject.set(x, "scale", js.Any.fromFunction0(value))
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    @scala.inline
    def setSpacingInner(value: Double): Self = StObject.set(x, "spacingInner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacingInnerUndefined: Self = StObject.set(x, "spacingInner", js.undefined)
    
    @scala.inline
    def setSpacingOuter(value: Double): Self = StObject.set(x, "spacingOuter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacingOuterUndefined: Self = StObject.set(x, "spacingOuter", js.undefined)
    
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleNull: Self = StObject.set(x, "style", null)
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setSvg(value: PartialTextProps): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSvgUndefined: Self = StObject.set(x, "svg", js.undefined)
  }
}
