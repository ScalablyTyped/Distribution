package typings.reactPhoneNumberInput.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhoneNumber extends js.Object {
  var carrierCode: js.UndefOr[String] = js.native
  var country: js.UndefOr[String] = js.native
  var countryCallingCode: String = js.native
  var ext: js.UndefOr[String] = js.native
  var nationalNumber: String = js.native
  var number: String = js.native
}

object PhoneNumber {
  @scala.inline
  def apply(countryCallingCode: String, nationalNumber: String, number: String): PhoneNumber = {
    val __obj = js.Dynamic.literal(countryCallingCode = countryCallingCode.asInstanceOf[js.Any], nationalNumber = nationalNumber.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneNumber]
  }
  @scala.inline
  implicit class PhoneNumberOps[Self <: PhoneNumber] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCountryCallingCode(value: String): Self = this.set("countryCallingCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setNationalNumber(value: String): Self = this.set("nationalNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumber(value: String): Self = this.set("number", value.asInstanceOf[js.Any])
    @scala.inline
    def setCarrierCode(value: String): Self = this.set("carrierCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCarrierCode: Self = this.set("carrierCode", js.undefined)
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    @scala.inline
    def setExt(value: String): Self = this.set("ext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExt: Self = this.set("ext", js.undefined)
  }
  
}

