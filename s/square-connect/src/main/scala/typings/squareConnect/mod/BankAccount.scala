package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "BankAccount")
@js.native
class BankAccount () extends js.Object {
  
  /**
    * The last few digits of the account number.
    */
  var account_number_suffix: String = js.native
  
  /**
    * The financial purpose of the associated bank account. See [BankAccountType](#type-bankaccounttype) for possible values
    */
  var account_type: String = js.native
  
  /**
    * Read only. Name of actual financial institution. For example \"Bank of America\".
    */
  var bank_name: js.UndefOr[String] = js.native
  
  /**
    * The ISO 3166 Alpha-2 country code where the bank account is based. See [Country](#type-country) for possible values
    */
  var country: String = js.native
  
  /**
    * Indicates whether it is possible for Square to send money to this bank account.
    */
  var creditable: Boolean = js.native
  
  /**
    * The 3-character ISO 4217 currency code indicating the operating currency of the bank account.
    * For example, the currency code for US dollars is `USD`. See [Currency](#type-currency) for possible values
    */
  var currency: String = js.native
  
  /**
    * Reference identifier that will be displayed to UK bank account owners when collecting direct debit authorization. Only required for UK bank accounts.
    */
  var debit_mandate_reference_id: js.UndefOr[String] = js.native
  
  /**
    * Indicates whether it is possible for Square to take money from this  bank account.
    */
  var debitable: Boolean = js.native
  
  /**
    * A Square-assigned, unique identifier for the bank account based on the account information.
    * The account fingerprint can be used to compare account entries and determine if the they represent the same real-world bank account.
    */
  var fingerprint: js.UndefOr[String] = js.native
  
  /**
    * Name of the account holder. This name must match the name  on the targeted bank account record.
    */
  var holder_name: String = js.native
  
  /**
    * The unique, Square-issued identifier for the bank account.
    */
  var id: String = js.native
  
  /**
    * The location to which the bank account belongs.
    */
  var location_id: js.UndefOr[String] = js.native
  
  /**
    * Primary identifier for the bank. For more information, see  [Bank Accounts API](https://developer.squareup.com/docs/docs/bank-accounts-api).
    */
  var primary_bank_identification_number: String = js.native
  
  /**
    * Client-provided identifier for linking the banking account to an entity in a third-party system (for example, a bank account number or a user identifier).
    */
  var reference_id: js.UndefOr[String] = js.native
  
  /**
    * Secondary identifier for the bank. For more information, see  [Bank Accounts API](https://developer.squareup.com/docs/docs/bank-accounts-api).
    */
  var secondary_bank_identification_number: js.UndefOr[String] = js.native
  
  /**
    * Read-only. The current verification status of this BankAccount object. See [BankAccountStatus](#type-bankaccountstatus) for possible values
    */
  var status: String = js.native
  
  /**
    * The current version of the `BankAccount`.
    */
  var version: js.UndefOr[Double] = js.native
}
