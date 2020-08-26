package typings.reactVis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VerticalBarSeriesProps extends AbstractSeriesProps[VerticalBarSeriesPoint] {
  var barWidth: Double = js.native
}

object VerticalBarSeriesProps {
  @scala.inline
  def apply(barWidth: Double): VerticalBarSeriesProps = {
    val __obj = js.Dynamic.literal(barWidth = barWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerticalBarSeriesProps]
  }
  @scala.inline
  implicit class VerticalBarSeriesPropsOps[Self <: VerticalBarSeriesProps] (val x: Self) extends AnyVal {
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
    def setBarWidth(value: Double): Self = this.set("barWidth", value.asInstanceOf[js.Any])
  }
  
}

