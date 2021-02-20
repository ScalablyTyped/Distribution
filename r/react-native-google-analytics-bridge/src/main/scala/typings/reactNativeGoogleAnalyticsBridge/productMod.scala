package typings.reactNativeGoogleAnalyticsBridge

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object productMod {
  
  @js.native
  sealed trait ProductActionEnum extends StObject
  @JSImport("react-native-google-analytics-bridge/dist/models/Product", "ProductActionEnum")
  @js.native
  object ProductActionEnum extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ProductActionEnum with Double] = js.native
    
    @js.native
    sealed trait Add extends ProductActionEnum
    /* 3 */ val Add: typings.reactNativeGoogleAnalyticsBridge.productMod.ProductActionEnum.Add with Double = js.native
    
    @js.native
    sealed trait Checkout extends ProductActionEnum
    /* 5 */ val Checkout: typings.reactNativeGoogleAnalyticsBridge.productMod.ProductActionEnum.Checkout with Double = js.native
    
    @js.native
    sealed trait CheckoutOption extends ProductActionEnum
    /* 6 */ val CheckoutOption: typings.reactNativeGoogleAnalyticsBridge.productMod.ProductActionEnum.CheckoutOption with Double = js.native
    
    @js.native
    sealed trait Click extends ProductActionEnum
    /* 2 */ val Click: typings.reactNativeGoogleAnalyticsBridge.productMod.ProductActionEnum.Click with Double = js.native
    
    @js.native
    sealed trait Detail extends ProductActionEnum
    /* 1 */ val Detail: typings.reactNativeGoogleAnalyticsBridge.productMod.ProductActionEnum.Detail with Double = js.native
    
    @js.native
    sealed trait Purchase extends ProductActionEnum
    /* 7 */ val Purchase: typings.reactNativeGoogleAnalyticsBridge.productMod.ProductActionEnum.Purchase with Double = js.native
    
    @js.native
    sealed trait Refund extends ProductActionEnum
    /* 8 */ val Refund: typings.reactNativeGoogleAnalyticsBridge.productMod.ProductActionEnum.Refund with Double = js.native
    
    @js.native
    sealed trait Remove extends ProductActionEnum
    /* 4 */ val Remove: typings.reactNativeGoogleAnalyticsBridge.productMod.ProductActionEnum.Remove with Double = js.native
  }
  
  @js.native
  trait Product extends StObject {
    
    var brand: js.UndefOr[String] = js.native
    
    var category: js.UndefOr[String] = js.native
    
    var couponCode: js.UndefOr[String] = js.native
    
    var id: String = js.native
    
    var name: String = js.native
    
    var price: js.UndefOr[Double] = js.native
    
    var quantity: js.UndefOr[Double] = js.native
    
    var variant: js.UndefOr[String] = js.native
  }
  object Product {
    
    @scala.inline
    def apply(id: String, name: String): Product = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Product]
    }
    
    @scala.inline
    implicit class ProductMutableBuilder[Self <: Product] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBrand(value: String): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrandUndefined: Self = StObject.set(x, "brand", js.undefined)
      
      @scala.inline
      def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
      
      @scala.inline
      def setCouponCode(value: String): Self = StObject.set(x, "couponCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCouponCodeUndefined: Self = StObject.set(x, "couponCode", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrice(value: Double): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
      
      @scala.inline
      def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
      
      @scala.inline
      def setVariant(value: String): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
    }
  }
  
  @js.native
  trait ProductAction extends StObject {
    
    var action: ProductActionEnum = js.native
    
    var checkoutOption: js.UndefOr[String] = js.native
    
    var checkoutStep: js.UndefOr[Double] = js.native
    
    var productActionList: js.UndefOr[String] = js.native
    
    var productListSource: js.UndefOr[String] = js.native
    
    var transaction: js.UndefOr[Transaction] = js.native
  }
  object ProductAction {
    
    @scala.inline
    def apply(action: ProductActionEnum): ProductAction = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProductAction]
    }
    
    @scala.inline
    implicit class ProductActionMutableBuilder[Self <: ProductAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: ProductActionEnum): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckoutOption(value: String): Self = StObject.set(x, "checkoutOption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckoutOptionUndefined: Self = StObject.set(x, "checkoutOption", js.undefined)
      
      @scala.inline
      def setCheckoutStep(value: Double): Self = StObject.set(x, "checkoutStep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckoutStepUndefined: Self = StObject.set(x, "checkoutStep", js.undefined)
      
      @scala.inline
      def setProductActionList(value: String): Self = StObject.set(x, "productActionList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProductActionListUndefined: Self = StObject.set(x, "productActionList", js.undefined)
      
      @scala.inline
      def setProductListSource(value: String): Self = StObject.set(x, "productListSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProductListSourceUndefined: Self = StObject.set(x, "productListSource", js.undefined)
      
      @scala.inline
      def setTransaction(value: Transaction): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
    }
  }
  
  @js.native
  trait Transaction extends StObject {
    
    var affiliation: js.UndefOr[String] = js.native
    
    var couponCode: js.UndefOr[String] = js.native
    
    var id: String = js.native
    
    var revenue: js.UndefOr[Double] = js.native
    
    var shipping: js.UndefOr[Double] = js.native
    
    var tax: js.UndefOr[Double] = js.native
  }
  object Transaction {
    
    @scala.inline
    def apply(id: String): Transaction = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Transaction]
    }
    
    @scala.inline
    implicit class TransactionMutableBuilder[Self <: Transaction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAffiliation(value: String): Self = StObject.set(x, "affiliation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAffiliationUndefined: Self = StObject.set(x, "affiliation", js.undefined)
      
      @scala.inline
      def setCouponCode(value: String): Self = StObject.set(x, "couponCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCouponCodeUndefined: Self = StObject.set(x, "couponCode", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRevenue(value: Double): Self = StObject.set(x, "revenue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRevenueUndefined: Self = StObject.set(x, "revenue", js.undefined)
      
      @scala.inline
      def setShipping(value: Double): Self = StObject.set(x, "shipping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShippingUndefined: Self = StObject.set(x, "shipping", js.undefined)
      
      @scala.inline
      def setTax(value: Double): Self = StObject.set(x, "tax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTaxUndefined: Self = StObject.set(x, "tax", js.undefined)
    }
  }
}
