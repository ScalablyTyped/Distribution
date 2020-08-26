package typings.reactBootstrap.tooltipMod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.reactBootstrap.mod.Sizes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TooltipProps
  extends AllHTMLAttributes[Tooltip]
     with ClassAttributes[Tooltip] {
  // Optional
  var arrowOffsetLeft: js.UndefOr[Double | String] = js.native
  var arrowOffsetTop: js.UndefOr[Double | String] = js.native
  var bsClass: js.UndefOr[String] = js.native
  var bsSize: js.UndefOr[Sizes] = js.native
  var bsStyle: js.UndefOr[String] = js.native
  var placement: js.UndefOr[String] = js.native
  var positionLeft: js.UndefOr[Double] = js.native
  var positionTop: js.UndefOr[Double] = js.native
}

object TooltipProps {
  @scala.inline
  def apply(): TooltipProps = {
    val __obj = js.Dynamic.literal()
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
    def setArrowOffsetLeft(value: Double | String): Self = this.set("arrowOffsetLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrowOffsetLeft: Self = this.set("arrowOffsetLeft", js.undefined)
    @scala.inline
    def setArrowOffsetTop(value: Double | String): Self = this.set("arrowOffsetTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrowOffsetTop: Self = this.set("arrowOffsetTop", js.undefined)
    @scala.inline
    def setBsClass(value: String): Self = this.set("bsClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBsClass: Self = this.set("bsClass", js.undefined)
    @scala.inline
    def setBsSize(value: Sizes): Self = this.set("bsSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBsSize: Self = this.set("bsSize", js.undefined)
    @scala.inline
    def setBsStyle(value: String): Self = this.set("bsStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBsStyle: Self = this.set("bsStyle", js.undefined)
    @scala.inline
    def setPlacement(value: String): Self = this.set("placement", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacement: Self = this.set("placement", js.undefined)
    @scala.inline
    def setPositionLeft(value: Double): Self = this.set("positionLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePositionLeft: Self = this.set("positionLeft", js.undefined)
    @scala.inline
    def setPositionTop(value: Double): Self = this.set("positionTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePositionTop: Self = this.set("positionTop", js.undefined)
  }
  
}

