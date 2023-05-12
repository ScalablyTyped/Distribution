package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CartLine
  extends StObject
     with Node {
  
  var attribute: js.UndefOr[Attribute] = js.undefined
  
  var attributes: js.Array[Attribute]
  
  var cost: CartLineCost
  
  var discountAllocations: js.Array[CartDiscountAllocation]
  
  var estimatedCost: MoneyV2
  
  var merchandise: Merchandise
  
  var quantity: Double
  
  var sellingPlanAllocation: js.UndefOr[SellingPlanAllocation] = js.undefined
}
object CartLine {
  
  inline def apply(
    attributes: js.Array[Attribute],
    cost: CartLineCost,
    discountAllocations: js.Array[CartDiscountAllocation],
    estimatedCost: MoneyV2,
    id: ID,
    merchandise: Merchandise,
    quantity: Double
  ): CartLine = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], cost = cost.asInstanceOf[js.Any], discountAllocations = discountAllocations.asInstanceOf[js.Any], estimatedCost = estimatedCost.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], merchandise = merchandise.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[CartLine]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CartLine] (val x: Self) extends AnyVal {
    
    inline def setAttribute(value: Attribute): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    inline def setAttributeUndefined: Self = StObject.set(x, "attribute", js.undefined)
    
    inline def setAttributes(value: js.Array[Attribute]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesVarargs(value: Attribute*): Self = StObject.set(x, "attributes", js.Array(value*))
    
    inline def setCost(value: CartLineCost): Self = StObject.set(x, "cost", value.asInstanceOf[js.Any])
    
    inline def setDiscountAllocations(value: js.Array[CartDiscountAllocation]): Self = StObject.set(x, "discountAllocations", value.asInstanceOf[js.Any])
    
    inline def setDiscountAllocationsVarargs(value: CartDiscountAllocation*): Self = StObject.set(x, "discountAllocations", js.Array(value*))
    
    inline def setEstimatedCost(value: MoneyV2): Self = StObject.set(x, "estimatedCost", value.asInstanceOf[js.Any])
    
    inline def setMerchandise(value: Merchandise): Self = StObject.set(x, "merchandise", value.asInstanceOf[js.Any])
    
    inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setSellingPlanAllocation(value: SellingPlanAllocation): Self = StObject.set(x, "sellingPlanAllocation", value.asInstanceOf[js.Any])
    
    inline def setSellingPlanAllocationUndefined: Self = StObject.set(x, "sellingPlanAllocation", js.undefined)
  }
}
