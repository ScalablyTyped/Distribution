package typings
package reactDashNativeDashMaterialDashUiLib.reactDashNativeDashMaterialDashUiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogContentProps extends js.Object {
  var children: reactLib.reactMod.Global.JSXNs.Element
  var style: js.UndefOr[reactDashNativeDashMaterialDashUiLib.Anon_ContentContainer] = js.undefined
}

object DialogContentProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.Global.JSXNs.Element,
    style: reactDashNativeDashMaterialDashUiLib.Anon_ContentContainer = null
  ): DialogContentProps = {
    val __obj = js.Dynamic.literal(children = children)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[DialogContentProps]
  }
}

