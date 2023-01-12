package typings.recurlyRecurlyJs

import typings.recurlyRecurlyJs.anon.Next
import typings.recurlyRecurlyJs.libEmitterMod.Emitter
import typings.recurlyRecurlyJs.libPricingCheckoutMod.CheckoutPricingInstance
import typings.recurlyRecurlyJs.libPricingSubscriptionMod.SubscriptionPricingInstance
import typings.std.VoidFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPricingMod {
  
  trait Pricing extends StObject {
    
    /**
      * @see {@link https://developers.recurly.com/reference/recurly-js/index.html#pricing|Pricing}
      */
    def Checkout(): CheckoutPricingInstance
    
    /**
      * @see {@link https://developers.recurly.com/reference/recurly-js/index.html#pricing|Pricing}
      */
    def Subscription(): SubscriptionPricingInstance
  }
  object Pricing {
    
    inline def apply(Checkout: () => CheckoutPricingInstance, Subscription: () => SubscriptionPricingInstance): Pricing = {
      val __obj = js.Dynamic.literal(Checkout = js.Any.fromFunction0(Checkout), Subscription = js.Any.fromFunction0(Subscription))
      __obj.asInstanceOf[Pricing]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Pricing] (val x: Self) extends AnyVal {
      
      inline def setCheckout(value: () => CheckoutPricingInstance): Self = StObject.set(x, "Checkout", js.Any.fromFunction0(value))
      
      inline def setSubscription(value: () => SubscriptionPricingInstance): Self = StObject.set(x, "Subscription", js.Any.fromFunction0(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.change
    - typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotsubscription
    - typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotplan
    - typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotaddon
    - typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotadjustment
    - typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotaddress
    - typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotshippingAddress
    - typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDottax
    - typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotcoupon
    - typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.unsetDotcoupon
    - typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.errorDotcoupon
    - typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotgift_card
    - typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.unsetDotgift_card
  */
  trait PricingEvent extends StObject
  object PricingEvent {
    
    inline def change: typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.change = "change".asInstanceOf[typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.change]
    
    inline def errorDotcoupon: typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.errorDotcoupon = "error.coupon".asInstanceOf[typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.errorDotcoupon]
    
    inline def setDotaddon: typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotaddon = "set.addon".asInstanceOf[typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotaddon]
    
    inline def setDotaddress: typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotaddress = "set.address".asInstanceOf[typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotaddress]
    
    inline def setDotadjustment: typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotadjustment = "set.adjustment".asInstanceOf[typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotadjustment]
    
    inline def setDotcoupon: typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotcoupon = "set.coupon".asInstanceOf[typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotcoupon]
    
    inline def setDotgift_card: typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotgift_card = "set.gift_card".asInstanceOf[typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotgift_card]
    
    inline def setDotplan: typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotplan = "set.plan".asInstanceOf[typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotplan]
    
    inline def setDotshippingAddress: typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotshippingAddress = "set.shippingAddress".asInstanceOf[typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotshippingAddress]
    
    inline def setDotsubscription: typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotsubscription = "set.subscription".asInstanceOf[typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotsubscription]
    
    inline def setDottax: typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDottax = "set.tax".asInstanceOf[typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDottax]
    
    inline def unsetDotcoupon: typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.unsetDotcoupon = "unset.coupon".asInstanceOf[typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.unsetDotcoupon]
    
    inline def unsetDotgift_card: typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.unsetDotgift_card = "unset.gift_card".asInstanceOf[typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.unsetDotgift_card]
  }
  
  @js.native
  trait PricingInstance[PricingPromise]
    extends StObject
       with Emitter[PricingEvent] {
    
    def remove(opts: Any, done: VoidFunction): PricingPromise = js.native
    
    def reprice(done: VoidFunction): PricingPromise = js.native
    
    def reset(): Unit = js.native
    @JSName("reset")
    var reset_Original: VoidFunction = js.native
  }
  
  trait Tax extends StObject {
    
    var amounts: js.UndefOr[Next] = js.undefined
    
    var tax_code: String
    
    var vat_number: js.UndefOr[String] = js.undefined
  }
  object Tax {
    
    inline def apply(tax_code: String): Tax = {
      val __obj = js.Dynamic.literal(tax_code = tax_code.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tax]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Tax] (val x: Self) extends AnyVal {
      
      inline def setAmounts(value: Next): Self = StObject.set(x, "amounts", value.asInstanceOf[js.Any])
      
      inline def setAmountsUndefined: Self = StObject.set(x, "amounts", js.undefined)
      
      inline def setTax_code(value: String): Self = StObject.set(x, "tax_code", value.asInstanceOf[js.Any])
      
      inline def setVat_number(value: String): Self = StObject.set(x, "vat_number", value.asInstanceOf[js.Any])
      
      inline def setVat_numberUndefined: Self = StObject.set(x, "vat_number", js.undefined)
    }
  }
}
