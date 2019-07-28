package typings.reactDashToggle.reactDashToggleMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToggleIcons extends js.Object {
  var checked: js.UndefOr[ReactNode] = js.undefined
  var unchecked: js.UndefOr[ReactNode] = js.undefined
}

object ToggleIcons {
  @scala.inline
  def apply(checked: ReactNode = null, unchecked: ReactNode = null): ToggleIcons = {
    val __obj = js.Dynamic.literal()
    if (checked != null) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (unchecked != null) __obj.updateDynamic("unchecked")(unchecked.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToggleIcons]
  }
}

