package typings
package reactDashNativeDashMaterialDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Avatar extends js.Object {
  var avatar: js.UndefOr[reactLib.reactMod.Global.JSXNs.Element] = js.undefined
  var onPress: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object Anon_Avatar {
  @scala.inline
  def apply(avatar: reactLib.reactMod.Global.JSXNs.Element = null, onPress: () => scala.Unit = null): Anon_Avatar = {
    val __obj = js.Dynamic.literal()
    if (avatar != null) __obj.updateDynamic("avatar")(avatar)
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    __obj.asInstanceOf[Anon_Avatar]
  }
}

