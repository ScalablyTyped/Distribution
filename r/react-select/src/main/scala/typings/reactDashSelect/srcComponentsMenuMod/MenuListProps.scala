package typings.reactDashSelect.srcComponentsMenuMod

import typings.react.reactMod.ReactNode
import typings.reactDashSelect.srcTypesMod.InnerRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuListProps extends js.Object {
  /** The children to be rendered. */
  var children: ReactNode
  /** Inner ref to DOM Node */
  var innerRef: InnerRef
}

object MenuListProps {
  @scala.inline
  def apply(children: ReactNode, innerRef: InnerRef): MenuListProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], innerRef = innerRef.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MenuListProps]
  }
}

