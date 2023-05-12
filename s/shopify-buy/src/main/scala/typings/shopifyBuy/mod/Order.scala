package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Order
  extends StObject
     with Node
     with HasMetafields
     with MetafieldParentResource {
  
  var cancelReason: js.UndefOr[OrderCancelReason] = js.undefined
  
  var canceledAt: js.UndefOr[DateTime] = js.undefined
  
  var currencyCode: CurrencyCode
  
  var currentSubtotalPrice: MoneyV2
  
  var currentTotalDuties: js.UndefOr[MoneyV2] = js.undefined
  
  var currentTotalPrice: MoneyV2
  
  var currentTotalTax: MoneyV2
  
  var customAttributes: js.Array[Attribute]
  
  var customerLocale: js.UndefOr[String] = js.undefined
  
  var customerUrl: js.UndefOr[URL] = js.undefined
  
  var discountApplications: js.Array[DiscountAllocation]
  
  var edited: Boolean
  
  var email: js.UndefOr[String] = js.undefined
  
  var financialStatus: js.UndefOr[OrderFinancialStatus] = js.undefined
  
  var fulfillmentStatus: OrderFulfillmentStatus
  
  var lineItems: js.Array[OrderLineItem]
  
  var name: String
  
  var orderNumber: Double
  
  var originalTotalDuties: js.UndefOr[MoneyV2] = js.undefined
  
  var originalTotalPrice: MoneyV2
  
  var phone: js.UndefOr[String] = js.undefined
  
  var processedAt: DateTime
  
  var shippingAddress: js.UndefOr[MailingAddress] = js.undefined
  
  var shippingDiscountAllocations: js.Array[DiscountAllocation]
  
  var statusUrl: URL
  
  var subtotalPrice: js.UndefOr[MoneyV2] = js.undefined
  
  /**
    * @deprecated
    */
  var subtotalPriceV2: js.UndefOr[MoneyV2] = js.undefined
  
  var successfulFulfillments: js.UndefOr[js.Array[Fulfillment]] = js.undefined
  
  var totalPrice: MoneyV2
  
  /**
    * @deprecated
    */
  var totalPriceV2: MoneyV2
  
  var totalRefunded: MoneyV2
  
  /**
    * @deprecated
    */
  var totalRefundedV2: MoneyV2
  
  var totalShippingPrice: MoneyV2
  
  /**
    * @deprecated
    */
  var totalShippingPriceV2: MoneyV2
  
  var totalTax: js.UndefOr[MoneyV2] = js.undefined
  
  /**
    * @deprecated
    */
  var totalTaxV2: js.UndefOr[MoneyV2] = js.undefined
}
object Order {
  
  inline def apply(
    currencyCode: CurrencyCode,
    currentSubtotalPrice: MoneyV2,
    currentTotalPrice: MoneyV2,
    currentTotalTax: MoneyV2,
    customAttributes: js.Array[Attribute],
    discountApplications: js.Array[DiscountAllocation],
    edited: Boolean,
    fulfillmentStatus: OrderFulfillmentStatus,
    id: ID,
    lineItems: js.Array[OrderLineItem],
    metafields: js.Array[Metafield],
    name: String,
    orderNumber: Double,
    originalTotalPrice: MoneyV2,
    processedAt: DateTime,
    shippingDiscountAllocations: js.Array[DiscountAllocation],
    statusUrl: URL,
    totalPrice: MoneyV2,
    totalPriceV2: MoneyV2,
    totalRefunded: MoneyV2,
    totalRefundedV2: MoneyV2,
    totalShippingPrice: MoneyV2,
    totalShippingPriceV2: MoneyV2
  ): Order = {
    val __obj = js.Dynamic.literal(currencyCode = currencyCode.asInstanceOf[js.Any], currentSubtotalPrice = currentSubtotalPrice.asInstanceOf[js.Any], currentTotalPrice = currentTotalPrice.asInstanceOf[js.Any], currentTotalTax = currentTotalTax.asInstanceOf[js.Any], customAttributes = customAttributes.asInstanceOf[js.Any], discountApplications = discountApplications.asInstanceOf[js.Any], edited = edited.asInstanceOf[js.Any], fulfillmentStatus = fulfillmentStatus.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lineItems = lineItems.asInstanceOf[js.Any], metafields = metafields.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], orderNumber = orderNumber.asInstanceOf[js.Any], originalTotalPrice = originalTotalPrice.asInstanceOf[js.Any], processedAt = processedAt.asInstanceOf[js.Any], shippingDiscountAllocations = shippingDiscountAllocations.asInstanceOf[js.Any], statusUrl = statusUrl.asInstanceOf[js.Any], totalPrice = totalPrice.asInstanceOf[js.Any], totalPriceV2 = totalPriceV2.asInstanceOf[js.Any], totalRefunded = totalRefunded.asInstanceOf[js.Any], totalRefundedV2 = totalRefundedV2.asInstanceOf[js.Any], totalShippingPrice = totalShippingPrice.asInstanceOf[js.Any], totalShippingPriceV2 = totalShippingPriceV2.asInstanceOf[js.Any])
    __obj.asInstanceOf[Order]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Order] (val x: Self) extends AnyVal {
    
    inline def setCancelReason(value: OrderCancelReason): Self = StObject.set(x, "cancelReason", value.asInstanceOf[js.Any])
    
    inline def setCancelReasonUndefined: Self = StObject.set(x, "cancelReason", js.undefined)
    
    inline def setCanceledAt(value: DateTime): Self = StObject.set(x, "canceledAt", value.asInstanceOf[js.Any])
    
    inline def setCanceledAtUndefined: Self = StObject.set(x, "canceledAt", js.undefined)
    
    inline def setCurrencyCode(value: CurrencyCode): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
    
    inline def setCurrentSubtotalPrice(value: MoneyV2): Self = StObject.set(x, "currentSubtotalPrice", value.asInstanceOf[js.Any])
    
    inline def setCurrentTotalDuties(value: MoneyV2): Self = StObject.set(x, "currentTotalDuties", value.asInstanceOf[js.Any])
    
    inline def setCurrentTotalDutiesUndefined: Self = StObject.set(x, "currentTotalDuties", js.undefined)
    
    inline def setCurrentTotalPrice(value: MoneyV2): Self = StObject.set(x, "currentTotalPrice", value.asInstanceOf[js.Any])
    
    inline def setCurrentTotalTax(value: MoneyV2): Self = StObject.set(x, "currentTotalTax", value.asInstanceOf[js.Any])
    
    inline def setCustomAttributes(value: js.Array[Attribute]): Self = StObject.set(x, "customAttributes", value.asInstanceOf[js.Any])
    
    inline def setCustomAttributesVarargs(value: Attribute*): Self = StObject.set(x, "customAttributes", js.Array(value*))
    
    inline def setCustomerLocale(value: String): Self = StObject.set(x, "customerLocale", value.asInstanceOf[js.Any])
    
    inline def setCustomerLocaleUndefined: Self = StObject.set(x, "customerLocale", js.undefined)
    
    inline def setCustomerUrl(value: URL): Self = StObject.set(x, "customerUrl", value.asInstanceOf[js.Any])
    
    inline def setCustomerUrlUndefined: Self = StObject.set(x, "customerUrl", js.undefined)
    
    inline def setDiscountApplications(value: js.Array[DiscountAllocation]): Self = StObject.set(x, "discountApplications", value.asInstanceOf[js.Any])
    
    inline def setDiscountApplicationsVarargs(value: DiscountAllocation*): Self = StObject.set(x, "discountApplications", js.Array(value*))
    
    inline def setEdited(value: Boolean): Self = StObject.set(x, "edited", value.asInstanceOf[js.Any])
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setFinancialStatus(value: OrderFinancialStatus): Self = StObject.set(x, "financialStatus", value.asInstanceOf[js.Any])
    
    inline def setFinancialStatusUndefined: Self = StObject.set(x, "financialStatus", js.undefined)
    
    inline def setFulfillmentStatus(value: OrderFulfillmentStatus): Self = StObject.set(x, "fulfillmentStatus", value.asInstanceOf[js.Any])
    
    inline def setLineItems(value: js.Array[OrderLineItem]): Self = StObject.set(x, "lineItems", value.asInstanceOf[js.Any])
    
    inline def setLineItemsVarargs(value: OrderLineItem*): Self = StObject.set(x, "lineItems", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOrderNumber(value: Double): Self = StObject.set(x, "orderNumber", value.asInstanceOf[js.Any])
    
    inline def setOriginalTotalDuties(value: MoneyV2): Self = StObject.set(x, "originalTotalDuties", value.asInstanceOf[js.Any])
    
    inline def setOriginalTotalDutiesUndefined: Self = StObject.set(x, "originalTotalDuties", js.undefined)
    
    inline def setOriginalTotalPrice(value: MoneyV2): Self = StObject.set(x, "originalTotalPrice", value.asInstanceOf[js.Any])
    
    inline def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    inline def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
    
    inline def setProcessedAt(value: DateTime): Self = StObject.set(x, "processedAt", value.asInstanceOf[js.Any])
    
    inline def setShippingAddress(value: MailingAddress): Self = StObject.set(x, "shippingAddress", value.asInstanceOf[js.Any])
    
    inline def setShippingAddressUndefined: Self = StObject.set(x, "shippingAddress", js.undefined)
    
    inline def setShippingDiscountAllocations(value: js.Array[DiscountAllocation]): Self = StObject.set(x, "shippingDiscountAllocations", value.asInstanceOf[js.Any])
    
    inline def setShippingDiscountAllocationsVarargs(value: DiscountAllocation*): Self = StObject.set(x, "shippingDiscountAllocations", js.Array(value*))
    
    inline def setStatusUrl(value: URL): Self = StObject.set(x, "statusUrl", value.asInstanceOf[js.Any])
    
    inline def setSubtotalPrice(value: MoneyV2): Self = StObject.set(x, "subtotalPrice", value.asInstanceOf[js.Any])
    
    inline def setSubtotalPriceUndefined: Self = StObject.set(x, "subtotalPrice", js.undefined)
    
    inline def setSubtotalPriceV2(value: MoneyV2): Self = StObject.set(x, "subtotalPriceV2", value.asInstanceOf[js.Any])
    
    inline def setSubtotalPriceV2Undefined: Self = StObject.set(x, "subtotalPriceV2", js.undefined)
    
    inline def setSuccessfulFulfillments(value: js.Array[Fulfillment]): Self = StObject.set(x, "successfulFulfillments", value.asInstanceOf[js.Any])
    
    inline def setSuccessfulFulfillmentsUndefined: Self = StObject.set(x, "successfulFulfillments", js.undefined)
    
    inline def setSuccessfulFulfillmentsVarargs(value: Fulfillment*): Self = StObject.set(x, "successfulFulfillments", js.Array(value*))
    
    inline def setTotalPrice(value: MoneyV2): Self = StObject.set(x, "totalPrice", value.asInstanceOf[js.Any])
    
    inline def setTotalPriceV2(value: MoneyV2): Self = StObject.set(x, "totalPriceV2", value.asInstanceOf[js.Any])
    
    inline def setTotalRefunded(value: MoneyV2): Self = StObject.set(x, "totalRefunded", value.asInstanceOf[js.Any])
    
    inline def setTotalRefundedV2(value: MoneyV2): Self = StObject.set(x, "totalRefundedV2", value.asInstanceOf[js.Any])
    
    inline def setTotalShippingPrice(value: MoneyV2): Self = StObject.set(x, "totalShippingPrice", value.asInstanceOf[js.Any])
    
    inline def setTotalShippingPriceV2(value: MoneyV2): Self = StObject.set(x, "totalShippingPriceV2", value.asInstanceOf[js.Any])
    
    inline def setTotalTax(value: MoneyV2): Self = StObject.set(x, "totalTax", value.asInstanceOf[js.Any])
    
    inline def setTotalTaxUndefined: Self = StObject.set(x, "totalTax", js.undefined)
    
    inline def setTotalTaxV2(value: MoneyV2): Self = StObject.set(x, "totalTaxV2", value.asInstanceOf[js.Any])
    
    inline def setTotalTaxV2Undefined: Self = StObject.set(x, "totalTaxV2", js.undefined)
  }
}
