package typings
package reactDashSelectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenInnerPropsIsFocused extends js.Object {
  /** The children to be rendered inside the indicator. */
  var children: reactLib.reactMod.ReactNs.ReactElement[_]
  /** Props that will be passed on to the children. */
  var innerProps: js.Any
  /** The focused state of the select. */
  var isFocused: scala.Boolean
  /** Whether the text is right to left */
  var isRtl: scala.Boolean
}

object Anon_ChildrenInnerPropsIsFocused {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNs.ReactElement[_],
    innerProps: js.Any,
    isFocused: scala.Boolean,
    isRtl: scala.Boolean
  ): Anon_ChildrenInnerPropsIsFocused = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("children")(children)
    __obj.updateDynamic("innerProps")(innerProps)
    __obj.updateDynamic("isFocused")(isFocused)
    __obj.updateDynamic("isRtl")(isRtl)
    __obj.asInstanceOf[Anon_ChildrenInnerPropsIsFocused]
  }
}

