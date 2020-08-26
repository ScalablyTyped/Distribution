package typings.reactToolbox.panelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PanelTheme extends js.Object {
  /**
    * Used in the root class in case the panel has bodyScroll.
    */
  var bodyScroll: js.UndefOr[String] = js.native
  /**
    * Used as the root class of the panel component.
    */
  var panel: js.UndefOr[String] = js.native
}

object PanelTheme {
  @scala.inline
  def apply(): PanelTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PanelTheme]
  }
  @scala.inline
  implicit class PanelThemeOps[Self <: PanelTheme] (val x: Self) extends AnyVal {
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
    def setBodyScroll(value: String): Self = this.set("bodyScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBodyScroll: Self = this.set("bodyScroll", js.undefined)
    @scala.inline
    def setPanel(value: String): Self = this.set("panel", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePanel: Self = this.set("panel", js.undefined)
  }
  
}

