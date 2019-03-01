package typings
package reactDashNativeDashMaterialDashUiLib.reactDashNativeDashMaterialDashUiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardProps extends js.Object {
  var children: js.UndefOr[reactLib.reactMod.Global.JSXNs.Element] = js.undefined
  var onPress: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var style: js.UndefOr[reactDashNativeDashMaterialDashUiLib.Anon_ContainerViewStyle] = js.undefined
}

object CardProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.Global.JSXNs.Element = null,
    onPress: js.Function0[scala.Unit] = null,
    style: reactDashNativeDashMaterialDashUiLib.Anon_ContainerViewStyle = null
  ): CardProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children)
    if (onPress != null) __obj.updateDynamic("onPress")(onPress)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[CardProps]
  }
}

