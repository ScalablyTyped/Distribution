package typings.stellarSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Amount extends js.Object {
  var amount: String
  var price: String
  var price_r: D
}

object Amount {
  @scala.inline
  def apply(amount: String, price: String, price_r: D): Amount = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], price_r = price_r.asInstanceOf[js.Any])
    __obj.asInstanceOf[Amount]
  }
}

