package typings
package atStorybookApiLib.distModulesLayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Layout extends js.Object {
  var isFullscreen: scala.Boolean
  var isToolshown: scala.Boolean
  var panelPosition: PanelPositions
  var showNav: scala.Boolean
  var showPanel: scala.Boolean
}

object Layout {
  @scala.inline
  def apply(
    isFullscreen: scala.Boolean,
    isToolshown: scala.Boolean,
    panelPosition: PanelPositions,
    showNav: scala.Boolean,
    showPanel: scala.Boolean
  ): Layout = {
    val __obj = js.Dynamic.literal(isFullscreen = isFullscreen, isToolshown = isToolshown, panelPosition = panelPosition, showNav = showNav, showPanel = showPanel)
  
    __obj.asInstanceOf[Layout]
  }
}

