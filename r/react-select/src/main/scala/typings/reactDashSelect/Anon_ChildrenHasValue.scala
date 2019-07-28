package typings.reactDashSelect

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenHasValue extends js.Object {
  /** The children to be rendered. */
  var children: ReactNode
  /** Whether the value container currently holds a value. */
  var hasValue: Boolean
  /** Set when the value container should hold multiple values */
  var isMulti: Boolean
}

object Anon_ChildrenHasValue {
  @scala.inline
  def apply(children: ReactNode, hasValue: Boolean, isMulti: Boolean): Anon_ChildrenHasValue = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], hasValue = hasValue, isMulti = isMulti)
  
    __obj.asInstanceOf[Anon_ChildrenHasValue]
  }
}

