package typings.reactBootstrap.panelBodyMod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PanelBodyProps
  extends AllHTMLAttributes[PanelBody]
     with ClassAttributes[PanelBody] {
  var bsClass: js.UndefOr[String] = js.native
  var collapsible: js.UndefOr[Boolean] = js.native
}

object PanelBodyProps {
  @scala.inline
  def apply(): PanelBodyProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PanelBodyProps]
  }
  @scala.inline
  implicit class PanelBodyPropsOps[Self <: PanelBodyProps] (val x: Self) extends AnyVal {
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
    def setBsClass(value: String): Self = this.set("bsClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBsClass: Self = this.set("bsClass", js.undefined)
    @scala.inline
    def setCollapsible(value: Boolean): Self = this.set("collapsible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapsible: Self = this.set("collapsible", js.undefined)
  }
  
}

