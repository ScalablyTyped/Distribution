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
  def apply(hasValue: Boolean, isMulti: Boolean, children: ReactNode = null): Anon_ChildrenHasValue = {
    val __obj = js.Dynamic.literal(hasValue = hasValue.asInstanceOf[js.Any], isMulti = isMulti.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ChildrenHasValue]
  }
}

