package typings.reactSelect.groupMod

import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentProps extends js.Object {
  /** Component to wrap the label, recieves headingProps. */
  var Heading: ComponentType[_]
  /** The children to be rendered. */
  var children: ReactNode
  /** Props to pass to Heading. */
  var headingProps: js.Any
  /** Label to be displayed in the heading component. */
  var label: ReactNode
}

object ComponentProps {
  @scala.inline
  def apply(
    Heading: ComponentType[_],
    headingProps: js.Any,
    children: ReactNode = null,
    label: ReactNode = null
  ): ComponentProps = {
    val __obj = js.Dynamic.literal(Heading = Heading.asInstanceOf[js.Any], headingProps = headingProps.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentProps]
  }
}

