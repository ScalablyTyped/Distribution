package typings.reactAsync.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Persist extends js.Object {
  var children: js.Any
  var persist: js.Any
  var state: js.Any
}

object Persist {
  @scala.inline
  def apply(children: js.Any, persist: js.Any, state: js.Any): Persist = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], persist = persist.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Persist]
  }
}

