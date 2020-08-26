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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbstractSeriesProps[T /* <: AbstractSeriesPoint */] extends js.Object {
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
  var onNearestXY: js.UndefOr[RVNearestXEventHandler[T]] = js.native
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
  def apply[/* <: typings.reactVis.mod.AbstractSeriesPoint */ T](): AbstractSeriesProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AbstractSeriesProps[T]]
  }
  @scala.inline
  implicit class AbstractSeriesPropsOps[Self <: AbstractSeriesProps[_], /* <: typings.reactVis.mod.AbstractSeriesPoint */ T] (val x: Self with AbstractSeriesProps[T]) extends AnyVal {
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
    def set_colorValue(value: /* import warning: importer.ImportType#apply Failed type conversion: T['_color'] */ js.Any): Self = this.set("_colorValue", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_colorValue: Self = this.set("_colorValue", js.undefined)
    @scala.inline
    def set_opacityValue(
      value: /* import warning: importer.ImportType#apply Failed type conversion: T['_opacity'] */ js.Any
    ): Self = this.set("_opacityValue", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_opacityValue: Self = this.set("_opacityValue", js.undefined)
    @scala.inline
    def set_sizeValue(value: /* import warning: importer.ImportType#apply Failed type conversion: T['_size'] */ js.Any): Self = this.set("_sizeValue", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_sizeValue: Self = this.set("_sizeValue", js.undefined)
    @scala.inline
    def set_xValue(value: /* import warning: importer.ImportType#apply Failed type conversion: T['_x'] */ js.Any): Self = this.set("_xValue", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_xValue: Self = this.set("_xValue", js.undefined)
    @scala.inline
    def set_yValue(value: /* import warning: importer.ImportType#apply Failed type conversion: T['_y'] */ js.Any): Self = this.set("_yValue", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_yValue: Self = this.set("_yValue", js.undefined)
    @scala.inline
    def setAnimation(value: String | AnimationParam | Boolean): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setColor(value: String | Double): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setColorBaseValue(value: /* import warning: importer.ImportType#apply Failed type conversion: T['color'] */ js.Any): Self = this.set("colorBaseValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorBaseValue: Self = this.set("colorBaseValue", js.undefined)
    @scala.inline
    def setColorDistance(value: Double): Self = this.set("colorDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorDistance: Self = this.set("colorDistance", js.undefined)
    @scala.inline
    def setColorDomainVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: T['color'] */ js.Any)*
    ): Self = this.set("colorDomain", js.Array(value :_*))
    @scala.inline
    def setColorDomain(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: T['color'] */ js.Any
        ]
    ): Self = this.set("colorDomain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorDomain: Self = this.set("colorDomain", js.undefined)
    @scala.inline
    def setColorRangeVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: T['color'] */ js.Any)*
    ): Self = this.set("colorRange", js.Array(value :_*))
    @scala.inline
    def setColorRange(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: T['color'] */ js.Any
        ]
    ): Self = this.set("colorRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorRange: Self = this.set("colorRange", js.undefined)
    @scala.inline
    def setColorType(value: Scale): Self = this.set("colorType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorType: Self = this.set("colorType", js.undefined)
    @scala.inline
    def setDataVarargs(value: (T | js.Array[js.Any])*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[T | js.Array[_]]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setFill(value: String | Double): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setGetColor(value: T => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any): Self = this.set("getColor", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetColor: Self = this.set("getColor", js.undefined)
    @scala.inline
    def setGetColor0(value: T => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any): Self = this.set("getColor0", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetColor0: Self = this.set("getColor0", js.undefined)
    @scala.inline
    def setGetOpacity(value: T => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any): Self = this.set("getOpacity", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetOpacity: Self = this.set("getOpacity", js.undefined)
    @scala.inline
    def setGetOpacity0(value: T => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any): Self = this.set("getOpacity0", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetOpacity0: Self = this.set("getOpacity0", js.undefined)
    @scala.inline
    def setGetSize(value: T => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any): Self = this.set("getSize", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetSize: Self = this.set("getSize", js.undefined)
    @scala.inline
    def setGetSize0(value: T => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any): Self = this.set("getSize0", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetSize0: Self = this.set("getSize0", js.undefined)
    @scala.inline
    def setGetX(value: T => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any): Self = this.set("getX", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetX: Self = this.set("getX", js.undefined)
    @scala.inline
    def setGetX0(value: T => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any): Self = this.set("getX0", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetX0: Self = this.set("getX0", js.undefined)
    @scala.inline
    def setGetY(value: T => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any): Self = this.set("getY", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetY: Self = this.set("getY", js.undefined)
    @scala.inline
    def setGetY0(value: T => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any): Self = this.set("getY0", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetY0: Self = this.set("getY0", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setOnNearestX(value: (T, /* data */ RVNearestXData[T]) => Unit): Self = this.set("onNearestX", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnNearestX: Self = this.set("onNearestX", js.undefined)
    @scala.inline
    def setOnNearestXY(value: (T, /* data */ RVNearestXData[T]) => Unit): Self = this.set("onNearestXY", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnNearestXY: Self = this.set("onNearestXY", js.undefined)
    @scala.inline
    def setOnSeriesClick(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = this.set("onSeriesClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSeriesClick: Self = this.set("onSeriesClick", js.undefined)
    @scala.inline
    def setOnSeriesMouseOut(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = this.set("onSeriesMouseOut", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSeriesMouseOut: Self = this.set("onSeriesMouseOut", js.undefined)
    @scala.inline
    def setOnSeriesMouseOver(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = this.set("onSeriesMouseOver", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSeriesMouseOver: Self = this.set("onSeriesMouseOver", js.undefined)
    @scala.inline
    def setOnSeriesRightClick(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = this.set("onSeriesRightClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSeriesRightClick: Self = this.set("onSeriesRightClick", js.undefined)
    @scala.inline
    def setOnValueClick(value: (T, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit): Self = this.set("onValueClick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnValueClick: Self = this.set("onValueClick", js.undefined)
    @scala.inline
    def setOnValueMouseOut(value: (T, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit): Self = this.set("onValueMouseOut", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnValueMouseOut: Self = this.set("onValueMouseOut", js.undefined)
    @scala.inline
    def setOnValueMouseOver(value: (T, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit): Self = this.set("onValueMouseOver", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnValueMouseOver: Self = this.set("onValueMouseOver", js.undefined)
    @scala.inline
    def setOnValueRightClick(value: (T, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit): Self = this.set("onValueRightClick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnValueRightClick: Self = this.set("onValueRightClick", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setOpacityBaseValue(value: /* import warning: importer.ImportType#apply Failed type conversion: T['opacity'] */ js.Any): Self = this.set("opacityBaseValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacityBaseValue: Self = this.set("opacityBaseValue", js.undefined)
    @scala.inline
    def setOpacityDistance(value: Double): Self = this.set("opacityDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacityDistance: Self = this.set("opacityDistance", js.undefined)
    @scala.inline
    def setOpacityDomainVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: T['opacity'] */ js.Any)*
    ): Self = this.set("opacityDomain", js.Array(value :_*))
    @scala.inline
    def setOpacityDomain(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: T['opacity'] */ js.Any
        ]
    ): Self = this.set("opacityDomain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacityDomain: Self = this.set("opacityDomain", js.undefined)
    @scala.inline
    def setOpacityRangeVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: T['opacity'] */ js.Any)*
    ): Self = this.set("opacityRange", js.Array(value :_*))
    @scala.inline
    def setOpacityRange(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: T['opacity'] */ js.Any
        ]
    ): Self = this.set("opacityRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacityRange: Self = this.set("opacityRange", js.undefined)
    @scala.inline
    def setOpacityType(value: Scale): Self = this.set("opacityType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacityType: Self = this.set("opacityType", js.undefined)
    @scala.inline
    def setSizeBaseValue(value: /* import warning: importer.ImportType#apply Failed type conversion: T['size'] */ js.Any): Self = this.set("sizeBaseValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizeBaseValue: Self = this.set("sizeBaseValue", js.undefined)
    @scala.inline
    def setSizeDistance(value: Double): Self = this.set("sizeDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizeDistance: Self = this.set("sizeDistance", js.undefined)
    @scala.inline
    def setSizeDomainVarargs(value: (/* import warning: importer.ImportType#apply Failed type conversion: T['size'] */ js.Any)*): Self = this.set("sizeDomain", js.Array(value :_*))
    @scala.inline
    def setSizeDomain(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: T['size'] */ js.Any
        ]
    ): Self = this.set("sizeDomain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizeDomain: Self = this.set("sizeDomain", js.undefined)
    @scala.inline
    def setSizeRangeVarargs(value: (/* import warning: importer.ImportType#apply Failed type conversion: T['size'] */ js.Any)*): Self = this.set("sizeRange", js.Array(value :_*))
    @scala.inline
    def setSizeRange(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: T['size'] */ js.Any
        ]
    ): Self = this.set("sizeRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizeRange: Self = this.set("sizeRange", js.undefined)
    @scala.inline
    def setSizeType(value: Scale): Self = this.set("sizeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizeType: Self = this.set("sizeType", js.undefined)
    @scala.inline
    def setStack(value: Boolean): Self = this.set("stack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStack: Self = this.set("stack", js.undefined)
    @scala.inline
    def setStroke(value: String | Double): Self = this.set("stroke", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setXBaseValue(value: /* import warning: importer.ImportType#apply Failed type conversion: T['x'] */ js.Any): Self = this.set("xBaseValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXBaseValue: Self = this.set("xBaseValue", js.undefined)
    @scala.inline
    def setXDistance(value: Double): Self = this.set("xDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXDistance: Self = this.set("xDistance", js.undefined)
    @scala.inline
    def setXDomainVarargs(value: (/* import warning: importer.ImportType#apply Failed type conversion: T['x'] */ js.Any)*): Self = this.set("xDomain", js.Array(value :_*))
    @scala.inline
    def setXDomain(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: T['x'] */ js.Any
        ]
    ): Self = this.set("xDomain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXDomain: Self = this.set("xDomain", js.undefined)
    @scala.inline
    def setXRangeVarargs(value: (/* import warning: importer.ImportType#apply Failed type conversion: T['x'] */ js.Any)*): Self = this.set("xRange", js.Array(value :_*))
    @scala.inline
    def setXRange(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: T['x'] */ js.Any
        ]
    ): Self = this.set("xRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXRange: Self = this.set("xRange", js.undefined)
    @scala.inline
    def setXType(value: Scale): Self = this.set("xType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXType: Self = this.set("xType", js.undefined)
    @scala.inline
    def setYBaseValue(value: /* import warning: importer.ImportType#apply Failed type conversion: T['y'] */ js.Any): Self = this.set("yBaseValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYBaseValue: Self = this.set("yBaseValue", js.undefined)
    @scala.inline
    def setYDistance(value: Double): Self = this.set("yDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYDistance: Self = this.set("yDistance", js.undefined)
    @scala.inline
    def setYDomainVarargs(value: (/* import warning: importer.ImportType#apply Failed type conversion: T['y'] */ js.Any)*): Self = this.set("yDomain", js.Array(value :_*))
    @scala.inline
    def setYDomain(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: T['y'] */ js.Any
        ]
    ): Self = this.set("yDomain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYDomain: Self = this.set("yDomain", js.undefined)
    @scala.inline
    def setYRangeVarargs(value: (/* import warning: importer.ImportType#apply Failed type conversion: T['y'] */ js.Any)*): Self = this.set("yRange", js.Array(value :_*))
    @scala.inline
    def setYRange(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: T['y'] */ js.Any
        ]
    ): Self = this.set("yRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYRange: Self = this.set("yRange", js.undefined)
    @scala.inline
    def setYType(value: Scale): Self = this.set("yType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYType: Self = this.set("yType", js.undefined)
  }
  
}

