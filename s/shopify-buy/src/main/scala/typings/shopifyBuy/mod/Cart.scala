package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Cart
  */
trait Cart
  extends StObject
     with Node {
  
  var attribute: js.UndefOr[Attribute] = js.undefined
  
  var attributes: js.Array[Attribute]
  
  var buyerIdentity: CartBuyerIdentity
  
  var checkoutUrl: URL
  
  var cost: CartCost
  
  var createdAt: DateTime
  
  var deliveryGroups: js.Array[CartDeliveryGroup]
  
  var discountAllocations: js.Array[CartDiscountAllocation]
  
  var discountCodes: js.Array[CartDiscountCode]
  
  /**
    * @deprecated
    */
  var estimatedCost: CartEstimatedCost
  
  var lines: js.Array[CartLine]
  
  var note: String
  
  var totalQuantity: Double
  
  var updatedAt: DateTime
}
object Cart {
  
  inline def apply(
    attributes: js.Array[Attribute],
    buyerIdentity: CartBuyerIdentity,
    checkoutUrl: URL,
    cost: CartCost,
    createdAt: DateTime,
    deliveryGroups: js.Array[CartDeliveryGroup],
    discountAllocations: js.Array[CartDiscountAllocation],
    discountCodes: js.Array[CartDiscountCode],
    estimatedCost: CartEstimatedCost,
    id: ID,
    lines: js.Array[CartLine],
    note: String,
    totalQuantity: Double,
    updatedAt: DateTime
  ): Cart = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], buyerIdentity = buyerIdentity.asInstanceOf[js.Any], checkoutUrl = checkoutUrl.asInstanceOf[js.Any], cost = cost.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], deliveryGroups = deliveryGroups.asInstanceOf[js.Any], discountAllocations = discountAllocations.asInstanceOf[js.Any], discountCodes = discountCodes.asInstanceOf[js.Any], estimatedCost = estimatedCost.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], note = note.asInstanceOf[js.Any], totalQuantity = totalQuantity.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cart]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cart] (val x: Self) extends AnyVal {
    
    inline def setAttribute(value: Attribute): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    inline def setAttributeUndefined: Self = StObject.set(x, "attribute", js.undefined)
    
    inline def setAttributes(value: js.Array[Attribute]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesVarargs(value: Attribute*): Self = StObject.set(x, "attributes", js.Array(value*))
    
    inline def setBuyerIdentity(value: CartBuyerIdentity): Self = StObject.set(x, "buyerIdentity", value.asInstanceOf[js.Any])
    
    inline def setCheckoutUrl(value: URL): Self = StObject.set(x, "checkoutUrl", value.asInstanceOf[js.Any])
    
    inline def setCost(value: CartCost): Self = StObject.set(x, "cost", value.asInstanceOf[js.Any])
    
    inline def setCreatedAt(value: DateTime): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setDeliveryGroups(value: js.Array[CartDeliveryGroup]): Self = StObject.set(x, "deliveryGroups", value.asInstanceOf[js.Any])
    
    inline def setDeliveryGroupsVarargs(value: CartDeliveryGroup*): Self = StObject.set(x, "deliveryGroups", js.Array(value*))
    
    inline def setDiscountAllocations(value: js.Array[CartDiscountAllocation]): Self = StObject.set(x, "discountAllocations", value.asInstanceOf[js.Any])
    
    inline def setDiscountAllocationsVarargs(value: CartDiscountAllocation*): Self = StObject.set(x, "discountAllocations", js.Array(value*))
    
    inline def setDiscountCodes(value: js.Array[CartDiscountCode]): Self = StObject.set(x, "discountCodes", value.asInstanceOf[js.Any])
    
    inline def setDiscountCodesVarargs(value: CartDiscountCode*): Self = StObject.set(x, "discountCodes", js.Array(value*))
    
    inline def setEstimatedCost(value: CartEstimatedCost): Self = StObject.set(x, "estimatedCost", value.asInstanceOf[js.Any])
    
    inline def setLines(value: js.Array[CartLine]): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
    
    inline def setLinesVarargs(value: CartLine*): Self = StObject.set(x, "lines", js.Array(value*))
    
    inline def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setTotalQuantity(value: Double): Self = StObject.set(x, "totalQuantity", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAt(value: DateTime): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
  }
}
