package typings
package reactDashSelectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenComponents[OptionType] extends js.Object {
  var children: reactLib.reactMod.ReactNs.ReactNode
  var components: js.Any
  var cropWithEllipsis: scala.Boolean
  var data: OptionType
  var innerProps: js.Any
  var isDisabled: scala.Boolean
  var isFocused: scala.Boolean
  var removeProps: Anon_EventOnClick
}

object Anon_ChildrenComponents {
  @scala.inline
  def apply[OptionType](
    children: reactLib.reactMod.ReactNs.ReactNode,
    components: js.Any,
    cropWithEllipsis: scala.Boolean,
    data: OptionType,
    innerProps: js.Any,
    isDisabled: scala.Boolean,
    isFocused: scala.Boolean,
    removeProps: Anon_EventOnClick
  ): Anon_ChildrenComponents[OptionType] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], components = components, cropWithEllipsis = cropWithEllipsis, data = data.asInstanceOf[js.Any], innerProps = innerProps, isDisabled = isDisabled, isFocused = isFocused, removeProps = removeProps)
  
    __obj.asInstanceOf[Anon_ChildrenComponents[OptionType]]
  }
}

