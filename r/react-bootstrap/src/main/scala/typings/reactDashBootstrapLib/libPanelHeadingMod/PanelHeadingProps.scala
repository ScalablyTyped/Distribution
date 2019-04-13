package typings
package reactDashBootstrapLib.libPanelHeadingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanelHeadingProps
  extends reactLib.reactMod.HTMLProps[PanelHeading] {
  var bsClass: js.UndefOr[java.lang.String] = js.undefined
  var componentClass: js.UndefOr[java.lang.String] = js.undefined
}

object PanelHeadingProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.HTMLProps[PanelHeading] = null,
    bsClass: java.lang.String = null,
    componentClass: java.lang.String = null
  ): PanelHeadingProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass)
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass)
    __obj.asInstanceOf[PanelHeadingProps]
  }
}

