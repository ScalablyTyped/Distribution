package typings.reactVis.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineMarkSeriesPoint extends AbstractSeriesPoint {
  var color: js.UndefOr[String | Double] = js.native
  var fill: js.UndefOr[String | Double] = js.native
  var opacity: js.UndefOr[String | Double] = js.native
  var size: js.UndefOr[String | Double] = js.native
  var stroke: js.UndefOr[String | Double] = js.native
  var x: String | Double | Date = js.native
  var y: String | Double | Date = js.native
}

object LineMarkSeriesPoint {
  @scala.inline
  def apply(x: String | Double | Date, y: String | Double | Date): LineMarkSeriesPoint = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineMarkSeriesPoint]
  }
  @scala.inline
  implicit class LineMarkSeriesPointOps[Self <: LineMarkSeriesPoint] (val x: Self) extends AnyVal {
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
    def setX(value: String | Double | Date): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: String | Double | Date): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def setColor(value: String | Double): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setFill(value: String | Double): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setOpacity(value: String | Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setSize(value: String | Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setStroke(value: String | Double): Self = this.set("stroke", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
  }
  
}

