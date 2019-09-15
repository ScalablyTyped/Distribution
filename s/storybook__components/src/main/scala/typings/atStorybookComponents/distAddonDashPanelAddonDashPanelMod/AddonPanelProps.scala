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
  def apply(active: Boolean, children: ReactNode): AddonPanelProps = {
    val __obj = js.Dynamic.literal(active = active, children = children.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AddonPanelProps]
  }
}

