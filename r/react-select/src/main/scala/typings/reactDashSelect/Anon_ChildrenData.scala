package typings.reactDashSelect

import typings.react.reactMod.ReactNode
import typings.reactDashSelect.reactDashSelectStrings.option
import typings.reactDashSelect.srcComponentsOptionMod.InnerProps
import typings.reactDashSelect.srcTypesMod.InnerRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenData extends js.Object {
  /** The children to be rendered. */
  var children: ReactNode
  /* The data of the selected option. */
  var data: js.Any
  /** props passed to the wrapping element for the group. */
  var innerProps: InnerProps
  /** Inner ref to DOM Node */
  var innerRef: InnerRef
  /* Text to be displayed representing the option. */
  var label: String
  /* Type is used by the menu to determine whether this is an option or a group.
    In the case of option this is always `option`. */
  var `type`: option
}

object Anon_ChildrenData {
  @scala.inline
  def apply(
    data: js.Any,
    innerProps: InnerProps,
    label: String,
    `type`: option,
    children: ReactNode = null,
    innerRef: InnerRef = null
  ): Anon_ChildrenData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], innerProps = innerProps.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ChildrenData]
  }
}

