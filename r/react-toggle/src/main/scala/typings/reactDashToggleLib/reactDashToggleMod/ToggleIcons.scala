package typings
package reactDashToggleLib.reactDashToggleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToggleIcons extends js.Object {
  var checked: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var unchecked: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
}

object ToggleIcons {
  @scala.inline
  def apply(checked: reactLib.reactMod.ReactNode = null, unchecked: reactLib.reactMod.ReactNode = null): ToggleIcons = {
    val __obj = js.Dynamic.literal()
    if (checked != null) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (unchecked != null) __obj.updateDynamic("unchecked")(unchecked.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToggleIcons]
  }
}

