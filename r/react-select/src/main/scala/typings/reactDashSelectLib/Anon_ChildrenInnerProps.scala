package typings
package reactDashSelectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenInnerProps extends js.Object {
  /** Children to render. */
  var children: reactLib.reactMod.ReactNode
  /** The mouse down event and the innerRef to pass down to the controller element. */
  var innerProps: Anon_Event
  var innerRef: reactLib.reactMod.Ref[_]
}

object Anon_ChildrenInnerProps {
  @scala.inline
  def apply(children: reactLib.reactMod.ReactNode, innerProps: Anon_Event, innerRef: reactLib.reactMod.Ref[_]): Anon_ChildrenInnerProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], innerProps = innerProps, innerRef = innerRef.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ChildrenInnerProps]
  }
}

