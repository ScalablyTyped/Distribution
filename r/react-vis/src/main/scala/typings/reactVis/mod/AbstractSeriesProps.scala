package typings.reactVis.mod

import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.reactVis.reactVisStrings.color
import typings.reactVis.reactVisStrings.color0
import typings.reactVis.reactVisStrings.opacity
import typings.reactVis.reactVisStrings.opacity0
import typings.reactVis.reactVisStrings.size
import typings.reactVis.reactVisStrings.size0
import typings.reactVis.reactVisStrings.x
import typings.reactVis.reactVisStrings.x0
import typings.reactVis.reactVisStrings.y
import typings.reactVis.reactVisStrings.y0
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AbstractSeriesProps[T /* <: AbstractSeriesPoint */] extends StObject {
  
  var _colorValue: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T['_color'] */ js.Any
  ] = js.undefined
  
  var _opacityValue: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T['_opacity'] */ js.Any
  ] = js.undefined
  
  var _sizeValue: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T['_size'] */ js.Any
  ] = js.undefined
  
  var _xValue: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T['_x'] */ js.Any
  ] = js.undefined
  
  var _yValue: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T['_y'] */ js.Any
  ] = js.undefined
  
  var animation: js.UndefOr[String | AnimationParam | Boolean] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var color: js.UndefOr[String | Double] = js.undefined
  
  var colorBaseValue: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T['color'] */ js.Any
  ] = js.undefined
  
  var colorDistance: js.UndefOr[Double] = js.undefined
  
  var colorDomain: js.UndefOr[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T['color'] */ js.Any
    ]
  ] = js.undefined
  
  var colorRange: js.UndefOr[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T['color'] */ js.Any
    ]
  ] = js.undefined
  
  var colorType: js.UndefOr[Scale] = js.undefined
  
  var data: js.UndefOr[js.Array[T | js.Array[Any]]] = js.undefined
  
  var fill: js.UndefOr[String | Double] = js.undefined
  
  var getColor: js.UndefOr[RVGet[T, color]] = js.undefined
  
  var getColor0: js.UndefOr[RVGet[T, color0]] = js.undefined
  
  var getOpacity: js.UndefOr[RVGet[T, opacity]] = js.undefined
  
  var getOpacity0: js.UndefOr[RVGet[T, opacity0]] = js.undefined
  
  var getSize: js.UndefOr[RVGet[T, size]] = js.undefined
  
  var getSize0: js.UndefOr[RVGet[T, size0]] = js.undefined
  
  var getX: js.UndefOr[RVGet[T, x]] = js.undefined
  
  var getX0: js.UndefOr[RVGet[T, x0]] = js.undefined
  
  var getY: js.UndefOr[RVGet[T, y]] = js.undefined
  
  var getY0: js.UndefOr[RVGet[T, y0]] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var onNearestX: js.UndefOr[RVNearestXEventHandler[T]] = js.undefined
  
  var onNearestXY: js.UndefOr[RVNearestXYEventHandler[T]] = js.undefined
  
  var onSeriesClick: js.UndefOr[RVMouseEventHandler] = js.undefined
  
  var onSeriesMouseOut: js.UndefOr[RVMouseEventHandler] = js.undefined
  
  var onSeriesMouseOver: js.UndefOr[RVMouseEventHandler] = js.undefined
  
  var onSeriesRightClick: js.UndefOr[RVMouseEventHandler] = js.undefined
  
  var onValueClick: js.UndefOr[RVValueEventHandler[T]] = js.undefined
  
  var onValueMouseOut: js.UndefOr[RVValueEventHandler[T]] = js.undefined
  
  var onValueMouseOver: js.UndefOr[RVValueEventHandler[T]] = js.undefined
  
  var onValueRightClick: js.UndefOr[RVValueEventHandler[T]] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var opacityBaseValue: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T['opacity'] */ js.Any
  ] = js.undefined
  
  var opacityDistance: js.UndefOr[Double] = js.undefined
  
  var opacityDomain: js.UndefOr[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T['opacity'] */ js.Any
    ]
  ] = js.undefined
  
  var opacityRange: js.UndefOr[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T['opacity'] */ js.Any
    ]
  ] = js.undefined
  
  var opacityType: js.UndefOr[Scale] = js.undefined
  
  var sizeBaseValue: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T['size'] */ js.Any
  ] = js.undefined
  
  var sizeDistance: js.UndefOr[Double] = js.undefined
  
  var sizeDomain: js.UndefOr[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T['size'] */ js.Any
    ]
  ] = js.undefined
  
  var sizeRange: js.UndefOr[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T['size'] */ js.Any
    ]
  ] = js.undefined
  
  var sizeType: js.UndefOr[Scale] = js.undefined
  
  var stack: js.UndefOr[Boolean] = js.undefined
  
  // default: false
  var stroke: js.UndefOr[String | Double] = js.undefined
  
  var style: js.UndefOr[CSSProperties] = js.undefined
  
  // default: {}
  var width: js.UndefOr[Double] = js.undefined
  
  var xBaseValue: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T['x'] */ js.Any
  ] = js.undefined
  
  var xDistance: js.UndefOr[Double] = js.undefined
  
  var xDomain: js.UndefOr[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T['x'] */ js.Any
    ]
  ] = js.undefined
  
  var xRange: js.UndefOr[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T['x'] */ js.Any
    ]
  ] = js.undefined
  
  var xType: js.UndefOr[Scale] = js.undefined
  
  var yBaseValue: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T['y'] */ js.Any
  ] = js.undefined
  
  var yDistance: js.UndefOr[Double] = js.undefined
  
  var yDomain: js.UndefOr[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T['y'] */ js.Any
    ]
  ] = js.undefined
  
  var yRange: js.UndefOr[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T['y'] */ js.Any
    ]
  ] = js.undefined
  
  var yType: js.UndefOr[Scale] = js.undefined
}
object AbstractSeriesProps {
  
  inline def apply[T /* <: AbstractSeriesPoint */](): AbstractSeriesProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AbstractSeriesProps[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AbstractSeriesProps[?], T /* <: AbstractSeriesPoint */] (val x: Self & AbstractSeriesProps[T]) extends AnyVal {
    
    inline def setAnimation(value: String | AnimationParam | Boolean): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setColor(value: String | Double): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorBaseValue(value: /* import warning: importer.ImportType#apply Failed type conversion: T['color'] */ js.Any): Self = StObject.set(x, "colorBaseValue", value.asInstanceOf[js.Any])
    
    inline def setColorBaseValueUndefined: Self = StObject.set(x, "colorBaseValue", js.undefined)
    
    inline def setColorDistance(value: Double): Self = StObject.set(x, "colorDistance", value.asInstanceOf[js.Any])
    
    inline def setColorDistanceUndefined: Self = StObject.set(x, "colorDistance", js.undefined)
    
    inline def setColorDomain(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: T['color'] */ js.Any
        ]
    ): Self = StObject.set(x, "colorDomain", value.asInstanceOf[js.Any])
    
    inline def setColorDomainUndefined: Self = StObject.set(x, "colorDomain", js.undefined)
    
    inline def setColorDomainVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: T['color'] */ js.Any)*
    ): Self = StObject.set(x, "colorDomain", js.Array(value*))
    
    inline def setColorRange(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: T['color'] */ js.Any
        ]
    ): Self = StObject.set(x, "colorRange", value.asInstanceOf[js.Any])
    
    inline def setColorRangeUndefined: Self = StObject.set(x, "colorRange", js.undefined)
    
    inline def setColorRangeVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: T['color'] */ js.Any)*
    ): Self = StObject.set(x, "colorRange", js.Array(value*))
    
    inline def setColorType(value: Scale): Self = StObject.set(x, "colorType", value.asInstanceOf[js.Any])
    
    inline def setColorTypeUndefined: Self = StObject.set(x, "colorType", js.undefined)
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setData(value: js.Array[T | js.Array[Any]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: (T | js.Array[Any])*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setFill(value: String | Double): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setGetColor(value: T => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any): Self = StObject.set(x, "getColor", js.Any.fromFunction1(value))
    
    inline def setGetColor0(value: T => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any): Self = StObject.set(x, "getColor0", js.Any.fromFunction1(value))
    
    inline def setGetColor0Undefined: Self = StObject.set(x, "getColor0", js.undefined)
    
    inline def setGetColorUndefined: Self = StObject.set(x, "getColor", js.undefined)
    
    inline def setGetOpacity(value: T => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any): Self = StObject.set(x, "getOpacity", js.Any.fromFunction1(value))
    
    inline def setGetOpacity0(value: T => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any): Self = StObject.set(x, "getOpacity0", js.Any.fromFunction1(value))
    
    inline def setGetOpacity0Undefined: Self = StObject.set(x, "getOpacity0", js.undefined)
    
    inline def setGetOpacityUndefined: Self = StObject.set(x, "getOpacity", js.undefined)
    
    inline def setGetSize(value: T => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any): Self = StObject.set(x, "getSize", js.Any.fromFunction1(value))
    
    inline def setGetSize0(value: T => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any): Self = StObject.set(x, "getSize0", js.Any.fromFunction1(value))
    
    inline def setGetSize0Undefined: Self = StObject.set(x, "getSize0", js.undefined)
    
    inline def setGetSizeUndefined: Self = StObject.set(x, "getSize", js.undefined)
    
    inline def setGetX(value: T => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any): Self = StObject.set(x, "getX", js.Any.fromFunction1(value))
    
    inline def setGetX0(value: T => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any): Self = StObject.set(x, "getX0", js.Any.fromFunction1(value))
    
    inline def setGetX0Undefined: Self = StObject.set(x, "getX0", js.undefined)
    
    inline def setGetXUndefined: Self = StObject.set(x, "getX", js.undefined)
    
    inline def setGetY(value: T => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any): Self = StObject.set(x, "getY", js.Any.fromFunction1(value))
    
    inline def setGetY0(value: T => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any): Self = StObject.set(x, "getY0", js.Any.fromFunction1(value))
    
    inline def setGetY0Undefined: Self = StObject.set(x, "getY0", js.undefined)
    
    inline def setGetYUndefined: Self = StObject.set(x, "getY", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setOnNearestX(value: (T, /* data */ RVNearestXData[T]) => Unit): Self = StObject.set(x, "onNearestX", js.Any.fromFunction2(value))
    
    inline def setOnNearestXUndefined: Self = StObject.set(x, "onNearestX", js.undefined)
    
    inline def setOnNearestXY(value: (T, /* data */ RVNearestXYData[T]) => Unit): Self = StObject.set(x, "onNearestXY", js.Any.fromFunction2(value))
    
    inline def setOnNearestXYUndefined: Self = StObject.set(x, "onNearestXY", js.undefined)
    
    inline def setOnSeriesClick(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onSeriesClick", js.Any.fromFunction1(value))
    
    inline def setOnSeriesClickUndefined: Self = StObject.set(x, "onSeriesClick", js.undefined)
    
    inline def setOnSeriesMouseOut(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onSeriesMouseOut", js.Any.fromFunction1(value))
    
    inline def setOnSeriesMouseOutUndefined: Self = StObject.set(x, "onSeriesMouseOut", js.undefined)
    
    inline def setOnSeriesMouseOver(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onSeriesMouseOver", js.Any.fromFunction1(value))
    
    inline def setOnSeriesMouseOverUndefined: Self = StObject.set(x, "onSeriesMouseOver", js.undefined)
    
    inline def setOnSeriesRightClick(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onSeriesRightClick", js.Any.fromFunction1(value))
    
    inline def setOnSeriesRightClickUndefined: Self = StObject.set(x, "onSeriesRightClick", js.undefined)
    
    inline def setOnValueClick(value: (T, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onValueClick", js.Any.fromFunction2(value))
    
    inline def setOnValueClickUndefined: Self = StObject.set(x, "onValueClick", js.undefined)
    
    inline def setOnValueMouseOut(value: (T, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onValueMouseOut", js.Any.fromFunction2(value))
    
    inline def setOnValueMouseOutUndefined: Self = StObject.set(x, "onValueMouseOut", js.undefined)
    
    inline def setOnValueMouseOver(value: (T, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onValueMouseOver", js.Any.fromFunction2(value))
    
    inline def setOnValueMouseOverUndefined: Self = StObject.set(x, "onValueMouseOver", js.undefined)
    
    inline def setOnValueRightClick(value: (T, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onValueRightClick", js.Any.fromFunction2(value))
    
    inline def setOnValueRightClickUndefined: Self = StObject.set(x, "onValueRightClick", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityBaseValue(value: /* import warning: importer.ImportType#apply Failed type conversion: T['opacity'] */ js.Any): Self = StObject.set(x, "opacityBaseValue", value.asInstanceOf[js.Any])
    
    inline def setOpacityBaseValueUndefined: Self = StObject.set(x, "opacityBaseValue", js.undefined)
    
    inline def setOpacityDistance(value: Double): Self = StObject.set(x, "opacityDistance", value.asInstanceOf[js.Any])
    
    inline def setOpacityDistanceUndefined: Self = StObject.set(x, "opacityDistance", js.undefined)
    
    inline def setOpacityDomain(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: T['opacity'] */ js.Any
        ]
    ): Self = StObject.set(x, "opacityDomain", value.asInstanceOf[js.Any])
    
    inline def setOpacityDomainUndefined: Self = StObject.set(x, "opacityDomain", js.undefined)
    
    inline def setOpacityDomainVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: T['opacity'] */ js.Any)*
    ): Self = StObject.set(x, "opacityDomain", js.Array(value*))
    
    inline def setOpacityRange(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: T['opacity'] */ js.Any
        ]
    ): Self = StObject.set(x, "opacityRange", value.asInstanceOf[js.Any])
    
    inline def setOpacityRangeUndefined: Self = StObject.set(x, "opacityRange", js.undefined)
    
    inline def setOpacityRangeVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: T['opacity'] */ js.Any)*
    ): Self = StObject.set(x, "opacityRange", js.Array(value*))
    
    inline def setOpacityType(value: Scale): Self = StObject.set(x, "opacityType", value.asInstanceOf[js.Any])
    
    inline def setOpacityTypeUndefined: Self = StObject.set(x, "opacityType", js.undefined)
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setSizeBaseValue(value: /* import warning: importer.ImportType#apply Failed type conversion: T['size'] */ js.Any): Self = StObject.set(x, "sizeBaseValue", value.asInstanceOf[js.Any])
    
    inline def setSizeBaseValueUndefined: Self = StObject.set(x, "sizeBaseValue", js.undefined)
    
    inline def setSizeDistance(value: Double): Self = StObject.set(x, "sizeDistance", value.asInstanceOf[js.Any])
    
    inline def setSizeDistanceUndefined: Self = StObject.set(x, "sizeDistance", js.undefined)
    
    inline def setSizeDomain(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: T['size'] */ js.Any
        ]
    ): Self = StObject.set(x, "sizeDomain", value.asInstanceOf[js.Any])
    
    inline def setSizeDomainUndefined: Self = StObject.set(x, "sizeDomain", js.undefined)
    
    inline def setSizeDomainVarargs(value: (/* import warning: importer.ImportType#apply Failed type conversion: T['size'] */ js.Any)*): Self = StObject.set(x, "sizeDomain", js.Array(value*))
    
    inline def setSizeRange(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: T['size'] */ js.Any
        ]
    ): Self = StObject.set(x, "sizeRange", value.asInstanceOf[js.Any])
    
    inline def setSizeRangeUndefined: Self = StObject.set(x, "sizeRange", js.undefined)
    
    inline def setSizeRangeVarargs(value: (/* import warning: importer.ImportType#apply Failed type conversion: T['size'] */ js.Any)*): Self = StObject.set(x, "sizeRange", js.Array(value*))
    
    inline def setSizeType(value: Scale): Self = StObject.set(x, "sizeType", value.asInstanceOf[js.Any])
    
    inline def setSizeTypeUndefined: Self = StObject.set(x, "sizeType", js.undefined)
    
    inline def setStack(value: Boolean): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    
    inline def setStroke(value: String | Double): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setXBaseValue(value: /* import warning: importer.ImportType#apply Failed type conversion: T['x'] */ js.Any): Self = StObject.set(x, "xBaseValue", value.asInstanceOf[js.Any])
    
    inline def setXBaseValueUndefined: Self = StObject.set(x, "xBaseValue", js.undefined)
    
    inline def setXDistance(value: Double): Self = StObject.set(x, "xDistance", value.asInstanceOf[js.Any])
    
    inline def setXDistanceUndefined: Self = StObject.set(x, "xDistance", js.undefined)
    
    inline def setXDomain(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: T['x'] */ js.Any
        ]
    ): Self = StObject.set(x, "xDomain", value.asInstanceOf[js.Any])
    
    inline def setXDomainUndefined: Self = StObject.set(x, "xDomain", js.undefined)
    
    inline def setXDomainVarargs(value: (/* import warning: importer.ImportType#apply Failed type conversion: T['x'] */ js.Any)*): Self = StObject.set(x, "xDomain", js.Array(value*))
    
    inline def setXRange(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: T['x'] */ js.Any
        ]
    ): Self = StObject.set(x, "xRange", value.asInstanceOf[js.Any])
    
    inline def setXRangeUndefined: Self = StObject.set(x, "xRange", js.undefined)
    
    inline def setXRangeVarargs(value: (/* import warning: importer.ImportType#apply Failed type conversion: T['x'] */ js.Any)*): Self = StObject.set(x, "xRange", js.Array(value*))
    
    inline def setXType(value: Scale): Self = StObject.set(x, "xType", value.asInstanceOf[js.Any])
    
    inline def setXTypeUndefined: Self = StObject.set(x, "xType", js.undefined)
    
    inline def setYBaseValue(value: /* import warning: importer.ImportType#apply Failed type conversion: T['y'] */ js.Any): Self = StObject.set(x, "yBaseValue", value.asInstanceOf[js.Any])
    
    inline def setYBaseValueUndefined: Self = StObject.set(x, "yBaseValue", js.undefined)
    
    inline def setYDistance(value: Double): Self = StObject.set(x, "yDistance", value.asInstanceOf[js.Any])
    
    inline def setYDistanceUndefined: Self = StObject.set(x, "yDistance", js.undefined)
    
    inline def setYDomain(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: T['y'] */ js.Any
        ]
    ): Self = StObject.set(x, "yDomain", value.asInstanceOf[js.Any])
    
    inline def setYDomainUndefined: Self = StObject.set(x, "yDomain", js.undefined)
    
    inline def setYDomainVarargs(value: (/* import warning: importer.ImportType#apply Failed type conversion: T['y'] */ js.Any)*): Self = StObject.set(x, "yDomain", js.Array(value*))
    
    inline def setYRange(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: T['y'] */ js.Any
        ]
    ): Self = StObject.set(x, "yRange", value.asInstanceOf[js.Any])
    
    inline def setYRangeUndefined: Self = StObject.set(x, "yRange", js.undefined)
    
    inline def setYRangeVarargs(value: (/* import warning: importer.ImportType#apply Failed type conversion: T['y'] */ js.Any)*): Self = StObject.set(x, "yRange", js.Array(value*))
    
    inline def setYType(value: Scale): Self = StObject.set(x, "yType", value.asInstanceOf[js.Any])
    
    inline def setYTypeUndefined: Self = StObject.set(x, "yType", js.undefined)
    
    inline def set_colorValue(value: /* import warning: importer.ImportType#apply Failed type conversion: T['_color'] */ js.Any): Self = StObject.set(x, "_colorValue", value.asInstanceOf[js.Any])
    
    inline def set_colorValueUndefined: Self = StObject.set(x, "_colorValue", js.undefined)
    
    inline def set_opacityValue(
      value: /* import warning: importer.ImportType#apply Failed type conversion: T['_opacity'] */ js.Any
    ): Self = StObject.set(x, "_opacityValue", value.asInstanceOf[js.Any])
    
    inline def set_opacityValueUndefined: Self = StObject.set(x, "_opacityValue", js.undefined)
    
    inline def set_sizeValue(value: /* import warning: importer.ImportType#apply Failed type conversion: T['_size'] */ js.Any): Self = StObject.set(x, "_sizeValue", value.asInstanceOf[js.Any])
    
    inline def set_sizeValueUndefined: Self = StObject.set(x, "_sizeValue", js.undefined)
    
    inline def set_xValue(value: /* import warning: importer.ImportType#apply Failed type conversion: T['_x'] */ js.Any): Self = StObject.set(x, "_xValue", value.asInstanceOf[js.Any])
    
    inline def set_xValueUndefined: Self = StObject.set(x, "_xValue", js.undefined)
    
    inline def set_yValue(value: /* import warning: importer.ImportType#apply Failed type conversion: T['_y'] */ js.Any): Self = StObject.set(x, "_yValue", value.asInstanceOf[js.Any])
    
    inline def set_yValueUndefined: Self = StObject.set(x, "_yValue", js.undefined)
  }
}
