package typings.stripeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBank extends js.Object {
  var bank: String
}

object AnonBank {
  @scala.inline
  def apply(bank: String): AnonBank = {
    val __obj = js.Dynamic.literal(bank = bank.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBank]
  }
}

