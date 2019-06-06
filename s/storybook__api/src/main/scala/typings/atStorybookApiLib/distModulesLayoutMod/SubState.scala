package typings
package atStorybookApiLib.distModulesLayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubState extends js.Object {
  var layout: Layout
  var selectedPanel: js.UndefOr[java.lang.String] = js.undefined
  var theme: atStorybookThemingLib.distTypesMod.ThemeVars
  var ui: UI
}

object SubState {
  @scala.inline
  def apply(
    layout: Layout,
    theme: atStorybookThemingLib.distTypesMod.ThemeVars,
    ui: UI,
    selectedPanel: java.lang.String = null
  ): SubState = {
    val __obj = js.Dynamic.literal(layout = layout, theme = theme, ui = ui)
    if (selectedPanel != null) __obj.updateDynamic("selectedPanel")(selectedPanel)
    __obj.asInstanceOf[SubState]
  }
}

