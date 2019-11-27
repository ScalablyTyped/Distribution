package typings.reactDashSelect

import typings.react.reactMod.ReactNode
import typings.react.reactMod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenInnerProps extends js.Object {
  /** Children to render. */
  var children: ReactNode
  /** The mouse down event and the innerRef to pass down to the controller element. */
  var innerProps: Anon_Event
  var innerRef: Ref[_]
}

object Anon_ChildrenInnerProps {
  @scala.inline
  def apply(innerProps: Anon_Event, children: ReactNode = null, innerRef: Ref[_] = null): Anon_ChildrenInnerProps = {
    val __obj = js.Dynamic.literal(innerProps = innerProps.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ChildrenInnerProps]
  }
}

