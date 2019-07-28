package typings.reactDashBootstrap.libPanelToggleMod

import typings.react.reactMod.HTMLProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanelToggleProps extends HTMLProps[PanelToggle] {
  var componentClass: js.UndefOr[String] = js.undefined
}

object PanelToggleProps {
  @scala.inline
  def apply(HTMLProps: HTMLProps[PanelToggle] = null, componentClass: String = null): PanelToggleProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass)
    __obj.asInstanceOf[PanelToggleProps]
  }
}

