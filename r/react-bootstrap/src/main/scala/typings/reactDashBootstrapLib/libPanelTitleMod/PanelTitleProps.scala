package typings
package reactDashBootstrapLib.libPanelTitleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanelTitleProps
  extends reactLib.reactMod.HTMLProps[PanelTitle] {
  var bsClass: js.UndefOr[java.lang.String] = js.undefined
  var componentClass: js.UndefOr[java.lang.String] = js.undefined
  var toggle: js.UndefOr[scala.Boolean] = js.undefined
}

object PanelTitleProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.HTMLProps[PanelTitle] = null,
    bsClass: java.lang.String = null,
    componentClass: java.lang.String = null,
    toggle: js.UndefOr[scala.Boolean] = js.undefined
  ): PanelTitleProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass)
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass)
    if (!js.isUndefined(toggle)) __obj.updateDynamic("toggle")(toggle)
    __obj.asInstanceOf[PanelTitleProps]
  }
}

