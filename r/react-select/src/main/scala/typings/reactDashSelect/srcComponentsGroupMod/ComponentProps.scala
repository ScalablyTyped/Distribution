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
  def apply(Heading: ComponentType[_], children: ReactNode = null, label: ReactNode = null): ComponentProps = {
    val __obj = js.Dynamic.literal(Heading = Heading.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentProps]
  }
}

