package typings.reactDashSelect

import typings.react.reactMod.ReactNode
import typings.reactDashSelect.srcTypesMod.OptionTypeBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenComponents[OptionType /* <: OptionTypeBase */] extends js.Object {
  var children: ReactNode
  var components: js.Any
  var cropWithEllipsis: Boolean
  var data: OptionType
  var innerProps: js.Any
  var isDisabled: Boolean
  var isFocused: Boolean
  var removeProps: Anon_EventOnClick
}

object Anon_ChildrenComponents {
  @scala.inline
  def apply[OptionType /* <: OptionTypeBase */](
    children: ReactNode,
    components: js.Any,
    cropWithEllipsis: Boolean,
    data: OptionType,
    innerProps: js.Any,
    isDisabled: Boolean,
    isFocused: Boolean,
    removeProps: Anon_EventOnClick
  ): Anon_ChildrenComponents[OptionType] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], components = components, cropWithEllipsis = cropWithEllipsis, data = data.asInstanceOf[js.Any], innerProps = innerProps, isDisabled = isDisabled, isFocused = isFocused, removeProps = removeProps)
  
    __obj.asInstanceOf[Anon_ChildrenComponents[OptionType]]
  }
}

