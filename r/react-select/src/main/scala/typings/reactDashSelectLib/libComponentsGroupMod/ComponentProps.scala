package typings
package reactDashSelectLib.libComponentsGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentProps extends js.Object {
  /** Component to wrap the label, recieves headingProps. */
  var Heading: reactLib.reactMod.ReactNs.ComponentType[_]
  /** The children to be rendered. */
  var children: reactLib.reactMod.ReactNs.ReactNode
  /** Label to be displayed in the heading component. */
  var label: reactLib.reactMod.ReactNs.ReactNode
}

object ComponentProps {
  @scala.inline
  def apply(
    Heading: reactLib.reactMod.ReactNs.ComponentType[_],
    children: reactLib.reactMod.ReactNs.ReactNode,
    label: reactLib.reactMod.ReactNs.ReactNode
  ): ComponentProps = {
    val __obj = js.Dynamic.literal(Heading = Heading.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ComponentProps]
  }
}

