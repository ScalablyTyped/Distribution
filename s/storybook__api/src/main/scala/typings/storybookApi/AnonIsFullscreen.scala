package typings.storybookApi

import typings.storybookApi.layoutMod.PanelPositions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIsFullscreen extends js.Object {
  var isFullscreen: Boolean
  var isToolshown: Boolean
  var panelPosition: PanelPositions
  var showNav: Boolean
  var showPanel: Boolean
}

object AnonIsFullscreen {
  @scala.inline
  def apply(
    isFullscreen: Boolean,
    isToolshown: Boolean,
    panelPosition: PanelPositions,
    showNav: Boolean,
    showPanel: Boolean
  ): AnonIsFullscreen = {
    val __obj = js.Dynamic.literal(isFullscreen = isFullscreen.asInstanceOf[js.Any], isToolshown = isToolshown.asInstanceOf[js.Any], panelPosition = panelPosition.asInstanceOf[js.Any], showNav = showNav.asInstanceOf[js.Any], showPanel = showPanel.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIsFullscreen]
  }
}

