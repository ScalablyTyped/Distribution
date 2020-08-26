package typings.reactNativeSvgCharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TooltipProps extends js.Object {
  var height: js.UndefOr[Double] = js.native
  var index: js.UndefOr[Double] = js.native
  var pointStroke: js.UndefOr[String] = js.native
  var stroke: js.UndefOr[String] = js.native
  var text: String = js.native
  var value: js.UndefOr[Double] = js.native
}

object TooltipProps {
  @scala.inline
  def apply(text: String): TooltipProps = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipProps]
  }
  @scala.inline
  implicit class TooltipPropsOps[Self <: TooltipProps] (val x: Self) extends AnyVal {
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
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setPointStroke(value: String): Self = this.set("pointStroke", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePointStroke: Self = this.set("pointStroke", js.undefined)
    @scala.inline
    def setStroke(value: String): Self = this.set("stroke", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

