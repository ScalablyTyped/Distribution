package typings
package stripeDashV3Lib.stripeNs.elementsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementChangeResponse extends js.Object {
  var bankName: js.UndefOr[java.lang.String] = js.undefined
  var brand: java.lang.String
  var complete: scala.Boolean
  var country: js.UndefOr[java.lang.String] = js.undefined
  var elementType: java.lang.String
  var empty: scala.Boolean
  var error: js.UndefOr[stripeDashV3Lib.stripeNs.Error] = js.undefined
  var value: js.UndefOr[stripeDashV3Lib.Anon_PostalCode] = js.undefined
}

object ElementChangeResponse {
  @scala.inline
  def apply(
    brand: java.lang.String,
    complete: scala.Boolean,
    elementType: java.lang.String,
    empty: scala.Boolean,
    bankName: java.lang.String = null,
    country: java.lang.String = null,
    error: stripeDashV3Lib.stripeNs.Error = null,
    value: stripeDashV3Lib.Anon_PostalCode = null
  ): ElementChangeResponse = {
    val __obj = js.Dynamic.literal(brand = brand, complete = complete, elementType = elementType, empty = empty)
    if (bankName != null) __obj.updateDynamic("bankName")(bankName)
    if (country != null) __obj.updateDynamic("country")(country)
    if (error != null) __obj.updateDynamic("error")(error)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ElementChangeResponse]
  }
}

