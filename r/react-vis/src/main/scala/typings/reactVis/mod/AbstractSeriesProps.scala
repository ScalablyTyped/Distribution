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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbstractSeriesProps[T /* <: AbstractSeriesPoint */] extends StObject {
  
  var _colorValue: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T['_color'] */ js.Any
  ] = js.native
  
  var _opacityValue: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T['_opacity'] */ js.Any
  ] = js.native
  
  var _sizeValue: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T['_size'] */ js.Any
  ] = js.native
  
  var _xValue: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T['_x'] */ js.Any
  ] = js.native
  
  var _yValue: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T['_y'] */ js.Any
  ] = js.native
  
  var animation: js.UndefOr[String | AnimationParam | Boolean] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var color: js.UndefOr[String | Double] = js.native
  
  var colorBaseValue: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T['color'] */ js.Any
  ] = js.native
  
  var colorDistance: js.UndefOr[Double] = js.native
  
  var colorDomain: js.UndefOr[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T['color'] */ js.Any
    ]
  ] = js.native
  
  var colorRange: js.UndefOr[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T['color'] */ js.Any
    ]
  ] = js.native
  
  var colorType: js.UndefOr[Scale] = js.native
  
  var data: js.UndefOr[js.Array[T | js.Array[_]]] = js.native
  
  var fill: js.UndefOr[String | Double] = js.native
  
  var getColor: js.UndefOr[RVGet[T, color]] = js.native
  
  var getColor0: js.UndefOr[RVGet[T, color0]] = js.native
  
  var getOpacity: js.UndefOr[RVGet[T, opacity]] = js.native
  
  var getOpacity0: js.UndefOr[RVGet[T, opacity0]] = js.native
  
  var getSize: js.UndefOr[RVGet[T, size]] = js.native
  
  var getSize0: js.UndefOr[RVGet[T, size0]] = js.native
  
  var getX: js.UndefOr[RVGet[T, x]] = js.native
  
  var getX0: js.UndefOr[RVGet[T, x0]] = js.native
  
  var getY: js.UndefOr[RVGet[T, y]] = js.native
  
  var getY0: js.UndefOr[RVGet[T, y0]] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var onNearestX: js.UndefOr[RVNearestXEventHandler[T]] = js.native
  
  var onNearestXY: js.UndefOr[RVNearestXYEventHandler[T]] = js.native
  
  var onSeriesClick: js.UndefOr[RVMouseEventHandler] = js.native
  
  var onSeriesMouseOut: js.UndefOr[RVMouseEventHandler] = js.native
  
  var onSeriesMouseOver: js.UndefOr[RVMouseEventHandler] = js.native
  
  var onSeriesRightClick: js.UndefOr[RVMouseEventHandler] = js.native
  
  var onValueClick: js.UndefOr[RVValueEventHandler[T]] = js.native
  
  var onValueMouseOut: js.UndefOr[RVValueEventHandler[T]] = js.native
  
  var onValueMouseOver: js.UndefOr[RVValueEventHandler[T]] = js.native
  
  var onValueRightClick: js.UndefOr[RVValueEventHandler[T]] = js.native
  
  var opacity: js.UndefOr[Double] = js.native
  
  var opacityBaseValue: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T['opacity'] */ js.Any
  ] = js.native
  
  var opacityDistance: js.UndefOr[Double] = js.native
  
  var opacityDomain: js.UndefOr[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T['opacity'] */ js.Any
    ]
  ] = js.native
  
  var opacityRange: js.UndefOr[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T['opacity'] */ js.Any
    ]
  ] = js.native
  
  var opacityType: js.UndefOr[Scale] = js.native
  
  var sizeBaseValue: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T['size'] */ js.Any
  ] = js.native
  
  var sizeDistance: js.UndefOr[Double] = js.native
  
  var sizeDomain: js.UndefOr[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T['size'] */ js.Any
    ]
  ] = js.native
  
  var sizeRange: js.UndefOr[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T['size'] */ js.Any
    ]
  ] = js.native
  
  var sizeType: js.UndefOr[Scale] = js.native
  
  var stack: js.UndefOr[Boolean] = js.native
  
  // default: false
  var stroke: js.UndefOr[String | Double] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  // default: {}
  var width: js.UndefOr[Double] = js.native
  
  var xBaseValue: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T['x'] */ js.Any
  ] = js.native
  
  var xDistance: js.UndefOr[Double] = js.native
  
  var xDomain: js.UndefOr[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T['x'] */ js.Any
    ]
  ] = js.native
  
  var xRange: js.UndefOr[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T['x'] */ js.Any
    ]
  ] = js.native
  
  var xType: js.UndefOr[Scale] = js.native
  
  var yBaseValue: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T['y'] */ js.Any
  ] = js.native
  
  var yDistance: js.UndefOr[Double] = js.native
  
  var yDomain: js.UndefOr[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T['y'] */ js.Any
    ]
  ] = js.native
  
  var yRange: js.UndefOr[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T['y'] */ js.Any
    ]
  ] = js.native
  
  var yType: js.UndefOr[Scale] = js.native
}
object AbstractSeriesProps {
  
  @scala.inline
  def apply[T /* <: AbstractSeriesPoint */](): AbstractSeriesProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AbstractSeriesProps[T]]
  }
  
  @scala.inline
  implicit class AbstractSeriesPropsMutableBuilder[Self <: AbstractSeriesProps[_], T /* <: AbstractSeriesPoint */] (val x: Self with AbstractSeriesProps[T]) extends AnyVal {
    
    @scala.inline
    def setAnimation(value: String | AnimationParam | Boolean): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setColor(value: String | Double): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorBaseValue(value: /* import warning: importer.ImportType#apply Failed type conversion: T['color'] */ js.Any): Self = StObject.set(x, "colorBaseValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorBaseValueUndefined: Self = StObject.set(x, "colorBaseValue", js.undefined)
    
    @scala.inline
    def setColorDistance(value: Double): Self = StObject.set(x, "colorDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorDistanceUndefined: Self = StObject.set(x, "colorDistance", js.undefined)
    
    @scala.inline
    def setColorDomain(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: T['color'] */ js.Any
        ]
    ): Self = StObject.set(x, "colorDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorDomainUndefined: Self = StObject.set(x, "colorDomain", js.undefined)
    
    @scala.inline
    def setColorDomainVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: T['color'] */ js.Any)*
    ): Self = StObject.set(x, "colorDomain", js.Array(value :_*))
    
    @scala.inline
    def setColorRange(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: T['color'] */ js.Any
        ]
    ): Self = StObject.set(x, "colorRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorRangeUndefined: Self = StObject.set(x, "colorRange", js.undefined)
    
    @scala.inline
    def setColorRangeVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: T['color'] */ js.Any)*
    ): Self = StObject.set(x, "colorRange", js.Array(value :_*))
    
    @scala.inline
    def setColorType(value: Scale): Self = StObject.set(x, "colorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorTypeUndefined: Self = StObject.set(x, "colorType", js.undefined)
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setData(value: js.Array[T | js.Array[_]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: (T | js.Array[js.Any])*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setFill(value: String | Double): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setGetColor(value: T => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any): Self = StObject.set(x, "getColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetColor0(value: T => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any): Self = StObject.set(x, "getColor0", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetColor0Undefined: Self = StObject.set(x, "getColor0", js.undefined)
    
    @scala.inline
    def setGetColorUndefined: Self = StObject.set(x, "getColor", js.undefined)
    
    @scala.inline
    def setGetOpacity(value: T => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any): Self = StObject.set(x, "getOpacity", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetOpacity0(value: T => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any): Self = StObject.set(x, "getOpacity0", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetOpacity0Undefined: Self = StObject.set(x, "getOpacity0", js.undefined)
    
    @scala.inline
    def setGetOpacityUndefined: Self = StObject.set(x, "getOpacity", js.undefined)
    
    @scala.inline
    def setGetSize(value: T => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any): Self = StObject.set(x, "getSize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSize0(value: T => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any): Self = StObject.set(x, "getSize0", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSize0Undefined: Self = StObject.set(x, "getSize0", js.undefined)
    
    @scala.inline
    def setGetSizeUndefined: Self = StObject.set(x, "getSize", js.undefined)
    
    @scala.inline
    def setGetX(value: T => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any): Self = StObject.set(x, "getX", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetX0(value: T => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any): Self = StObject.set(x, "getX0", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetX0Undefined: Self = StObject.set(x, "getX0", js.undefined)
    
    @scala.inline
    def setGetXUndefined: Self = StObject.set(x, "getX", js.undefined)
    
    @scala.inline
    def setGetY(value: T => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any): Self = StObject.set(x, "getY", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetY0(value: T => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any): Self = StObject.set(x, "getY0", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetY0Undefined: Self = StObject.set(x, "getY0", js.undefined)
    
    @scala.inline
    def setGetYUndefined: Self = StObject.set(x, "getY", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setOnNearestX(value: (T, /* data */ RVNearestXData[T]) => Unit): Self = StObject.set(x, "onNearestX", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnNearestXUndefined: Self = StObject.set(x, "onNearestX", js.undefined)
    
    @scala.inline
    def setOnNearestXY(value: (T, /* data */ RVNearestXYData[T]) => Unit): Self = StObject.set(x, "onNearestXY", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnNearestXYUndefined: Self = StObject.set(x, "onNearestXY", js.undefined)
    
    @scala.inline
    def setOnSeriesClick(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onSeriesClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSeriesClickUndefined: Self = StObject.set(x, "onSeriesClick", js.undefined)
    
    @scala.inline
    def setOnSeriesMouseOut(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onSeriesMouseOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSeriesMouseOutUndefined: Self = StObject.set(x, "onSeriesMouseOut", js.undefined)
    
    @scala.inline
    def setOnSeriesMouseOver(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onSeriesMouseOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSeriesMouseOverUndefined: Self = StObject.set(x, "onSeriesMouseOver", js.undefined)
    
    @scala.inline
    def setOnSeriesRightClick(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onSeriesRightClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSeriesRightClickUndefined: Self = StObject.set(x, "onSeriesRightClick", js.undefined)
    
    @scala.inline
    def setOnValueClick(value: (T, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onValueClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnValueClickUndefined: Self = StObject.set(x, "onValueClick", js.undefined)
    
    @scala.inline
    def setOnValueMouseOut(value: (T, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onValueMouseOut", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnValueMouseOutUndefined: Self = StObject.set(x, "onValueMouseOut", js.undefined)
    
    @scala.inline
    def setOnValueMouseOver(value: (T, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onValueMouseOver", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnValueMouseOverUndefined: Self = StObject.set(x, "onValueMouseOver", js.undefined)
    
    @scala.inline
    def setOnValueRightClick(value: (T, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onValueRightClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnValueRightClickUndefined: Self = StObject.set(x, "onValueRightClick", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityBaseValue(value: /* import warning: importer.ImportType#apply Failed type conversion: T['opacity'] */ js.Any): Self = StObject.set(x, "opacityBaseValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityBaseValueUndefined: Self = StObject.set(x, "opacityBaseValue", js.undefined)
    
    @scala.inline
    def setOpacityDistance(value: Double): Self = StObject.set(x, "opacityDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityDistanceUndefined: Self = StObject.set(x, "opacityDistance", js.undefined)
    
    @scala.inline
    def setOpacityDomain(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: T['opacity'] */ js.Any
        ]
    ): Self = StObject.set(x, "opacityDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityDomainUndefined: Self = StObject.set(x, "opacityDomain", js.undefined)
    
    @scala.inline
    def setOpacityDomainVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: T['opacity'] */ js.Any)*
    ): Self = StObject.set(x, "opacityDomain", js.Array(value :_*))
    
    @scala.inline
    def setOpacityRange(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: T['opacity'] */ js.Any
        ]
    ): Self = StObject.set(x, "opacityRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityRangeUndefined: Self = StObject.set(x, "opacityRange", js.undefined)
    
    @scala.inline
    def setOpacityRangeVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: T['opacity'] */ js.Any)*
    ): Self = StObject.set(x, "opacityRange", js.Array(value :_*))
    
    @scala.inline
    def setOpacityType(value: Scale): Self = StObject.set(x, "opacityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityTypeUndefined: Self = StObject.set(x, "opacityType", js.undefined)
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setSizeBaseValue(value: /* import warning: importer.ImportType#apply Failed type conversion: T['size'] */ js.Any): Self = StObject.set(x, "sizeBaseValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeBaseValueUndefined: Self = StObject.set(x, "sizeBaseValue", js.undefined)
    
    @scala.inline
    def setSizeDistance(value: Double): Self = StObject.set(x, "sizeDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeDistanceUndefined: Self = StObject.set(x, "sizeDistance", js.undefined)
    
    @scala.inline
    def setSizeDomain(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: T['size'] */ js.Any
        ]
    ): Self = StObject.set(x, "sizeDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeDomainUndefined: Self = StObject.set(x, "sizeDomain", js.undefined)
    
    @scala.inline
    def setSizeDomainVarargs(value: (/* import warning: importer.ImportType#apply Failed type conversion: T['size'] */ js.Any)*): Self = StObject.set(x, "sizeDomain", js.Array(value :_*))
    
    @scala.inline
    def setSizeRange(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: T['size'] */ js.Any
        ]
    ): Self = StObject.set(x, "sizeRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeRangeUndefined: Self = StObject.set(x, "sizeRange", js.undefined)
    
    @scala.inline
    def setSizeRangeVarargs(value: (/* import warning: importer.ImportType#apply Failed type conversion: T['size'] */ js.Any)*): Self = StObject.set(x, "sizeRange", js.Array(value :_*))
    
    @scala.inline
    def setSizeType(value: Scale): Self = StObject.set(x, "sizeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeTypeUndefined: Self = StObject.set(x, "sizeType", js.undefined)
    
    @scala.inline
    def setStack(value: Boolean): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    
    @scala.inline
    def setStroke(value: String | Double): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setXBaseValue(value: /* import warning: importer.ImportType#apply Failed type conversion: T['x'] */ js.Any): Self = StObject.set(x, "xBaseValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXBaseValueUndefined: Self = StObject.set(x, "xBaseValue", js.undefined)
    
    @scala.inline
    def setXDistance(value: Double): Self = StObject.set(x, "xDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXDistanceUndefined: Self = StObject.set(x, "xDistance", js.undefined)
    
    @scala.inline
    def setXDomain(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: T['x'] */ js.Any
        ]
    ): Self = StObject.set(x, "xDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXDomainUndefined: Self = StObject.set(x, "xDomain", js.undefined)
    
    @scala.inline
    def setXDomainVarargs(value: (/* import warning: importer.ImportType#apply Failed type conversion: T['x'] */ js.Any)*): Self = StObject.set(x, "xDomain", js.Array(value :_*))
    
    @scala.inline
    def setXRange(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: T['x'] */ js.Any
        ]
    ): Self = StObject.set(x, "xRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXRangeUndefined: Self = StObject.set(x, "xRange", js.undefined)
    
    @scala.inline
    def setXRangeVarargs(value: (/* import warning: importer.ImportType#apply Failed type conversion: T['x'] */ js.Any)*): Self = StObject.set(x, "xRange", js.Array(value :_*))
    
    @scala.inline
    def setXType(value: Scale): Self = StObject.set(x, "xType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXTypeUndefined: Self = StObject.set(x, "xType", js.undefined)
    
    @scala.inline
    def setYBaseValue(value: /* import warning: importer.ImportType#apply Failed type conversion: T['y'] */ js.Any): Self = StObject.set(x, "yBaseValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYBaseValueUndefined: Self = StObject.set(x, "yBaseValue", js.undefined)
    
    @scala.inline
    def setYDistance(value: Double): Self = StObject.set(x, "yDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYDistanceUndefined: Self = StObject.set(x, "yDistance", js.undefined)
    
    @scala.inline
    def setYDomain(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: T['y'] */ js.Any
        ]
    ): Self = StObject.set(x, "yDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYDomainUndefined: Self = StObject.set(x, "yDomain", js.undefined)
    
    @scala.inline
    def setYDomainVarargs(value: (/* import warning: importer.ImportType#apply Failed type conversion: T['y'] */ js.Any)*): Self = StObject.set(x, "yDomain", js.Array(value :_*))
    
    @scala.inline
    def setYRange(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: T['y'] */ js.Any
        ]
    ): Self = StObject.set(x, "yRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYRangeUndefined: Self = StObject.set(x, "yRange", js.undefined)
    
    @scala.inline
    def setYRangeVarargs(value: (/* import warning: importer.ImportType#apply Failed type conversion: T['y'] */ js.Any)*): Self = StObject.set(x, "yRange", js.Array(value :_*))
    
    @scala.inline
    def setYType(value: Scale): Self = StObject.set(x, "yType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYTypeUndefined: Self = StObject.set(x, "yType", js.undefined)
    
    @scala.inline
    def set_colorValue(value: /* import warning: importer.ImportType#apply Failed type conversion: T['_color'] */ js.Any): Self = StObject.set(x, "_colorValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_colorValueUndefined: Self = StObject.set(x, "_colorValue", js.undefined)
    
    @scala.inline
    def set_opacityValue(
      value: /* import warning: importer.ImportType#apply Failed type conversion: T['_opacity'] */ js.Any
    ): Self = StObject.set(x, "_opacityValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_opacityValueUndefined: Self = StObject.set(x, "_opacityValue", js.undefined)
    
    @scala.inline
    def set_sizeValue(value: /* import warning: importer.ImportType#apply Failed type conversion: T['_size'] */ js.Any): Self = StObject.set(x, "_sizeValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_sizeValueUndefined: Self = StObject.set(x, "_sizeValue", js.undefined)
    
    @scala.inline
    def set_xValue(value: /* import warning: importer.ImportType#apply Failed type conversion: T['_x'] */ js.Any): Self = StObject.set(x, "_xValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_xValueUndefined: Self = StObject.set(x, "_xValue", js.undefined)
    
    @scala.inline
    def set_yValue(value: /* import warning: importer.ImportType#apply Failed type conversion: T['_y'] */ js.Any): Self = StObject.set(x, "_yValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_yValueUndefined: Self = StObject.set(x, "_yValue", js.undefined)
  }
}
