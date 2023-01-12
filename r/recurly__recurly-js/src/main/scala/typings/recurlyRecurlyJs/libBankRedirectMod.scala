package typings.recurlyRecurlyJs

import typings.recurlyRecurlyJs.libEmitterMod.Emitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBankRedirectMod {
  
  type BankRedirect = js.Function0[BankRedirectInstance]
  
  /* Rewritten from type alias, can be one of: 
    - typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.token
    - typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.banks
    - typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.error
    - typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.countries
  */
  trait BankRedirectEvent extends StObject
  object BankRedirectEvent {
    
    inline def banks: typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.banks = "banks".asInstanceOf[typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.banks]
    
    inline def countries: typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.countries = "countries".asInstanceOf[typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.countries]
    
    inline def error: typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.error = "error".asInstanceOf[typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.error]
    
    inline def token: typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.token = "token".asInstanceOf[typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.token]
  }
  
  @js.native
  trait BankRedirectInstance
    extends StObject
       with Emitter[BankRedirectEvent] {
    
    /**
      * Load the banks for the specified payment method type.
      */
    def loadBanks(data: LoadBanksOptions): Unit = js.native
    def loadBanks(data: LoadBanksOptions, attachTo: String): Unit = js.native
    
    /**
      * Load the countries for the specified payment method type.
      */
    def loadCountries(data: LoadCountriesOptions): Unit = js.native
    def loadCountries(data: LoadCountriesOptions, attachTo: String): Unit = js.native
    
    /**
      * Start the BankRedirect Payment Modal.
      */
    def start(data: BankRedirectOptions): Unit = js.native
  }
  
  trait BankRedirectOptions extends StObject {
    
    /**
      * Country Code for sofort Payment methods.
      */
    var country_code: js.UndefOr[String] = js.undefined
    
    /**
      * Invoice Uuid from PendingPurchase.
      */
    var invoice_uuid: String
    
    /**
      * Issuer Id for iDeal Payment methods.
      */
    var issuer_id: js.UndefOr[String] = js.undefined
    
    /**
      * Token Payment method type.
      */
    var payment_method_type: PaymentMethodType
  }
  object BankRedirectOptions {
    
    inline def apply(invoice_uuid: String, payment_method_type: PaymentMethodType): BankRedirectOptions = {
      val __obj = js.Dynamic.literal(invoice_uuid = invoice_uuid.asInstanceOf[js.Any], payment_method_type = payment_method_type.asInstanceOf[js.Any])
      __obj.asInstanceOf[BankRedirectOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BankRedirectOptions] (val x: Self) extends AnyVal {
      
      inline def setCountry_code(value: String): Self = StObject.set(x, "country_code", value.asInstanceOf[js.Any])
      
      inline def setCountry_codeUndefined: Self = StObject.set(x, "country_code", js.undefined)
      
      inline def setInvoice_uuid(value: String): Self = StObject.set(x, "invoice_uuid", value.asInstanceOf[js.Any])
      
      inline def setIssuer_id(value: String): Self = StObject.set(x, "issuer_id", value.asInstanceOf[js.Any])
      
      inline def setIssuer_idUndefined: Self = StObject.set(x, "issuer_id", js.undefined)
      
      inline def setPayment_method_type(value: PaymentMethodType): Self = StObject.set(x, "payment_method_type", value.asInstanceOf[js.Any])
    }
  }
  
  trait LoadBanksOptions extends StObject {
    
    /**
      * Token Payment method type.
      */
    var payment_method_type: PaymentMethodType
  }
  object LoadBanksOptions {
    
    inline def apply(payment_method_type: PaymentMethodType): LoadBanksOptions = {
      val __obj = js.Dynamic.literal(payment_method_type = payment_method_type.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoadBanksOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LoadBanksOptions] (val x: Self) extends AnyVal {
      
      inline def setPayment_method_type(value: PaymentMethodType): Self = StObject.set(x, "payment_method_type", value.asInstanceOf[js.Any])
    }
  }
  
  type LoadCountriesOptions = LoadBanksOptions
  
  /* Rewritten from type alias, can be one of: 
    - typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.ideal
    - typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.sofort
  */
  trait PaymentMethodType extends StObject
  object PaymentMethodType {
    
    inline def ideal: typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.ideal = "ideal".asInstanceOf[typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.ideal]
    
    inline def sofort: typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.sofort = "sofort".asInstanceOf[typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.sofort]
  }
}
