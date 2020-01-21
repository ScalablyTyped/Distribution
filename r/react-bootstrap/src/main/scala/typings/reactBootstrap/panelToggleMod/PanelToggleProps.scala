package typings.reactBootstrap.panelToggleMod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanelToggleProps
  extends AllHTMLAttributes[PanelToggle]
     with ClassAttributes[PanelToggle] {
  var componentClass: js.UndefOr[String] = js.undefined
}

object PanelToggleProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[PanelToggle] = null,
    ClassAttributes: ClassAttributes[PanelToggle] = null,
    componentClass: String = null
  ): PanelToggleProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanelToggleProps]
  }
}

