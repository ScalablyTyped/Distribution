package typings.reactStripeElements

import typings.reactStripeElements.mod.ReactStripeElements.StripeProviderProps
import typings.stripeV3.stripe.Stripe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined {  apiKey :never | undefined,   stripe :stripe-v3.stripe.Stripe | null} & react-stripe-elements.react-stripe-elements.ReactStripeElements.StripeProviderOptions */
  trait apiKeyneverundefinedstrip
    extends StObject
       with StripeProviderProps {
    
    var apiKey: js.UndefOr[scala.Nothing] = js.undefined
    
    var stripe: Stripe | Null
    
    var stripeAccount: js.UndefOr[String] = js.undefined
  }
  object apiKeyneverundefinedstrip {
    
    inline def apply(): apiKeyneverundefinedstrip = {
      val __obj = js.Dynamic.literal(stripe = null)
      __obj.asInstanceOf[apiKeyneverundefinedstrip]
    }
    
    extension [Self <: apiKeyneverundefinedstrip](x: Self) {
      
      inline def setStripe(value: Stripe): Self = StObject.set(x, "stripe", value.asInstanceOf[js.Any])
      
      inline def setStripeAccount(value: String): Self = StObject.set(x, "stripeAccount", value.asInstanceOf[js.Any])
      
      inline def setStripeAccountUndefined: Self = StObject.set(x, "stripeAccount", js.undefined)
      
      inline def setStripeNull: Self = StObject.set(x, "stripe", null)
    }
  }
  
  /* Inlined {  apiKey :string,   stripe :never | undefined} & react-stripe-elements.react-stripe-elements.ReactStripeElements.StripeProviderOptions */
  trait apiKeystringstripeneverun
    extends StObject
       with StripeProviderProps {
    
    var apiKey: String
    
    var stripe: js.UndefOr[scala.Nothing] = js.undefined
    
    var stripeAccount: js.UndefOr[String] = js.undefined
  }
  object apiKeystringstripeneverun {
    
    inline def apply(apiKey: String): apiKeystringstripeneverun = {
      val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[apiKeystringstripeneverun]
    }
    
    extension [Self <: apiKeystringstripeneverun](x: Self) {
      
      inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      inline def setStripeAccount(value: String): Self = StObject.set(x, "stripeAccount", value.asInstanceOf[js.Any])
      
      inline def setStripeAccountUndefined: Self = StObject.set(x, "stripeAccount", js.undefined)
    }
  }
}
