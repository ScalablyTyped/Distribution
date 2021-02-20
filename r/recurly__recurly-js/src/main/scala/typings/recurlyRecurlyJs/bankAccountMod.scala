package typings.recurlyRecurlyJs

import typings.recurlyRecurlyJs.errorMod.RecurlyError
import typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.bacs
import typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.becs
import typings.recurlyRecurlyJs.tokenMod.TokenHandler
import typings.std.HTMLFormElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bankAccountMod {
  
  /* Inlined @recurly/recurly-js.@recurly/recurly-js/lib/bank-account.BillingInfoCommonFields & {  account_number :string,   account_number_confirmation :string} */
  @js.native
  trait AccountInfo extends StObject {
    
    var account_number: String = js.native
    
    var account_number_confirmation: String = js.native
    
    var address1: js.UndefOr[String] = js.native
    
    var address2: js.UndefOr[String] = js.native
    
    var city: js.UndefOr[String] = js.native
    
    var country: js.UndefOr[String] = js.native
    
    var name_on_account: String = js.native
    
    var postal_code: js.UndefOr[String] = js.native
    
    var state: js.UndefOr[String] = js.native
    
    var vat_number: js.UndefOr[String] = js.native
  }
  object AccountInfo {
    
    @scala.inline
    def apply(account_number: String, account_number_confirmation: String, name_on_account: String): AccountInfo = {
      val __obj = js.Dynamic.literal(account_number = account_number.asInstanceOf[js.Any], account_number_confirmation = account_number_confirmation.asInstanceOf[js.Any], name_on_account = name_on_account.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccountInfo]
    }
    
    @scala.inline
    implicit class AccountInfoMutableBuilder[Self <: AccountInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccount_number(value: String): Self = StObject.set(x, "account_number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccount_number_confirmation(value: String): Self = StObject.set(x, "account_number_confirmation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddress1(value: String): Self = StObject.set(x, "address1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddress1Undefined: Self = StObject.set(x, "address1", js.undefined)
      
      @scala.inline
      def setAddress2(value: String): Self = StObject.set(x, "address2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddress2Undefined: Self = StObject.set(x, "address2", js.undefined)
      
      @scala.inline
      def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
      
      @scala.inline
      def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
      
      @scala.inline
      def setName_on_account(value: String): Self = StObject.set(x, "name_on_account", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPostal_code(value: String): Self = StObject.set(x, "postal_code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPostal_codeUndefined: Self = StObject.set(x, "postal_code", js.undefined)
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      @scala.inline
      def setVat_number(value: String): Self = StObject.set(x, "vat_number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVat_numberUndefined: Self = StObject.set(x, "vat_number", js.undefined)
    }
  }
  
  /* Inlined @recurly/recurly-js.@recurly/recurly-js/lib/bank-account.AccountInfo & {  type :'bacs',   sort_code :string} */
  @js.native
  trait BacsBillingInfo extends BillingInfo {
    
    var account_number: String = js.native
    
    var account_number_confirmation: String = js.native
    
    var address1: js.UndefOr[String] = js.native
    
    var address2: js.UndefOr[String] = js.native
    
    var city: js.UndefOr[String] = js.native
    
    var country: js.UndefOr[String] = js.native
    
    var name_on_account: String = js.native
    
    var postal_code: js.UndefOr[String] = js.native
    
    /**
      * Bank identifier code for UK based banks.
      */
    var sort_code: String = js.native
    
    var state: js.UndefOr[String] = js.native
    
    var `type`: bacs = js.native
    
    var vat_number: js.UndefOr[String] = js.native
  }
  object BacsBillingInfo {
    
    @scala.inline
    def apply(
      account_number: String,
      account_number_confirmation: String,
      name_on_account: String,
      sort_code: String,
      `type`: bacs
    ): BacsBillingInfo = {
      val __obj = js.Dynamic.literal(account_number = account_number.asInstanceOf[js.Any], account_number_confirmation = account_number_confirmation.asInstanceOf[js.Any], name_on_account = name_on_account.asInstanceOf[js.Any], sort_code = sort_code.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BacsBillingInfo]
    }
    
    @scala.inline
    implicit class BacsBillingInfoMutableBuilder[Self <: BacsBillingInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccount_number(value: String): Self = StObject.set(x, "account_number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccount_number_confirmation(value: String): Self = StObject.set(x, "account_number_confirmation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddress1(value: String): Self = StObject.set(x, "address1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddress1Undefined: Self = StObject.set(x, "address1", js.undefined)
      
      @scala.inline
      def setAddress2(value: String): Self = StObject.set(x, "address2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddress2Undefined: Self = StObject.set(x, "address2", js.undefined)
      
      @scala.inline
      def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
      
      @scala.inline
      def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
      
      @scala.inline
      def setName_on_account(value: String): Self = StObject.set(x, "name_on_account", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPostal_code(value: String): Self = StObject.set(x, "postal_code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPostal_codeUndefined: Self = StObject.set(x, "postal_code", js.undefined)
      
      @scala.inline
      def setSort_code(value: String): Self = StObject.set(x, "sort_code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      @scala.inline
      def setType(value: bacs): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVat_number(value: String): Self = StObject.set(x, "vat_number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVat_numberUndefined: Self = StObject.set(x, "vat_number", js.undefined)
    }
  }
  
  @js.native
  trait BankAccount extends StObject {
    
    /**
      * @see {@link https://developers.recurly.com/reference/recurly-js/index.html#recurlybankaccountbankinfo|BankInfo}
      */
    def bankInfo(bankInfoOptions: BankInfoOptions, BankInfoHandler: BankInfoHandler): Unit = js.native
    /**
      * @see {@link https://developers.recurly.com/reference/recurly-js/index.html#recurlybankaccountbankinfo|BankInfo}
      */
    @JSName("bankInfo")
    var bankInfo_Original: BankInfo = js.native
    
    def token(data: BillingInfo, tokenHandler: TokenHandler): Unit = js.native
    /**
      * @see {@link https://developers.recurly.com/reference/recurly-js/index.html#getting-a-token-1|Getting a token}
      */
    def token(data: HTMLFormElement, tokenHandler: TokenHandler): Unit = js.native
  }
  
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
    implicit class BankAccountBillingInfoMutableBuilder[Self <: BankAccountBillingInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccount_number(value: String): Self = StObject.set(x, "account_number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccount_number_confirmation(value: String): Self = StObject.set(x, "account_number_confirmation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddress1(value: String): Self = StObject.set(x, "address1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddress1Undefined: Self = StObject.set(x, "address1", js.undefined)
      
      @scala.inline
      def setAddress2(value: String): Self = StObject.set(x, "address2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddress2Undefined: Self = StObject.set(x, "address2", js.undefined)
      
      @scala.inline
      def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
      
      @scala.inline
      def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
      
      @scala.inline
      def setName_on_account(value: String): Self = StObject.set(x, "name_on_account", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPostal_code(value: String): Self = StObject.set(x, "postal_code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPostal_codeUndefined: Self = StObject.set(x, "postal_code", js.undefined)
      
      @scala.inline
      def setRouting_number(value: String): Self = StObject.set(x, "routing_number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      @scala.inline
      def setVat_number(value: String): Self = StObject.set(x, "vat_number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVat_numberUndefined: Self = StObject.set(x, "vat_number", js.undefined)
    }
  }
  
  type BankInfo = js.Function2[/* bankInfoOptions */ BankInfoOptions, /* BankInfoHandler */ BankInfoHandler, Unit]
  
  type BankInfoHandler = js.Function2[/* err */ RecurlyError, /* bankInfo */ BankInfoPayload, Unit]
  
  @js.native
  trait BankInfoOptions extends StObject {
    
    /**
      * The routing number for a bank (ex: ‘123456780’)
      */
    var routingNumber: String = js.native
  }
  object BankInfoOptions {
    
    @scala.inline
    def apply(routingNumber: String): BankInfoOptions = {
      val __obj = js.Dynamic.literal(routingNumber = routingNumber.asInstanceOf[js.Any])
      __obj.asInstanceOf[BankInfoOptions]
    }
    
    @scala.inline
    implicit class BankInfoOptionsMutableBuilder[Self <: BankInfoOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRoutingNumber(value: String): Self = StObject.set(x, "routingNumber", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BankInfoPayload extends StObject {
    
    /**
      * Bank institution name (ex: Bank of Recurly)
      */
    var bank_name: String = js.native
  }
  object BankInfoPayload {
    
    @scala.inline
    def apply(bank_name: String): BankInfoPayload = {
      val __obj = js.Dynamic.literal(bank_name = bank_name.asInstanceOf[js.Any])
      __obj.asInstanceOf[BankInfoPayload]
    }
    
    @scala.inline
    implicit class BankInfoPayloadMutableBuilder[Self <: BankInfoPayload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBank_name(value: String): Self = StObject.set(x, "bank_name", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined @recurly/recurly-js.@recurly/recurly-js/lib/bank-account.AccountInfo & {  type :'becs',   branch_code :string} */
  @js.native
  trait BecsBillingInfo extends BillingInfo {
    
    var account_number: String = js.native
    
    var account_number_confirmation: String = js.native
    
    var address1: js.UndefOr[String] = js.native
    
    var address2: js.UndefOr[String] = js.native
    
    var branch_code: String = js.native
    
    var city: js.UndefOr[String] = js.native
    
    var country: js.UndefOr[String] = js.native
    
    var name_on_account: String = js.native
    
    var postal_code: js.UndefOr[String] = js.native
    
    var state: js.UndefOr[String] = js.native
    
    var `type`: becs = js.native
    
    var vat_number: js.UndefOr[String] = js.native
  }
  object BecsBillingInfo {
    
    @scala.inline
    def apply(
      account_number: String,
      account_number_confirmation: String,
      branch_code: String,
      name_on_account: String,
      `type`: becs
    ): BecsBillingInfo = {
      val __obj = js.Dynamic.literal(account_number = account_number.asInstanceOf[js.Any], account_number_confirmation = account_number_confirmation.asInstanceOf[js.Any], branch_code = branch_code.asInstanceOf[js.Any], name_on_account = name_on_account.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BecsBillingInfo]
    }
    
    @scala.inline
    implicit class BecsBillingInfoMutableBuilder[Self <: BecsBillingInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccount_number(value: String): Self = StObject.set(x, "account_number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccount_number_confirmation(value: String): Self = StObject.set(x, "account_number_confirmation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddress1(value: String): Self = StObject.set(x, "address1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddress1Undefined: Self = StObject.set(x, "address1", js.undefined)
      
      @scala.inline
      def setAddress2(value: String): Self = StObject.set(x, "address2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddress2Undefined: Self = StObject.set(x, "address2", js.undefined)
      
      @scala.inline
      def setBranch_code(value: String): Self = StObject.set(x, "branch_code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
      
      @scala.inline
      def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
      
      @scala.inline
      def setName_on_account(value: String): Self = StObject.set(x, "name_on_account", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPostal_code(value: String): Self = StObject.set(x, "postal_code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPostal_codeUndefined: Self = StObject.set(x, "postal_code", js.undefined)
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      @scala.inline
      def setType(value: becs): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVat_number(value: String): Self = StObject.set(x, "vat_number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVat_numberUndefined: Self = StObject.set(x, "vat_number", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.recurlyRecurlyJs.bankAccountMod.SepaBillingInfo
    - typings.recurlyRecurlyJs.bankAccountMod.BacsBillingInfo
    - typings.recurlyRecurlyJs.bankAccountMod.BecsBillingInfo
    - typings.recurlyRecurlyJs.bankAccountMod.BankAccountBillingInfo
  */
  trait BillingInfo extends StObject
  object BillingInfo {
    
    @scala.inline
    def BacsBillingInfo(
      account_number: String,
      account_number_confirmation: String,
      name_on_account: String,
      sort_code: String,
      `type`: bacs
    ): typings.recurlyRecurlyJs.bankAccountMod.BacsBillingInfo = {
      val __obj = js.Dynamic.literal(account_number = account_number.asInstanceOf[js.Any], account_number_confirmation = account_number_confirmation.asInstanceOf[js.Any], name_on_account = name_on_account.asInstanceOf[js.Any], sort_code = sort_code.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.recurlyRecurlyJs.bankAccountMod.BacsBillingInfo]
    }
    
    @scala.inline
    def BankAccountBillingInfo(
      account_number: String,
      account_number_confirmation: String,
      name_on_account: String,
      routing_number: String
    ): typings.recurlyRecurlyJs.bankAccountMod.BankAccountBillingInfo = {
      val __obj = js.Dynamic.literal(account_number = account_number.asInstanceOf[js.Any], account_number_confirmation = account_number_confirmation.asInstanceOf[js.Any], name_on_account = name_on_account.asInstanceOf[js.Any], routing_number = routing_number.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.recurlyRecurlyJs.bankAccountMod.BankAccountBillingInfo]
    }
    
    @scala.inline
    def BecsBillingInfo(
      account_number: String,
      account_number_confirmation: String,
      branch_code: String,
      name_on_account: String,
      `type`: becs
    ): typings.recurlyRecurlyJs.bankAccountMod.BecsBillingInfo = {
      val __obj = js.Dynamic.literal(account_number = account_number.asInstanceOf[js.Any], account_number_confirmation = account_number_confirmation.asInstanceOf[js.Any], branch_code = branch_code.asInstanceOf[js.Any], name_on_account = name_on_account.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.recurlyRecurlyJs.bankAccountMod.BecsBillingInfo]
    }
    
    @scala.inline
    def SepaBillingInfo(iban: String, name_on_account: String): typings.recurlyRecurlyJs.bankAccountMod.SepaBillingInfo = {
      val __obj = js.Dynamic.literal(iban = iban.asInstanceOf[js.Any], name_on_account = name_on_account.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.recurlyRecurlyJs.bankAccountMod.SepaBillingInfo]
    }
  }
  
  @js.native
  trait BillingInfoCommonFields extends StObject {
    
    var address1: js.UndefOr[String] = js.native
    
    var address2: js.UndefOr[String] = js.native
    
    var city: js.UndefOr[String] = js.native
    
    var country: js.UndefOr[String] = js.native
    
    var name_on_account: String = js.native
    
    var postal_code: js.UndefOr[String] = js.native
    
    var state: js.UndefOr[String] = js.native
    
    var vat_number: js.UndefOr[String] = js.native
  }
  object BillingInfoCommonFields {
    
    @scala.inline
    def apply(name_on_account: String): BillingInfoCommonFields = {
      val __obj = js.Dynamic.literal(name_on_account = name_on_account.asInstanceOf[js.Any])
      __obj.asInstanceOf[BillingInfoCommonFields]
    }
    
    @scala.inline
    implicit class BillingInfoCommonFieldsMutableBuilder[Self <: BillingInfoCommonFields] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress1(value: String): Self = StObject.set(x, "address1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddress1Undefined: Self = StObject.set(x, "address1", js.undefined)
      
      @scala.inline
      def setAddress2(value: String): Self = StObject.set(x, "address2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddress2Undefined: Self = StObject.set(x, "address2", js.undefined)
      
      @scala.inline
      def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
      
      @scala.inline
      def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
      
      @scala.inline
      def setName_on_account(value: String): Self = StObject.set(x, "name_on_account", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPostal_code(value: String): Self = StObject.set(x, "postal_code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPostal_codeUndefined: Self = StObject.set(x, "postal_code", js.undefined)
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      @scala.inline
      def setVat_number(value: String): Self = StObject.set(x, "vat_number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVat_numberUndefined: Self = StObject.set(x, "vat_number", js.undefined)
    }
  }
  
  /* Inlined @recurly/recurly-js.@recurly/recurly-js/lib/bank-account.BillingInfoCommonFields & {  name_on_account :string,   iban :string} */
  @js.native
  trait SepaBillingInfo extends BillingInfo {
    
    var address1: js.UndefOr[String] = js.native
    
    var address2: js.UndefOr[String] = js.native
    
    var city: js.UndefOr[String] = js.native
    
    var country: js.UndefOr[String] = js.native
    
    /**
      * The International Bank Account Number, up to 34 alphanumeric characters comprising a country code; two check
      * digits; and a number that includes the domestic bank account number, branch identifier, and potential routing
      * information.
      */
    var iban: String = js.native
    
    var name_on_account: String = js.native
    
    var postal_code: js.UndefOr[String] = js.native
    
    var state: js.UndefOr[String] = js.native
    
    var vat_number: js.UndefOr[String] = js.native
  }
  object SepaBillingInfo {
    
    @scala.inline
    def apply(iban: String, name_on_account: String): SepaBillingInfo = {
      val __obj = js.Dynamic.literal(iban = iban.asInstanceOf[js.Any], name_on_account = name_on_account.asInstanceOf[js.Any])
      __obj.asInstanceOf[SepaBillingInfo]
    }
    
    @scala.inline
    implicit class SepaBillingInfoMutableBuilder[Self <: SepaBillingInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress1(value: String): Self = StObject.set(x, "address1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddress1Undefined: Self = StObject.set(x, "address1", js.undefined)
      
      @scala.inline
      def setAddress2(value: String): Self = StObject.set(x, "address2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddress2Undefined: Self = StObject.set(x, "address2", js.undefined)
      
      @scala.inline
      def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
      
      @scala.inline
      def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
      
      @scala.inline
      def setIban(value: String): Self = StObject.set(x, "iban", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName_on_account(value: String): Self = StObject.set(x, "name_on_account", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPostal_code(value: String): Self = StObject.set(x, "postal_code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPostal_codeUndefined: Self = StObject.set(x, "postal_code", js.undefined)
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      @scala.inline
      def setVat_number(value: String): Self = StObject.set(x, "vat_number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVat_numberUndefined: Self = StObject.set(x, "vat_number", js.undefined)
    }
  }
}
