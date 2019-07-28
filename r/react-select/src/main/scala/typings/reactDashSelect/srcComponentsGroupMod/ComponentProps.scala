package typings.reactDashSelect.srcComponentsGroupMod

import typings.react.reactMod.ComponentType
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentProps extends js.Object {
  /** Component to wrap the label, recieves headingProps. */
  var Heading: ComponentType[_]
  /** The children to be rendered. */
  var children: ReactNode
  /** Label to be displayed in the heading component. */
  var label: ReactNode
}

object ComponentProps {
  @scala.inline
  def apply(Heading: ComponentType[_], children: ReactNode, label: ReactNode): ComponentProps = {
    val __obj = js.Dynamic.literal(Heading = Heading.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ComponentProps]
  }
}

