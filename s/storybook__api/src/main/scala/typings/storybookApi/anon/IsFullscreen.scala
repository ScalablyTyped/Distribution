package typings.storybookApi.anon

import typings.storybookApi.layoutMod.PanelPositions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsFullscreen extends js.Object {
  var isFullscreen: Boolean = js.native
  var isToolshown: Boolean = js.native
  var panelPosition: PanelPositions = js.native
  var showNav: Boolean = js.native
  var showPanel: Boolean = js.native
}

object IsFullscreen {
  @scala.inline
  def apply(
    isFullscreen: Boolean,
    isToolshown: Boolean,
    panelPosition: PanelPositions,
    showNav: Boolean,
    showPanel: Boolean
  ): IsFullscreen = {
    val __obj = js.Dynamic.literal(isFullscreen = isFullscreen.asInstanceOf[js.Any], isToolshown = isToolshown.asInstanceOf[js.Any], panelPosition = panelPosition.asInstanceOf[js.Any], showNav = showNav.asInstanceOf[js.Any], showPanel = showPanel.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsFullscreen]
  }
  @scala.inline
  implicit class IsFullscreenOps[Self <: IsFullscreen] (val x: Self) extends AnyVal {
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
    def setIsToolshown(value: Boolean): Self = this.set("isToolshown", value.asInstanceOf[js.Any])
    @scala.inline
    def setPanelPosition(value: PanelPositions): Self = this.set("panelPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowNav(value: Boolean): Self = this.set("showNav", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowPanel(value: Boolean): Self = this.set("showPanel", value.asInstanceOf[js.Any])
  }
  
}

