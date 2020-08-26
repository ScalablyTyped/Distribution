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

@js.native
trait RadialChartProps extends js.Object {
  var animation: js.UndefOr[String | AnimationParam | Boolean] = js.native
  var className: js.UndefOr[String] = js.native
   // default: ''
  var colorType: js.UndefOr[String] = js.native
   // default: 'category'
  var data: js.Array[Angle] = js.native
  var getAngle: js.UndefOr[RVGet[RadialChartPoint, angle]] = js.native
  var getAngle0: js.UndefOr[RVGet[RadialChartPoint, angle0]] = js.native
  var getLabel: js.UndefOr[RVGet[RadialChartPoint, label]] = js.native
  var getRadius: js.UndefOr[RVGet[RadialChartPoint, radius]] = js.native
  var getRadius0: js.UndefOr[RVGet[RadialChartPoint, radius0]] = js.native
  var height: Double = js.native
  var labelsAboveChildren: js.UndefOr[Boolean] = js.native
  var labelsStyle: js.UndefOr[CSSProperties] = js.native
  var margin: js.UndefOr[Margin | Double] = js.native
  var onValueClick: js.UndefOr[RVValueEventHandler[RadialChartPoint]] = js.native
  var onValueMouseOut: js.UndefOr[RVValueEventHandler[RadialChartPoint]] = js.native
  var onValueMouseOver: js.UndefOr[RVValueEventHandler[RadialChartPoint]] = js.native
  var showLabels: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var subLabel: js.UndefOr[js.Function1[/* row */ js.Any, String]] = js.native
  var width: Double = js.native
}

object RadialChartProps {
  @scala.inline
  def apply(data: js.Array[Angle], height: Double, width: Double): RadialChartProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadialChartProps]
  }
  @scala.inline
  implicit class RadialChartPropsOps[Self <: RadialChartProps] (val x: Self) extends AnyVal {
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
    def setDataVarargs(value: Angle*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[Angle]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimation(value: String | AnimationParam | Boolean): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setColorType(value: String): Self = this.set("colorType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorType: Self = this.set("colorType", js.undefined)
    @scala.inline
    def setGetAngle(
      value: RadialChartPoint => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ): Self = this.set("getAngle", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetAngle: Self = this.set("getAngle", js.undefined)
    @scala.inline
    def setGetAngle0(
      value: RadialChartPoint => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ): Self = this.set("getAngle0", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetAngle0: Self = this.set("getAngle0", js.undefined)
    @scala.inline
    def setGetLabel(
      value: RadialChartPoint => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ): Self = this.set("getLabel", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetLabel: Self = this.set("getLabel", js.undefined)
    @scala.inline
    def setGetRadius(
      value: RadialChartPoint => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ): Self = this.set("getRadius", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetRadius: Self = this.set("getRadius", js.undefined)
    @scala.inline
    def setGetRadius0(
      value: RadialChartPoint => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ): Self = this.set("getRadius0", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetRadius0: Self = this.set("getRadius0", js.undefined)
    @scala.inline
    def setLabelsAboveChildren(value: Boolean): Self = this.set("labelsAboveChildren", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelsAboveChildren: Self = this.set("labelsAboveChildren", js.undefined)
    @scala.inline
    def setLabelsStyle(value: CSSProperties): Self = this.set("labelsStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelsStyle: Self = this.set("labelsStyle", js.undefined)
    @scala.inline
    def setMargin(value: Margin | Double): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def setOnValueClick(value: (RadialChartPoint, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit): Self = this.set("onValueClick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnValueClick: Self = this.set("onValueClick", js.undefined)
    @scala.inline
    def setOnValueMouseOut(value: (RadialChartPoint, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit): Self = this.set("onValueMouseOut", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnValueMouseOut: Self = this.set("onValueMouseOut", js.undefined)
    @scala.inline
    def setOnValueMouseOver(value: (RadialChartPoint, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit): Self = this.set("onValueMouseOver", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnValueMouseOver: Self = this.set("onValueMouseOver", js.undefined)
    @scala.inline
    def setShowLabels(value: Boolean): Self = this.set("showLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowLabels: Self = this.set("showLabels", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setSubLabel(value: /* row */ js.Any => String): Self = this.set("subLabel", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSubLabel: Self = this.set("subLabel", js.undefined)
  }
  
}

