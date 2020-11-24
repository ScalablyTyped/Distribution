package typings.recurlyRecurlyJs.bankAccountMod

import typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.bacs
import typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.becs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.recurlyRecurlyJs.bankAccountMod.SepaBillingInfo
  - typings.recurlyRecurlyJs.bankAccountMod.BacsBillingInfo
  - typings.recurlyRecurlyJs.bankAccountMod.BecsBillingInfo
  - typings.recurlyRecurlyJs.bankAccountMod.BankAccountBillingInfo
*/
trait BillingInfo extends js.Object
object BillingInfo {
  
  @scala.inline
  def SepaBillingInfo(iban: String, name_on_account: String): BillingInfo = {
    val __obj = js.Dynamic.literal(iban = iban.asInstanceOf[js.Any], name_on_account = name_on_account.asInstanceOf[js.Any])
    __obj.asInstanceOf[BillingInfo]
  }
  
  @scala.inline
  def BacsBillingInfo(
    account_number: String,
    account_number_confirmation: String,
    name_on_account: String,
    sort_code: String,
    `type`: bacs
  ): BillingInfo = {
    val __obj = js.Dynamic.literal(account_number = account_number.asInstanceOf[js.Any], account_number_confirmation = account_number_confirmation.asInstanceOf[js.Any], name_on_account = name_on_account.asInstanceOf[js.Any], sort_code = sort_code.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BillingInfo]
  }
  
  @scala.inline
  def BecsBillingInfo(
    account_number: String,
    account_number_confirmation: String,
    branch_code: String,
    name_on_account: String,
    `type`: becs
  ): BillingInfo = {
    val __obj = js.Dynamic.literal(account_number = account_number.asInstanceOf[js.Any], account_number_confirmation = account_number_confirmation.asInstanceOf[js.Any], branch_code = branch_code.asInstanceOf[js.Any], name_on_account = name_on_account.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BillingInfo]
  }
  
  @scala.inline
  def BankAccountBillingInfo(
    account_number: String,
    account_number_confirmation: String,
    name_on_account: String,
    routing_number: String
  ): BillingInfo = {
    val __obj = js.Dynamic.literal(account_number = account_number.asInstanceOf[js.Any], account_number_confirmation = account_number_confirmation.asInstanceOf[js.Any], name_on_account = name_on_account.asInstanceOf[js.Any], routing_number = routing_number.asInstanceOf[js.Any])
    __obj.asInstanceOf[BillingInfo]
  }
}
