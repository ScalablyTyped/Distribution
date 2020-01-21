package typings.stripeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIban extends js.Object {
  /*
    * An IBAN account number.
    */
  var iban: String
}

object AnonIban {
  @scala.inline
  def apply(iban: String): AnonIban = {
    val __obj = js.Dynamic.literal(iban = iban.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIban]
  }
}

