package typings.reactDashSelect

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenInnerPropsAnonOnKeyDown extends js.Object {
  /** The children to be rendered. */
  var children: ReactNode
  /** Inner props to be passed down to the container. */
  var innerProps: Anon_OnKeyDown
}

object Anon_ChildrenInnerPropsAnonOnKeyDown {
  @scala.inline
  def apply(innerProps: Anon_OnKeyDown, children: ReactNode = null): Anon_ChildrenInnerPropsAnonOnKeyDown = {
    val __obj = js.Dynamic.literal(innerProps = innerProps)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ChildrenInnerPropsAnonOnKeyDown]
  }
}

