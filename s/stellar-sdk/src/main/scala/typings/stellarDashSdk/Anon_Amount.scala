package typings.stellarDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Amount extends js.Object {
  var amount: String
  var price: String
  var price_r: Anon_D
}

object Anon_Amount {
  @scala.inline
  def apply(amount: String, price: String, price_r: Anon_D): Anon_Amount = {
    val __obj = js.Dynamic.literal(amount = amount, price = price, price_r = price_r)
  
    __obj.asInstanceOf[Anon_Amount]
  }
}

