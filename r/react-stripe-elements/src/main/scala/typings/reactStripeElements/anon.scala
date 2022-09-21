package typings.reactStripeElements

import typings.react.mod.ReactNode
import typings.reactStripeElements.mod.ReactStripeElements.StripeProviderProps
import typings.stripeV3.stripe.Stripe
import typings.stripeV3.stripe.elements.Font
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined stripe-v3.stripe.elements.ElementsCreateOptions & {  children :react.react.ReactNode | undefined} */
  trait ElementsCreateOptionschil extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var fonts: js.UndefOr[js.Array[Font]] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
  }
  object ElementsCreateOptionschil {
    
    inline def apply(): ElementsCreateOptionschil = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ElementsCreateOptionschil]
    }
    
    extension [Self <: ElementsCreateOptionschil](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setFonts(value: js.Array[Font]): Self = StObject.set(x, "fonts", value.asInstanceOf[js.Any])
      
      inline def setFontsUndefined: Self = StObject.set(x, "fonts", js.undefined)
      
      inline def setFontsVarargs(value: Font*): Self = StObject.set(x, "fonts", js.Array(value*))
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    }
  }
  
  /* Inlined {  children :react.react.ReactNode | undefined,   apiKey :string,   stripe :never | undefined} & react-stripe-elements.react-stripe-elements.ReactStripeElements.StripeProviderOptions */
  trait childrenReactNodeundefine
    extends StObject
       with StripeProviderProps {
    
    var apiKey: String
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var stripe: js.UndefOr[scala.Nothing] = js.undefined
    
    var stripeAccount: js.UndefOr[String] = js.undefined
  }
  object childrenReactNodeundefine {
    
    inline def apply(apiKey: String): childrenReactNodeundefine = {
      val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[childrenReactNodeundefine]
    }
    
    extension [Self <: childrenReactNodeundefine](x: Self) {
      
      inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setStripeAccount(value: String): Self = StObject.set(x, "stripeAccount", value.asInstanceOf[js.Any])
      
      inline def setStripeAccountUndefined: Self = StObject.set(x, "stripeAccount", js.undefined)
    }
  }
  
  /* Inlined {  children :react.react.ReactNode | undefined,   apiKey :never | undefined,   stripe :stripe-v3.stripe.Stripe | null} & react-stripe-elements.react-stripe-elements.ReactStripeElements.StripeProviderOptions */
  trait childrenReactNodeundefineApiKey
    extends StObject
       with StripeProviderProps {
    
    var apiKey: js.UndefOr[scala.Nothing] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var stripe: Stripe | Null
    
    var stripeAccount: js.UndefOr[String] = js.undefined
  }
  object childrenReactNodeundefineApiKey {
    
    inline def apply(): childrenReactNodeundefineApiKey = {
      val __obj = js.Dynamic.literal(stripe = null)
      __obj.asInstanceOf[childrenReactNodeundefineApiKey]
    }
    
    extension [Self <: childrenReactNodeundefineApiKey](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setStripe(value: Stripe): Self = StObject.set(x, "stripe", value.asInstanceOf[js.Any])
      
      inline def setStripeAccount(value: String): Self = StObject.set(x, "stripeAccount", value.asInstanceOf[js.Any])
      
      inline def setStripeAccountUndefined: Self = StObject.set(x, "stripeAccount", js.undefined)
      
      inline def setStripeNull: Self = StObject.set(x, "stripe", null)
    }
  }
}
