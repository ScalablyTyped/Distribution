package typings.reactDashSelect

import typings.react.reactMod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenInnerPropsIsFocused extends js.Object {
  /** The children to be rendered inside the indicator. */
  var children: ReactElement
  /** Props that will be passed on to the children. */
  var innerProps: js.Any
  /** The focused state of the select. */
  var isFocused: Boolean
  /** Whether the text is right to left */
  var isRtl: Boolean
}

object Anon_ChildrenInnerPropsIsFocused {
  @scala.inline
  def apply(children: ReactElement, innerProps: js.Any, isFocused: Boolean, isRtl: Boolean): Anon_ChildrenInnerPropsIsFocused = {
    val __obj = js.Dynamic.literal(children = children, innerProps = innerProps, isFocused = isFocused, isRtl = isRtl)
  
    __obj.asInstanceOf[Anon_ChildrenInnerPropsIsFocused]
  }
}

