package typings.atStorybookApi.distModulesLayoutMod

import typings.atStorybookTheming.distTypesMod.ThemeVars
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubState extends js.Object {
  var layout: Layout
  var selectedPanel: js.UndefOr[String] = js.undefined
  var theme: ThemeVars
  var ui: UI
}

object SubState {
  @scala.inline
  def apply(layout: Layout, theme: ThemeVars, ui: UI, selectedPanel: String = null): SubState = {
    val __obj = js.Dynamic.literal(layout = layout.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], ui = ui.asInstanceOf[js.Any])
    if (selectedPanel != null) __obj.updateDynamic("selectedPanel")(selectedPanel.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubState]
  }
}

