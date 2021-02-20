package typings.recurlyRecurlyJs

import typings.recurlyRecurlyJs.addressMod.Address
import typings.recurlyRecurlyJs.anon.Adjustments
import typings.recurlyRecurlyJs.anon.Code
import typings.recurlyRecurlyJs.pricingMod.PricingInstance
import typings.recurlyRecurlyJs.pricingMod.Tax
import typings.recurlyRecurlyJs.promiseMod.PricingPromise
import typings.recurlyRecurlyJs.subscriptionMod.SubscriptionPricingState
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkoutMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.recurlyRecurlyJs.checkoutMod.ItemAdjustment
    - typings.recurlyRecurlyJs.checkoutMod.NonItemAdjustment
  */
  trait Adjustment extends StObject
  object Adjustment {
    
    @scala.inline
    def ItemAdjustment(itemCode: String, quantity: Double): typings.recurlyRecurlyJs.checkoutMod.ItemAdjustment = {
      val __obj = js.Dynamic.literal(itemCode = itemCode.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.recurlyRecurlyJs.checkoutMod.ItemAdjustment]
    }
    
    @scala.inline
    def NonItemAdjustment(amount: Double, quantity: Double, taxCode: String, taxExempt: Boolean): typings.recurlyRecurlyJs.checkoutMod.NonItemAdjustment = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], taxCode = taxCode.asInstanceOf[js.Any], taxExempt = taxExempt.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.recurlyRecurlyJs.checkoutMod.NonItemAdjustment]
    }
  }
  
  @js.native
  trait CheckoutPrice extends StObject {
    
    var currency: Code = js.native
    
    var next: Adjustments = js.native
    
    var now: Adjustments = js.native
    
    var taxes: js.Array[CheckoutPricingStateTax] = js.native
  }
  object CheckoutPrice {
    
    @scala.inline
    def apply(currency: Code, next: Adjustments, now: Adjustments, taxes: js.Array[CheckoutPricingStateTax]): CheckoutPrice = {
      val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], now = now.asInstanceOf[js.Any], taxes = taxes.asInstanceOf[js.Any])
      __obj.asInstanceOf[CheckoutPrice]
    }
    
    @scala.inline
    implicit class CheckoutPriceMutableBuilder[Self <: CheckoutPrice] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrency(value: Code): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNext(value: Adjustments): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNow(value: Adjustments): Self = StObject.set(x, "now", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTaxes(value: js.Array[CheckoutPricingStateTax]): Self = StObject.set(x, "taxes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTaxesVarargs(value: CheckoutPricingStateTax*): Self = StObject.set(x, "taxes", js.Array(value :_*))
    }
  }
  
  type CheckoutPricing = js.Function0[CheckoutPricingInstance]
  
  @js.native
  trait CheckoutPricingInstance
    extends PricingInstance[CheckoutPricingPromise]
       with CheckoutPricingMethods {
    
    /**
      * @see {@link https://developers.recurly.com/reference/recurly-js/index.html#fn-checkoutpricingattach|CheckoutPricing.attach}
      */
    def attach(element: String): Unit = js.native
    def attach(element: HTMLElement): Unit = js.native
  }
  
  @js.native
  trait CheckoutPricingMethods extends StObject {
    
    def address(address: Address): CheckoutPricingPromise = js.native
    
    def adjustment(adjustment: Adjustment): CheckoutPricingPromise = js.native
    
    def coupon(coupon: String): CheckoutPricingPromise = js.native
    
    def currency(currency: String): CheckoutPricingPromise = js.native
    
    def giftCard(giftcard: String): CheckoutPricingPromise = js.native
    
    def shippingAddress(address: Address): CheckoutPricingPromise = js.native
    
    def subscription(subscriptionPricing: SubscriptionPricingState): CheckoutPricingPromise = js.native
    
    def tax(tax: Tax): CheckoutPricingPromise = js.native
  }
  object CheckoutPricingMethods {
    
    @scala.inline
    def apply(
      address: Address => CheckoutPricingPromise,
      adjustment: Adjustment => CheckoutPricingPromise,
      coupon: String => CheckoutPricingPromise,
      currency: String => CheckoutPricingPromise,
      giftCard: String => CheckoutPricingPromise,
      shippingAddress: Address => CheckoutPricingPromise,
      subscription: SubscriptionPricingState => CheckoutPricingPromise,
      tax: Tax => CheckoutPricingPromise
    ): CheckoutPricingMethods = {
      val __obj = js.Dynamic.literal(address = js.Any.fromFunction1(address), adjustment = js.Any.fromFunction1(adjustment), coupon = js.Any.fromFunction1(coupon), currency = js.Any.fromFunction1(currency), giftCard = js.Any.fromFunction1(giftCard), shippingAddress = js.Any.fromFunction1(shippingAddress), subscription = js.Any.fromFunction1(subscription), tax = js.Any.fromFunction1(tax))
      __obj.asInstanceOf[CheckoutPricingMethods]
    }
    
    @scala.inline
    implicit class CheckoutPricingMethodsMutableBuilder[Self <: CheckoutPricingMethods] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: Address => CheckoutPricingPromise): Self = StObject.set(x, "address", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAdjustment(value: Adjustment => CheckoutPricingPromise): Self = StObject.set(x, "adjustment", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCoupon(value: String => CheckoutPricingPromise): Self = StObject.set(x, "coupon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCurrency(value: String => CheckoutPricingPromise): Self = StObject.set(x, "currency", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGiftCard(value: String => CheckoutPricingPromise): Self = StObject.set(x, "giftCard", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShippingAddress(value: Address => CheckoutPricingPromise): Self = StObject.set(x, "shippingAddress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSubscription(value: SubscriptionPricingState => CheckoutPricingPromise): Self = StObject.set(x, "subscription", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTax(value: Tax => CheckoutPricingPromise): Self = StObject.set(x, "tax", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait CheckoutPricingPromise
    extends PricingPromise[CheckoutPricingState, CheckoutPricingMethods]
       with CheckoutPricingInstance
  
  @js.native
  trait CheckoutPricingState extends StObject {
    
    var price: CheckoutPrice = js.native
  }
  object CheckoutPricingState {
    
    @scala.inline
    def apply(price: CheckoutPrice): CheckoutPricingState = {
      val __obj = js.Dynamic.literal(price = price.asInstanceOf[js.Any])
      __obj.asInstanceOf[CheckoutPricingState]
    }
    
    @scala.inline
    implicit class CheckoutPricingStateMutableBuilder[Self <: CheckoutPricingState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrice(value: CheckoutPrice): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CheckoutPricingStateTax extends StObject {
    
    var rate: String = js.native
    
    var region: String = js.native
    
    var tax_type: String = js.native
  }
  object CheckoutPricingStateTax {
    
    @scala.inline
    def apply(rate: String, region: String, tax_type: String): CheckoutPricingStateTax = {
      val __obj = js.Dynamic.literal(rate = rate.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], tax_type = tax_type.asInstanceOf[js.Any])
      __obj.asInstanceOf[CheckoutPricingStateTax]
    }
    
    @scala.inline
    implicit class CheckoutPricingStateTaxMutableBuilder[Self <: CheckoutPricingStateTax] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRate(value: String): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTax_type(value: String): Self = StObject.set(x, "tax_type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Item extends StObject {
    
    var addons: String = js.native
    
    var amount: String = js.native
    
    var id: String = js.native
    
    var plan: String = js.native
    
    var setupFee: String = js.native
    
    var `type`: String = js.native
  }
  object Item {
    
    @scala.inline
    def apply(addons: String, amount: String, id: String, plan: String, setupFee: String, `type`: String): Item = {
      val __obj = js.Dynamic.literal(addons = addons.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], plan = plan.asInstanceOf[js.Any], setupFee = setupFee.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Item]
    }
    
    @scala.inline
    implicit class ItemMutableBuilder[Self <: Item] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddons(value: String): Self = StObject.set(x, "addons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlan(value: String): Self = StObject.set(x, "plan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetupFee(value: String): Self = StObject.set(x, "setupFee", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ItemAdjustment extends Adjustment {
    
    /**
      * Currency code
      */
    var currency: js.UndefOr[String] = js.native
    
    /**
      * Unique identifier. Use this value to modify an adjustment in-place.
      */
    var id: js.UndefOr[String] = js.native
    
    /**
      * Item code reference. If provided, the amount and tax properties will be populated from the given item. An itemCode
      * may not be used to modify an adjustment in-place.
      */
    var itemCode: String = js.native
    
    /**
      * Number of units
      */
    var quantity: Double = js.native
  }
  object ItemAdjustment {
    
    @scala.inline
    def apply(itemCode: String, quantity: Double): ItemAdjustment = {
      val __obj = js.Dynamic.literal(itemCode = itemCode.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemAdjustment]
    }
    
    @scala.inline
    implicit class ItemAdjustmentMutableBuilder[Self <: ItemAdjustment] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setItemCode(value: String): Self = StObject.set(x, "itemCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NonItemAdjustment extends Adjustment {
    
    /**
      * In unit price (1.0 for USD, etc)
      */
    var amount: Double = js.native
    
    /**
      * Currency code
      */
    var currency: js.UndefOr[String] = js.native
    
    /**
      * Unique identifier. Use this value to modify an adjustment in-place.
      */
    var id: js.UndefOr[String] = js.native
    
    /**
      * Number of units
      */
    var quantity: Double = js.native
    
    /**
      * Taxation code
      */
    var taxCode: String = js.native
    
    /**
      * Whether this adjustment is tax exempt
      */
    var taxExempt: Boolean = js.native
  }
  object NonItemAdjustment {
    
    @scala.inline
    def apply(amount: Double, quantity: Double, taxCode: String, taxExempt: Boolean): NonItemAdjustment = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], taxCode = taxCode.asInstanceOf[js.Any], taxExempt = taxExempt.asInstanceOf[js.Any])
      __obj.asInstanceOf[NonItemAdjustment]
    }
    
    @scala.inline
    implicit class NonItemAdjustmentMutableBuilder[Self <: NonItemAdjustment] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTaxCode(value: String): Self = StObject.set(x, "taxCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTaxExempt(value: Boolean): Self = StObject.set(x, "taxExempt", value.asInstanceOf[js.Any])
    }
  }
}
