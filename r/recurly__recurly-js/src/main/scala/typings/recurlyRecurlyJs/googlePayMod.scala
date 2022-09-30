package typings.recurlyRecurlyJs

import org.scalablytyped.runtime.StringDictionary
import typings.recurlyRecurlyJs.emitterMod.Emitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object googlePayMod {
  
  type GooglePay = js.Function1[/* options */ GooglePayOptions, Emitter[GooglePayEvent]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.token
    - typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.error
    - typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.ready
  */
  trait GooglePayEvent extends StObject
  object GooglePayEvent {
    
    inline def error: typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.error = "error".asInstanceOf[typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.error]
    
    inline def ready: typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.ready = "ready".asInstanceOf[typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.ready]
    
    inline def token: typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.token = "token".asInstanceOf[typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.token]
  }
  
  trait GooglePayOptions extends StObject {
    
    /**
      * The object to configure the Google Pay payment button.
      * See https://developers.google.com/pay/api/web/reference/request-objects#ButtonOptions for options supported.
      *
      */
    var buttonOptions: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    /**
      * Your ISO 3166 country code (ex: ‘US’). This is your country code as the merchant.
      */
    var country: String
    
    /**
      * ISO 4217 purchase currency (ex: ‘USD’).
      */
    var currency: String
    
    /**
      * Specify which Payment Gateway in Recurly must handle the payment.
      */
    var gatewayCode: js.UndefOr[String] = js.undefined
    
    /**
      * The Google merchant business name registered with the Google Pay and Wallet Console.
      */
    var googleBusinessName: js.UndefOr[String] = js.undefined
    
    /**
      * The Google merchant identifier issued after registration with the Google Pay and Wallet Console.
      */
    var googleMerchantId: String
    
    /**
      * Requires the user to accept providing the full billing address.
      */
    var requireBillingAddress: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Total cost to display in the Google Pay payment sheet.
      */
    var total: String
  }
  object GooglePayOptions {
    
    inline def apply(country: String, currency: String, googleMerchantId: String, total: String): GooglePayOptions = {
      val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], googleMerchantId = googleMerchantId.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[GooglePayOptions]
    }
    
    extension [Self <: GooglePayOptions](x: Self) {
      
      inline def setButtonOptions(value: StringDictionary[Any]): Self = StObject.set(x, "buttonOptions", value.asInstanceOf[js.Any])
      
      inline def setButtonOptionsUndefined: Self = StObject.set(x, "buttonOptions", js.undefined)
      
      inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      inline def setGatewayCode(value: String): Self = StObject.set(x, "gatewayCode", value.asInstanceOf[js.Any])
      
      inline def setGatewayCodeUndefined: Self = StObject.set(x, "gatewayCode", js.undefined)
      
      inline def setGoogleBusinessName(value: String): Self = StObject.set(x, "googleBusinessName", value.asInstanceOf[js.Any])
      
      inline def setGoogleBusinessNameUndefined: Self = StObject.set(x, "googleBusinessName", js.undefined)
      
      inline def setGoogleMerchantId(value: String): Self = StObject.set(x, "googleMerchantId", value.asInstanceOf[js.Any])
      
      inline def setRequireBillingAddress(value: Boolean): Self = StObject.set(x, "requireBillingAddress", value.asInstanceOf[js.Any])
      
      inline def setRequireBillingAddressUndefined: Self = StObject.set(x, "requireBillingAddress", js.undefined)
      
      inline def setTotal(value: String): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
}
