package typings.reactNativePaypalLib

import typings.reactNativePaypalLib.reactNativePaypalLibStrings.AUTHORIZE
import typings.reactNativePaypalLib.reactNativePaypalLibStrings.NO_NETWORK
import typings.reactNativePaypalLib.reactNativePaypalLibStrings.ORDER
import typings.reactNativePaypalLib.reactNativePaypalLibStrings.PRODUCTION
import typings.reactNativePaypalLib.reactNativePaypalLibStrings.SALE
import typings.reactNativePaypalLib.reactNativePaypalLibStrings.SANDBOX
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("react-native-paypal-lib", "default.ENVIRONMENT")
    @js.native
    val ENVIRONMENT: EnvironmentParam = js.native
    
    @JSImport("react-native-paypal-lib", "default.INTENT")
    @js.native
    val INTENT: IntentParam = js.native
    
    @JSImport("react-native-paypal-lib", "default.paymentRequest")
    @js.native
    def paymentRequest(params: PaymentParams): js.Promise[PaymentConfirmation] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativePaypalLib.reactNativePaypalLibStrings.AUD
    - typings.reactNativePaypalLib.reactNativePaypalLibStrings.BRL
    - typings.reactNativePaypalLib.reactNativePaypalLibStrings.CAD
    - typings.reactNativePaypalLib.reactNativePaypalLibStrings.CNY
    - typings.reactNativePaypalLib.reactNativePaypalLibStrings.CZK
    - typings.reactNativePaypalLib.reactNativePaypalLibStrings.DKK
    - typings.reactNativePaypalLib.reactNativePaypalLibStrings.EUR
    - typings.reactNativePaypalLib.reactNativePaypalLibStrings.HKD
    - typings.reactNativePaypalLib.reactNativePaypalLibStrings.HUF
    - typings.reactNativePaypalLib.reactNativePaypalLibStrings.INR
    - typings.reactNativePaypalLib.reactNativePaypalLibStrings.ILS
    - typings.reactNativePaypalLib.reactNativePaypalLibStrings.JPY
    - typings.reactNativePaypalLib.reactNativePaypalLibStrings.MYR
    - typings.reactNativePaypalLib.reactNativePaypalLibStrings.MXN
    - typings.reactNativePaypalLib.reactNativePaypalLibStrings.TWD
    - typings.reactNativePaypalLib.reactNativePaypalLibStrings.NZD
    - typings.reactNativePaypalLib.reactNativePaypalLibStrings.NOK
    - typings.reactNativePaypalLib.reactNativePaypalLibStrings.PHP
    - typings.reactNativePaypalLib.reactNativePaypalLibStrings.PLN
    - typings.reactNativePaypalLib.reactNativePaypalLibStrings.GBP
    - typings.reactNativePaypalLib.reactNativePaypalLibStrings.RUB
    - typings.reactNativePaypalLib.reactNativePaypalLibStrings.SGD
    - typings.reactNativePaypalLib.reactNativePaypalLibStrings.SEK
    - typings.reactNativePaypalLib.reactNativePaypalLibStrings.CHF
    - typings.reactNativePaypalLib.reactNativePaypalLibStrings.THB
    - typings.reactNativePaypalLib.reactNativePaypalLibStrings.USD
  */
  trait CURRENCIES extends StObject
  object CURRENCIES {
    
    @scala.inline
    def AUD: typings.reactNativePaypalLib.reactNativePaypalLibStrings.AUD = "AUD".asInstanceOf[typings.reactNativePaypalLib.reactNativePaypalLibStrings.AUD]
    
    @scala.inline
    def BRL: typings.reactNativePaypalLib.reactNativePaypalLibStrings.BRL = "BRL".asInstanceOf[typings.reactNativePaypalLib.reactNativePaypalLibStrings.BRL]
    
    @scala.inline
    def CAD: typings.reactNativePaypalLib.reactNativePaypalLibStrings.CAD = "CAD".asInstanceOf[typings.reactNativePaypalLib.reactNativePaypalLibStrings.CAD]
    
    @scala.inline
    def CHF: typings.reactNativePaypalLib.reactNativePaypalLibStrings.CHF = "CHF".asInstanceOf[typings.reactNativePaypalLib.reactNativePaypalLibStrings.CHF]
    
    @scala.inline
    def CNY: typings.reactNativePaypalLib.reactNativePaypalLibStrings.CNY = "CNY".asInstanceOf[typings.reactNativePaypalLib.reactNativePaypalLibStrings.CNY]
    
    @scala.inline
    def CZK: typings.reactNativePaypalLib.reactNativePaypalLibStrings.CZK = "CZK".asInstanceOf[typings.reactNativePaypalLib.reactNativePaypalLibStrings.CZK]
    
    @scala.inline
    def DKK: typings.reactNativePaypalLib.reactNativePaypalLibStrings.DKK = "DKK".asInstanceOf[typings.reactNativePaypalLib.reactNativePaypalLibStrings.DKK]
    
    @scala.inline
    def EUR: typings.reactNativePaypalLib.reactNativePaypalLibStrings.EUR = "EUR".asInstanceOf[typings.reactNativePaypalLib.reactNativePaypalLibStrings.EUR]
    
    @scala.inline
    def GBP: typings.reactNativePaypalLib.reactNativePaypalLibStrings.GBP = "GBP".asInstanceOf[typings.reactNativePaypalLib.reactNativePaypalLibStrings.GBP]
    
    @scala.inline
    def HKD: typings.reactNativePaypalLib.reactNativePaypalLibStrings.HKD = "HKD".asInstanceOf[typings.reactNativePaypalLib.reactNativePaypalLibStrings.HKD]
    
    @scala.inline
    def HUF: typings.reactNativePaypalLib.reactNativePaypalLibStrings.HUF = "HUF".asInstanceOf[typings.reactNativePaypalLib.reactNativePaypalLibStrings.HUF]
    
    @scala.inline
    def ILS: typings.reactNativePaypalLib.reactNativePaypalLibStrings.ILS = "ILS".asInstanceOf[typings.reactNativePaypalLib.reactNativePaypalLibStrings.ILS]
    
    @scala.inline
    def INR: typings.reactNativePaypalLib.reactNativePaypalLibStrings.INR = "INR".asInstanceOf[typings.reactNativePaypalLib.reactNativePaypalLibStrings.INR]
    
    @scala.inline
    def JPY: typings.reactNativePaypalLib.reactNativePaypalLibStrings.JPY = "JPY".asInstanceOf[typings.reactNativePaypalLib.reactNativePaypalLibStrings.JPY]
    
    @scala.inline
    def MXN: typings.reactNativePaypalLib.reactNativePaypalLibStrings.MXN = "MXN".asInstanceOf[typings.reactNativePaypalLib.reactNativePaypalLibStrings.MXN]
    
    @scala.inline
    def MYR: typings.reactNativePaypalLib.reactNativePaypalLibStrings.MYR = "MYR".asInstanceOf[typings.reactNativePaypalLib.reactNativePaypalLibStrings.MYR]
    
    @scala.inline
    def NOK: typings.reactNativePaypalLib.reactNativePaypalLibStrings.NOK = "NOK".asInstanceOf[typings.reactNativePaypalLib.reactNativePaypalLibStrings.NOK]
    
    @scala.inline
    def NZD: typings.reactNativePaypalLib.reactNativePaypalLibStrings.NZD = "NZD".asInstanceOf[typings.reactNativePaypalLib.reactNativePaypalLibStrings.NZD]
    
    @scala.inline
    def PHP: typings.reactNativePaypalLib.reactNativePaypalLibStrings.PHP = "PHP".asInstanceOf[typings.reactNativePaypalLib.reactNativePaypalLibStrings.PHP]
    
    @scala.inline
    def PLN: typings.reactNativePaypalLib.reactNativePaypalLibStrings.PLN = "PLN".asInstanceOf[typings.reactNativePaypalLib.reactNativePaypalLibStrings.PLN]
    
    @scala.inline
    def RUB: typings.reactNativePaypalLib.reactNativePaypalLibStrings.RUB = "RUB".asInstanceOf[typings.reactNativePaypalLib.reactNativePaypalLibStrings.RUB]
    
    @scala.inline
    def SEK: typings.reactNativePaypalLib.reactNativePaypalLibStrings.SEK = "SEK".asInstanceOf[typings.reactNativePaypalLib.reactNativePaypalLibStrings.SEK]
    
    @scala.inline
    def SGD: typings.reactNativePaypalLib.reactNativePaypalLibStrings.SGD = "SGD".asInstanceOf[typings.reactNativePaypalLib.reactNativePaypalLibStrings.SGD]
    
    @scala.inline
    def THB: typings.reactNativePaypalLib.reactNativePaypalLibStrings.THB = "THB".asInstanceOf[typings.reactNativePaypalLib.reactNativePaypalLibStrings.THB]
    
    @scala.inline
    def TWD: typings.reactNativePaypalLib.reactNativePaypalLibStrings.TWD = "TWD".asInstanceOf[typings.reactNativePaypalLib.reactNativePaypalLibStrings.TWD]
    
    @scala.inline
    def USD: typings.reactNativePaypalLib.reactNativePaypalLibStrings.USD = "USD".asInstanceOf[typings.reactNativePaypalLib.reactNativePaypalLibStrings.USD]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativePaypalLib.reactNativePaypalLibStrings.NO_NETWORK
    - typings.reactNativePaypalLib.reactNativePaypalLibStrings.SANDBOX
    - typings.reactNativePaypalLib.reactNativePaypalLibStrings.PRODUCTION
  */
  trait ENVIRONMENT extends StObject
  object ENVIRONMENT {
    
    @scala.inline
    def NO_NETWORK: typings.reactNativePaypalLib.reactNativePaypalLibStrings.NO_NETWORK = "NO_NETWORK".asInstanceOf[typings.reactNativePaypalLib.reactNativePaypalLibStrings.NO_NETWORK]
    
    @scala.inline
    def PRODUCTION: typings.reactNativePaypalLib.reactNativePaypalLibStrings.PRODUCTION = "PRODUCTION".asInstanceOf[typings.reactNativePaypalLib.reactNativePaypalLibStrings.PRODUCTION]
    
    @scala.inline
    def SANDBOX: typings.reactNativePaypalLib.reactNativePaypalLibStrings.SANDBOX = "SANDBOX".asInstanceOf[typings.reactNativePaypalLib.reactNativePaypalLibStrings.SANDBOX]
  }
  
  @js.native
  trait EnvironmentParam extends StObject {
    
    var NO_NETWORK: typings.reactNativePaypalLib.reactNativePaypalLibStrings.NO_NETWORK = js.native
    
    var PRODUCTION: typings.reactNativePaypalLib.reactNativePaypalLibStrings.PRODUCTION = js.native
    
    var SANDBOX: typings.reactNativePaypalLib.reactNativePaypalLibStrings.SANDBOX = js.native
  }
  object EnvironmentParam {
    
    @scala.inline
    def apply(NO_NETWORK: NO_NETWORK, PRODUCTION: PRODUCTION, SANDBOX: SANDBOX): EnvironmentParam = {
      val __obj = js.Dynamic.literal(NO_NETWORK = NO_NETWORK.asInstanceOf[js.Any], PRODUCTION = PRODUCTION.asInstanceOf[js.Any], SANDBOX = SANDBOX.asInstanceOf[js.Any])
      __obj.asInstanceOf[EnvironmentParam]
    }
    
    @scala.inline
    implicit class EnvironmentParamMutableBuilder[Self <: EnvironmentParam] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNO_NETWORK(value: NO_NETWORK): Self = StObject.set(x, "NO_NETWORK", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPRODUCTION(value: PRODUCTION): Self = StObject.set(x, "PRODUCTION", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSANDBOX(value: SANDBOX): Self = StObject.set(x, "SANDBOX", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativePaypalLib.reactNativePaypalLibStrings.SALE
    - typings.reactNativePaypalLib.reactNativePaypalLibStrings.AUTHORIZE
    - typings.reactNativePaypalLib.reactNativePaypalLibStrings.ORDER
  */
  trait INTENT extends StObject
  object INTENT {
    
    @scala.inline
    def AUTHORIZE: typings.reactNativePaypalLib.reactNativePaypalLibStrings.AUTHORIZE = "AUTHORIZE".asInstanceOf[typings.reactNativePaypalLib.reactNativePaypalLibStrings.AUTHORIZE]
    
    @scala.inline
    def ORDER: typings.reactNativePaypalLib.reactNativePaypalLibStrings.ORDER = "ORDER".asInstanceOf[typings.reactNativePaypalLib.reactNativePaypalLibStrings.ORDER]
    
    @scala.inline
    def SALE: typings.reactNativePaypalLib.reactNativePaypalLibStrings.SALE = "SALE".asInstanceOf[typings.reactNativePaypalLib.reactNativePaypalLibStrings.SALE]
  }
  
  @js.native
  trait IntentParam extends StObject {
    
    var AUTHORIZE: typings.reactNativePaypalLib.reactNativePaypalLibStrings.AUTHORIZE = js.native
    
    var ORDER: typings.reactNativePaypalLib.reactNativePaypalLibStrings.ORDER = js.native
    
    var SALE: typings.reactNativePaypalLib.reactNativePaypalLibStrings.SALE = js.native
  }
  object IntentParam {
    
    @scala.inline
    def apply(AUTHORIZE: AUTHORIZE, ORDER: ORDER, SALE: SALE): IntentParam = {
      val __obj = js.Dynamic.literal(AUTHORIZE = AUTHORIZE.asInstanceOf[js.Any], ORDER = ORDER.asInstanceOf[js.Any], SALE = SALE.asInstanceOf[js.Any])
      __obj.asInstanceOf[IntentParam]
    }
    
    @scala.inline
    implicit class IntentParamMutableBuilder[Self <: IntentParam] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAUTHORIZE(value: AUTHORIZE): Self = StObject.set(x, "AUTHORIZE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setORDER(value: ORDER): Self = StObject.set(x, "ORDER", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSALE(value: SALE): Self = StObject.set(x, "SALE", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PayPalPayment extends StObject {
    
    var environment: String = js.native
    
    var paypal_sdk_version: String = js.native
    
    var platform: String = js.native
    
    var product_name: String = js.native
  }
  object PayPalPayment {
    
    @scala.inline
    def apply(environment: String, paypal_sdk_version: String, platform: String, product_name: String): PayPalPayment = {
      val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], paypal_sdk_version = paypal_sdk_version.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], product_name = product_name.asInstanceOf[js.Any])
      __obj.asInstanceOf[PayPalPayment]
    }
    
    @scala.inline
    implicit class PayPalPaymentMutableBuilder[Self <: PayPalPayment] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaypal_sdk_version(value: String): Self = StObject.set(x, "paypal_sdk_version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProduct_name(value: String): Self = StObject.set(x, "product_name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PaymentConfirmation extends StObject {
    
    var client: PayPalPayment = js.native
    
    var response: ProofOfPayment = js.native
    
    var response_type: String = js.native
  }
  object PaymentConfirmation {
    
    @scala.inline
    def apply(client: PayPalPayment, response: ProofOfPayment, response_type: String): PaymentConfirmation = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], response_type = response_type.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaymentConfirmation]
    }
    
    @scala.inline
    implicit class PaymentConfirmationMutableBuilder[Self <: PaymentConfirmation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClient(value: PayPalPayment): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponse(value: ProofOfPayment): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponse_type(value: String): Self = StObject.set(x, "response_type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PaymentParams extends StObject {
    
    var acceptCreditCards: Boolean = js.native
    
    var clientId: String = js.native
    
    var currency: CURRENCIES = js.native
    
    var description: String = js.native
    
    var environment: ENVIRONMENT = js.native
    
    var intent: INTENT = js.native
    
    var price: Double = js.native
  }
  object PaymentParams {
    
    @scala.inline
    def apply(
      acceptCreditCards: Boolean,
      clientId: String,
      currency: CURRENCIES,
      description: String,
      environment: ENVIRONMENT,
      intent: INTENT,
      price: Double
    ): PaymentParams = {
      val __obj = js.Dynamic.literal(acceptCreditCards = acceptCreditCards.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], intent = intent.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaymentParams]
    }
    
    @scala.inline
    implicit class PaymentParamsMutableBuilder[Self <: PaymentParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAcceptCreditCards(value: Boolean): Self = StObject.set(x, "acceptCreditCards", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrency(value: CURRENCIES): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvironment(value: ENVIRONMENT): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntent(value: INTENT): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrice(value: Double): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ProofOfPayment extends StObject {
    
    var create_time: String = js.native
    
    var id: String = js.native
    
    var intent: String = js.native
    
    var state: String = js.native
  }
  object ProofOfPayment {
    
    @scala.inline
    def apply(create_time: String, id: String, intent: String, state: String): ProofOfPayment = {
      val __obj = js.Dynamic.literal(create_time = create_time.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], intent = intent.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProofOfPayment]
    }
    
    @scala.inline
    implicit class ProofOfPaymentMutableBuilder[Self <: ProofOfPayment] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreate_time(value: String): Self = StObject.set(x, "create_time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntent(value: String): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
}
