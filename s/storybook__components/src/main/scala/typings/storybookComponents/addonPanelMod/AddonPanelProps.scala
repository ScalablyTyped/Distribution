package typings.storybookComponents.addonPanelMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddonPanelProps extends js.Object {
  var active: Boolean = js.native
  var children: ReactNode = js.native
}

object AddonPanelProps {
  @scala.inline
  def apply(active: Boolean, children: ReactNode = null): AddonPanelProps = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddonPanelProps]
  }
}

