package typings.recurlyRecurlyJs

import typings.recurlyRecurlyJs.addressMod.Address
import typings.recurlyRecurlyJs.anon.Base
import typings.recurlyRecurlyJs.pricingMod.PricingInstance
import typings.recurlyRecurlyJs.pricingMod.Tax
import typings.recurlyRecurlyJs.promiseMod.PricingPromise
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subscriptionMod {
  
  trait AddonOptions extends StObject {
    
    var quantity: js.UndefOr[Double] = js.undefined
  }
  object AddonOptions {
    
    inline def apply(): AddonOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddonOptions]
    }
    
    extension [Self <: AddonOptions](x: Self) {
      
      inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
      
      inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    }
  }
  
  trait PlanOptions extends StObject {
    
    var quantity: js.UndefOr[Double] = js.undefined
  }
  object PlanOptions {
    
    inline def apply(): PlanOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PlanOptions]
    }
    
    extension [Self <: PlanOptions](x: Self) {
      
      inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
      
      inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    }
  }
  
  type SubscriptionPricing = js.Function0[SubscriptionPricingInstance]
  
  @js.native
  trait SubscriptionPricingInstance
    extends StObject
       with SubscriptionPricingMethods
       with PricingInstance[SubscriptionPricingPromise] {
    
    def attach(element: String): Unit = js.native
    def attach(element: HTMLElement): Unit = js.native
  }
  
  @js.native
  trait SubscriptionPricingMethods extends StObject {
    
    def addon(addonCode: String): SubscriptionPricingPromise = js.native
    def addon(addonCode: String, addonOptions: AddonOptions): SubscriptionPricingPromise = js.native
    
    def address(address: Address): SubscriptionPricingPromise = js.native
    
    def coupon(coupon: String): SubscriptionPricingPromise = js.native
    
    def currency(currency: String): SubscriptionPricingPromise = js.native
    
    def giftcard(giftcard: String): SubscriptionPricingPromise = js.native
    
    def plan(plan: String): SubscriptionPricingPromise = js.native
    def plan(plan: String, planOptions: PlanOptions): SubscriptionPricingPromise = js.native
    
    def shippingAddress(address: Address): SubscriptionPricingPromise = js.native
    
    def tax(tax: Tax): SubscriptionPricingPromise = js.native
  }
  
  @js.native
  trait SubscriptionPricingPromise
    extends StObject
       with SubscriptionPricingInstance
       with PricingPromise[SubscriptionPricingState, SubscriptionPricingMethods]
  
  trait SubscriptionPricingState extends StObject {
    
    var price: Base
  }
  object SubscriptionPricingState {
    
    inline def apply(price: Base): SubscriptionPricingState = {
      val __obj = js.Dynamic.literal(price = price.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubscriptionPricingState]
    }
    
    extension [Self <: SubscriptionPricingState](x: Self) {
      
      inline def setPrice(value: Base): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    }
  }
  
  trait SubscriptionPricingStateTax extends StObject {
    
    var rate: String
    
    var region: String
    
    var tax_type: String
  }
  object SubscriptionPricingStateTax {
    
    inline def apply(rate: String, region: String, tax_type: String): SubscriptionPricingStateTax = {
      val __obj = js.Dynamic.literal(rate = rate.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], tax_type = tax_type.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubscriptionPricingStateTax]
    }
    
    extension [Self <: SubscriptionPricingStateTax](x: Self) {
      
      inline def setRate(value: String): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setTax_type(value: String): Self = StObject.set(x, "tax_type", value.asInstanceOf[js.Any])
    }
  }
}
