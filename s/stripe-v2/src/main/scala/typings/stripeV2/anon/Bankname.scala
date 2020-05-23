package typings.stripeV2.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bankname extends js.Object {
  var bank_name: String
  var country: String
  var last4: Double
  var `object`: String
  var validated: Boolean
}

object Bankname {
  @scala.inline
  def apply(bank_name: String, country: String, last4: Double, `object`: String, validated: Boolean): Bankname = {
    val __obj = js.Dynamic.literal(bank_name = bank_name.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], last4 = last4.asInstanceOf[js.Any], validated = validated.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bankname]
  }
}

