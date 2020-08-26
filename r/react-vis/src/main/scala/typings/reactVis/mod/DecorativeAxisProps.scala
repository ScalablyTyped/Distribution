package typings.reactVis.mod

import typings.reactVis.anon.Y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecorativeAxisProps extends AbstractSeriesProps[DecorativeAxisPoint] {
  var axisDomain: js.Array[Double] = js.native
  var axisEnd: Y = js.native
  var axisStart: Y = js.native
  var numberOfTicks: js.UndefOr[Double] = js.native
  var tickSize: js.UndefOr[Double] = js.native
   // default: 10
  var tickValue: js.UndefOr[js.Function1[/* x */ js.Any, String | Double]] = js.native
}

object DecorativeAxisProps {
  @scala.inline
  def apply(axisDomain: js.Array[Double], axisEnd: Y, axisStart: Y): DecorativeAxisProps = {
    val __obj = js.Dynamic.literal(axisDomain = axisDomain.asInstanceOf[js.Any], axisEnd = axisEnd.asInstanceOf[js.Any], axisStart = axisStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecorativeAxisProps]
  }
  @scala.inline
  implicit class DecorativeAxisPropsOps[Self <: DecorativeAxisProps] (val x: Self) extends AnyVal {
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
    def setAxisDomainVarargs(value: Double*): Self = this.set("axisDomain", js.Array(value :_*))
    @scala.inline
    def setAxisDomain(value: js.Array[Double]): Self = this.set("axisDomain", value.asInstanceOf[js.Any])
    @scala.inline
    def setAxisEnd(value: Y): Self = this.set("axisEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setAxisStart(value: Y): Self = this.set("axisStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumberOfTicks(value: Double): Self = this.set("numberOfTicks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberOfTicks: Self = this.set("numberOfTicks", js.undefined)
    @scala.inline
    def setTickSize(value: Double): Self = this.set("tickSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTickSize: Self = this.set("tickSize", js.undefined)
    @scala.inline
    def setTickValue(value: /* x */ js.Any => String | Double): Self = this.set("tickValue", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTickValue: Self = this.set("tickValue", js.undefined)
  }
  
}

