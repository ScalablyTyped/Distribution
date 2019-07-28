package typings.stellarDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Amount extends js.Object {
  var amount: String
  var price: Double
}

object Anon_Amount {
  @scala.inline
  def apply(amount: String, price: Double): Anon_Amount = {
    val __obj = js.Dynamic.literal(amount = amount, price = price)
  
    __obj.asInstanceOf[Anon_Amount]
  }
}

