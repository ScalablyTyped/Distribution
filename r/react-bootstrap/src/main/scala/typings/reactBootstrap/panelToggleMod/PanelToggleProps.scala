package typings.reactBootstrap.panelToggleMod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PanelToggleProps
  extends AllHTMLAttributes[PanelToggle]
     with ClassAttributes[PanelToggle] {
  var componentClass: js.UndefOr[String] = js.native
}

object PanelToggleProps {
  @scala.inline
  def apply(): PanelToggleProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PanelToggleProps]
  }
  @scala.inline
  implicit class PanelTogglePropsOps[Self <: PanelToggleProps] (val x: Self) extends AnyVal {
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
    def setComponentClass(value: String): Self = this.set("componentClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponentClass: Self = this.set("componentClass", js.undefined)
  }
  
}

