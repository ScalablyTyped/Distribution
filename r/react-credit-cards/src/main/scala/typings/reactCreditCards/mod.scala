package typings.reactCreditCards

import typings.react.mod.Component
import typings.reactCreditCards.anon.Name
import typings.reactCreditCards.anon.Valid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-credit-cards", JSImport.Default)
  @js.native
  open class default ()
    extends Component[ReactCreditCardProps, scala.Nothing, Any]
  
  trait CallbackArgument extends StObject {
    
    var issuer: String
    
    var maxLength: Double
  }
  object CallbackArgument {
    
    inline def apply(issuer: String, maxLength: Double): CallbackArgument = {
      val __obj = js.Dynamic.literal(issuer = issuer.asInstanceOf[js.Any], maxLength = maxLength.asInstanceOf[js.Any])
      __obj.asInstanceOf[CallbackArgument]
    }
    
    extension [Self <: CallbackArgument](x: Self) {
      
      inline def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
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
    
    inline def cvc: typings.reactCreditCards.reactCreditCardsStrings.cvc = "cvc".asInstanceOf[typings.reactCreditCards.reactCreditCardsStrings.cvc]
    
    inline def expiry: typings.reactCreditCards.reactCreditCardsStrings.expiry = "expiry".asInstanceOf[typings.reactCreditCards.reactCreditCardsStrings.expiry]
    
    inline def name: typings.reactCreditCards.reactCreditCardsStrings.name = "name".asInstanceOf[typings.reactCreditCards.reactCreditCardsStrings.name]
    
    inline def number: typings.reactCreditCards.reactCreditCardsStrings.number = "number".asInstanceOf[typings.reactCreditCards.reactCreditCardsStrings.number]
  }
  
  type ReactCreditCard = Component[ReactCreditCardProps, scala.Nothing, Any]
  
  trait ReactCreditCardProps extends StObject {
    
    var acceptedCards: js.UndefOr[js.Array[String]] = js.undefined
    
    var callback: js.UndefOr[js.Function2[/* type */ CallbackArgument, /* isValid */ Boolean, Unit]] = js.undefined
    
    var cvc: String | Double
    
    var expiry: String | Double
    
    var focused: js.UndefOr[Focused] = js.undefined
    
    var issuer: js.UndefOr[String] = js.undefined
    
    var locale: js.UndefOr[Valid] = js.undefined
    
    var name: String
    
    var number: String | Double
    
    var placeholders: js.UndefOr[Name] = js.undefined
    
    var preview: js.UndefOr[Boolean] = js.undefined
  }
  object ReactCreditCardProps {
    
    inline def apply(cvc: String | Double, expiry: String | Double, name: String, number: String | Double): ReactCreditCardProps = {
      val __obj = js.Dynamic.literal(cvc = cvc.asInstanceOf[js.Any], expiry = expiry.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactCreditCardProps]
    }
    
    extension [Self <: ReactCreditCardProps](x: Self) {
      
      inline def setAcceptedCards(value: js.Array[String]): Self = StObject.set(x, "acceptedCards", value.asInstanceOf[js.Any])
      
      inline def setAcceptedCardsUndefined: Self = StObject.set(x, "acceptedCards", js.undefined)
      
      inline def setAcceptedCardsVarargs(value: String*): Self = StObject.set(x, "acceptedCards", js.Array(value*))
      
      inline def setCallback(value: (/* type */ CallbackArgument, /* isValid */ Boolean) => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setCvc(value: String | Double): Self = StObject.set(x, "cvc", value.asInstanceOf[js.Any])
      
      inline def setExpiry(value: String | Double): Self = StObject.set(x, "expiry", value.asInstanceOf[js.Any])
      
      inline def setFocused(value: Focused): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      inline def setFocusedUndefined: Self = StObject.set(x, "focused", js.undefined)
      
      inline def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
      
      inline def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
      
      inline def setLocale(value: Valid): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNumber(value: String | Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setPlaceholders(value: Name): Self = StObject.set(x, "placeholders", value.asInstanceOf[js.Any])
      
      inline def setPlaceholdersUndefined: Self = StObject.set(x, "placeholders", js.undefined)
      
      inline def setPreview(value: Boolean): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
      
      inline def setPreviewUndefined: Self = StObject.set(x, "preview", js.undefined)
    }
  }
}
