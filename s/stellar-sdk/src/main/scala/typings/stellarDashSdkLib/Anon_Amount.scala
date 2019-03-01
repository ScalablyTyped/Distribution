package typings
package stellarDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Amount extends js.Object {
  var amount: java.lang.String
  var price: scala.Double
}

object Anon_Amount {
  @scala.inline
  def apply(amount: java.lang.String, price: scala.Double): Anon_Amount = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("amount")(amount)
    __obj.updateDynamic("price")(price)
    __obj.asInstanceOf[Anon_Amount]
  }
}

