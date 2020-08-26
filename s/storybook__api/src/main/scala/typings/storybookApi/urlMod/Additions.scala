package typings.storybookApi.urlMod

import typings.storybookApi.layoutMod.PanelPositions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Additions extends js.Object {
  var isFullscreen: js.UndefOr[Boolean] = js.native
  var panelPosition: js.UndefOr[PanelPositions] = js.native
  var selectedPanel: js.UndefOr[String] = js.native
  var showNav: js.UndefOr[Boolean] = js.native
  var showPanel: js.UndefOr[Boolean] = js.native
  var viewMode: js.UndefOr[String] = js.native
}

object Additions {
  @scala.inline
  def apply(): Additions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Additions]
  }
  @scala.inline
  implicit class AdditionsOps[Self <: Additions] (val x: Self) extends AnyVal {
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
    def setIsFullscreen(value: Boolean): Self = this.set("isFullscreen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsFullscreen: Self = this.set("isFullscreen", js.undefined)
    @scala.inline
    def setPanelPosition(value: PanelPositions): Self = this.set("panelPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePanelPosition: Self = this.set("panelPosition", js.undefined)
    @scala.inline
    def setSelectedPanel(value: String): Self = this.set("selectedPanel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedPanel: Self = this.set("selectedPanel", js.undefined)
    @scala.inline
    def setShowNav(value: Boolean): Self = this.set("showNav", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowNav: Self = this.set("showNav", js.undefined)
    @scala.inline
    def setShowPanel(value: Boolean): Self = this.set("showPanel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowPanel: Self = this.set("showPanel", js.undefined)
    @scala.inline
    def setViewMode(value: String): Self = this.set("viewMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewMode: Self = this.set("viewMode", js.undefined)
  }
  
}

