package typings.recurlyRecurlyJs

import typings.recurlyRecurlyJs.anon.Next
import typings.recurlyRecurlyJs.checkoutMod.CheckoutPricingInstance
import typings.recurlyRecurlyJs.emitterMod.Emitter
import typings.recurlyRecurlyJs.subscriptionMod.SubscriptionPricingInstance
import typings.std.VoidFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pricingMod {
  
  @js.native
  trait Pricing extends StObject {
    
    /**
      * @see {@link https://developers.recurly.com/reference/recurly-js/index.html#pricing|Pricing}
      */
    def Checkout(): CheckoutPricingInstance = js.native
    
    /**
      * @see {@link https://developers.recurly.com/reference/recurly-js/index.html#pricing|Pricing}
      */
    def Subscription(): SubscriptionPricingInstance = js.native
  }
  object Pricing {
    
    @scala.inline
    def apply(Checkout: () => CheckoutPricingInstance, Subscription: () => SubscriptionPricingInstance): Pricing = {
      val __obj = js.Dynamic.literal(Checkout = js.Any.fromFunction0(Checkout), Subscription = js.Any.fromFunction0(Subscription))
      __obj.asInstanceOf[Pricing]
    }
    
    @scala.inline
    implicit class PricingMutableBuilder[Self <: Pricing] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheckout(value: () => CheckoutPricingInstance): Self = StObject.set(x, "Checkout", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSubscription(value: () => SubscriptionPricingInstance): Self = StObject.set(x, "Subscription", js.Any.fromFunction0(value))
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
    
    @scala.inline
    def change: typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.change = "change".asInstanceOf[typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.change]
    
    @scala.inline
    def errorDotcoupon: typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.errorDotcoupon = "error.coupon".asInstanceOf[typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.errorDotcoupon]
    
    @scala.inline
    def setDotaddon: typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotaddon = "set.addon".asInstanceOf[typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotaddon]
    
    @scala.inline
    def setDotaddress: typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotaddress = "set.address".asInstanceOf[typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotaddress]
    
    @scala.inline
    def setDotadjustment: typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotadjustment = "set.adjustment".asInstanceOf[typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotadjustment]
    
    @scala.inline
    def setDotcoupon: typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotcoupon = "set.coupon".asInstanceOf[typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotcoupon]
    
    @scala.inline
    def setDotgift_card: typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotgift_card = "set.gift_card".asInstanceOf[typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotgift_card]
    
    @scala.inline
    def setDotplan: typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotplan = "set.plan".asInstanceOf[typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotplan]
    
    @scala.inline
    def setDotshippingAddress: typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotshippingAddress = "set.shippingAddress".asInstanceOf[typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotshippingAddress]
    
    @scala.inline
    def setDotsubscription: typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotsubscription = "set.subscription".asInstanceOf[typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotsubscription]
    
    @scala.inline
    def setDottax: typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDottax = "set.tax".asInstanceOf[typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDottax]
    
    @scala.inline
    def unsetDotcoupon: typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.unsetDotcoupon = "unset.coupon".asInstanceOf[typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.unsetDotcoupon]
    
    @scala.inline
    def unsetDotgift_card: typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.unsetDotgift_card = "unset.gift_card".asInstanceOf[typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.unsetDotgift_card]
  }
  
  @js.native
  trait PricingInstance[PricingPromise] extends Emitter[PricingEvent] {
    
    def remove(opts: js.Any, done: VoidFunction): PricingPromise = js.native
    
    def reprice(done: VoidFunction): PricingPromise = js.native
    
    def reset(): Unit = js.native
    @JSName("reset")
    var reset_Original: VoidFunction = js.native
  }
  
  @js.native
  trait Tax extends StObject {
    
    var amounts: js.UndefOr[Next] = js.native
    
    var tax_code: String = js.native
    
    var vat_number: js.UndefOr[String] = js.native
  }
  object Tax {
    
    @scala.inline
    def apply(tax_code: String): Tax = {
      val __obj = js.Dynamic.literal(tax_code = tax_code.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tax]
    }
    
    @scala.inline
    implicit class TaxMutableBuilder[Self <: Tax] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmounts(value: Next): Self = StObject.set(x, "amounts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmountsUndefined: Self = StObject.set(x, "amounts", js.undefined)
      
      @scala.inline
      def setTax_code(value: String): Self = StObject.set(x, "tax_code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVat_number(value: String): Self = StObject.set(x, "vat_number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVat_numberUndefined: Self = StObject.set(x, "vat_number", js.undefined)
    }
  }
}
