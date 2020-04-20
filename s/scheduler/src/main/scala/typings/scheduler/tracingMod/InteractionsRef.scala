package typings.scheduler.tracingMod

import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InteractionsRef extends js.Object {
  var current: Set[Interaction]
}

object InteractionsRef {
  @scala.inline
  def apply(current: Set[Interaction]): InteractionsRef = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractionsRef]
  }
}

