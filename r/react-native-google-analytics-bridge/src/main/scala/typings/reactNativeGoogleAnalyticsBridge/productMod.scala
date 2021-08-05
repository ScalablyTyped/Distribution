package typings.reactNativeGoogleAnalyticsBridge

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object productMod {
  
  @js.native
  sealed trait ProductActionEnum extends StObject
  @JSImport("react-native-google-analytics-bridge/dist/models/Product", "ProductActionEnum")
  @js.native
  object ProductActionEnum extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ProductActionEnum & Double] = js.native
    
    @js.native
    sealed trait Add
      extends StObject
         with ProductActionEnum
    /* 3 */ val Add: typings.reactNativeGoogleAnalyticsBridge.productMod.ProductActionEnum.Add & Double = js.native
    
    @js.native
    sealed trait Checkout
      extends StObject
         with ProductActionEnum
    /* 5 */ val Checkout: typings.reactNativeGoogleAnalyticsBridge.productMod.ProductActionEnum.Checkout & Double = js.native
    
    @js.native
    sealed trait CheckoutOption
      extends StObject
         with ProductActionEnum
    /* 6 */ val CheckoutOption: typings.reactNativeGoogleAnalyticsBridge.productMod.ProductActionEnum.CheckoutOption & Double = js.native
    
    @js.native
    sealed trait Click
      extends StObject
         with ProductActionEnum
    /* 2 */ val Click: typings.reactNativeGoogleAnalyticsBridge.productMod.ProductActionEnum.Click & Double = js.native
    
    @js.native
    sealed trait Detail
      extends StObject
         with ProductActionEnum
    /* 1 */ val Detail: typings.reactNativeGoogleAnalyticsBridge.productMod.ProductActionEnum.Detail & Double = js.native
    
    @js.native
    sealed trait Purchase
      extends StObject
         with ProductActionEnum
    /* 7 */ val Purchase: typings.reactNativeGoogleAnalyticsBridge.productMod.ProductActionEnum.Purchase & Double = js.native
    
    @js.native
    sealed trait Refund
      extends StObject
         with ProductActionEnum
    /* 8 */ val Refund: typings.reactNativeGoogleAnalyticsBridge.productMod.ProductActionEnum.Refund & Double = js.native
    
    @js.native
    sealed trait Remove
      extends StObject
         with ProductActionEnum
    /* 4 */ val Remove: typings.reactNativeGoogleAnalyticsBridge.productMod.ProductActionEnum.Remove & Double = js.native
  }
  
  trait Product extends StObject {
    
    var brand: js.UndefOr[String] = js.undefined
    
    var category: js.UndefOr[String] = js.undefined
    
    var couponCode: js.UndefOr[String] = js.undefined
    
    var id: String
    
    var name: String
    
    var price: js.UndefOr[Double] = js.undefined
    
    var quantity: js.UndefOr[Double] = js.undefined
    
    var variant: js.UndefOr[String] = js.undefined
  }
  object Product {
    
    inline def apply(id: String, name: String): Product = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Product]
    }
    
    extension [Self <: Product](x: Self) {
      
      inline def setBrand(value: String): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
      
      inline def setBrandUndefined: Self = StObject.set(x, "brand", js.undefined)
      
      inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
      
      inline def setCouponCode(value: String): Self = StObject.set(x, "couponCode", value.asInstanceOf[js.Any])
      
      inline def setCouponCodeUndefined: Self = StObject.set(x, "couponCode", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPrice(value: Double): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
      
      inline def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
      
      inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
      
      inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
      
      inline def setVariant(value: String): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
    }
  }
  
  trait ProductAction extends StObject {
    
    var action: ProductActionEnum
    
    var checkoutOption: js.UndefOr[String] = js.undefined
    
    var checkoutStep: js.UndefOr[Double] = js.undefined
    
    var productActionList: js.UndefOr[String] = js.undefined
    
    var productListSource: js.UndefOr[String] = js.undefined
    
    var transaction: js.UndefOr[Transaction] = js.undefined
  }
  object ProductAction {
    
    inline def apply(action: ProductActionEnum): ProductAction = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProductAction]
    }
    
    extension [Self <: ProductAction](x: Self) {
      
      inline def setAction(value: ProductActionEnum): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setCheckoutOption(value: String): Self = StObject.set(x, "checkoutOption", value.asInstanceOf[js.Any])
      
      inline def setCheckoutOptionUndefined: Self = StObject.set(x, "checkoutOption", js.undefined)
      
      inline def setCheckoutStep(value: Double): Self = StObject.set(x, "checkoutStep", value.asInstanceOf[js.Any])
      
      inline def setCheckoutStepUndefined: Self = StObject.set(x, "checkoutStep", js.undefined)
      
      inline def setProductActionList(value: String): Self = StObject.set(x, "productActionList", value.asInstanceOf[js.Any])
      
      inline def setProductActionListUndefined: Self = StObject.set(x, "productActionList", js.undefined)
      
      inline def setProductListSource(value: String): Self = StObject.set(x, "productListSource", value.asInstanceOf[js.Any])
      
      inline def setProductListSourceUndefined: Self = StObject.set(x, "productListSource", js.undefined)
      
      inline def setTransaction(value: Transaction): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
      
      inline def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
    }
  }
  
  trait Transaction extends StObject {
    
    var affiliation: js.UndefOr[String] = js.undefined
    
    var couponCode: js.UndefOr[String] = js.undefined
    
    var id: String
    
    var revenue: js.UndefOr[Double] = js.undefined
    
    var shipping: js.UndefOr[Double] = js.undefined
    
    var tax: js.UndefOr[Double] = js.undefined
  }
  object Transaction {
    
    inline def apply(id: String): Transaction = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Transaction]
    }
    
    extension [Self <: Transaction](x: Self) {
      
      inline def setAffiliation(value: String): Self = StObject.set(x, "affiliation", value.asInstanceOf[js.Any])
      
      inline def setAffiliationUndefined: Self = StObject.set(x, "affiliation", js.undefined)
      
      inline def setCouponCode(value: String): Self = StObject.set(x, "couponCode", value.asInstanceOf[js.Any])
      
      inline def setCouponCodeUndefined: Self = StObject.set(x, "couponCode", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setRevenue(value: Double): Self = StObject.set(x, "revenue", value.asInstanceOf[js.Any])
      
      inline def setRevenueUndefined: Self = StObject.set(x, "revenue", js.undefined)
      
      inline def setShipping(value: Double): Self = StObject.set(x, "shipping", value.asInstanceOf[js.Any])
      
      inline def setShippingUndefined: Self = StObject.set(x, "shipping", js.undefined)
      
      inline def setTax(value: Double): Self = StObject.set(x, "tax", value.asInstanceOf[js.Any])
      
      inline def setTaxUndefined: Self = StObject.set(x, "tax", js.undefined)
    }
  }
}
