package typings.atStorybookApi.distModulesLayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Layout extends js.Object {
  var isFullscreen: Boolean
  var isToolshown: Boolean
  var panelPosition: PanelPositions
  var showNav: Boolean
  var showPanel: Boolean
}

object Layout {
  @scala.inline
  def apply(
    isFullscreen: Boolean,
    isToolshown: Boolean,
    panelPosition: PanelPositions,
    showNav: Boolean,
    showPanel: Boolean
  ): Layout = {
    val __obj = js.Dynamic.literal(isFullscreen = isFullscreen, isToolshown = isToolshown, panelPosition = panelPosition, showNav = showNav, showPanel = showPanel)
  
    __obj.asInstanceOf[Layout]
  }
}

