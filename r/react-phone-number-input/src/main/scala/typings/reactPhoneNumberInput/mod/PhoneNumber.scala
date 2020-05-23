package typings.reactPhoneNumberInput.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhoneNumber extends js.Object {
  var carrierCode: js.UndefOr[String] = js.undefined
  var country: js.UndefOr[String] = js.undefined
  var countryCallingCode: String
  var ext: js.UndefOr[String] = js.undefined
  var nationalNumber: String
  var number: String
}

object PhoneNumber {
  @scala.inline
  def apply(
    countryCallingCode: String,
    nationalNumber: String,
    number: String,
    carrierCode: String = null,
    country: String = null,
    ext: String = null
  ): PhoneNumber = {
    val __obj = js.Dynamic.literal(countryCallingCode = countryCallingCode.asInstanceOf[js.Any], nationalNumber = nationalNumber.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    if (carrierCode != null) __obj.updateDynamic("carrierCode")(carrierCode.asInstanceOf[js.Any])
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (ext != null) __obj.updateDynamic("ext")(ext.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneNumber]
  }
}

