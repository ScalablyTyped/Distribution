package typings.reactCreditCards

import typings.react.mod.Component
import typings.reactCreditCards.anon.Name
import typings.reactCreditCards.anon.Valid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-credit-cards", JSImport.Default)
  @js.native
  class default ()
    extends Component[ReactCreditCardProps, scala.Nothing, js.Any]
  
  @js.native
  trait CallbackArgument extends StObject {
    
    var issuer: String = js.native
    
    var maxLength: Double = js.native
  }
  object CallbackArgument {
    
    @scala.inline
    def apply(issuer: String, maxLength: Double): CallbackArgument = {
      val __obj = js.Dynamic.literal(issuer = issuer.asInstanceOf[js.Any], maxLength = maxLength.asInstanceOf[js.Any])
      __obj.asInstanceOf[CallbackArgument]
    }
    
    @scala.inline
    implicit class CallbackArgumentMutableBuilder[Self <: CallbackArgument] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactCreditCards.reactCreditCardsStrings.name
    - typings.reactCreditCards.reactCreditCardsStrings.number
    - typings.reactCreditCards.reactCreditCardsStrings.expiry
    - typings.reactCreditCards.reactCreditCardsStrings.cvc
  */
  trait Focused extends StObject
  object Focused {
    
    @scala.inline
    def cvc: typings.reactCreditCards.reactCreditCardsStrings.cvc = "cvc".asInstanceOf[typings.reactCreditCards.reactCreditCardsStrings.cvc]
    
    @scala.inline
    def expiry: typings.reactCreditCards.reactCreditCardsStrings.expiry = "expiry".asInstanceOf[typings.reactCreditCards.reactCreditCardsStrings.expiry]
    
    @scala.inline
    def name: typings.reactCreditCards.reactCreditCardsStrings.name = "name".asInstanceOf[typings.reactCreditCards.reactCreditCardsStrings.name]
    
    @scala.inline
    def number: typings.reactCreditCards.reactCreditCardsStrings.number = "number".asInstanceOf[typings.reactCreditCards.reactCreditCardsStrings.number]
  }
  
  type ReactCreditCard = Component[ReactCreditCardProps, scala.Nothing, js.Any]
  
  @js.native
  trait ReactCreditCardProps extends StObject {
    
    var acceptedCards: js.UndefOr[js.Array[String]] = js.native
    
    var callback: js.UndefOr[js.Function2[/* type */ CallbackArgument, /* isValid */ Boolean, Unit]] = js.native
    
    var cvc: String | Double = js.native
    
    var expiry: String | Double = js.native
    
    var focused: js.UndefOr[Focused] = js.native
    
    var issuer: js.UndefOr[String] = js.native
    
    var locale: js.UndefOr[Valid] = js.native
    
    var name: String = js.native
    
    var number: String | Double = js.native
    
    var placeholders: js.UndefOr[Name] = js.native
    
    var preview: js.UndefOr[Boolean] = js.native
  }
  object ReactCreditCardProps {
    
    @scala.inline
    def apply(cvc: String | Double, expiry: String | Double, name: String, number: String | Double): ReactCreditCardProps = {
      val __obj = js.Dynamic.literal(cvc = cvc.asInstanceOf[js.Any], expiry = expiry.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactCreditCardProps]
    }
    
    @scala.inline
    implicit class ReactCreditCardPropsMutableBuilder[Self <: ReactCreditCardProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAcceptedCards(value: js.Array[String]): Self = StObject.set(x, "acceptedCards", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcceptedCardsUndefined: Self = StObject.set(x, "acceptedCards", js.undefined)
      
      @scala.inline
      def setAcceptedCardsVarargs(value: String*): Self = StObject.set(x, "acceptedCards", js.Array(value :_*))
      
      @scala.inline
      def setCallback(value: (/* type */ CallbackArgument, /* isValid */ Boolean) => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def setCvc(value: String | Double): Self = StObject.set(x, "cvc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpiry(value: String | Double): Self = StObject.set(x, "expiry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocused(value: Focused): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusedUndefined: Self = StObject.set(x, "focused", js.undefined)
      
      @scala.inline
      def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
      
      @scala.inline
      def setLocale(value: Valid): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumber(value: String | Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholders(value: Name): Self = StObject.set(x, "placeholders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholdersUndefined: Self = StObject.set(x, "placeholders", js.undefined)
      
      @scala.inline
      def setPreview(value: Boolean): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewUndefined: Self = StObject.set(x, "preview", js.undefined)
    }
  }
}
