package typings.reactToolbox.tooltipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TooltipTheme extends js.Object {
  /**
    * Added to the tooltip element.
    */
  var tooltip: js.UndefOr[String] = js.native
  /**
    * Added to the root when the tooltip is active.
    */
  var tooltipActive: js.UndefOr[String] = js.native
  /**
    * Wrapper for the root element used to position the tooltip.
    */
  var tooltipWrapper: js.UndefOr[String] = js.native
}

object TooltipTheme {
  @scala.inline
  def apply(): TooltipTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipTheme]
  }
  @scala.inline
  implicit class TooltipThemeOps[Self <: TooltipTheme] (val x: Self) extends AnyVal {
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
    def setTooltip(value: String): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    @scala.inline
    def setTooltipActive(value: String): Self = this.set("tooltipActive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltipActive: Self = this.set("tooltipActive", js.undefined)
    @scala.inline
    def setTooltipWrapper(value: String): Self = this.set("tooltipWrapper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltipWrapper: Self = this.set("tooltipWrapper", js.undefined)
  }
  
}

