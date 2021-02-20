package typings.reactStripeElements

import typings.react.mod.Component
import typings.react.mod.ComponentType
import typings.reactStripeElements.mod.ReactStripeElements.ElementProps
import typings.reactStripeElements.mod.ReactStripeElements.InjectOptions
import typings.reactStripeElements.mod.ReactStripeElements.InjectedStripeProps
import typings.reactStripeElements.mod.ReactStripeElements.PaymentRequestButtonElementProps
import typings.reactStripeElements.mod.ReactStripeElements.StripeProviderProps
import typings.stripeV3.stripe.BankAccountTokenOptions
import typings.stripeV3.stripe.CreatePaymentMethodOptions
import typings.stripeV3.stripe.HandleCardPaymentWithoutElementsOptions
import typings.stripeV3.stripe.HandleCardSetupOptions
import typings.stripeV3.stripe.PaymentIntentResponse
import typings.stripeV3.stripe.PaymentMethodData
import typings.stripeV3.stripe.PaymentMethodResponse
import typings.stripeV3.stripe.RetrieveSourceOptions
import typings.stripeV3.stripe.SetupIntentResponse
import typings.stripeV3.stripe.StripeClientCheckoutOptions
import typings.stripeV3.stripe.StripeRedirectResponse
import typings.stripeV3.stripe.elements.Element
import typings.stripeV3.stripe.elements.ElementsCreateOptions
import typings.stripeV3.stripe.paymentMethod.paymentMethodType
import typings.stripeV3.stripe.paymentRequest.StripePaymentRequest
import typings.stripeV3.stripe.paymentRequest.StripePaymentRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-stripe-elements", "CardCVCElement")
  @js.native
  class CardCVCElement_ protected () extends CardCvcElement {
    def this(props: ElementProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ElementProps, context: js.Any) = this()
  }
  
  @JSImport("react-stripe-elements", "CardCvcElement")
  @js.native
  class CardCvcElement protected ()
    extends Component[ElementProps, js.Object, js.Any] {
    def this(props: ElementProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ElementProps, context: js.Any) = this()
  }
  
  @JSImport("react-stripe-elements", "CardElement")
  @js.native
  class CardElement protected ()
    extends Component[ElementProps, js.Object, js.Any] {
    def this(props: ElementProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ElementProps, context: js.Any) = this()
  }
  
  @JSImport("react-stripe-elements", "CardExpiryElement")
  @js.native
  class CardExpiryElement protected ()
    extends Component[ElementProps, js.Object, js.Any] {
    def this(props: ElementProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ElementProps, context: js.Any) = this()
  }
  
  @JSImport("react-stripe-elements", "CardNumberElement")
  @js.native
  class CardNumberElement protected ()
    extends Component[ElementProps, js.Object, js.Any] {
    def this(props: ElementProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ElementProps, context: js.Any) = this()
  }
  
  @JSImport("react-stripe-elements", "Elements")
  @js.native
  class Elements protected ()
    extends Component[ElementsCreateOptions, js.Object, js.Any] {
    def this(props: ElementsCreateOptions) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ElementsCreateOptions, context: js.Any) = this()
  }
  
  @JSImport("react-stripe-elements", "IbanElement")
  @js.native
  class IbanElement protected ()
    extends Component[ElementProps, js.Object, js.Any] {
    def this(props: ElementProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ElementProps, context: js.Any) = this()
  }
  
  @JSImport("react-stripe-elements", "IdealBankElement")
  @js.native
  class IdealBankElement protected ()
    extends Component[ElementProps, js.Object, js.Any] {
    def this(props: ElementProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ElementProps, context: js.Any) = this()
  }
  
  @JSImport("react-stripe-elements", "PaymentRequestButtonElement")
  @js.native
  class PaymentRequestButtonElement protected ()
    extends Component[PaymentRequestButtonElementProps, js.Object, js.Any] {
    def this(props: PaymentRequestButtonElementProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PaymentRequestButtonElementProps, context: js.Any) = this()
  }
  
  @JSImport("react-stripe-elements", "PostalCodeElement")
  @js.native
  class PostalCodeElement protected ()
    extends Component[ElementProps, js.Object, js.Any] {
    def this(props: ElementProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ElementProps, context: js.Any) = this()
  }
  
  @JSImport("react-stripe-elements", "StripeProvider")
  @js.native
  class StripeProvider protected ()
    extends Component[StripeProviderProps, js.Object, js.Any] {
    def this(props: StripeProviderProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: StripeProviderProps, context: js.Any) = this()
  }
  
  @JSImport("react-stripe-elements", "injectStripe")
  @js.native
  def injectStripe[P /* <: js.Object */](WrappedComponent: ComponentType[P with InjectedStripeProps]): ComponentType[P] = js.native
  @JSImport("react-stripe-elements", "injectStripe")
  @js.native
  def injectStripe[P /* <: js.Object */](WrappedComponent: ComponentType[P with InjectedStripeProps], componentOptions: InjectOptions): ComponentType[P] = js.native
  
  object ReactStripeElements {
    
    type ElementChangeResponse = typings.stripeV3.stripe.elements.ElementChangeResponse
    
    @js.native
    trait ElementProps
      extends typings.stripeV3.stripe.elements.ElementsOptions {
      
      var className: js.UndefOr[String] = js.native
      
      var elementRef: js.UndefOr[js.Function1[/* ref */ js.Any, Unit]] = js.native
      
      var id: js.UndefOr[String] = js.native
      
      var onBlur: js.UndefOr[js.Function1[/* event */ ElementChangeResponse, Unit]] = js.native
      
      var onChange: js.UndefOr[js.Function1[/* event */ ElementChangeResponse, Unit]] = js.native
      
      var onFocus: js.UndefOr[js.Function1[/* event */ ElementChangeResponse, Unit]] = js.native
      
      var onReady: js.UndefOr[js.Function1[/* el */ HTMLStripeElement, Unit]] = js.native
    }
    object ElementProps {
      
      @scala.inline
      def apply(): ElementProps = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ElementProps]
      }
      
      @scala.inline
      implicit class ElementPropsMutableBuilder[Self <: ElementProps] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
        
        @scala.inline
        def setElementRef(value: /* ref */ js.Any => Unit): Self = StObject.set(x, "elementRef", js.Any.fromFunction1(value))
        
        @scala.inline
        def setElementRefUndefined: Self = StObject.set(x, "elementRef", js.undefined)
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        @scala.inline
        def setOnBlur(value: /* event */ ElementChangeResponse => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
        
        @scala.inline
        def setOnChange(value: /* event */ ElementChangeResponse => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
        
        @scala.inline
        def setOnFocus(value: /* event */ ElementChangeResponse => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
        
        @scala.inline
        def setOnReady(value: /* el */ HTMLStripeElement => Unit): Self = StObject.set(x, "onReady", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnReadyUndefined: Self = StObject.set(x, "onReady", js.undefined)
      }
    }
    
    type ElementsOptions = typings.stripeV3.stripe.elements.ElementsOptions
    
    type HTMLStripeElement = Element
    
    @js.native
    trait InjectOptions extends StObject {
      
      var withRef: js.UndefOr[Boolean] = js.native
    }
    object InjectOptions {
      
      @scala.inline
      def apply(): InjectOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[InjectOptions]
      }
      
      @scala.inline
      implicit class InjectOptionsMutableBuilder[Self <: InjectOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setWithRef(value: Boolean): Self = StObject.set(x, "withRef", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWithRefUndefined: Self = StObject.set(x, "withRef", js.undefined)
      }
    }
    
    @js.native
    trait InjectedStripeProps extends StObject {
      
      var elements: typings.stripeV3.stripe.elements.Elements | Null = js.native
      
      var stripe: StripeProps | Null = js.native
    }
    object InjectedStripeProps {
      
      @scala.inline
      def apply(): InjectedStripeProps = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[InjectedStripeProps]
      }
      
      @scala.inline
      implicit class InjectedStripePropsMutableBuilder[Self <: InjectedStripeProps] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setElements(value: typings.stripeV3.stripe.elements.Elements): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setElementsNull: Self = StObject.set(x, "elements", null)
        
        @scala.inline
        def setStripe(value: StripeProps): Self = StObject.set(x, "stripe", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStripeNull: Self = StObject.set(x, "stripe", null)
      }
    }
    
    @js.native
    trait PaymentRequestButtonElementProps extends ElementProps {
      
      var onClick: js.UndefOr[js.Function1[/* event */ js.Any, Unit]] = js.native
    }
    object PaymentRequestButtonElementProps {
      
      @scala.inline
      def apply(): PaymentRequestButtonElementProps = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PaymentRequestButtonElementProps]
      }
      
      @scala.inline
      implicit class PaymentRequestButtonElementPropsMutableBuilder[Self <: PaymentRequestButtonElementProps] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setOnClick(value: /* event */ js.Any => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      }
    }
    
    type SourceOptions = typings.stripeV3.stripe.SourceOptions
    
    type SourceResponse = typings.stripeV3.stripe.SourceResponse
    
    @js.native
    trait StripeOverrideProps extends StObject {
      
      def createPaymentMethod(data: PaymentMethodData): js.Promise[PaymentMethodResponse] = js.native
      def createPaymentMethod(paymentMethodType: paymentMethodType): js.Promise[PaymentMethodResponse] = js.native
      def createPaymentMethod(paymentMethodType: paymentMethodType, data: CreatePaymentMethodOptions): js.Promise[PaymentMethodResponse] = js.native
      def createPaymentMethod(paymentMethodType: paymentMethodType, element: HTMLStripeElement): js.Promise[PaymentMethodResponse] = js.native
      def createPaymentMethod(paymentMethodType: paymentMethodType, element: HTMLStripeElement, data: CreatePaymentMethodOptions): js.Promise[PaymentMethodResponse] = js.native
      
      def createSource(): js.Promise[SourceResponse] = js.native
      def createSource(sourceData: SourceOptions): js.Promise[SourceResponse] = js.native
      
      /*
        * react-stripe-elements let's you use the same createToken function
        * with either credit card or bank account options
        * which one to choose depends solely on the inferred elements and can't be expressed in TypeScript
        */
      def createToken(): js.Promise[TokenResponse] = js.native
      def createToken(options: TokenOptions): js.Promise[TokenResponse] = js.native
      def createToken(options: BankAccountTokenOptions): js.Promise[TokenResponse] = js.native
      
      def handleCardPayment(clientSecret: String): js.Promise[PaymentIntentResponse] = js.native
      def handleCardPayment(clientSecret: String, options: HandleCardPaymentWithoutElementsOptions): js.Promise[PaymentIntentResponse] = js.native
      
      def handleCardSetup(clientSecret: String): js.Promise[SetupIntentResponse] = js.native
      def handleCardSetup(clientSecret: String, data: HandleCardSetupOptions): js.Promise[SetupIntentResponse] = js.native
    }
    
    /* Inlined parent std.Omit<stripe-v3.stripe.Stripe, keyof react-stripe-elements.react-stripe-elements.ReactStripeElements.StripeOverrideProps> */
    /* Inlined parent react-stripe-elements.react-stripe-elements.ReactStripeElements.StripeOverrideProps */
    @js.native
    trait StripeProps extends StObject {
      
      var confirmCardPayment: js.Function1[/* clientSecret */ String, js.Promise[PaymentIntentResponse]] = js.native
      
      var confirmCardSetup: js.Function1[/* clientSecret */ String, js.Promise[SetupIntentResponse]] = js.native
      
      var confirmPaymentIntent: js.Function2[/* clientSecret */ String, /* element */ Element, js.Promise[PaymentIntentResponse]] = js.native
      
      var confirmSepaDebitPayment: js.Function1[/* clientSecret */ String, js.Promise[PaymentIntentResponse]] = js.native
      
      var confirmSepaDebitSetup: js.Function1[/* clientSecret */ String, js.Promise[SetupIntentResponse]] = js.native
      
      def createPaymentMethod(data: PaymentMethodData): js.Promise[PaymentMethodResponse] = js.native
      def createPaymentMethod(paymentMethodType: paymentMethodType): js.Promise[PaymentMethodResponse] = js.native
      def createPaymentMethod(paymentMethodType: paymentMethodType, data: CreatePaymentMethodOptions): js.Promise[PaymentMethodResponse] = js.native
      def createPaymentMethod(paymentMethodType: paymentMethodType, element: HTMLStripeElement): js.Promise[PaymentMethodResponse] = js.native
      def createPaymentMethod(paymentMethodType: paymentMethodType, element: HTMLStripeElement, data: CreatePaymentMethodOptions): js.Promise[PaymentMethodResponse] = js.native
      
      def createSource(): js.Promise[SourceResponse] = js.native
      def createSource(sourceData: SourceOptions): js.Promise[SourceResponse] = js.native
      
      /*
        * react-stripe-elements let's you use the same createToken function
        * with either credit card or bank account options
        * which one to choose depends solely on the inferred elements and can't be expressed in TypeScript
        */
      def createToken(): js.Promise[TokenResponse] = js.native
      def createToken(options: TokenOptions): js.Promise[TokenResponse] = js.native
      def createToken(options: BankAccountTokenOptions): js.Promise[TokenResponse] = js.native
      
      var elements: js.Function0[typings.stripeV3.stripe.elements.Elements] = js.native
      
      var handleCardAction: js.Function1[/* clientSecret */ String, js.Promise[PaymentIntentResponse]] = js.native
      
      def handleCardPayment(clientSecret: String): js.Promise[PaymentIntentResponse] = js.native
      def handleCardPayment(clientSecret: String, options: HandleCardPaymentWithoutElementsOptions): js.Promise[PaymentIntentResponse] = js.native
      
      def handleCardSetup(clientSecret: String): js.Promise[SetupIntentResponse] = js.native
      def handleCardSetup(clientSecret: String, data: HandleCardSetupOptions): js.Promise[SetupIntentResponse] = js.native
      
      var paymentRequest: js.Function1[/* options */ StripePaymentRequestOptions, StripePaymentRequest] = js.native
      
      var redirectToCheckout: js.Function1[/* options */ StripeClientCheckoutOptions, js.Promise[StripeRedirectResponse]] = js.native
      
      var retrievePaymentIntent: js.Function1[/* clientSecret */ String, js.Promise[PaymentIntentResponse]] = js.native
      
      var retrieveSetupIntent: js.Function1[/* clientSecret */ String, js.Promise[SetupIntentResponse]] = js.native
      
      var retrieveSource: js.Function1[
            /* options */ RetrieveSourceOptions, 
            js.Promise[typings.stripeV3.stripe.SourceResponse]
          ] = js.native
    }
    
    @js.native
    trait StripeProviderOptions extends StObject {
      
      var stripeAccount: js.UndefOr[String] = js.native
    }
    object StripeProviderOptions {
      
      @scala.inline
      def apply(): StripeProviderOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[StripeProviderOptions]
      }
      
      @scala.inline
      implicit class StripeProviderOptionsMutableBuilder[Self <: StripeProviderOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setStripeAccount(value: String): Self = StObject.set(x, "stripeAccount", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStripeAccountUndefined: Self = StObject.set(x, "stripeAccount", js.undefined)
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.reactStripeElements.anon.apiKeystringstripeneverun
      - typings.reactStripeElements.anon.apiKeyneverundefinedstrip
    */
    trait StripeProviderProps extends StObject
    object StripeProviderProps {
      
      @scala.inline
      def apiKeyneverundefinedstrip(): typings.reactStripeElements.anon.apiKeyneverundefinedstrip = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.reactStripeElements.anon.apiKeyneverundefinedstrip]
      }
      
      @scala.inline
      def apiKeystringstripeneverun(apiKey: String): typings.reactStripeElements.anon.apiKeystringstripeneverun = {
        val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.reactStripeElements.anon.apiKeystringstripeneverun]
      }
    }
    
    /* Inlined stripe-v3.stripe.TokenOptions & {  type :react-stripe-elements.react-stripe-elements.ReactStripeElements.TokenType | undefined} */
    @js.native
    trait TokenOptions extends StObject {
      
      var address_city: js.UndefOr[String] = js.native
      
      var address_country: js.UndefOr[String] = js.native
      
      var address_line1: js.UndefOr[String] = js.native
      
      var address_line2: js.UndefOr[String] = js.native
      
      var address_state: js.UndefOr[String] = js.native
      
      var address_zip: js.UndefOr[String] = js.native
      
      var currency: js.UndefOr[String] = js.native
      
      var name: js.UndefOr[String] = js.native
      
      var `type`: js.UndefOr[TokenType] = js.native
    }
    object TokenOptions {
      
      @scala.inline
      def apply(): TokenOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TokenOptions]
      }
      
      @scala.inline
      implicit class TokenOptionsMutableBuilder[Self <: TokenOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAddress_city(value: String): Self = StObject.set(x, "address_city", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAddress_cityUndefined: Self = StObject.set(x, "address_city", js.undefined)
        
        @scala.inline
        def setAddress_country(value: String): Self = StObject.set(x, "address_country", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAddress_countryUndefined: Self = StObject.set(x, "address_country", js.undefined)
        
        @scala.inline
        def setAddress_line1(value: String): Self = StObject.set(x, "address_line1", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAddress_line1Undefined: Self = StObject.set(x, "address_line1", js.undefined)
        
        @scala.inline
        def setAddress_line2(value: String): Self = StObject.set(x, "address_line2", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAddress_line2Undefined: Self = StObject.set(x, "address_line2", js.undefined)
        
        @scala.inline
        def setAddress_state(value: String): Self = StObject.set(x, "address_state", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAddress_stateUndefined: Self = StObject.set(x, "address_state", js.undefined)
        
        @scala.inline
        def setAddress_zip(value: String): Self = StObject.set(x, "address_zip", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAddress_zipUndefined: Self = StObject.set(x, "address_zip", js.undefined)
        
        @scala.inline
        def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        @scala.inline
        def setType(value: TokenType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    type TokenResponse = typings.stripeV3.stripe.TokenResponse
    
    // From https://stripe.com/docs/stripe-js/reference#element-types
    /* Rewritten from type alias, can be one of: 
      - typings.reactStripeElements.reactStripeElementsStrings.card
      - typings.reactStripeElements.reactStripeElementsStrings.cardNumber
      - typings.reactStripeElements.reactStripeElementsStrings.cardExpiry
      - typings.reactStripeElements.reactStripeElementsStrings.cardCvc
      - typings.reactStripeElements.reactStripeElementsStrings.paymentRequestButton
      - typings.reactStripeElements.reactStripeElementsStrings.iban
      - typings.reactStripeElements.reactStripeElementsStrings.idealBank
    */
    trait TokenType extends StObject
    object TokenType {
      
      @scala.inline
      def card: typings.reactStripeElements.reactStripeElementsStrings.card = "card".asInstanceOf[typings.reactStripeElements.reactStripeElementsStrings.card]
      
      @scala.inline
      def cardCvc: typings.reactStripeElements.reactStripeElementsStrings.cardCvc = "cardCvc".asInstanceOf[typings.reactStripeElements.reactStripeElementsStrings.cardCvc]
      
      @scala.inline
      def cardExpiry: typings.reactStripeElements.reactStripeElementsStrings.cardExpiry = "cardExpiry".asInstanceOf[typings.reactStripeElements.reactStripeElementsStrings.cardExpiry]
      
      @scala.inline
      def cardNumber: typings.reactStripeElements.reactStripeElementsStrings.cardNumber = "cardNumber".asInstanceOf[typings.reactStripeElements.reactStripeElementsStrings.cardNumber]
      
      @scala.inline
      def iban: typings.reactStripeElements.reactStripeElementsStrings.iban = "iban".asInstanceOf[typings.reactStripeElements.reactStripeElementsStrings.iban]
      
      @scala.inline
      def idealBank: typings.reactStripeElements.reactStripeElementsStrings.idealBank = "idealBank".asInstanceOf[typings.reactStripeElements.reactStripeElementsStrings.idealBank]
      
      @scala.inline
      def paymentRequestButton: typings.reactStripeElements.reactStripeElementsStrings.paymentRequestButton = "paymentRequestButton".asInstanceOf[typings.reactStripeElements.reactStripeElementsStrings.paymentRequestButton]
    }
  }
}
