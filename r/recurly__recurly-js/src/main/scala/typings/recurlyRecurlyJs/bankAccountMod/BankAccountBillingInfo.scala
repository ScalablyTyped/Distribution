package typings.recurlyRecurlyJs.bankAccountMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @recurly/recurly-js.@recurly/recurly-js/lib/bank-account.AccountInfo & {  routing_number :string} */
@js.native
trait BankAccountBillingInfo extends BillingInfo {
  
  var account_number: String = js.native
  
  var account_number_confirmation: String = js.native
  
  var address1: js.UndefOr[String] = js.native
  
  var address2: js.UndefOr[String] = js.native
  
  var city: js.UndefOr[String] = js.native
  
  var country: js.UndefOr[String] = js.native
  
  var name_on_account: String = js.native
  
  var postal_code: js.UndefOr[String] = js.native
  
  var routing_number: String = js.native
  
  var state: js.UndefOr[String] = js.native
  
  var vat_number: js.UndefOr[String] = js.native
}
object BankAccountBillingInfo {
  
  @scala.inline
  def apply(
    account_number: String,
    account_number_confirmation: String,
    name_on_account: String,
    routing_number: String
  ): BankAccountBillingInfo = {
    val __obj = js.Dynamic.literal(account_number = account_number.asInstanceOf[js.Any], account_number_confirmation = account_number_confirmation.asInstanceOf[js.Any], name_on_account = name_on_account.asInstanceOf[js.Any], routing_number = routing_number.asInstanceOf[js.Any])
    __obj.asInstanceOf[BankAccountBillingInfo]
  }
  
  @scala.inline
  implicit class BankAccountBillingInfoOps[Self <: BankAccountBillingInfo] (val x: Self) extends AnyVal {
    
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
    def setAccount_number(value: String): Self = this.set("account_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccount_number_confirmation(value: String): Self = this.set("account_number_confirmation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName_on_account(value: String): Self = this.set("name_on_account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouting_number(value: String): Self = this.set("routing_number", value.asInstanceOf[js.Any])
    
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
    def setPostal_code(value: String): Self = this.set("postal_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostal_code: Self = this.set("postal_code", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setVat_number(value: String): Self = this.set("vat_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVat_number: Self = this.set("vat_number", js.undefined)
  }
}
