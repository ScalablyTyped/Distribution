package typings.screeps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AmountNumber extends js.Object {
  var amount: Double
}

object AmountNumber {
  @scala.inline
  def apply(amount: Double): AmountNumber = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmountNumber]
  }
}

