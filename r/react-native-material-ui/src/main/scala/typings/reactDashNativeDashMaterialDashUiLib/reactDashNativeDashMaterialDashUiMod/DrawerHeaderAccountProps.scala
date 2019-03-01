package typings
package reactDashNativeDashMaterialDashUiLib.reactDashNativeDashMaterialDashUiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawerHeaderAccountProps extends js.Object {
  var accounts: js.UndefOr[js.Array[reactDashNativeDashMaterialDashUiLib.Anon_Avatar]] = js.undefined
  var avatar: js.UndefOr[reactLib.reactMod.Global.JSXNs.Element] = js.undefined
  var footer: js.UndefOr[js.Object] = js.undefined
  var style: js.UndefOr[reactDashNativeDashMaterialDashUiLib.Anon_AccountContainer] = js.undefined
}

object DrawerHeaderAccountProps {
  @scala.inline
  def apply(
    accounts: js.Array[reactDashNativeDashMaterialDashUiLib.Anon_Avatar] = null,
    avatar: reactLib.reactMod.Global.JSXNs.Element = null,
    footer: js.Object = null,
    style: reactDashNativeDashMaterialDashUiLib.Anon_AccountContainer = null
  ): DrawerHeaderAccountProps = {
    val __obj = js.Dynamic.literal()
    if (accounts != null) __obj.updateDynamic("accounts")(accounts)
    if (avatar != null) __obj.updateDynamic("avatar")(avatar)
    if (footer != null) __obj.updateDynamic("footer")(footer)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[DrawerHeaderAccountProps]
  }
}

