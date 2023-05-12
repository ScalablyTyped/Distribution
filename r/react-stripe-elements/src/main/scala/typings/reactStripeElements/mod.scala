package typings.reactStripeElements

import typings.react.mod.Component
import typings.react.mod.ComponentType
import typings.reactStripeElements.anon.ElementsCreateOptionschil
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
import typings.stripeV3.stripe.VerificationSessionResult
import typings.stripeV3.stripe.elements.Element
import typings.stripeV3.stripe.paymentMethod.paymentMethodType
import typings.stripeV3.stripe.paymentRequest.StripePaymentRequest
import typings.stripeV3.stripe.paymentRequest.StripePaymentRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-stripe-elements", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-stripe-elements", "CardCVCElement")
  @js.native
  open class CardCVCElement_ protected () extends CardCvcElement {
    def this(props: ElementProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: ElementProps, context: Any) = this()
  }
  
  @JSImport("react-stripe-elements", "CardCvcElement")
  @js.native
  open class CardCvcElement protected ()
    extends Component[ElementProps, js.Object, Any] {
    def this(props: ElementProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: ElementProps, context: Any) = this()
  }
  
  @JSImport("react-stripe-elements", "CardElement")
  @js.native
  open class CardElement protected ()
    extends Component[ElementProps, js.Object, Any] {
    def this(props: ElementProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: ElementProps, context: Any) = this()
  }
  
  @JSImport("react-stripe-elements", "CardExpiryElement")
  @js.native
  open class CardExpiryElement protected ()
    extends Component[ElementProps, js.Object, Any] {
    def this(props: ElementProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: ElementProps, context: Any) = this()
  }
  
  @JSImport("react-stripe-elements", "CardNumberElement")
  @js.native
  open class CardNumberElement protected ()
    extends Component[ElementProps, js.Object, Any] {
    def this(props: ElementProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: ElementProps, context: Any) = this()
  }
  
  @JSImport("react-stripe-elements", "Elements")
  @js.native
  open class Elements protected ()
    extends Component[ElementsCreateOptionschil, js.Object, Any] {
    def this(props: ElementsCreateOptionschil) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: ElementsCreateOptionschil, context: Any) = this()
  }
  
  @JSImport("react-stripe-elements", "IbanElement")
  @js.native
  open class IbanElement protected ()
    extends Component[ElementProps, js.Object, Any] {
    def this(props: ElementProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: ElementProps, context: Any) = this()
  }
  
  @JSImport("react-stripe-elements", "IdealBankElement")
  @js.native
  open class IdealBankElement protected ()
    extends Component[ElementProps, js.Object, Any] {
    def this(props: ElementProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: ElementProps, context: Any) = this()
  }
  
  @JSImport("react-stripe-elements", "PaymentRequestButtonElement")
  @js.native
  open class PaymentRequestButtonElement protected ()
    extends Component[PaymentRequestButtonElementProps, js.Object, Any] {
    def this(props: PaymentRequestButtonElementProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: PaymentRequestButtonElementProps, context: Any) = this()
  }
  
  @JSImport("react-stripe-elements", "PostalCodeElement")
  @js.native
  open class PostalCodeElement protected ()
    extends Component[ElementProps, js.Object, Any] {
    def this(props: ElementProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: ElementProps, context: Any) = this()
  }
  
  @JSImport("react-stripe-elements", "StripeProvider")
  @js.native
  open class StripeProvider protected ()
    extends Component[StripeProviderProps, js.Object, Any] {
    def this(props: StripeProviderProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: StripeProviderProps, context: Any) = this()
  }
  
  inline def injectStripe[P /* <: js.Object */](WrappedComponent: ComponentType[P & InjectedStripeProps]): ComponentType[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("injectStripe")(WrappedComponent.asInstanceOf[js.Any]).asInstanceOf[ComponentType[P]]
  inline def injectStripe[P /* <: js.Object */](WrappedComponent: ComponentType[P & InjectedStripeProps], componentOptions: InjectOptions): ComponentType[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("injectStripe")(WrappedComponent.asInstanceOf[js.Any], componentOptions.asInstanceOf[js.Any])).asInstanceOf[ComponentType[P]]
  
  object ReactStripeElements {
    
    type ElementChangeResponse = typings.stripeV3.stripe.elements.ElementChangeResponse
    
    trait ElementProps
      extends StObject
         with typings.stripeV3.stripe.elements.ElementsOptions {
      
      var className: js.UndefOr[String] = js.undefined
      
      var elementRef: js.UndefOr[js.Function1[/* ref */ Any, Unit]] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var onBlur: js.UndefOr[js.Function1[/* event */ ElementChangeResponse, Unit]] = js.undefined
      
      var onChange: js.UndefOr[js.Function1[/* event */ ElementChangeResponse, Unit]] = js.undefined
      
      var onFocus: js.UndefOr[js.Function1[/* event */ ElementChangeResponse, Unit]] = js.undefined
      
      var onReady: js.UndefOr[js.Function1[/* el */ HTMLStripeElement, Unit]] = js.undefined
    }
    object ElementProps {
      
      inline def apply(): ElementProps = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ElementProps]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ElementProps] (val x: Self) extends AnyVal {
        
        inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
        
        inline def setElementRef(value: /* ref */ Any => Unit): Self = StObject.set(x, "elementRef", js.Any.fromFunction1(value))
        
        inline def setElementRefUndefined: Self = StObject.set(x, "elementRef", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setOnBlur(value: /* event */ ElementChangeResponse => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
        
        inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
        
        inline def setOnChange(value: /* event */ ElementChangeResponse => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
        
        inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
        
        inline def setOnFocus(value: /* event */ ElementChangeResponse => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
        
        inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
        
        inline def setOnReady(value: /* el */ HTMLStripeElement => Unit): Self = StObject.set(x, "onReady", js.Any.fromFunction1(value))
        
        inline def setOnReadyUndefined: Self = StObject.set(x, "onReady", js.undefined)
      }
    }
    
    type ElementsOptions = typings.stripeV3.stripe.elements.ElementsOptions
    
    type HTMLStripeElement = Element
    
    trait InjectOptions extends StObject {
      
      var withRef: js.UndefOr[Boolean] = js.undefined
    }
    object InjectOptions {
      
      inline def apply(): InjectOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[InjectOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: InjectOptions] (val x: Self) extends AnyVal {
        
        inline def setWithRef(value: Boolean): Self = StObject.set(x, "withRef", value.asInstanceOf[js.Any])
        
        inline def setWithRefUndefined: Self = StObject.set(x, "withRef", js.undefined)
      }
    }
    
    trait InjectedStripeProps extends StObject {
      
      var elements: typings.stripeV3.stripe.elements.Elements | Null
      
      var stripe: StripeProps | Null
    }
    object InjectedStripeProps {
      
      inline def apply(): InjectedStripeProps = {
        val __obj = js.Dynamic.literal(elements = null, stripe = null)
        __obj.asInstanceOf[InjectedStripeProps]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: InjectedStripeProps] (val x: Self) extends AnyVal {
        
        inline def setElements(value: typings.stripeV3.stripe.elements.Elements): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
        
        inline def setElementsNull: Self = StObject.set(x, "elements", null)
        
        inline def setStripe(value: StripeProps): Self = StObject.set(x, "stripe", value.asInstanceOf[js.Any])
        
        inline def setStripeNull: Self = StObject.set(x, "stripe", null)
      }
    }
    
    trait PaymentRequestButtonElementProps
      extends StObject
         with ElementProps {
      
      var onClick: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
    }
    object PaymentRequestButtonElementProps {
      
      inline def apply(): PaymentRequestButtonElementProps = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PaymentRequestButtonElementProps]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: PaymentRequestButtonElementProps] (val x: Self) extends AnyVal {
        
        inline def setOnClick(value: /* event */ Any => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
        
        inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
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
      
      var confirmAuBecsDebitPayment: js.Function1[/* clientSecret */ String, js.Promise[PaymentIntentResponse]] = js.native
      
      var confirmCardPayment: js.Function1[/* clientSecret */ String, js.Promise[PaymentIntentResponse]] = js.native
      
      var confirmCardSetup: js.Function1[/* clientSecret */ String, js.Promise[SetupIntentResponse]] = js.native
      
      var confirmPaymentIntent: js.Function2[/* clientSecret */ String, /* element */ Element, js.Promise[PaymentIntentResponse]] = js.native
      
      var confirmSepaDebitPayment: js.Function1[/* clientSecret */ String, js.Promise[PaymentIntentResponse]] = js.native
      
      var confirmSepaDebitSetup: js.Function1[/* clientSecret */ String, js.Promise[SetupIntentResponse]] = js.native
      
      var confirmSofortPayment: js.Function1[/* clientSecret */ String, js.Promise[PaymentIntentResponse]] = js.native
      
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
      
      var verifyIdentity: js.Function1[/* clientSecret */ String, js.Promise[VerificationSessionResult]] = js.native
    }
    
    trait StripeProviderOptions extends StObject {
      
      var stripeAccount: js.UndefOr[String] = js.undefined
    }
    object StripeProviderOptions {
      
      inline def apply(): StripeProviderOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[StripeProviderOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: StripeProviderOptions] (val x: Self) extends AnyVal {
        
        inline def setStripeAccount(value: String): Self = StObject.set(x, "stripeAccount", value.asInstanceOf[js.Any])
        
        inline def setStripeAccountUndefined: Self = StObject.set(x, "stripeAccount", js.undefined)
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.reactStripeElements.anon.childrenReactNodeundefine
      - typings.reactStripeElements.anon.childrenReactNodeundefineApiKey
    */
    trait StripeProviderProps extends StObject
    object StripeProviderProps {
      
      inline def childrenReactNodeundefine(apiKey: String): typings.reactStripeElements.anon.childrenReactNodeundefine = {
        val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.reactStripeElements.anon.childrenReactNodeundefine]
      }
      
      inline def childrenReactNodeundefineApiKey(): typings.reactStripeElements.anon.childrenReactNodeundefineApiKey = {
        val __obj = js.Dynamic.literal(stripe = null)
        __obj.asInstanceOf[typings.reactStripeElements.anon.childrenReactNodeundefineApiKey]
      }
    }
    
    trait TokenOptions
      extends StObject
         with typings.stripeV3.stripe.TokenOptions {
      
      var `type`: js.UndefOr[TokenType] = js.undefined
    }
    object TokenOptions {
      
      inline def apply(): TokenOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TokenOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: TokenOptions] (val x: Self) extends AnyVal {
        
        inline def setType(value: TokenType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
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
      
      inline def card: typings.reactStripeElements.reactStripeElementsStrings.card = "card".asInstanceOf[typings.reactStripeElements.reactStripeElementsStrings.card]
      
      inline def cardCvc: typings.reactStripeElements.reactStripeElementsStrings.cardCvc = "cardCvc".asInstanceOf[typings.reactStripeElements.reactStripeElementsStrings.cardCvc]
      
      inline def cardExpiry: typings.reactStripeElements.reactStripeElementsStrings.cardExpiry = "cardExpiry".asInstanceOf[typings.reactStripeElements.reactStripeElementsStrings.cardExpiry]
      
      inline def cardNumber: typings.reactStripeElements.reactStripeElementsStrings.cardNumber = "cardNumber".asInstanceOf[typings.reactStripeElements.reactStripeElementsStrings.cardNumber]
      
      inline def iban: typings.reactStripeElements.reactStripeElementsStrings.iban = "iban".asInstanceOf[typings.reactStripeElements.reactStripeElementsStrings.iban]
      
      inline def idealBank: typings.reactStripeElements.reactStripeElementsStrings.idealBank = "idealBank".asInstanceOf[typings.reactStripeElements.reactStripeElementsStrings.idealBank]
      
      inline def paymentRequestButton: typings.reactStripeElements.reactStripeElementsStrings.paymentRequestButton = "paymentRequestButton".asInstanceOf[typings.reactStripeElements.reactStripeElementsStrings.paymentRequestButton]
    }
  }
}
