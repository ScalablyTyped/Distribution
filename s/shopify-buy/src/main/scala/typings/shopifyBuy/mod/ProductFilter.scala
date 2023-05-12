package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProductFilter extends StObject {
  
  var available: js.UndefOr[Boolean] = js.undefined
  
  var price: js.UndefOr[PriceRangeFilter] = js.undefined
  
  var productMetafield: js.UndefOr[MetafieldFilter] = js.undefined
  
  var productType: js.UndefOr[String] = js.undefined
  
  var productVendor: js.UndefOr[String] = js.undefined
  
  var tag: js.UndefOr[String] = js.undefined
  
  var variantMetafield: js.UndefOr[MetafieldFilter] = js.undefined
  
  var variantOption: js.UndefOr[VariantOptionFilter] = js.undefined
}
object ProductFilter {
  
  inline def apply(): ProductFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProductFilter] (val x: Self) extends AnyVal {
    
    inline def setAvailable(value: Boolean): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
    
    inline def setAvailableUndefined: Self = StObject.set(x, "available", js.undefined)
    
    inline def setPrice(value: PriceRangeFilter): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
    
    inline def setProductMetafield(value: MetafieldFilter): Self = StObject.set(x, "productMetafield", value.asInstanceOf[js.Any])
    
    inline def setProductMetafieldUndefined: Self = StObject.set(x, "productMetafield", js.undefined)
    
    inline def setProductType(value: String): Self = StObject.set(x, "productType", value.asInstanceOf[js.Any])
    
    inline def setProductTypeUndefined: Self = StObject.set(x, "productType", js.undefined)
    
    inline def setProductVendor(value: String): Self = StObject.set(x, "productVendor", value.asInstanceOf[js.Any])
    
    inline def setProductVendorUndefined: Self = StObject.set(x, "productVendor", js.undefined)
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    
    inline def setVariantMetafield(value: MetafieldFilter): Self = StObject.set(x, "variantMetafield", value.asInstanceOf[js.Any])
    
    inline def setVariantMetafieldUndefined: Self = StObject.set(x, "variantMetafield", js.undefined)
    
    inline def setVariantOption(value: VariantOptionFilter): Self = StObject.set(x, "variantOption", value.asInstanceOf[js.Any])
    
    inline def setVariantOptionUndefined: Self = StObject.set(x, "variantOption", js.undefined)
  }
}
