package typings.psi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Timing extends js.Object {
  var total: Double
}

object Timing {
  @scala.inline
  def apply(total: Double): Timing = {
    val __obj = js.Dynamic.literal(total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Timing]
  }
}

