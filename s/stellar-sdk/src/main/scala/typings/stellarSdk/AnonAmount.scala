package typings.stellarSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAmount extends js.Object {
  var amount: String
  var price: String
  var price_r: AnonD
}

object AnonAmount {
  @scala.inline
  def apply(amount: String, price: String, price_r: AnonD): AnonAmount = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], price_r = price_r.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAmount]
  }
}

