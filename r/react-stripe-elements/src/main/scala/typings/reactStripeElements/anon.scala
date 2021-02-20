package typings.reactStripeElements

import typings.reactStripeElements.mod.ReactStripeElements.StripeProviderProps
import typings.stripeV3.stripe.Stripe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined {  apiKey :never | undefined,   stripe :stripe-v3.stripe.Stripe | null} & react-stripe-elements.react-stripe-elements.ReactStripeElements.StripeProviderOptions */
  @js.native
  trait apiKeyneverundefinedstrip extends StripeProviderProps {
    
    var apiKey: js.UndefOr[scala.Nothing] = js.native
    
    var stripe: Stripe | Null = js.native
    
    var stripeAccount: js.UndefOr[String] = js.native
  }
  object apiKeyneverundefinedstrip {
    
    @scala.inline
    def apply(): apiKeyneverundefinedstrip = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[apiKeyneverundefinedstrip]
    }
    
    @scala.inline
    implicit class apiKeyneverundefinedstripMutableBuilder[Self <: apiKeyneverundefinedstrip] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStripe(value: Stripe): Self = StObject.set(x, "stripe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStripeAccount(value: String): Self = StObject.set(x, "stripeAccount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStripeAccountUndefined: Self = StObject.set(x, "stripeAccount", js.undefined)
      
      @scala.inline
      def setStripeNull: Self = StObject.set(x, "stripe", null)
    }
  }
  
  /* Inlined {  apiKey :string,   stripe :never | undefined} & react-stripe-elements.react-stripe-elements.ReactStripeElements.StripeProviderOptions */
  @js.native
  trait apiKeystringstripeneverun extends StripeProviderProps {
    
    var apiKey: String = js.native
    
    var stripe: js.UndefOr[scala.Nothing] = js.native
    
    var stripeAccount: js.UndefOr[String] = js.native
  }
  object apiKeystringstripeneverun {
    
    @scala.inline
    def apply(apiKey: String): apiKeystringstripeneverun = {
      val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[apiKeystringstripeneverun]
    }
    
    @scala.inline
    implicit class apiKeystringstripeneverunMutableBuilder[Self <: apiKeystringstripeneverun] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStripeAccount(value: String): Self = StObject.set(x, "stripeAccount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStripeAccountUndefined: Self = StObject.set(x, "stripeAccount", js.undefined)
    }
  }
}
