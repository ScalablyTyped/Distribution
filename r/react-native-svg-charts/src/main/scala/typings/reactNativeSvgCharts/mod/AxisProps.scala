package typings.reactNativeSvgCharts.mod

import typings.d3Scale.mod.ScaleBand_
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeSvgCharts.anon.PartialTextProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AxisProps[T] extends StObject {
  
  var data: js.Array[T]
  
  var formatLabel: js.UndefOr[js.Function2[/* value */ Any, /* index */ Double, Double | String]] = js.undefined
  
  var numberOfTicks: js.UndefOr[Double] = js.undefined
  
  var scale: js.UndefOr[ScaleFunction] = js.undefined
  
  var spacingInner: js.UndefOr[Double] = js.undefined
  
  var spacingOuter: js.UndefOr[Double] = js.undefined
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var svg: js.UndefOr[PartialTextProps] = js.undefined
}
object AxisProps {
  
  inline def apply[T](data: js.Array[T]): AxisProps[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisProps[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AxisProps[?], T] (val x: Self & AxisProps[T]) extends AnyVal {
    
    inline def setData(value: js.Array[T]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: T*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setFormatLabel(value: (/* value */ Any, /* index */ Double) => Double | String): Self = StObject.set(x, "formatLabel", js.Any.fromFunction2(value))
    
    inline def setFormatLabelUndefined: Self = StObject.set(x, "formatLabel", js.undefined)
    
    inline def setNumberOfTicks(value: Double): Self = StObject.set(x, "numberOfTicks", value.asInstanceOf[js.Any])
    
    inline def setNumberOfTicksUndefined: Self = StObject.set(x, "numberOfTicks", js.undefined)
    
    inline def setScale(value: () => (ScaleType[Any, Any]) | ScaleBand_[Any]): Self = StObject.set(x, "scale", js.Any.fromFunction0(value))
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setSpacingInner(value: Double): Self = StObject.set(x, "spacingInner", value.asInstanceOf[js.Any])
    
    inline def setSpacingInnerUndefined: Self = StObject.set(x, "spacingInner", js.undefined)
    
    inline def setSpacingOuter(value: Double): Self = StObject.set(x, "spacingOuter", value.asInstanceOf[js.Any])
    
    inline def setSpacingOuterUndefined: Self = StObject.set(x, "spacingOuter", js.undefined)
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setSvg(value: PartialTextProps): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
    
    inline def setSvgUndefined: Self = StObject.set(x, "svg", js.undefined)
  }
}
