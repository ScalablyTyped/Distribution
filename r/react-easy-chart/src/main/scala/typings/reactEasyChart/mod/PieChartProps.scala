package typings.reactEasyChart.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.CSSProperties
import typings.reactEasyChart.anon.Color
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PieChartProps extends js.Object {
  var clickHandler: js.UndefOr[js.Function2[/* data */ PieData, /* mouseEvent */ MouseEvent, _]] = js.native
  var data: js.Array[Color] = js.native
  /** Size in pixels of the inner hole (diameter) */
  var innerHoleSize: js.UndefOr[Double] = js.native
  /** Whether to add labels the to pie segments */
  var labels: js.UndefOr[Boolean] = js.native
  var mouseMoveHandler: js.UndefOr[js.Function2[/* data */ PieData, /* mouseEvent */ MouseEvent, _]] = js.native
  var mouseOutHandler: js.UndefOr[js.Function2[/* data */ PieData, /* mouseEvent */ MouseEvent, _]] = js.native
  var mouseOverHandler: js.UndefOr[js.Function2[/* data */ PieData, /* mouseEvent */ MouseEvent, _]] = js.native
  /** Padding around the chart in pixels */
  var padding: js.UndefOr[Double] = js.native
  /** Size in pixels in each dimension */
  var size: js.UndefOr[Double] = js.native
  var styles: js.UndefOr[StringDictionary[CSSProperties]] = js.native
}

object PieChartProps {
  @scala.inline
  def apply(data: js.Array[Color]): PieChartProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[PieChartProps]
  }
  @scala.inline
  implicit class PieChartPropsOps[Self <: PieChartProps] (val x: Self) extends AnyVal {
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
    def setDataVarargs(value: Color*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[Color]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setClickHandler(value: (/* data */ PieData, /* mouseEvent */ MouseEvent) => _): Self = this.set("clickHandler", js.Any.fromFunction2(value))
    @scala.inline
    def deleteClickHandler: Self = this.set("clickHandler", js.undefined)
    @scala.inline
    def setInnerHoleSize(value: Double): Self = this.set("innerHoleSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInnerHoleSize: Self = this.set("innerHoleSize", js.undefined)
    @scala.inline
    def setLabels(value: Boolean): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    @scala.inline
    def setMouseMoveHandler(value: (/* data */ PieData, /* mouseEvent */ MouseEvent) => _): Self = this.set("mouseMoveHandler", js.Any.fromFunction2(value))
    @scala.inline
    def deleteMouseMoveHandler: Self = this.set("mouseMoveHandler", js.undefined)
    @scala.inline
    def setMouseOutHandler(value: (/* data */ PieData, /* mouseEvent */ MouseEvent) => _): Self = this.set("mouseOutHandler", js.Any.fromFunction2(value))
    @scala.inline
    def deleteMouseOutHandler: Self = this.set("mouseOutHandler", js.undefined)
    @scala.inline
    def setMouseOverHandler(value: (/* data */ PieData, /* mouseEvent */ MouseEvent) => _): Self = this.set("mouseOverHandler", js.Any.fromFunction2(value))
    @scala.inline
    def deleteMouseOverHandler: Self = this.set("mouseOverHandler", js.undefined)
    @scala.inline
    def setPadding(value: Double): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setStyles(value: StringDictionary[CSSProperties]): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
  }
  
}

