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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadialChartProps extends js.Object {
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
  @scala.inline
  def apply(
    data: js.Array[Angle],
    height: Double,
    width: Double,
    animation: String | AnimationParam | Boolean = null,
    className: String = null,
    colorType: String = null,
    getAngle: RadialChartPoint => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any = null,
    getAngle0: RadialChartPoint => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any = null,
    getLabel: RadialChartPoint => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any = null,
    getRadius: RadialChartPoint => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any = null,
    getRadius0: RadialChartPoint => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any = null,
    labelsAboveChildren: js.UndefOr[Boolean] = js.undefined,
    labelsStyle: CSSProperties = null,
    margin: Margin | Double = null,
    onValueClick: (RadialChartPoint, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit = null,
    onValueMouseOut: (RadialChartPoint, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit = null,
    onValueMouseOver: (RadialChartPoint, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit = null,
    showLabels: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    subLabel: /* row */ js.Any => String = null
  ): RadialChartProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (colorType != null) __obj.updateDynamic("colorType")(colorType.asInstanceOf[js.Any])
    if (getAngle != null) __obj.updateDynamic("getAngle")(js.Any.fromFunction1(getAngle))
    if (getAngle0 != null) __obj.updateDynamic("getAngle0")(js.Any.fromFunction1(getAngle0))
    if (getLabel != null) __obj.updateDynamic("getLabel")(js.Any.fromFunction1(getLabel))
    if (getRadius != null) __obj.updateDynamic("getRadius")(js.Any.fromFunction1(getRadius))
    if (getRadius0 != null) __obj.updateDynamic("getRadius0")(js.Any.fromFunction1(getRadius0))
    if (!js.isUndefined(labelsAboveChildren)) __obj.updateDynamic("labelsAboveChildren")(labelsAboveChildren.get.asInstanceOf[js.Any])
    if (labelsStyle != null) __obj.updateDynamic("labelsStyle")(labelsStyle.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (onValueClick != null) __obj.updateDynamic("onValueClick")(js.Any.fromFunction2(onValueClick))
    if (onValueMouseOut != null) __obj.updateDynamic("onValueMouseOut")(js.Any.fromFunction2(onValueMouseOut))
    if (onValueMouseOver != null) __obj.updateDynamic("onValueMouseOver")(js.Any.fromFunction2(onValueMouseOver))
    if (!js.isUndefined(showLabels)) __obj.updateDynamic("showLabels")(showLabels.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (subLabel != null) __obj.updateDynamic("subLabel")(js.Any.fromFunction1(subLabel))
    __obj.asInstanceOf[RadialChartProps]
  }
}

