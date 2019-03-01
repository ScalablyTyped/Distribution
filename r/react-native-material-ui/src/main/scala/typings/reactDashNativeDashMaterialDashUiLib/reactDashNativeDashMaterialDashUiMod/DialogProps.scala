package typings
package reactDashNativeDashMaterialDashUiLib.reactDashNativeDashMaterialDashUiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogProps extends js.Object {
  var children: reactLib.reactMod.Global.JSXNs.Element | js.Array[reactLib.reactMod.Global.JSXNs.Element]
  var onPress: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var style: js.UndefOr[reactDashNativeDashMaterialDashUiLib.Anon_ContainerViewStyle] = js.undefined
}

object DialogProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.Global.JSXNs.Element | js.Array[reactLib.reactMod.Global.JSXNs.Element],
    onPress: js.Function0[scala.Unit] = null,
    style: reactDashNativeDashMaterialDashUiLib.Anon_ContainerViewStyle = null
  ): DialogProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (onPress != null) __obj.updateDynamic("onPress")(onPress)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[DialogProps]
  }
}

