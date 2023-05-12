package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Orders
  */
trait Fulfillment extends StObject {
  
  var fulfillmentLineItems: js.Array[FulfillmentLineItem]
  
  var trackingCompany: String
  
  var trackingInfo: js.Array[FulfillmentTrackingInfo]
}
object Fulfillment {
  
  inline def apply(
    fulfillmentLineItems: js.Array[FulfillmentLineItem],
    trackingCompany: String,
    trackingInfo: js.Array[FulfillmentTrackingInfo]
  ): Fulfillment = {
    val __obj = js.Dynamic.literal(fulfillmentLineItems = fulfillmentLineItems.asInstanceOf[js.Any], trackingCompany = trackingCompany.asInstanceOf[js.Any], trackingInfo = trackingInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fulfillment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Fulfillment] (val x: Self) extends AnyVal {
    
    inline def setFulfillmentLineItems(value: js.Array[FulfillmentLineItem]): Self = StObject.set(x, "fulfillmentLineItems", value.asInstanceOf[js.Any])
    
    inline def setFulfillmentLineItemsVarargs(value: FulfillmentLineItem*): Self = StObject.set(x, "fulfillmentLineItems", js.Array(value*))
    
    inline def setTrackingCompany(value: String): Self = StObject.set(x, "trackingCompany", value.asInstanceOf[js.Any])
    
    inline def setTrackingInfo(value: js.Array[FulfillmentTrackingInfo]): Self = StObject.set(x, "trackingInfo", value.asInstanceOf[js.Any])
    
    inline def setTrackingInfoVarargs(value: FulfillmentTrackingInfo*): Self = StObject.set(x, "trackingInfo", js.Array(value*))
  }
}
