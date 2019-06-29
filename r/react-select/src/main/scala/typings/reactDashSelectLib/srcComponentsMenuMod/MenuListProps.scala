package typings
package reactDashSelectLib.srcComponentsMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuListProps extends js.Object {
  /** The children to be rendered. */
  var children: reactLib.reactMod.ReactNode
  /** Inner ref to DOM Node */
  var innerRef: reactDashSelectLib.srcTypesMod.InnerRef
}

object MenuListProps {
  @scala.inline
  def apply(children: reactLib.reactMod.ReactNode, innerRef: reactDashSelectLib.srcTypesMod.InnerRef): MenuListProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], innerRef = innerRef.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MenuListProps]
  }
}

