package typings.reactToolbox.tooltipMod

import typings.reactToolbox.reactToolboxStrings.bottom
import typings.reactToolbox.reactToolboxStrings.horizontal
import typings.reactToolbox.reactToolboxStrings.left
import typings.reactToolbox.reactToolboxStrings.right
import typings.reactToolbox.reactToolboxStrings.top
import typings.reactToolbox.reactToolboxStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TooltipOptions extends js.Object {
  var className: js.UndefOr[String] = js.native
  var delay: js.UndefOr[Double] = js.native
  var hideOnClick: js.UndefOr[Boolean] = js.native
  var passthrough: js.UndefOr[Boolean] = js.native
  var position: js.UndefOr[bottom | horizontal | left | right | top | vertical] = js.native
  var showOnClick: js.UndefOr[Boolean] = js.native
}

object TooltipOptions {
  @scala.inline
  def apply(): TooltipOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipOptions]
  }
  @scala.inline
  implicit class TooltipOptionsOps[Self <: TooltipOptions] (val x: Self) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setHideOnClick(value: Boolean): Self = this.set("hideOnClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideOnClick: Self = this.set("hideOnClick", js.undefined)
    @scala.inline
    def setPassthrough(value: Boolean): Self = this.set("passthrough", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassthrough: Self = this.set("passthrough", js.undefined)
    @scala.inline
    def setPosition(value: bottom | horizontal | left | right | top | vertical): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setShowOnClick(value: Boolean): Self = this.set("showOnClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowOnClick: Self = this.set("showOnClick", js.undefined)
  }
  
}

