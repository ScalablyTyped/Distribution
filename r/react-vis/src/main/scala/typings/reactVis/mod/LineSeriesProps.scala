package typings.reactVis.mod

import typings.reactVis.reactVisStrings.dashed
import typings.reactVis.reactVisStrings.solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineSeriesProps extends AbstractSeriesProps[LineSeriesPoint] {
   // default: 'solid'
  var curve: js.UndefOr[String | (js.Function1[/* x */ js.Any, _])] = js.native
   // default: null
  var getNull: js.UndefOr[RVGetNull[LineSeriesPoint]] = js.native
  var strokeStyle: js.UndefOr[dashed | solid] = js.native
}

object LineSeriesProps {
  @scala.inline
  def apply(): LineSeriesProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineSeriesProps]
  }
  @scala.inline
  implicit class LineSeriesPropsOps[Self <: LineSeriesProps] (val x: Self) extends AnyVal {
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
    def setGetNull(value: LineSeriesPoint => js.Any): Self = this.set("getNull", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetNull: Self = this.set("getNull", js.undefined)
    @scala.inline
    def setStrokeStyle(value: dashed | solid): Self = this.set("strokeStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeStyle: Self = this.set("strokeStyle", js.undefined)
  }
  
}

