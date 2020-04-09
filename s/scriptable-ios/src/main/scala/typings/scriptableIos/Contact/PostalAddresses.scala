package typings.scriptableIos.Contact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostalAddresses extends js.Object {
  var city: String
  var country: String
  var identifier: js.UndefOr[String] = js.undefined
  var label: String
  var localizedLabel: String
  var postalCode: String
  var state: String
  var street: String
}

object PostalAddresses {
  @scala.inline
  def apply(
    city: String,
    country: String,
    label: String,
    localizedLabel: String,
    postalCode: String,
    state: String,
    street: String,
    identifier: String = null
  ): PostalAddresses = {
    val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], localizedLabel = localizedLabel.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], street = street.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostalAddresses]
  }
}

