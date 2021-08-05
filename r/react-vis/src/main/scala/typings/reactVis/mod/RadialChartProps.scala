package typings.reactVis.mod

import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.reactVis.anon.Angle
import typings.reactVis.reactVisStrings.angle
import typings.reactVis.reactVisStrings.angle0
import typings.reactVis.reactVisStrings.label
import typings.reactVis.reactVisStrings.radius
import typings.reactVis.reactVisStrings.radius0
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RadialChartProps extends StObject {
  
  var animation: js.UndefOr[String | AnimationParam | Boolean] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  // default: ''
  var colorType: js.UndefOr[String] = js.undefined
  
  // default: 'category'
  var data: js.Array[Angle]
  
  var getAngle: js.UndefOr[RVGet[RadialChartPoint, angle]] = js.undefined
  
  var getAngle0: js.UndefOr[RVGet[RadialChartPoint, angle0]] = js.undefined
  
  var getLabel: js.UndefOr[RVGet[RadialChartPoint, label]] = js.undefined
  
  var getRadius: js.UndefOr[RVGet[RadialChartPoint, radius]] = js.undefined
  
  var getRadius0: js.UndefOr[RVGet[RadialChartPoint, radius0]] = js.undefined
  
  var height: Double
  
  var labelsAboveChildren: js.UndefOr[Boolean] = js.undefined
  
  var labelsStyle: js.UndefOr[CSSProperties] = js.undefined
  
  var margin: js.UndefOr[Margin | Double] = js.undefined
  
  var onValueClick: js.UndefOr[RVValueEventHandler[RadialChartPoint]] = js.undefined
  
  var onValueMouseOut: js.UndefOr[RVValueEventHandler[RadialChartPoint]] = js.undefined
  
  var onValueMouseOver: js.UndefOr[RVValueEventHandler[RadialChartPoint]] = js.undefined
  
  var showLabels: js.UndefOr[Boolean] = js.undefined
  
  var style: js.UndefOr[CSSProperties] = js.undefined
  
  var subLabel: js.UndefOr[js.Function1[/* row */ js.Any, String]] = js.undefined
  
  var width: Double
}
object RadialChartProps {
  
  inline def apply(data: js.Array[Angle], height: Double, width: Double): RadialChartProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadialChartProps]
  }
  
  extension [Self <: RadialChartProps](x: Self) {
    
    inline def setAnimation(value: String | AnimationParam | Boolean): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setColorType(value: String): Self = StObject.set(x, "colorType", value.asInstanceOf[js.Any])
    
    inline def setColorTypeUndefined: Self = StObject.set(x, "colorType", js.undefined)
    
    inline def setData(value: js.Array[Angle]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: Angle*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    inline def setGetAngle(
      value: RadialChartPoint => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ): Self = StObject.set(x, "getAngle", js.Any.fromFunction1(value))
    
    inline def setGetAngle0(
      value: RadialChartPoint => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ): Self = StObject.set(x, "getAngle0", js.Any.fromFunction1(value))
    
    inline def setGetAngle0Undefined: Self = StObject.set(x, "getAngle0", js.undefined)
    
    inline def setGetAngleUndefined: Self = StObject.set(x, "getAngle", js.undefined)
    
    inline def setGetLabel(
      value: RadialChartPoint => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ): Self = StObject.set(x, "getLabel", js.Any.fromFunction1(value))
    
    inline def setGetLabelUndefined: Self = StObject.set(x, "getLabel", js.undefined)
    
    inline def setGetRadius(
      value: RadialChartPoint => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ): Self = StObject.set(x, "getRadius", js.Any.fromFunction1(value))
    
    inline def setGetRadius0(
      value: RadialChartPoint => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ): Self = StObject.set(x, "getRadius0", js.Any.fromFunction1(value))
    
    inline def setGetRadius0Undefined: Self = StObject.set(x, "getRadius0", js.undefined)
    
    inline def setGetRadiusUndefined: Self = StObject.set(x, "getRadius", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setLabelsAboveChildren(value: Boolean): Self = StObject.set(x, "labelsAboveChildren", value.asInstanceOf[js.Any])
    
    inline def setLabelsAboveChildrenUndefined: Self = StObject.set(x, "labelsAboveChildren", js.undefined)
    
    inline def setLabelsStyle(value: CSSProperties): Self = StObject.set(x, "labelsStyle", value.asInstanceOf[js.Any])
    
    inline def setLabelsStyleUndefined: Self = StObject.set(x, "labelsStyle", js.undefined)
    
    inline def setMargin(value: Margin | Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setOnValueClick(value: (RadialChartPoint, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onValueClick", js.Any.fromFunction2(value))
    
    inline def setOnValueClickUndefined: Self = StObject.set(x, "onValueClick", js.undefined)
    
    inline def setOnValueMouseOut(value: (RadialChartPoint, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onValueMouseOut", js.Any.fromFunction2(value))
    
    inline def setOnValueMouseOutUndefined: Self = StObject.set(x, "onValueMouseOut", js.undefined)
    
    inline def setOnValueMouseOver(value: (RadialChartPoint, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onValueMouseOver", js.Any.fromFunction2(value))
    
    inline def setOnValueMouseOverUndefined: Self = StObject.set(x, "onValueMouseOver", js.undefined)
    
    inline def setShowLabels(value: Boolean): Self = StObject.set(x, "showLabels", value.asInstanceOf[js.Any])
    
    inline def setShowLabelsUndefined: Self = StObject.set(x, "showLabels", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setSubLabel(value: /* row */ js.Any => String): Self = StObject.set(x, "subLabel", js.Any.fromFunction1(value))
    
    inline def setSubLabelUndefined: Self = StObject.set(x, "subLabel", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
