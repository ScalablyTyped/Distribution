package typings.recurlyRecurlyJs

import typings.recurlyRecurlyJs.emitterMod.Emitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adyenMod {
  
  type Adyen = js.Function1[/* adyenOptions */ js.UndefOr[AdyenOptions], AdyenInstance]
  
  /* Rewritten from type alias, can be one of: 
    - typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.token
    - typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.error
  */
  trait AdyenEvent extends StObject
  object AdyenEvent {
    
    @scala.inline
    def error: typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.error = "error".asInstanceOf[typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.error]
    
    @scala.inline
    def token: typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.token = "token".asInstanceOf[typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.token]
  }
  
  @js.native
  trait AdyenInstance extends Emitter[AdyenEvent] {
    
    /**
      * Invokes the Adyen Payment Modal
      */
    def start(adyenOptions: AdyenOptions): Unit = js.native
  }
  
  @js.native
  trait AdyenOptions extends StObject {
    
    /**
      * 2 Digit Country Code
      */
    var countryCode: js.UndefOr[String] = js.native
    
    /**
      * Invoice Uuid from PendingPurchase
      */
    var invoiceUuid: String = js.native
    
    /**
      * Shopper locale for Payment Modal
      */
    var shopperLocale: js.UndefOr[String] = js.native
    
    /**
      * Skin code provided by Adyen
      */
    var skinCode: js.UndefOr[String] = js.native
  }
  object AdyenOptions {
    
    @scala.inline
    def apply(invoiceUuid: String): AdyenOptions = {
      val __obj = js.Dynamic.literal(invoiceUuid = invoiceUuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[AdyenOptions]
    }
    
    @scala.inline
    implicit class AdyenOptionsMutableBuilder[Self <: AdyenOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
      
      @scala.inline
      def setInvoiceUuid(value: String): Self = StObject.set(x, "invoiceUuid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShopperLocale(value: String): Self = StObject.set(x, "shopperLocale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShopperLocaleUndefined: Self = StObject.set(x, "shopperLocale", js.undefined)
      
      @scala.inline
      def setSkinCode(value: String): Self = StObject.set(x, "skinCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkinCodeUndefined: Self = StObject.set(x, "skinCode", js.undefined)
    }
  }
}
