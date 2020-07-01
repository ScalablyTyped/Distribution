package typings.reactVis.mod

import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighlightProps extends AbstractSeriesProps[LineMarkSeriesPoint] {
  var enableX: js.UndefOr[Boolean] = js.undefined
  var enableY: js.UndefOr[Boolean] = js.undefined
  var highlightHeight: Double
  var highlightWidth: Double
  var highlightX: String | Double
  var highlightY: String | Double
  def onBrush(row: js.Any): js.Any
  def onBrushEnd(row: js.Any): js.Any
  def onBrushStart(row: js.Any): js.Any
  def onDrag(row: js.Any): js.Any
  def onDragEnd(row: js.Any): js.Any
  def onDragStart(row: js.Any): js.Any
}

object HighlightProps {
  @scala.inline
  def apply(
    highlightHeight: Double,
    highlightWidth: Double,
    highlightX: String | Double,
    highlightY: String | Double,
    onBrush: js.Any => js.Any,
    onBrushEnd: js.Any => js.Any,
    onBrushStart: js.Any => js.Any,
    onDrag: js.Any => js.Any,
    onDragEnd: js.Any => js.Any,
    onDragStart: js.Any => js.Any,
    _colorValue: /* import warning: importer.ImportType#apply Failed type conversion: T['_color'] */ js.Any = null,
    _opacityValue: /* import warning: importer.ImportType#apply Failed type conversion: T['_opacity'] */ js.Any = null,
    _sizeValue: /* import warning: importer.ImportType#apply Failed type conversion: T['_size'] */ js.Any = null,
    _xValue: /* import warning: importer.ImportType#apply Failed type conversion: T['_x'] */ js.Any = null,
    _yValue: /* import warning: importer.ImportType#apply Failed type conversion: T['_y'] */ js.Any = null,
    animation: String | AnimationParam | Boolean = null,
    className: String = null,
    color: String | Double = null,
    colorBaseValue: /* import warning: importer.ImportType#apply Failed type conversion: T['color'] */ js.Any = null,
    colorDistance: js.UndefOr[Double] = js.undefined,
    colorDomain: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T['color'] */ js.Any
    ] = null,
    colorRange: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T['color'] */ js.Any
    ] = null,
    colorType: Scale = null,
    data: js.Array[LineMarkSeriesPoint | js.Array[_]] = null,
    enableX: js.UndefOr[Boolean] = js.undefined,
    enableY: js.UndefOr[Boolean] = js.undefined,
    fill: String | Double = null,
    getColor: LineMarkSeriesPoint => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any = null,
    getColor0: LineMarkSeriesPoint => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any = null,
    getOpacity: LineMarkSeriesPoint => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any = null,
    getOpacity0: LineMarkSeriesPoint => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any = null,
    getSize: LineMarkSeriesPoint => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any = null,
    getSize0: LineMarkSeriesPoint => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any = null,
    getX: LineMarkSeriesPoint => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any = null,
    getX0: LineMarkSeriesPoint => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any = null,
    getY: LineMarkSeriesPoint => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any = null,
    getY0: LineMarkSeriesPoint => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any = null,
    height: js.UndefOr[Double] = js.undefined,
    onNearestX: (LineMarkSeriesPoint, /* data */ RVNearestXData[LineMarkSeriesPoint]) => Unit = null,
    onNearestXY: (LineMarkSeriesPoint, /* data */ RVNearestXData[LineMarkSeriesPoint]) => Unit = null,
    onSeriesClick: MouseEvent[HTMLElement, NativeMouseEvent] => Unit = null,
    onSeriesMouseOut: MouseEvent[HTMLElement, NativeMouseEvent] => Unit = null,
    onSeriesMouseOver: MouseEvent[HTMLElement, NativeMouseEvent] => Unit = null,
    onSeriesRightClick: MouseEvent[HTMLElement, NativeMouseEvent] => Unit = null,
    onValueClick: (LineMarkSeriesPoint, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit = null,
    onValueMouseOut: (LineMarkSeriesPoint, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit = null,
    onValueMouseOver: (LineMarkSeriesPoint, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit = null,
    onValueRightClick: (LineMarkSeriesPoint, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit = null,
    opacity: js.UndefOr[Double] = js.undefined,
    opacityBaseValue: /* import warning: importer.ImportType#apply Failed type conversion: T['opacity'] */ js.Any = null,
    opacityDistance: js.UndefOr[Double] = js.undefined,
    opacityDomain: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T['opacity'] */ js.Any
    ] = null,
    opacityRange: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T['opacity'] */ js.Any
    ] = null,
    opacityType: Scale = null,
    sizeBaseValue: /* import warning: importer.ImportType#apply Failed type conversion: T['size'] */ js.Any = null,
    sizeDistance: js.UndefOr[Double] = js.undefined,
    sizeDomain: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T['size'] */ js.Any
    ] = null,
    sizeRange: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T['size'] */ js.Any
    ] = null,
    sizeType: Scale = null,
    stack: js.UndefOr[Boolean] = js.undefined,
    stroke: String | Double = null,
    style: CSSProperties = null,
    width: js.UndefOr[Double] = js.undefined,
    xBaseValue: /* import warning: importer.ImportType#apply Failed type conversion: T['x'] */ js.Any = null,
    xDistance: js.UndefOr[Double] = js.undefined,
    xDomain: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T['x'] */ js.Any
    ] = null,
    xRange: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T['x'] */ js.Any
    ] = null,
    xType: Scale = null,
    yBaseValue: /* import warning: importer.ImportType#apply Failed type conversion: T['y'] */ js.Any = null,
    yDistance: js.UndefOr[Double] = js.undefined,
    yDomain: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T['y'] */ js.Any
    ] = null,
    yRange: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T['y'] */ js.Any
    ] = null,
    yType: Scale = null
  ): HighlightProps = {
    val __obj = js.Dynamic.literal(highlightHeight = highlightHeight.asInstanceOf[js.Any], highlightWidth = highlightWidth.asInstanceOf[js.Any], highlightX = highlightX.asInstanceOf[js.Any], highlightY = highlightY.asInstanceOf[js.Any], onBrush = js.Any.fromFunction1(onBrush), onBrushEnd = js.Any.fromFunction1(onBrushEnd), onBrushStart = js.Any.fromFunction1(onBrushStart), onDrag = js.Any.fromFunction1(onDrag), onDragEnd = js.Any.fromFunction1(onDragEnd), onDragStart = js.Any.fromFunction1(onDragStart))
    if (_colorValue != null) __obj.updateDynamic("_colorValue")(_colorValue.asInstanceOf[js.Any])
    if (_opacityValue != null) __obj.updateDynamic("_opacityValue")(_opacityValue.asInstanceOf[js.Any])
    if (_sizeValue != null) __obj.updateDynamic("_sizeValue")(_sizeValue.asInstanceOf[js.Any])
    if (_xValue != null) __obj.updateDynamic("_xValue")(_xValue.asInstanceOf[js.Any])
    if (_yValue != null) __obj.updateDynamic("_yValue")(_yValue.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (colorBaseValue != null) __obj.updateDynamic("colorBaseValue")(colorBaseValue.asInstanceOf[js.Any])
    if (!js.isUndefined(colorDistance)) __obj.updateDynamic("colorDistance")(colorDistance.get.asInstanceOf[js.Any])
    if (colorDomain != null) __obj.updateDynamic("colorDomain")(colorDomain.asInstanceOf[js.Any])
    if (colorRange != null) __obj.updateDynamic("colorRange")(colorRange.asInstanceOf[js.Any])
    if (colorType != null) __obj.updateDynamic("colorType")(colorType.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(enableX)) __obj.updateDynamic("enableX")(enableX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableY)) __obj.updateDynamic("enableY")(enableY.get.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (getColor != null) __obj.updateDynamic("getColor")(js.Any.fromFunction1(getColor))
    if (getColor0 != null) __obj.updateDynamic("getColor0")(js.Any.fromFunction1(getColor0))
    if (getOpacity != null) __obj.updateDynamic("getOpacity")(js.Any.fromFunction1(getOpacity))
    if (getOpacity0 != null) __obj.updateDynamic("getOpacity0")(js.Any.fromFunction1(getOpacity0))
    if (getSize != null) __obj.updateDynamic("getSize")(js.Any.fromFunction1(getSize))
    if (getSize0 != null) __obj.updateDynamic("getSize0")(js.Any.fromFunction1(getSize0))
    if (getX != null) __obj.updateDynamic("getX")(js.Any.fromFunction1(getX))
    if (getX0 != null) __obj.updateDynamic("getX0")(js.Any.fromFunction1(getX0))
    if (getY != null) __obj.updateDynamic("getY")(js.Any.fromFunction1(getY))
    if (getY0 != null) __obj.updateDynamic("getY0")(js.Any.fromFunction1(getY0))
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (onNearestX != null) __obj.updateDynamic("onNearestX")(js.Any.fromFunction2(onNearestX))
    if (onNearestXY != null) __obj.updateDynamic("onNearestXY")(js.Any.fromFunction2(onNearestXY))
    if (onSeriesClick != null) __obj.updateDynamic("onSeriesClick")(js.Any.fromFunction1(onSeriesClick))
    if (onSeriesMouseOut != null) __obj.updateDynamic("onSeriesMouseOut")(js.Any.fromFunction1(onSeriesMouseOut))
    if (onSeriesMouseOver != null) __obj.updateDynamic("onSeriesMouseOver")(js.Any.fromFunction1(onSeriesMouseOver))
    if (onSeriesRightClick != null) __obj.updateDynamic("onSeriesRightClick")(js.Any.fromFunction1(onSeriesRightClick))
    if (onValueClick != null) __obj.updateDynamic("onValueClick")(js.Any.fromFunction2(onValueClick))
    if (onValueMouseOut != null) __obj.updateDynamic("onValueMouseOut")(js.Any.fromFunction2(onValueMouseOut))
    if (onValueMouseOver != null) __obj.updateDynamic("onValueMouseOver")(js.Any.fromFunction2(onValueMouseOver))
    if (onValueRightClick != null) __obj.updateDynamic("onValueRightClick")(js.Any.fromFunction2(onValueRightClick))
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (opacityBaseValue != null) __obj.updateDynamic("opacityBaseValue")(opacityBaseValue.asInstanceOf[js.Any])
    if (!js.isUndefined(opacityDistance)) __obj.updateDynamic("opacityDistance")(opacityDistance.get.asInstanceOf[js.Any])
    if (opacityDomain != null) __obj.updateDynamic("opacityDomain")(opacityDomain.asInstanceOf[js.Any])
    if (opacityRange != null) __obj.updateDynamic("opacityRange")(opacityRange.asInstanceOf[js.Any])
    if (opacityType != null) __obj.updateDynamic("opacityType")(opacityType.asInstanceOf[js.Any])
    if (sizeBaseValue != null) __obj.updateDynamic("sizeBaseValue")(sizeBaseValue.asInstanceOf[js.Any])
    if (!js.isUndefined(sizeDistance)) __obj.updateDynamic("sizeDistance")(sizeDistance.get.asInstanceOf[js.Any])
    if (sizeDomain != null) __obj.updateDynamic("sizeDomain")(sizeDomain.asInstanceOf[js.Any])
    if (sizeRange != null) __obj.updateDynamic("sizeRange")(sizeRange.asInstanceOf[js.Any])
    if (sizeType != null) __obj.updateDynamic("sizeType")(sizeType.asInstanceOf[js.Any])
    if (!js.isUndefined(stack)) __obj.updateDynamic("stack")(stack.get.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (xBaseValue != null) __obj.updateDynamic("xBaseValue")(xBaseValue.asInstanceOf[js.Any])
    if (!js.isUndefined(xDistance)) __obj.updateDynamic("xDistance")(xDistance.get.asInstanceOf[js.Any])
    if (xDomain != null) __obj.updateDynamic("xDomain")(xDomain.asInstanceOf[js.Any])
    if (xRange != null) __obj.updateDynamic("xRange")(xRange.asInstanceOf[js.Any])
    if (xType != null) __obj.updateDynamic("xType")(xType.asInstanceOf[js.Any])
    if (yBaseValue != null) __obj.updateDynamic("yBaseValue")(yBaseValue.asInstanceOf[js.Any])
    if (!js.isUndefined(yDistance)) __obj.updateDynamic("yDistance")(yDistance.get.asInstanceOf[js.Any])
    if (yDomain != null) __obj.updateDynamic("yDomain")(yDomain.asInstanceOf[js.Any])
    if (yRange != null) __obj.updateDynamic("yRange")(yRange.asInstanceOf[js.Any])
    if (yType != null) __obj.updateDynamic("yType")(yType.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightProps]
  }
}

