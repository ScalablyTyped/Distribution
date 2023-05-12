package typings.recurlyRecurlyJs

import typings.recurlyRecurlyJs.anon.Address1
import typings.recurlyRecurlyJs.anon.AdministrativeArea
import typings.recurlyRecurlyJs.anon.Id
import typings.recurlyRecurlyJs.anon.RedemptionCodes
import typings.recurlyRecurlyJs.libTokenMod.TokenPayload
import typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.COMPLETE_IMMEDIATE_PURCHASE
import typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.DEFAULT
import typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.ESTIMATED
import typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.FINAL
import typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.INITIALIZE
import typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.LINE_ITEM
import typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.OFFER
import typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.OFFER_INVALID
import typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.OTHER_ERROR
import typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.PAYMENT_AUTHORIZATION
import typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.PAYMENT_DATA_INVALID
import typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.PENDING
import typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.SHIPPING_ADDRESS
import typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.SHIPPING_ADDRESS_INVALID
import typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.SHIPPING_ADDRESS_UNSERVICEABLE
import typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.SHIPPING_OPTION
import typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.SHIPPING_OPTION_INVALID
import typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.SUBTOTAL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGooglePayNativeMod {
  
  trait GooglePayDisplayItem extends StObject {
    
    /**
      * The label to be displayed for the given option.
      */
    var label: String
    
    /**
      * The monetary value of the cart item with an optional decimal precision of two decimal places. Negative values are allowed.
      */
    var price: String
    
    /**
      * Ddefine price variance.
      * Default to FINAL if not provided
      */
    var status: js.UndefOr[FINAL | PENDING] = js.undefined
    
    /**
      * Type of displayed line item.
      */
    var `type`: LINE_ITEM | SUBTOTAL
  }
  object GooglePayDisplayItem {
    
    inline def apply(label: String, price: String, `type`: LINE_ITEM | SUBTOTAL): GooglePayDisplayItem = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[GooglePayDisplayItem]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GooglePayDisplayItem] (val x: Self) extends AnyVal {
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setPrice(value: String): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: FINAL | PENDING): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setType(value: LINE_ITEM | SUBTOTAL): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait GooglePayIntermediatePaymentData extends StObject {
    
    var callbackTrigger: js.UndefOr[INITIALIZE | SHIPPING_ADDRESS | SHIPPING_OPTION | OFFER] = js.undefined
    
    var offerData: js.UndefOr[RedemptionCodes] = js.undefined
    
    var shippingAddress: js.UndefOr[AdministrativeArea] = js.undefined
    
    var shippingOptionData: js.UndefOr[Id] = js.undefined
  }
  object GooglePayIntermediatePaymentData {
    
    inline def apply(): GooglePayIntermediatePaymentData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GooglePayIntermediatePaymentData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GooglePayIntermediatePaymentData] (val x: Self) extends AnyVal {
      
      inline def setCallbackTrigger(value: INITIALIZE | SHIPPING_ADDRESS | SHIPPING_OPTION | OFFER): Self = StObject.set(x, "callbackTrigger", value.asInstanceOf[js.Any])
      
      inline def setCallbackTriggerUndefined: Self = StObject.set(x, "callbackTrigger", js.undefined)
      
      inline def setOfferData(value: RedemptionCodes): Self = StObject.set(x, "offerData", value.asInstanceOf[js.Any])
      
      inline def setOfferDataUndefined: Self = StObject.set(x, "offerData", js.undefined)
      
      inline def setShippingAddress(value: AdministrativeArea): Self = StObject.set(x, "shippingAddress", value.asInstanceOf[js.Any])
      
      inline def setShippingAddressUndefined: Self = StObject.set(x, "shippingAddress", js.undefined)
      
      inline def setShippingOptionData(value: Id): Self = StObject.set(x, "shippingOptionData", value.asInstanceOf[js.Any])
      
      inline def setShippingOptionDataUndefined: Self = StObject.set(x, "shippingOptionData", js.undefined)
    }
  }
  
  trait GooglePayMerchantInfo extends StObject {
    
    /**
      * The Google merchant identifier issued after registration with the Google Pay and Wallet Console.
      */
    var merchantId: js.UndefOr[String] = js.undefined
    
    /**
      * The Google merchant business name registered with the Google Pay and Wallet Console.
      */
    var merchantName: js.UndefOr[String] = js.undefined
    
    /**
      * The fully qualified domain of the requesting merchant.
      */
    var merchantOrigin: js.UndefOr[String] = js.undefined
  }
  object GooglePayMerchantInfo {
    
    inline def apply(): GooglePayMerchantInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GooglePayMerchantInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GooglePayMerchantInfo] (val x: Self) extends AnyVal {
      
      inline def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
      
      inline def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
      
      inline def setMerchantName(value: String): Self = StObject.set(x, "merchantName", value.asInstanceOf[js.Any])
      
      inline def setMerchantNameUndefined: Self = StObject.set(x, "merchantName", js.undefined)
      
      inline def setMerchantOrigin(value: String): Self = StObject.set(x, "merchantOrigin", value.asInstanceOf[js.Any])
      
      inline def setMerchantOriginUndefined: Self = StObject.set(x, "merchantOrigin", js.undefined)
    }
  }
  
  trait GooglePayOfferDetail extends StObject {
    
    /**
      * A description of the promotion applied by the Offer code.
      */
    var description: String
    
    /**
      * The promotional code associated with the Offer. Should be the same as the code entered into the payment sheet.
      */
    var redemptionCode: String
  }
  object GooglePayOfferDetail {
    
    inline def apply(description: String, redemptionCode: String): GooglePayOfferDetail = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], redemptionCode = redemptionCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[GooglePayOfferDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GooglePayOfferDetail] (val x: Self) extends AnyVal {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setRedemptionCode(value: String): Self = StObject.set(x, "redemptionCode", value.asInstanceOf[js.Any])
    }
  }
  
  trait GooglePayOfferInfo extends StObject {
    
    var offers: js.Array[GooglePayOfferDetail]
  }
  object GooglePayOfferInfo {
    
    inline def apply(offers: js.Array[GooglePayOfferDetail]): GooglePayOfferInfo = {
      val __obj = js.Dynamic.literal(offers = offers.asInstanceOf[js.Any])
      __obj.asInstanceOf[GooglePayOfferInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GooglePayOfferInfo] (val x: Self) extends AnyVal {
      
      inline def setOffers(value: js.Array[GooglePayOfferDetail]): Self = StObject.set(x, "offers", value.asInstanceOf[js.Any])
      
      inline def setOffersVarargs(value: GooglePayOfferDetail*): Self = StObject.set(x, "offers", js.Array(value*))
    }
  }
  
  trait GooglePayPaymentData extends StObject {
    
    var email: js.UndefOr[String] = js.undefined
    
    var recurlyToken: TokenPayload
    
    var shippingAddress: js.UndefOr[Address1] = js.undefined
  }
  object GooglePayPaymentData {
    
    inline def apply(recurlyToken: TokenPayload): GooglePayPaymentData = {
      val __obj = js.Dynamic.literal(recurlyToken = recurlyToken.asInstanceOf[js.Any])
      __obj.asInstanceOf[GooglePayPaymentData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GooglePayPaymentData] (val x: Self) extends AnyVal {
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setRecurlyToken(value: TokenPayload): Self = StObject.set(x, "recurlyToken", value.asInstanceOf[js.Any])
      
      inline def setShippingAddress(value: Address1): Self = StObject.set(x, "shippingAddress", value.asInstanceOf[js.Any])
      
      inline def setShippingAddressUndefined: Self = StObject.set(x, "shippingAddress", js.undefined)
    }
  }
  
  trait GooglePayPaymentDataError extends StObject {
    
    /**
      * The intent of the error.
      */
    var intent: OFFER | PAYMENT_AUTHORIZATION | SHIPPING_ADDRESS | SHIPPING_OPTION
    
    /**
      * Error message to the user that's displayed in a dialog.
      */
    var message: String
    
    var reason: OFFER_INVALID | PAYMENT_DATA_INVALID | SHIPPING_ADDRESS_INVALID | SHIPPING_ADDRESS_UNSERVICEABLE | SHIPPING_OPTION_INVALID | OTHER_ERROR
  }
  object GooglePayPaymentDataError {
    
    inline def apply(
      intent: OFFER | PAYMENT_AUTHORIZATION | SHIPPING_ADDRESS | SHIPPING_OPTION,
      message: String,
      reason: OFFER_INVALID | PAYMENT_DATA_INVALID | SHIPPING_ADDRESS_INVALID | SHIPPING_ADDRESS_UNSERVICEABLE | SHIPPING_OPTION_INVALID | OTHER_ERROR
    ): GooglePayPaymentDataError = {
      val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
      __obj.asInstanceOf[GooglePayPaymentDataError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GooglePayPaymentDataError] (val x: Self) extends AnyVal {
      
      inline def setIntent(value: OFFER | PAYMENT_AUTHORIZATION | SHIPPING_ADDRESS | SHIPPING_OPTION): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setReason(
        value: OFFER_INVALID | PAYMENT_DATA_INVALID | SHIPPING_ADDRESS_INVALID | SHIPPING_ADDRESS_UNSERVICEABLE | SHIPPING_OPTION_INVALID | OTHER_ERROR
      ): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    }
  }
  
  trait GooglePayPaymentDataRequest extends StObject {
    
    /**
      * Request an email address.
      */
    var emailRequired: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Information about the merchant that requests payment data.
      */
    var merchantInfo: js.UndefOr[GooglePayMerchantInfo] = js.undefined
    
    /**
      * Specifies which offers to apply when the payment sheet first loads.
      */
    var offerInfo: js.UndefOr[GooglePayOfferInfo] = js.undefined
    
    /**
      * If shippingAddressRequired is set to true, specify shipping address restrictions.
      */
    var shippingAddressParameters: js.UndefOr[GooglePayShippingAddressParameters] = js.undefined
    
    /**
      * Request an shipping address.
      */
    var shippingAddressRequired: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If shippingOptionRequired is set to true, specify shipping options.
      */
    var shippingOptionParameters: js.UndefOr[GooglePayShippingOptionParameters] = js.undefined
    
    /**
      * Request an shipping option.
      * This field is required if you implement support for Authorize Payments or Dynamic Price Updates.
      */
    var shippingOptionRequired: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Details about the authorization of the transaction based upon whether the user agrees to the transaction or not.
      */
    var transactionInfo: js.UndefOr[GooglePayTransactionInfo] = js.undefined
  }
  object GooglePayPaymentDataRequest {
    
    inline def apply(): GooglePayPaymentDataRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GooglePayPaymentDataRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GooglePayPaymentDataRequest] (val x: Self) extends AnyVal {
      
      inline def setEmailRequired(value: Boolean): Self = StObject.set(x, "emailRequired", value.asInstanceOf[js.Any])
      
      inline def setEmailRequiredUndefined: Self = StObject.set(x, "emailRequired", js.undefined)
      
      inline def setMerchantInfo(value: GooglePayMerchantInfo): Self = StObject.set(x, "merchantInfo", value.asInstanceOf[js.Any])
      
      inline def setMerchantInfoUndefined: Self = StObject.set(x, "merchantInfo", js.undefined)
      
      inline def setOfferInfo(value: GooglePayOfferInfo): Self = StObject.set(x, "offerInfo", value.asInstanceOf[js.Any])
      
      inline def setOfferInfoUndefined: Self = StObject.set(x, "offerInfo", js.undefined)
      
      inline def setShippingAddressParameters(value: GooglePayShippingAddressParameters): Self = StObject.set(x, "shippingAddressParameters", value.asInstanceOf[js.Any])
      
      inline def setShippingAddressParametersUndefined: Self = StObject.set(x, "shippingAddressParameters", js.undefined)
      
      inline def setShippingAddressRequired(value: Boolean): Self = StObject.set(x, "shippingAddressRequired", value.asInstanceOf[js.Any])
      
      inline def setShippingAddressRequiredUndefined: Self = StObject.set(x, "shippingAddressRequired", js.undefined)
      
      inline def setShippingOptionParameters(value: GooglePayShippingOptionParameters): Self = StObject.set(x, "shippingOptionParameters", value.asInstanceOf[js.Any])
      
      inline def setShippingOptionParametersUndefined: Self = StObject.set(x, "shippingOptionParameters", js.undefined)
      
      inline def setShippingOptionRequired(value: Boolean): Self = StObject.set(x, "shippingOptionRequired", value.asInstanceOf[js.Any])
      
      inline def setShippingOptionRequiredUndefined: Self = StObject.set(x, "shippingOptionRequired", js.undefined)
      
      inline def setTransactionInfo(value: GooglePayTransactionInfo): Self = StObject.set(x, "transactionInfo", value.asInstanceOf[js.Any])
      
      inline def setTransactionInfoUndefined: Self = StObject.set(x, "transactionInfo", js.undefined)
    }
  }
  
  trait GooglePayPaymentDataRequestUpdate extends StObject {
    
    /**
      * Adds an error message to the payment sheet.
      */
    var error: js.UndefOr[GooglePayPaymentDataError] = js.undefined
    
    /**
      * Updates the offers currently active in the payment sheet.
      */
    var newOfferInfo: js.UndefOr[GooglePayOfferInfo] = js.undefined
    
    /**
      * Updates the shipping options in the payment sheet.
      */
    var newShippingOptionParameters: js.UndefOr[GooglePayShippingOptionParameters] = js.undefined
    
    /**
      * Updates the transaction info in the payment sheet.
      */
    var newTransactionInfo: js.UndefOr[GooglePayTransactionInfo] = js.undefined
  }
  object GooglePayPaymentDataRequestUpdate {
    
    inline def apply(): GooglePayPaymentDataRequestUpdate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GooglePayPaymentDataRequestUpdate]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GooglePayPaymentDataRequestUpdate] (val x: Self) extends AnyVal {
      
      inline def setError(value: GooglePayPaymentDataError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setNewOfferInfo(value: GooglePayOfferInfo): Self = StObject.set(x, "newOfferInfo", value.asInstanceOf[js.Any])
      
      inline def setNewOfferInfoUndefined: Self = StObject.set(x, "newOfferInfo", js.undefined)
      
      inline def setNewShippingOptionParameters(value: GooglePayShippingOptionParameters): Self = StObject.set(x, "newShippingOptionParameters", value.asInstanceOf[js.Any])
      
      inline def setNewShippingOptionParametersUndefined: Self = StObject.set(x, "newShippingOptionParameters", js.undefined)
      
      inline def setNewTransactionInfo(value: GooglePayTransactionInfo): Self = StObject.set(x, "newTransactionInfo", value.asInstanceOf[js.Any])
      
      inline def setNewTransactionInfoUndefined: Self = StObject.set(x, "newTransactionInfo", js.undefined)
    }
  }
  
  trait GooglePaySelectionOption extends StObject {
    
    /**
      * A descriptive text that is displayed below the option label.
      */
    var description: js.UndefOr[String] = js.undefined
    
    /**
      * The developer can put any value that needs to be returned in PaymentData.
      */
    var id: String
    
    /**
      * The label to be displayed as the option.
      */
    var label: String
  }
  object GooglePaySelectionOption {
    
    inline def apply(id: String, label: String): GooglePaySelectionOption = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[GooglePaySelectionOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GooglePaySelectionOption] (val x: Self) extends AnyVal {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    }
  }
  
  trait GooglePayShippingAddressParameters extends StObject {
    
    /**
      * ISO 3166-1 alpha-2 country code values of the countries where shipping is allowed.
      * If this object isn't specified, all shipping address countries are allowed.
      */
    var allowedCountryCodes: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Set to true if a phone number is required for the provided shipping address.
      */
    var phoneNumberRequired: js.UndefOr[Boolean] = js.undefined
  }
  object GooglePayShippingAddressParameters {
    
    inline def apply(): GooglePayShippingAddressParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GooglePayShippingAddressParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GooglePayShippingAddressParameters] (val x: Self) extends AnyVal {
      
      inline def setAllowedCountryCodes(value: js.Array[String]): Self = StObject.set(x, "allowedCountryCodes", value.asInstanceOf[js.Any])
      
      inline def setAllowedCountryCodesUndefined: Self = StObject.set(x, "allowedCountryCodes", js.undefined)
      
      inline def setAllowedCountryCodesVarargs(value: String*): Self = StObject.set(x, "allowedCountryCodes", js.Array(value*))
      
      inline def setPhoneNumberRequired(value: Boolean): Self = StObject.set(x, "phoneNumberRequired", value.asInstanceOf[js.Any])
      
      inline def setPhoneNumberRequiredUndefined: Self = StObject.set(x, "phoneNumberRequired", js.undefined)
    }
  }
  
  trait GooglePayShippingOptionParameters extends StObject {
    
    /**
      * An identifier to the default selected shipping option.
      * If this field isn't provided, the first option is the default option.
      */
    var defaultSelectedOptionId: js.UndefOr[String] = js.undefined
    
    /**
      * All of the shipping options available for the current request.
      */
    var shippingOptions: js.Array[GooglePaySelectionOption]
  }
  object GooglePayShippingOptionParameters {
    
    inline def apply(shippingOptions: js.Array[GooglePaySelectionOption]): GooglePayShippingOptionParameters = {
      val __obj = js.Dynamic.literal(shippingOptions = shippingOptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[GooglePayShippingOptionParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GooglePayShippingOptionParameters] (val x: Self) extends AnyVal {
      
      inline def setDefaultSelectedOptionId(value: String): Self = StObject.set(x, "defaultSelectedOptionId", value.asInstanceOf[js.Any])
      
      inline def setDefaultSelectedOptionIdUndefined: Self = StObject.set(x, "defaultSelectedOptionId", js.undefined)
      
      inline def setShippingOptions(value: js.Array[GooglePaySelectionOption]): Self = StObject.set(x, "shippingOptions", value.asInstanceOf[js.Any])
      
      inline def setShippingOptionsVarargs(value: GooglePaySelectionOption*): Self = StObject.set(x, "shippingOptions", js.Array(value*))
    }
  }
  
  trait GooglePayTransactionInfo extends StObject {
    
    /**
      * Affects the submit button text displayed in the Google Pay payment sheet.
      */
    var checkoutOption: js.UndefOr[DEFAULT | COMPLETE_IMMEDIATE_PURCHASE] = js.undefined
    
    /*
      * Your ISO 3166 country code (ex: ‘US’). This is your country code as the merchant.
      */
    var countryCode: js.UndefOr[String] = js.undefined
    
    /**
      * ISO 4217 purchase currency (ex: ‘USD’).
      */
    var currencyCode: js.UndefOr[String] = js.undefined
    
    /**
      * All of the available charges for the current payment request.
      * Required and only populated in the payment sheet if you use Authorize Payments or Dynamic Price Updates.
      */
    var displayItems: js.UndefOr[js.Array[GooglePayDisplayItem]] = js.undefined
    
    /**
      * Total cost to display in the Google Pay payment sheet.
      */
    var totalPrice: js.UndefOr[String] = js.undefined
    
    /**
      * Label for the total price within the display items.
      */
    var totalPriceLabel: js.UndefOr[String] = js.undefined
    
    /**
      * The status of the total price used:
      */
    var totalPriceStatus: js.UndefOr[ESTIMATED | FINAL] = js.undefined
  }
  object GooglePayTransactionInfo {
    
    inline def apply(): GooglePayTransactionInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GooglePayTransactionInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GooglePayTransactionInfo] (val x: Self) extends AnyVal {
      
      inline def setCheckoutOption(value: DEFAULT | COMPLETE_IMMEDIATE_PURCHASE): Self = StObject.set(x, "checkoutOption", value.asInstanceOf[js.Any])
      
      inline def setCheckoutOptionUndefined: Self = StObject.set(x, "checkoutOption", js.undefined)
      
      inline def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
      
      inline def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
      
      inline def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
      
      inline def setCurrencyCodeUndefined: Self = StObject.set(x, "currencyCode", js.undefined)
      
      inline def setDisplayItems(value: js.Array[GooglePayDisplayItem]): Self = StObject.set(x, "displayItems", value.asInstanceOf[js.Any])
      
      inline def setDisplayItemsUndefined: Self = StObject.set(x, "displayItems", js.undefined)
      
      inline def setDisplayItemsVarargs(value: GooglePayDisplayItem*): Self = StObject.set(x, "displayItems", js.Array(value*))
      
      inline def setTotalPrice(value: String): Self = StObject.set(x, "totalPrice", value.asInstanceOf[js.Any])
      
      inline def setTotalPriceLabel(value: String): Self = StObject.set(x, "totalPriceLabel", value.asInstanceOf[js.Any])
      
      inline def setTotalPriceLabelUndefined: Self = StObject.set(x, "totalPriceLabel", js.undefined)
      
      inline def setTotalPriceStatus(value: ESTIMATED | FINAL): Self = StObject.set(x, "totalPriceStatus", value.asInstanceOf[js.Any])
      
      inline def setTotalPriceStatusUndefined: Self = StObject.set(x, "totalPriceStatus", js.undefined)
      
      inline def setTotalPriceUndefined: Self = StObject.set(x, "totalPrice", js.undefined)
    }
  }
}
