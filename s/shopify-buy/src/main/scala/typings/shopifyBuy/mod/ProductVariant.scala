package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProductVariant
  extends StObject
     with Node
     with HasMetafields
     with MetafieldParentResource
     with MetafieldReference {
  
  var availableForSale: Boolean
  
  var barcode: String
  
  var compareAtPrice: MoneyV2
  
  var currentlyNotInStock: Boolean
  
  var image: Image
  
  var price: MoneyV2
  
  var product: Product
  
  var quantityAvailable: js.UndefOr[Double] = js.undefined
  
  var requiresShipping: Boolean
  
  var selectedOptions: js.Array[SelectedOption]
  
  var sellingPlanAllocations: js.Array[SellingPlanAllocation]
  
  var sku: js.UndefOr[String] = js.undefined
  
  var storeAvailability: js.Array[StoreAvailability]
  
  var title: String
  
  var unitPrice: js.UndefOr[MoneyV2] = js.undefined
  
  var unitPriceMeasurement: js.UndefOr[UnitPriceMeasurement] = js.undefined
  
  var weight: js.UndefOr[Double] = js.undefined
  
  var weightUnit: js.UndefOr[WeightUnit] = js.undefined
}
object ProductVariant {
  
  inline def apply(
    availableForSale: Boolean,
    barcode: String,
    compareAtPrice: MoneyV2,
    currentlyNotInStock: Boolean,
    id: ID,
    image: Image,
    metafields: js.Array[Metafield],
    price: MoneyV2,
    product: Product,
    requiresShipping: Boolean,
    selectedOptions: js.Array[SelectedOption],
    sellingPlanAllocations: js.Array[SellingPlanAllocation],
    storeAvailability: js.Array[StoreAvailability],
    title: String
  ): ProductVariant = {
    val __obj = js.Dynamic.literal(availableForSale = availableForSale.asInstanceOf[js.Any], barcode = barcode.asInstanceOf[js.Any], compareAtPrice = compareAtPrice.asInstanceOf[js.Any], currentlyNotInStock = currentlyNotInStock.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], metafields = metafields.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], product = product.asInstanceOf[js.Any], requiresShipping = requiresShipping.asInstanceOf[js.Any], selectedOptions = selectedOptions.asInstanceOf[js.Any], sellingPlanAllocations = sellingPlanAllocations.asInstanceOf[js.Any], storeAvailability = storeAvailability.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductVariant]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProductVariant] (val x: Self) extends AnyVal {
    
    inline def setAvailableForSale(value: Boolean): Self = StObject.set(x, "availableForSale", value.asInstanceOf[js.Any])
    
    inline def setBarcode(value: String): Self = StObject.set(x, "barcode", value.asInstanceOf[js.Any])
    
    inline def setCompareAtPrice(value: MoneyV2): Self = StObject.set(x, "compareAtPrice", value.asInstanceOf[js.Any])
    
    inline def setCurrentlyNotInStock(value: Boolean): Self = StObject.set(x, "currentlyNotInStock", value.asInstanceOf[js.Any])
    
    inline def setImage(value: Image): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setPrice(value: MoneyV2): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setProduct(value: Product): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    inline def setQuantityAvailable(value: Double): Self = StObject.set(x, "quantityAvailable", value.asInstanceOf[js.Any])
    
    inline def setQuantityAvailableUndefined: Self = StObject.set(x, "quantityAvailable", js.undefined)
    
    inline def setRequiresShipping(value: Boolean): Self = StObject.set(x, "requiresShipping", value.asInstanceOf[js.Any])
    
    inline def setSelectedOptions(value: js.Array[SelectedOption]): Self = StObject.set(x, "selectedOptions", value.asInstanceOf[js.Any])
    
    inline def setSelectedOptionsVarargs(value: SelectedOption*): Self = StObject.set(x, "selectedOptions", js.Array(value*))
    
    inline def setSellingPlanAllocations(value: js.Array[SellingPlanAllocation]): Self = StObject.set(x, "sellingPlanAllocations", value.asInstanceOf[js.Any])
    
    inline def setSellingPlanAllocationsVarargs(value: SellingPlanAllocation*): Self = StObject.set(x, "sellingPlanAllocations", js.Array(value*))
    
    inline def setSku(value: String): Self = StObject.set(x, "sku", value.asInstanceOf[js.Any])
    
    inline def setSkuUndefined: Self = StObject.set(x, "sku", js.undefined)
    
    inline def setStoreAvailability(value: js.Array[StoreAvailability]): Self = StObject.set(x, "storeAvailability", value.asInstanceOf[js.Any])
    
    inline def setStoreAvailabilityVarargs(value: StoreAvailability*): Self = StObject.set(x, "storeAvailability", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setUnitPrice(value: MoneyV2): Self = StObject.set(x, "unitPrice", value.asInstanceOf[js.Any])
    
    inline def setUnitPriceMeasurement(value: UnitPriceMeasurement): Self = StObject.set(x, "unitPriceMeasurement", value.asInstanceOf[js.Any])
    
    inline def setUnitPriceMeasurementUndefined: Self = StObject.set(x, "unitPriceMeasurement", js.undefined)
    
    inline def setUnitPriceUndefined: Self = StObject.set(x, "unitPrice", js.undefined)
    
    inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
    
    inline def setWeightUnit(value: WeightUnit): Self = StObject.set(x, "weightUnit", value.asInstanceOf[js.Any])
    
    inline def setWeightUnitUndefined: Self = StObject.set(x, "weightUnit", js.undefined)
  }
}
