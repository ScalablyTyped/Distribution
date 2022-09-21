package typings.recurlyRecurlyJs

import typings.recurlyRecurlyJs.`3dSecureMod`.ThreeDSecureEvent
import typings.recurlyRecurlyJs.adyenMod.AdyenEvent
import typings.recurlyRecurlyJs.applePayMod.ApplePayEvent
import typings.recurlyRecurlyJs.bankRedirectMod.BankRedirectEvent
import typings.recurlyRecurlyJs.bankRedirectMod.PaymentMethodType
import typings.recurlyRecurlyJs.elementsMod.ElementEvent
import typings.recurlyRecurlyJs.paypalMod.PayPalEvent
import typings.recurlyRecurlyJs.pricingMod.PricingEvent
import typings.recurlyRecurlyJs.recurlyMod.RecurlyEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object recurlyRecurlyJsStrings {
  
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
  sealed trait blur
    extends StObject
       with ElementEvent
  inline def blur: blur = "blur".asInstanceOf[blur]
  
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
  sealed trait error
    extends StObject
       with AdyenEvent
       with ApplePayEvent
       with BankRedirectEvent
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
  sealed trait ideal
    extends StObject
       with PaymentMethodType
  inline def ideal: ideal = "ideal".asInstanceOf[ideal]
  
  @js.native
  sealed trait paymentAuthorized
    extends StObject
       with ApplePayEvent
  inline def paymentAuthorized: paymentAuthorized = "paymentAuthorized".asInstanceOf[paymentAuthorized]
  
  @js.native
  sealed trait ready
    extends StObject
       with ApplePayEvent
       with PayPalEvent
  inline def ready: ready = "ready".asInstanceOf[ready]
  
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
  sealed trait submit
    extends StObject
       with ElementEvent
  inline def submit: submit = "submit".asInstanceOf[submit]
  
  @js.native
  sealed trait token
    extends StObject
       with AdyenEvent
       with ApplePayEvent
       with BankRedirectEvent
       with PayPalEvent
       with ThreeDSecureEvent
  inline def token: token = "token".asInstanceOf[token]
  
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
}
