package typings
package reactDashSelectLib.libComponentsMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuListProps extends js.Object {
  /** The children to be rendered. */
  var children: reactLib.reactMod.ReactNs.ReactNode
  /** Inner ref to DOM Node */
  var innerRef: reactDashSelectLib.libTypesMod.InnerRef
}

object MenuListProps {
  @scala.inline
  def apply(children: reactLib.reactMod.ReactNs.ReactNode, innerRef: reactDashSelectLib.libTypesMod.InnerRef): MenuListProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuListProps]
  }
}

