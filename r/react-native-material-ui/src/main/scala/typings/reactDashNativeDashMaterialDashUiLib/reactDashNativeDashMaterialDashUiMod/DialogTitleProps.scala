package typings
package reactDashNativeDashMaterialDashUiLib.reactDashNativeDashMaterialDashUiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogTitleProps extends js.Object {
  var children: reactLib.reactMod.Global.JSXNs.Element
  var style: js.UndefOr[reactDashNativeDashMaterialDashUiLib.Anon_TitleContainer] = js.undefined
}

object DialogTitleProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.Global.JSXNs.Element,
    style: reactDashNativeDashMaterialDashUiLib.Anon_TitleContainer = null
  ): DialogTitleProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("children")(children)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[DialogTitleProps]
  }
}

