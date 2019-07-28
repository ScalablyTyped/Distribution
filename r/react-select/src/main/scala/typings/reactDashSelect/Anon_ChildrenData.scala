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
    children: ReactNode,
    data: js.Any,
    innerProps: InnerProps,
    innerRef: InnerRef,
    label: String,
    `type`: option
  ): Anon_ChildrenData = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], data = data, innerProps = innerProps, innerRef = innerRef.asInstanceOf[js.Any], label = label)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_ChildrenData]
  }
}

