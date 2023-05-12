package typings.recurlyRecurlyJs

import typings.recurlyRecurlyJs.lib3dSecureMod.ThreeDSecureEvent
import typings.recurlyRecurlyJs.libAdyenMod.AdyenEvent
import typings.recurlyRecurlyJs.libAlternativePaymentMethodsMod.AdyenEnvironmentType
import typings.recurlyRecurlyJs.libAlternativePaymentMethodsMod.AlternativePaymentMethodEvents
import typings.recurlyRecurlyJs.libAlternativePaymentMethodsMod.ChannelType
import typings.recurlyRecurlyJs.libApplePayMod.ApplePayEvent
import typings.recurlyRecurlyJs.libApplePayNativeMod.ApplePayContactField
import typings.recurlyRecurlyJs.libApplePayNativeMod.ApplePayErrorCode
import typings.recurlyRecurlyJs.libApplePayNativeMod.ApplePayErrorContactField
import typings.recurlyRecurlyJs.libApplePayNativeMod.ApplePayPaymentTiming
import typings.recurlyRecurlyJs.libApplePayNativeMod.ApplePayRecurringPaymentDateUnit
import typings.recurlyRecurlyJs.libBankRedirectMod.BankRedirectEvent
import typings.recurlyRecurlyJs.libBankRedirectMod.PaymentMethodType
import typings.recurlyRecurlyJs.libElementsMod.ElementEvent
import typings.recurlyRecurlyJs.libGooglePayMod.GooglePayEvent
import typings.recurlyRecurlyJs.libPaypalMod.PayPalEvent
import typings.recurlyRecurlyJs.libPricingMod.PricingEvent
import typings.recurlyRecurlyJs.libRecurlyMod.RecurlyEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object recurlyRecurlyJsStrings {
  
  @js.native
  sealed trait Android
    extends StObject
       with ChannelType
  inline def Android: Android = "Android".asInstanceOf[Android]
  
  @js.native
  sealed trait COMPLETE_IMMEDIATE_PURCHASE extends StObject
  inline def COMPLETE_IMMEDIATE_PURCHASE: COMPLETE_IMMEDIATE_PURCHASE = "COMPLETE_IMMEDIATE_PURCHASE".asInstanceOf[COMPLETE_IMMEDIATE_PURCHASE]
  
  @js.native
  sealed trait DEFAULT extends StObject
  inline def DEFAULT: DEFAULT = "DEFAULT".asInstanceOf[DEFAULT]
  
  @js.native
  sealed trait ESTIMATED extends StObject
  inline def ESTIMATED: ESTIMATED = "ESTIMATED".asInstanceOf[ESTIMATED]
  
  @js.native
  sealed trait FINAL extends StObject
  inline def FINAL: FINAL = "FINAL".asInstanceOf[FINAL]
  
  @js.native
  sealed trait INITIALIZE extends StObject
  inline def INITIALIZE: INITIALIZE = "INITIALIZE".asInstanceOf[INITIALIZE]
  
  @js.native
  sealed trait LINE_ITEM extends StObject
  inline def LINE_ITEM: LINE_ITEM = "LINE_ITEM".asInstanceOf[LINE_ITEM]
  
  @js.native
  sealed trait OFFER extends StObject
  inline def OFFER: OFFER = "OFFER".asInstanceOf[OFFER]
  
  @js.native
  sealed trait OFFER_INVALID extends StObject
  inline def OFFER_INVALID: OFFER_INVALID = "OFFER_INVALID".asInstanceOf[OFFER_INVALID]
  
  @js.native
  sealed trait OTHER_ERROR extends StObject
  inline def OTHER_ERROR: OTHER_ERROR = "OTHER_ERROR".asInstanceOf[OTHER_ERROR]
  
  @js.native
  sealed trait PAYMENT_AUTHORIZATION extends StObject
  inline def PAYMENT_AUTHORIZATION: PAYMENT_AUTHORIZATION = "PAYMENT_AUTHORIZATION".asInstanceOf[PAYMENT_AUTHORIZATION]
  
  @js.native
  sealed trait PAYMENT_DATA_INVALID extends StObject
  inline def PAYMENT_DATA_INVALID: PAYMENT_DATA_INVALID = "PAYMENT_DATA_INVALID".asInstanceOf[PAYMENT_DATA_INVALID]
  
  @js.native
  sealed trait PENDING extends StObject
  inline def PENDING: PENDING = "PENDING".asInstanceOf[PENDING]
  
  @js.native
  sealed trait SHIPPING_ADDRESS extends StObject
  inline def SHIPPING_ADDRESS: SHIPPING_ADDRESS = "SHIPPING_ADDRESS".asInstanceOf[SHIPPING_ADDRESS]
  
  @js.native
  sealed trait SHIPPING_ADDRESS_INVALID extends StObject
  inline def SHIPPING_ADDRESS_INVALID: SHIPPING_ADDRESS_INVALID = "SHIPPING_ADDRESS_INVALID".asInstanceOf[SHIPPING_ADDRESS_INVALID]
  
  @js.native
  sealed trait SHIPPING_ADDRESS_UNSERVICEABLE extends StObject
  inline def SHIPPING_ADDRESS_UNSERVICEABLE: SHIPPING_ADDRESS_UNSERVICEABLE = "SHIPPING_ADDRESS_UNSERVICEABLE".asInstanceOf[SHIPPING_ADDRESS_UNSERVICEABLE]
  
  @js.native
  sealed trait SHIPPING_OPTION extends StObject
  inline def SHIPPING_OPTION: SHIPPING_OPTION = "SHIPPING_OPTION".asInstanceOf[SHIPPING_OPTION]
  
  @js.native
  sealed trait SHIPPING_OPTION_INVALID extends StObject
  inline def SHIPPING_OPTION_INVALID: SHIPPING_OPTION_INVALID = "SHIPPING_OPTION_INVALID".asInstanceOf[SHIPPING_OPTION_INVALID]
  
  @js.native
  sealed trait SUBTOTAL extends StObject
  inline def SUBTOTAL: SUBTOTAL = "SUBTOTAL".asInstanceOf[SUBTOTAL]
  
  @js.native
  sealed trait Web
    extends StObject
       with ChannelType
  inline def Web: Web = "Web".asInstanceOf[Web]
  
  @js.native
  sealed trait addressLines
    extends StObject
       with ApplePayErrorContactField
  inline def addressLines: addressLines = "addressLines".asInstanceOf[addressLines]
  
  @js.native
  sealed trait addressUnserviceable
    extends StObject
       with ApplePayErrorCode
  inline def addressUnserviceable: addressUnserviceable = "addressUnserviceable".asInstanceOf[addressUnserviceable]
  
  @js.native
  sealed trait administrativeArea
    extends StObject
       with ApplePayErrorContactField
  inline def administrativeArea: administrativeArea = "administrativeArea".asInstanceOf[administrativeArea]
  
  @js.native
  sealed trait attach
    extends StObject
       with ElementEvent
  inline def attach: attach = "attach".asInstanceOf[attach]
  
  @js.native
  sealed trait bacs extends StObject
  inline def bacs: bacs = "bacs".asInstanceOf[bacs]
  
  @js.native
  sealed trait banks
    extends StObject
       with BankRedirectEvent
  inline def banks: banks = "banks".asInstanceOf[banks]
  
  @js.native
  sealed trait becs extends StObject
  inline def becs: becs = "becs".asInstanceOf[becs]
  
  @js.native
  sealed trait billingContactInvalid
    extends StObject
       with ApplePayErrorCode
  inline def billingContactInvalid: billingContactInvalid = "billingContactInvalid".asInstanceOf[billingContactInvalid]
  
  @js.native
  sealed trait blur
    extends StObject
       with ElementEvent
  inline def blur: blur = "blur".asInstanceOf[blur]
  
  @js.native
  sealed trait boleto extends StObject
  inline def boleto: boleto = "boleto".asInstanceOf[boleto]
  
  @js.native
  sealed trait cancel
    extends StObject
       with ApplePayEvent
       with PayPalEvent
  inline def cancel: cancel = "cancel".asInstanceOf[cancel]
  
  @js.native
  sealed trait change
    extends StObject
       with ElementEvent
       with PricingEvent
       with RecurlyEvent
  inline def change: change = "change".asInstanceOf[change]
  
  @js.native
  sealed trait countries
    extends StObject
       with BankRedirectEvent
  inline def countries: countries = "countries".asInstanceOf[countries]
  
  @js.native
  sealed trait country
    extends StObject
       with ApplePayErrorContactField
  inline def country: country = "country".asInstanceOf[country]
  
  @js.native
  sealed trait countryCode
    extends StObject
       with ApplePayErrorContactField
  inline def countryCode: countryCode = "countryCode".asInstanceOf[countryCode]
  
  @js.native
  sealed trait credit extends StObject
  inline def credit: credit = "credit".asInstanceOf[credit]
  
  @js.native
  sealed trait debit extends StObject
  inline def debit: debit = "debit".asInstanceOf[debit]
  
  @js.native
  sealed trait email
    extends StObject
       with ApplePayContactField
  inline def email: email = "email".asInstanceOf[email]
  
  @js.native
  sealed trait emailAddress
    extends StObject
       with ApplePayErrorContactField
  inline def emailAddress: emailAddress = "emailAddress".asInstanceOf[emailAddress]
  
  @js.native
  sealed trait error
    extends StObject
       with AdyenEvent
       with AlternativePaymentMethodEvents
       with ApplePayEvent
       with BankRedirectEvent
       with GooglePayEvent
       with PayPalEvent
       with RecurlyEvent
       with ThreeDSecureEvent
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait errorDotcoupon
    extends StObject
       with PricingEvent
  inline def errorDotcoupon: errorDotcoupon = "error.coupon".asInstanceOf[errorDotcoupon]
  
  @js.native
  sealed trait fieldColonsubmit
    extends StObject
       with RecurlyEvent
  inline def fieldColonsubmit: fieldColonsubmit = "field:submit".asInstanceOf[fieldColonsubmit]
  
  @js.native
  sealed trait focus
    extends StObject
       with ElementEvent
  inline def focus: focus = "focus".asInstanceOf[focus]
  
  @js.native
  sealed trait iOS
    extends StObject
       with ChannelType
  inline def iOS: iOS = "iOS".asInstanceOf[iOS]
  
  @js.native
  sealed trait ideal
    extends StObject
       with PaymentMethodType
  inline def ideal: ideal = "ideal".asInstanceOf[ideal]
  
  @js.native
  sealed trait immediate
    extends StObject
       with ApplePayPaymentTiming
  inline def immediate: immediate = "immediate".asInstanceOf[immediate]
  
  @js.native
  sealed trait live
    extends StObject
       with AdyenEnvironmentType
  inline def live: live = "live".asInstanceOf[live]
  
  @js.native
  sealed trait `live-apse`
    extends StObject
       with AdyenEnvironmentType
  inline def `live-apse`: `live-apse` = "live-apse".asInstanceOf[`live-apse`]
  
  @js.native
  sealed trait `live-au`
    extends StObject
       with AdyenEnvironmentType
  inline def `live-au`: `live-au` = "live-au".asInstanceOf[`live-au`]
  
  @js.native
  sealed trait `live-us`
    extends StObject
       with AdyenEnvironmentType
  inline def `live-us`: `live-us` = "live-us".asInstanceOf[`live-us`]
  
  @js.native
  sealed trait locality
    extends StObject
       with ApplePayErrorContactField
  inline def locality: locality = "locality".asInstanceOf[locality]
  
  @js.native
  sealed trait month
    extends StObject
       with ApplePayRecurringPaymentDateUnit
  inline def month: month = "month".asInstanceOf[month]
  
  @js.native
  sealed trait name
    extends StObject
       with ApplePayContactField
       with ApplePayErrorContactField
  inline def name: name = "name".asInstanceOf[name]
  
  @js.native
  sealed trait paymentAuthorized
    extends StObject
       with ApplePayEvent
       with GooglePayEvent
  inline def paymentAuthorized: paymentAuthorized = "paymentAuthorized".asInstanceOf[paymentAuthorized]
  
  @js.native
  sealed trait phone
    extends StObject
       with ApplePayContactField
  inline def phone: phone = "phone".asInstanceOf[phone]
  
  @js.native
  sealed trait phoneNumber
    extends StObject
       with ApplePayErrorContactField
  inline def phoneNumber: phoneNumber = "phoneNumber".asInstanceOf[phoneNumber]
  
  @js.native
  sealed trait phoneticName
    extends StObject
       with ApplePayContactField
       with ApplePayErrorContactField
  inline def phoneticName: phoneticName = "phoneticName".asInstanceOf[phoneticName]
  
  @js.native
  sealed trait postalAddress
    extends StObject
       with ApplePayContactField
       with ApplePayErrorContactField
  inline def postalAddress: postalAddress = "postalAddress".asInstanceOf[postalAddress]
  
  @js.native
  sealed trait postalCode
    extends StObject
       with ApplePayErrorContactField
  inline def postalCode: postalCode = "postalCode".asInstanceOf[postalCode]
  
  @js.native
  sealed trait ready
    extends StObject
       with ApplePayEvent
       with GooglePayEvent
       with PayPalEvent
  inline def ready: ready = "ready".asInstanceOf[ready]
  
  @js.native
  sealed trait recurring
    extends StObject
       with ApplePayPaymentTiming
  inline def recurring: recurring = "recurring".asInstanceOf[recurring]
  
  @js.native
  sealed trait remove
    extends StObject
       with ElementEvent
  inline def remove: remove = "remove".asInstanceOf[remove]
  
  @js.native
  sealed trait setDotaddon
    extends StObject
       with PricingEvent
  inline def setDotaddon: setDotaddon = "set.addon".asInstanceOf[setDotaddon]
  
  @js.native
  sealed trait setDotaddress
    extends StObject
       with PricingEvent
  inline def setDotaddress: setDotaddress = "set.address".asInstanceOf[setDotaddress]
  
  @js.native
  sealed trait setDotadjustment
    extends StObject
       with PricingEvent
  inline def setDotadjustment: setDotadjustment = "set.adjustment".asInstanceOf[setDotadjustment]
  
  @js.native
  sealed trait setDotcoupon
    extends StObject
       with PricingEvent
  inline def setDotcoupon: setDotcoupon = "set.coupon".asInstanceOf[setDotcoupon]
  
  @js.native
  sealed trait setDotgift_card
    extends StObject
       with PricingEvent
  inline def setDotgift_card: setDotgift_card = "set.gift_card".asInstanceOf[setDotgift_card]
  
  @js.native
  sealed trait setDotplan
    extends StObject
       with PricingEvent
  inline def setDotplan: setDotplan = "set.plan".asInstanceOf[setDotplan]
  
  @js.native
  sealed trait setDotshippingAddress
    extends StObject
       with PricingEvent
  inline def setDotshippingAddress: setDotshippingAddress = "set.shippingAddress".asInstanceOf[setDotshippingAddress]
  
  @js.native
  sealed trait setDotsubscription
    extends StObject
       with PricingEvent
  inline def setDotsubscription: setDotsubscription = "set.subscription".asInstanceOf[setDotsubscription]
  
  @js.native
  sealed trait setDottax
    extends StObject
       with PricingEvent
  inline def setDottax: setDottax = "set.tax".asInstanceOf[setDottax]
  
  @js.native
  sealed trait shippingContactInvalid
    extends StObject
       with ApplePayErrorCode
  inline def shippingContactInvalid: shippingContactInvalid = "shippingContactInvalid".asInstanceOf[shippingContactInvalid]
  
  @js.native
  sealed trait shippingContactSelected
    extends StObject
       with ApplePayEvent
  inline def shippingContactSelected: shippingContactSelected = "shippingContactSelected".asInstanceOf[shippingContactSelected]
  
  @js.native
  sealed trait shippingMethodSelected
    extends StObject
       with ApplePayEvent
  inline def shippingMethodSelected: shippingMethodSelected = "shippingMethodSelected".asInstanceOf[shippingMethodSelected]
  
  @js.native
  sealed trait sofort
    extends StObject
       with PaymentMethodType
  inline def sofort: sofort = "sofort".asInstanceOf[sofort]
  
  @js.native
  sealed trait subAdministrativeArea
    extends StObject
       with ApplePayErrorContactField
  inline def subAdministrativeArea: subAdministrativeArea = "subAdministrativeArea".asInstanceOf[subAdministrativeArea]
  
  @js.native
  sealed trait subLocality
    extends StObject
       with ApplePayErrorContactField
  inline def subLocality: subLocality = "subLocality".asInstanceOf[subLocality]
  
  @js.native
  sealed trait submit
    extends StObject
       with ElementEvent
  inline def submit: submit = "submit".asInstanceOf[submit]
  
  @js.native
  sealed trait test
    extends StObject
       with AdyenEnvironmentType
  inline def test: test = "test".asInstanceOf[test]
  
  @js.native
  sealed trait token
    extends StObject
       with AdyenEvent
       with AlternativePaymentMethodEvents
       with ApplePayEvent
       with BankRedirectEvent
       with GooglePayEvent
       with PayPalEvent
       with ThreeDSecureEvent
  inline def token: token = "token".asInstanceOf[token]
  
  @js.native
  sealed trait unknown
    extends StObject
       with ApplePayErrorCode
  inline def unknown: unknown = "unknown".asInstanceOf[unknown]
  
  @js.native
  sealed trait unsetDotcoupon
    extends StObject
       with PricingEvent
  inline def unsetDotcoupon: unsetDotcoupon = "unset.coupon".asInstanceOf[unsetDotcoupon]
  
  @js.native
  sealed trait unsetDotgift_card
    extends StObject
       with PricingEvent
  inline def unsetDotgift_card: unsetDotgift_card = "unset.gift_card".asInstanceOf[unsetDotgift_card]
  
  @js.native
  sealed trait valid
    extends StObject
       with AlternativePaymentMethodEvents
  inline def valid: valid = "valid".asInstanceOf[valid]
  
  @js.native
  sealed trait year
    extends StObject
       with ApplePayRecurringPaymentDateUnit
  inline def year: year = "year".asInstanceOf[year]
}
