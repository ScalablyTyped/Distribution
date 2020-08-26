package typings.recurlyRecurlyJs.bankAccountMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BillingInfo extends js.Object {
  var account_number: js.UndefOr[String] = js.native
  var account_number_confirmation: js.UndefOr[String] = js.native
  var account_type: js.UndefOr[String] = js.native
  var address1: js.UndefOr[String] = js.native
  var address2: js.UndefOr[String] = js.native
  var city: js.UndefOr[String] = js.native
  var country: js.UndefOr[String] = js.native
  var iban: js.UndefOr[String] = js.native
  var name_on_account: String = js.native
  var postal_code: js.UndefOr[String] = js.native
  var routing_number: js.UndefOr[String] = js.native
  var sort_code: js.UndefOr[String] = js.native
  var state: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
  var vat_number: js.UndefOr[String] = js.native
}

object BillingInfo {
  @scala.inline
  def apply(name_on_account: String): BillingInfo = {
    val __obj = js.Dynamic.literal(name_on_account = name_on_account.asInstanceOf[js.Any])
    __obj.asInstanceOf[BillingInfo]
  }
  @scala.inline
  implicit class BillingInfoOps[Self <: BillingInfo] (val x: Self) extends AnyVal {
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
    def setName_on_account(value: String): Self = this.set("name_on_account", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccount_number(value: String): Self = this.set("account_number", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccount_number: Self = this.set("account_number", js.undefined)
    @scala.inline
    def setAccount_number_confirmation(value: String): Self = this.set("account_number_confirmation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccount_number_confirmation: Self = this.set("account_number_confirmation", js.undefined)
    @scala.inline
    def setAccount_type(value: String): Self = this.set("account_type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccount_type: Self = this.set("account_type", js.undefined)
    @scala.inline
    def setAddress1(value: String): Self = this.set("address1", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddress1: Self = this.set("address1", js.undefined)
    @scala.inline
    def setAddress2(value: String): Self = this.set("address2", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddress2: Self = this.set("address2", js.undefined)
    @scala.inline
    def setCity(value: String): Self = this.set("city", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCity: Self = this.set("city", js.undefined)
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    @scala.inline
    def setIban(value: String): Self = this.set("iban", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIban: Self = this.set("iban", js.undefined)
    @scala.inline
    def setPostal_code(value: String): Self = this.set("postal_code", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePostal_code: Self = this.set("postal_code", js.undefined)
    @scala.inline
    def setRouting_number(value: String): Self = this.set("routing_number", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRouting_number: Self = this.set("routing_number", js.undefined)
    @scala.inline
    def setSort_code(value: String): Self = this.set("sort_code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSort_code: Self = this.set("sort_code", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setVat_number(value: String): Self = this.set("vat_number", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVat_number: Self = this.set("vat_number", js.undefined)
  }
  
}

