package typings.stripeDashV3.stripe.elements

import typings.stripeDashV3.Anon_PostalCode
import typings.stripeDashV3.stripe.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementChangeResponse extends js.Object {
  var bankName: js.UndefOr[String] = js.undefined
  var brand: String
  var complete: Boolean
  var country: js.UndefOr[String] = js.undefined
  var elementType: String
  var empty: Boolean
  var error: js.UndefOr[Error] = js.undefined
  var value: js.UndefOr[Anon_PostalCode | String] = js.undefined
}

object ElementChangeResponse {
  @scala.inline
  def apply(
    brand: String,
    complete: Boolean,
    elementType: String,
    empty: Boolean,
    bankName: String = null,
    country: String = null,
    error: Error = null,
    value: Anon_PostalCode | String = null
  ): ElementChangeResponse = {
    val __obj = js.Dynamic.literal(brand = brand, complete = complete, elementType = elementType, empty = empty)
    if (bankName != null) __obj.updateDynamic("bankName")(bankName)
    if (country != null) __obj.updateDynamic("country")(country)
    if (error != null) __obj.updateDynamic("error")(error)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementChangeResponse]
  }
}

