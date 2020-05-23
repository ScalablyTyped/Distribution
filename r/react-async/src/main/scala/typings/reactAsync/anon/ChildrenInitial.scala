package typings.reactAsync.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChildrenInitial extends js.Object {
  var children: js.Any
  var initial: js.Any
  var state: js.Any
}

object ChildrenInitial {
  @scala.inline
  def apply(children: js.Any, initial: js.Any, state: js.Any): ChildrenInitial = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildrenInitial]
  }
}

