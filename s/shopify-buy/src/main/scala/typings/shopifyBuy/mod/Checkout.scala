package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Checkout
  extends StObject
     with Node {
  
  var appliedGiftCards: js.Array[AppliedGiftCard]
  
  var availableShippingRates: js.UndefOr[AvailableShippingRates] = js.undefined
  
  var buyerIdentity: CheckoutBuyerIdentity
  
  var completedAt: js.UndefOr[DateTime] = js.undefined
  
  var createdAt: DateTime
  
  var currencyCode: CurrencyCode
  
  var customAttributes: js.Array[Attribute]
  
  var discountApplications: js.Array[DiscountApplication]
  
  var email: js.UndefOr[String] = js.undefined
  
  var lineItems: js.Array[CheckoutLineItem]
  
  var lineItemsSubtotalPrice: MoneyV2
  
  var note: js.UndefOr[String] = js.undefined
  
  var order: js.UndefOr[Order] = js.undefined
  
  var orderStatusUrl: js.UndefOr[URL] = js.undefined
  
  var paymentDue: MoneyV2
  
  /**
    * @deprecated
    */
  var paymentDueV2: MoneyV2
  
  var ready: Boolean
  
  var requiresShipping: Boolean
  
  var shippingAddress: js.UndefOr[MailingAddress] = js.undefined
  
  var shippingDiscountAllocations: js.Array[DiscountAllocation]
  
  var shippingLine: js.UndefOr[ShippingRate] = js.undefined
  
  var subtotalPrice: MoneyV2
  
  /**
    * @deprecated
    */
  var subtotalPriceV2: MoneyV2
  
  var taxExempt: Boolean
  
  var taxesIncluded: Boolean
  
  var totalDuties: js.UndefOr[MoneyV2] = js.undefined
  
  var totalPrice: MoneyV2
  
  /**
    * @deprecated
    */
  var totalPriceV2: MoneyV2
  
  var totalTax: MoneyV2
  
  /**
    * @deprecated
    */
  var totalTaxV2: MoneyV2
  
  var updatedAt: DateTime
  
  var webUrl: URL
}
object Checkout {
  
  inline def apply(
    appliedGiftCards: js.Array[AppliedGiftCard],
    buyerIdentity: CheckoutBuyerIdentity,
    createdAt: DateTime,
    currencyCode: CurrencyCode,
    customAttributes: js.Array[Attribute],
    discountApplications: js.Array[DiscountApplication],
    id: ID,
    lineItems: js.Array[CheckoutLineItem],
    lineItemsSubtotalPrice: MoneyV2,
    paymentDue: MoneyV2,
    paymentDueV2: MoneyV2,
    ready: Boolean,
    requiresShipping: Boolean,
    shippingDiscountAllocations: js.Array[DiscountAllocation],
    subtotalPrice: MoneyV2,
    subtotalPriceV2: MoneyV2,
    taxExempt: Boolean,
    taxesIncluded: Boolean,
    totalPrice: MoneyV2,
    totalPriceV2: MoneyV2,
    totalTax: MoneyV2,
    totalTaxV2: MoneyV2,
    updatedAt: DateTime,
    webUrl: URL
  ): Checkout = {
    val __obj = js.Dynamic.literal(appliedGiftCards = appliedGiftCards.asInstanceOf[js.Any], buyerIdentity = buyerIdentity.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], currencyCode = currencyCode.asInstanceOf[js.Any], customAttributes = customAttributes.asInstanceOf[js.Any], discountApplications = discountApplications.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lineItems = lineItems.asInstanceOf[js.Any], lineItemsSubtotalPrice = lineItemsSubtotalPrice.asInstanceOf[js.Any], paymentDue = paymentDue.asInstanceOf[js.Any], paymentDueV2 = paymentDueV2.asInstanceOf[js.Any], ready = ready.asInstanceOf[js.Any], requiresShipping = requiresShipping.asInstanceOf[js.Any], shippingDiscountAllocations = shippingDiscountAllocations.asInstanceOf[js.Any], subtotalPrice = subtotalPrice.asInstanceOf[js.Any], subtotalPriceV2 = subtotalPriceV2.asInstanceOf[js.Any], taxExempt = taxExempt.asInstanceOf[js.Any], taxesIncluded = taxesIncluded.asInstanceOf[js.Any], totalPrice = totalPrice.asInstanceOf[js.Any], totalPriceV2 = totalPriceV2.asInstanceOf[js.Any], totalTax = totalTax.asInstanceOf[js.Any], totalTaxV2 = totalTaxV2.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any], webUrl = webUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Checkout]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Checkout] (val x: Self) extends AnyVal {
    
    inline def setAppliedGiftCards(value: js.Array[AppliedGiftCard]): Self = StObject.set(x, "appliedGiftCards", value.asInstanceOf[js.Any])
    
    inline def setAppliedGiftCardsVarargs(value: AppliedGiftCard*): Self = StObject.set(x, "appliedGiftCards", js.Array(value*))
    
    inline def setAvailableShippingRates(value: AvailableShippingRates): Self = StObject.set(x, "availableShippingRates", value.asInstanceOf[js.Any])
    
    inline def setAvailableShippingRatesUndefined: Self = StObject.set(x, "availableShippingRates", js.undefined)
    
    inline def setBuyerIdentity(value: CheckoutBuyerIdentity): Self = StObject.set(x, "buyerIdentity", value.asInstanceOf[js.Any])
    
    inline def setCompletedAt(value: DateTime): Self = StObject.set(x, "completedAt", value.asInstanceOf[js.Any])
    
    inline def setCompletedAtUndefined: Self = StObject.set(x, "completedAt", js.undefined)
    
    inline def setCreatedAt(value: DateTime): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCurrencyCode(value: CurrencyCode): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
    
    inline def setCustomAttributes(value: js.Array[Attribute]): Self = StObject.set(x, "customAttributes", value.asInstanceOf[js.Any])
    
    inline def setCustomAttributesVarargs(value: Attribute*): Self = StObject.set(x, "customAttributes", js.Array(value*))
    
    inline def setDiscountApplications(value: js.Array[DiscountApplication]): Self = StObject.set(x, "discountApplications", value.asInstanceOf[js.Any])
    
    inline def setDiscountApplicationsVarargs(value: DiscountApplication*): Self = StObject.set(x, "discountApplications", js.Array(value*))
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setLineItems(value: js.Array[CheckoutLineItem]): Self = StObject.set(x, "lineItems", value.asInstanceOf[js.Any])
    
    inline def setLineItemsSubtotalPrice(value: MoneyV2): Self = StObject.set(x, "lineItemsSubtotalPrice", value.asInstanceOf[js.Any])
    
    inline def setLineItemsVarargs(value: CheckoutLineItem*): Self = StObject.set(x, "lineItems", js.Array(value*))
    
    inline def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setOrder(value: Order): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderStatusUrl(value: URL): Self = StObject.set(x, "orderStatusUrl", value.asInstanceOf[js.Any])
    
    inline def setOrderStatusUrlUndefined: Self = StObject.set(x, "orderStatusUrl", js.undefined)
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setPaymentDue(value: MoneyV2): Self = StObject.set(x, "paymentDue", value.asInstanceOf[js.Any])
    
    inline def setPaymentDueV2(value: MoneyV2): Self = StObject.set(x, "paymentDueV2", value.asInstanceOf[js.Any])
    
    inline def setReady(value: Boolean): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
    
    inline def setRequiresShipping(value: Boolean): Self = StObject.set(x, "requiresShipping", value.asInstanceOf[js.Any])
    
    inline def setShippingAddress(value: MailingAddress): Self = StObject.set(x, "shippingAddress", value.asInstanceOf[js.Any])
    
    inline def setShippingAddressUndefined: Self = StObject.set(x, "shippingAddress", js.undefined)
    
    inline def setShippingDiscountAllocations(value: js.Array[DiscountAllocation]): Self = StObject.set(x, "shippingDiscountAllocations", value.asInstanceOf[js.Any])
    
    inline def setShippingDiscountAllocationsVarargs(value: DiscountAllocation*): Self = StObject.set(x, "shippingDiscountAllocations", js.Array(value*))
    
    inline def setShippingLine(value: ShippingRate): Self = StObject.set(x, "shippingLine", value.asInstanceOf[js.Any])
    
    inline def setShippingLineUndefined: Self = StObject.set(x, "shippingLine", js.undefined)
    
    inline def setSubtotalPrice(value: MoneyV2): Self = StObject.set(x, "subtotalPrice", value.asInstanceOf[js.Any])
    
    inline def setSubtotalPriceV2(value: MoneyV2): Self = StObject.set(x, "subtotalPriceV2", value.asInstanceOf[js.Any])
    
    inline def setTaxExempt(value: Boolean): Self = StObject.set(x, "taxExempt", value.asInstanceOf[js.Any])
    
    inline def setTaxesIncluded(value: Boolean): Self = StObject.set(x, "taxesIncluded", value.asInstanceOf[js.Any])
    
    inline def setTotalDuties(value: MoneyV2): Self = StObject.set(x, "totalDuties", value.asInstanceOf[js.Any])
    
    inline def setTotalDutiesUndefined: Self = StObject.set(x, "totalDuties", js.undefined)
    
    inline def setTotalPrice(value: MoneyV2): Self = StObject.set(x, "totalPrice", value.asInstanceOf[js.Any])
    
    inline def setTotalPriceV2(value: MoneyV2): Self = StObject.set(x, "totalPriceV2", value.asInstanceOf[js.Any])
    
    inline def setTotalTax(value: MoneyV2): Self = StObject.set(x, "totalTax", value.asInstanceOf[js.Any])
    
    inline def setTotalTaxV2(value: MoneyV2): Self = StObject.set(x, "totalTaxV2", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAt(value: DateTime): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
    
    inline def setWebUrl(value: URL): Self = StObject.set(x, "webUrl", value.asInstanceOf[js.Any])
  }
}
