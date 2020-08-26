package typings.reactVis.mod

import typings.react.mod.CSSProperties
import typings.reactVis.reactVisStrings.dashed
import typings.reactVis.reactVisStrings.solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineMarkSeriesProps extends AbstractSeriesProps[LineMarkSeriesPoint] {
  var curve: js.UndefOr[String | (js.Function1[/* x */ js.Any, _])] = js.native
   // default: null
  var getNull: js.UndefOr[RVGetNull[LineMarkSeriesPoint]] = js.native
  var lineStyle: js.UndefOr[CSSProperties] = js.native
   // default: {}
  var markStyle: js.UndefOr[CSSProperties] = js.native
   // default: {}
  var strokeStyle: js.UndefOr[dashed | solid] = js.native
}

object LineMarkSeriesProps {
  @scala.inline
  def apply(): LineMarkSeriesProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineMarkSeriesProps]
  }
  @scala.inline
  implicit class LineMarkSeriesPropsOps[Self <: LineMarkSeriesProps] (val x: Self) extends AnyVal {
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
    def setCurveFunction1(value: /* x */ js.Any => _): Self = this.set("curve", js.Any.fromFunction1(value))
    @scala.inline
    def setCurve(value: String | (js.Function1[/* x */ js.Any, _])): Self = this.set("curve", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurve: Self = this.set("curve", js.undefined)
    @scala.inline
    def setGetNull(value: LineMarkSeriesPoint => js.Any): Self = this.set("getNull", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetNull: Self = this.set("getNull", js.undefined)
    @scala.inline
    def setLineStyle(value: CSSProperties): Self = this.set("lineStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineStyle: Self = this.set("lineStyle", js.undefined)
    @scala.inline
    def setMarkStyle(value: CSSProperties): Self = this.set("markStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkStyle: Self = this.set("markStyle", js.undefined)
    @scala.inline
    def setStrokeStyle(value: dashed | solid): Self = this.set("strokeStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeStyle: Self = this.set("strokeStyle", js.undefined)
  }
  
}

