package typings
package schedulerLib.tracingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InteractionsRef extends js.Object {
  var current: stdLib.Set[Interaction]
}

object InteractionsRef {
  @scala.inline
  def apply(current: stdLib.Set[Interaction]): InteractionsRef = {
    val __obj = js.Dynamic.literal(current = current)
  
    __obj.asInstanceOf[InteractionsRef]
  }
}

