package typings
package stripeDashV2Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bankname extends js.Object {
  var bank_name: java.lang.String
  var country: java.lang.String
  var last4: scala.Double
  var `object`: java.lang.String
  var validated: scala.Boolean
}

object Anon_Bankname {
  @scala.inline
  def apply(
    bank_name: java.lang.String,
    country: java.lang.String,
    last4: scala.Double,
    `object`: java.lang.String,
    validated: scala.Boolean
  ): Anon_Bankname = {
    val __obj = js.Dynamic.literal(bank_name = bank_name, country = country, last4 = last4, validated = validated)
    __obj.updateDynamic("object")(`object`)
    __obj.asInstanceOf[Anon_Bankname]
  }
}

