package typings.atStorybookComponents.distAddonDashPanelAddonDashPanelMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddonPanelProps extends js.Object {
  var active: Boolean
  var children: ReactNode
}

object AddonPanelProps {
  @scala.inline
  def apply(active: Boolean, children: ReactNode = null): AddonPanelProps = {
    val __obj = js.Dynamic.literal(active = active)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddonPanelProps]
  }
}

