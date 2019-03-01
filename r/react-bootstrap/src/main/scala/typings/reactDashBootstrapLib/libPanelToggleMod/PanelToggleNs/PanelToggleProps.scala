package typings
package reactDashBootstrapLib.libPanelToggleMod.PanelToggleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanelToggleProps
  extends reactLib.reactMod.ReactNs.HTMLProps[reactDashBootstrapLib.libPanelToggleMod.PanelToggle] {
  var componentClass: js.UndefOr[java.lang.String] = js.undefined
}

object PanelToggleProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.ReactNs.HTMLProps[reactDashBootstrapLib.libPanelToggleMod.PanelToggle] = null,
    componentClass: java.lang.String = null
  ): PanelToggleProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass)
    __obj.asInstanceOf[PanelToggleProps]
  }
}

