package typings.recurlyRecurlyJs

import typings.recurlyRecurlyJs.errorMod.RecurlyError
import typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.bacs
import typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.becs
import typings.recurlyRecurlyJs.tokenMod.TokenHandler
import typings.std.HTMLFormElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bankAccountMod {
  
  trait AccountInfo
    extends StObject
       with BillingInfoCommonFields {
    
    var account_number: String
    
    var account_number_confirmation: String
  }
  object AccountInfo {
    
    inline def apply(account_number: String, account_number_confirmation: String, name_on_account: String): AccountInfo = {
      val __obj = js.Dynamic.literal(account_number = account_number.asInstanceOf[js.Any], account_number_confirmation = account_number_confirmation.asInstanceOf[js.Any], name_on_account = name_on_account.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccountInfo]
    }
    
    extension [Self <: AccountInfo](x: Self) {
      
      inline def setAccount_number(value: String): Self = StObject.set(x, "account_number", value.asInstanceOf[js.Any])
      
      inline def setAccount_number_confirmation(value: String): Self = StObject.set(x, "account_number_confirmation", value.asInstanceOf[js.Any])
    }
  }
  
  trait BacsBillingInfo
    extends StObject
       with AccountInfo
       with BillingInfo {
    
    /**
      * Bank identifier code for UK based banks.
      */
    var sort_code: String
    
    var `type`: bacs
  }
  object BacsBillingInfo {
    
    inline def apply(
      account_number: String,
      account_number_confirmation: String,
      name_on_account: String,
      sort_code: String
    ): BacsBillingInfo = {
      val __obj = js.Dynamic.literal(account_number = account_number.asInstanceOf[js.Any], account_number_confirmation = account_number_confirmation.asInstanceOf[js.Any], name_on_account = name_on_account.asInstanceOf[js.Any], sort_code = sort_code.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("bacs")
      __obj.asInstanceOf[BacsBillingInfo]
    }
    
    extension [Self <: BacsBillingInfo](x: Self) {
      
      inline def setSort_code(value: String): Self = StObject.set(x, "sort_code", value.asInstanceOf[js.Any])
      
      inline def setType(value: bacs): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
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
  
  trait BankAccountBillingInfo
    extends StObject
       with AccountInfo
       with BillingInfo {
    
    var routing_number: String
  }
  object BankAccountBillingInfo {
    
    inline def apply(
      account_number: String,
      account_number_confirmation: String,
      name_on_account: String,
      routing_number: String
    ): BankAccountBillingInfo = {
      val __obj = js.Dynamic.literal(account_number = account_number.asInstanceOf[js.Any], account_number_confirmation = account_number_confirmation.asInstanceOf[js.Any], name_on_account = name_on_account.asInstanceOf[js.Any], routing_number = routing_number.asInstanceOf[js.Any])
      __obj.asInstanceOf[BankAccountBillingInfo]
    }
    
    extension [Self <: BankAccountBillingInfo](x: Self) {
      
      inline def setRouting_number(value: String): Self = StObject.set(x, "routing_number", value.asInstanceOf[js.Any])
    }
  }
  
  type BankInfo = js.Function2[/* bankInfoOptions */ BankInfoOptions, /* BankInfoHandler */ BankInfoHandler, Unit]
  
  type BankInfoHandler = js.Function2[/* err */ RecurlyError, /* bankInfo */ BankInfoPayload, Unit]
  
  trait BankInfoOptions extends StObject {
    
    /**
      * The routing number for a bank (ex: ‘123456780’)
      */
    var routingNumber: String
  }
  object BankInfoOptions {
    
    inline def apply(routingNumber: String): BankInfoOptions = {
      val __obj = js.Dynamic.literal(routingNumber = routingNumber.asInstanceOf[js.Any])
      __obj.asInstanceOf[BankInfoOptions]
    }
    
    extension [Self <: BankInfoOptions](x: Self) {
      
      inline def setRoutingNumber(value: String): Self = StObject.set(x, "routingNumber", value.asInstanceOf[js.Any])
    }
  }
  
  trait BankInfoPayload extends StObject {
    
    /**
      * Bank institution name (ex: Bank of Recurly)
      */
    var bank_name: String
  }
  object BankInfoPayload {
    
    inline def apply(bank_name: String): BankInfoPayload = {
      val __obj = js.Dynamic.literal(bank_name = bank_name.asInstanceOf[js.Any])
      __obj.asInstanceOf[BankInfoPayload]
    }
    
    extension [Self <: BankInfoPayload](x: Self) {
      
      inline def setBank_name(value: String): Self = StObject.set(x, "bank_name", value.asInstanceOf[js.Any])
    }
  }
  
  trait BecsBillingInfo
    extends StObject
       with AccountInfo
       with BillingInfo {
    
    var branch_code: String
    
    var `type`: becs
  }
  object BecsBillingInfo {
    
    inline def apply(
      account_number: String,
      account_number_confirmation: String,
      branch_code: String,
      name_on_account: String
    ): BecsBillingInfo = {
      val __obj = js.Dynamic.literal(account_number = account_number.asInstanceOf[js.Any], account_number_confirmation = account_number_confirmation.asInstanceOf[js.Any], branch_code = branch_code.asInstanceOf[js.Any], name_on_account = name_on_account.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("becs")
      __obj.asInstanceOf[BecsBillingInfo]
    }
    
    extension [Self <: BecsBillingInfo](x: Self) {
      
      inline def setBranch_code(value: String): Self = StObject.set(x, "branch_code", value.asInstanceOf[js.Any])
      
      inline def setType(value: becs): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
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
    
    inline def BacsBillingInfo(
      account_number: String,
      account_number_confirmation: String,
      name_on_account: String,
      sort_code: String
    ): typings.recurlyRecurlyJs.bankAccountMod.BacsBillingInfo = {
      val __obj = js.Dynamic.literal(account_number = account_number.asInstanceOf[js.Any], account_number_confirmation = account_number_confirmation.asInstanceOf[js.Any], name_on_account = name_on_account.asInstanceOf[js.Any], sort_code = sort_code.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("bacs")
      __obj.asInstanceOf[typings.recurlyRecurlyJs.bankAccountMod.BacsBillingInfo]
    }
    
    inline def BankAccountBillingInfo(
      account_number: String,
      account_number_confirmation: String,
      name_on_account: String,
      routing_number: String
    ): typings.recurlyRecurlyJs.bankAccountMod.BankAccountBillingInfo = {
      val __obj = js.Dynamic.literal(account_number = account_number.asInstanceOf[js.Any], account_number_confirmation = account_number_confirmation.asInstanceOf[js.Any], name_on_account = name_on_account.asInstanceOf[js.Any], routing_number = routing_number.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.recurlyRecurlyJs.bankAccountMod.BankAccountBillingInfo]
    }
    
    inline def BecsBillingInfo(
      account_number: String,
      account_number_confirmation: String,
      branch_code: String,
      name_on_account: String
    ): typings.recurlyRecurlyJs.bankAccountMod.BecsBillingInfo = {
      val __obj = js.Dynamic.literal(account_number = account_number.asInstanceOf[js.Any], account_number_confirmation = account_number_confirmation.asInstanceOf[js.Any], branch_code = branch_code.asInstanceOf[js.Any], name_on_account = name_on_account.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("becs")
      __obj.asInstanceOf[typings.recurlyRecurlyJs.bankAccountMod.BecsBillingInfo]
    }
    
    inline def SepaBillingInfo(iban: String, name_on_account: String): typings.recurlyRecurlyJs.bankAccountMod.SepaBillingInfo = {
      val __obj = js.Dynamic.literal(iban = iban.asInstanceOf[js.Any], name_on_account = name_on_account.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.recurlyRecurlyJs.bankAccountMod.SepaBillingInfo]
    }
  }
  
  trait BillingInfoCommonFields extends StObject {
    
    var address1: js.UndefOr[String] = js.undefined
    
    var address2: js.UndefOr[String] = js.undefined
    
    var city: js.UndefOr[String] = js.undefined
    
    var country: js.UndefOr[String] = js.undefined
    
    var name_on_account: String
    
    var postal_code: js.UndefOr[String] = js.undefined
    
    var state: js.UndefOr[String] = js.undefined
    
    var vat_number: js.UndefOr[String] = js.undefined
  }
  object BillingInfoCommonFields {
    
    inline def apply(name_on_account: String): BillingInfoCommonFields = {
      val __obj = js.Dynamic.literal(name_on_account = name_on_account.asInstanceOf[js.Any])
      __obj.asInstanceOf[BillingInfoCommonFields]
    }
    
    extension [Self <: BillingInfoCommonFields](x: Self) {
      
      inline def setAddress1(value: String): Self = StObject.set(x, "address1", value.asInstanceOf[js.Any])
      
      inline def setAddress1Undefined: Self = StObject.set(x, "address1", js.undefined)
      
      inline def setAddress2(value: String): Self = StObject.set(x, "address2", value.asInstanceOf[js.Any])
      
      inline def setAddress2Undefined: Self = StObject.set(x, "address2", js.undefined)
      
      inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      inline def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
      
      inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
      
      inline def setName_on_account(value: String): Self = StObject.set(x, "name_on_account", value.asInstanceOf[js.Any])
      
      inline def setPostal_code(value: String): Self = StObject.set(x, "postal_code", value.asInstanceOf[js.Any])
      
      inline def setPostal_codeUndefined: Self = StObject.set(x, "postal_code", js.undefined)
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setVat_number(value: String): Self = StObject.set(x, "vat_number", value.asInstanceOf[js.Any])
      
      inline def setVat_numberUndefined: Self = StObject.set(x, "vat_number", js.undefined)
    }
  }
  
  trait SepaBillingInfo
    extends StObject
       with BillingInfoCommonFields
       with BillingInfo {
    
    /**
      * The International Bank Account Number, up to 34 alphanumeric characters comprising a country code; two check
      * digits; and a number that includes the domestic bank account number, branch identifier, and potential routing
      * information.
      */
    var iban: String
  }
  object SepaBillingInfo {
    
    inline def apply(iban: String, name_on_account: String): SepaBillingInfo = {
      val __obj = js.Dynamic.literal(iban = iban.asInstanceOf[js.Any], name_on_account = name_on_account.asInstanceOf[js.Any])
      __obj.asInstanceOf[SepaBillingInfo]
    }
    
    extension [Self <: SepaBillingInfo](x: Self) {
      
      inline def setIban(value: String): Self = StObject.set(x, "iban", value.asInstanceOf[js.Any])
    }
  }
}
