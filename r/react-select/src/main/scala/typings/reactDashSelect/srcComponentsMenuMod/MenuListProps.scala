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
  def apply(children: ReactNode = null, innerRef: InnerRef = null): MenuListProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuListProps]
  }
}

