package typings.stripeDashV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bankname extends js.Object {
  var bank_name: String
  var country: String
  var last4: Double
  var `object`: String
  var validated: Boolean
}

object Anon_Bankname {
  @scala.inline
  def apply(bank_name: String, country: String, last4: Double, `object`: String, validated: Boolean): Anon_Bankname = {
    val __obj = js.Dynamic.literal(bank_name = bank_name, country = country, last4 = last4, validated = validated)
    __obj.updateDynamic("object")(`object`)
    __obj.asInstanceOf[Anon_Bankname]
  }
}

