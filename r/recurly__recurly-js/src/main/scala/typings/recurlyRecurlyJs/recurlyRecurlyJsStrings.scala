package typings.recurlyRecurlyJs

import typings.recurlyRecurlyJs.`3dSecureMod`.ThreeDSecureEvent
import typings.recurlyRecurlyJs.adyenMod.AdyenEvent
import typings.recurlyRecurlyJs.applePayMod.ApplePayEvent
import typings.recurlyRecurlyJs.elementsMod.ElementEvent
import typings.recurlyRecurlyJs.paypalMod.PayPalEvent
import typings.recurlyRecurlyJs.pricingMod.PricingEvent
import typings.recurlyRecurlyJs.recurlyMod.RecurlyEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object recurlyRecurlyJsStrings {
  
  @js.native
  sealed trait attach extends ElementEvent
  @scala.inline
  def attach: attach = "attach".asInstanceOf[attach]
  
  @js.native
  sealed trait bacs extends StObject
  @scala.inline
  def bacs: bacs = "bacs".asInstanceOf[bacs]
  
  @js.native
  sealed trait becs extends StObject
  @scala.inline
  def becs: becs = "becs".asInstanceOf[becs]
  
  @js.native
  sealed trait blur extends ElementEvent
  @scala.inline
  def blur: blur = "blur".asInstanceOf[blur]
  
  @js.native
  sealed trait cancel
    extends ApplePayEvent
       with PayPalEvent
  @scala.inline
  def cancel: cancel = "cancel".asInstanceOf[cancel]
  
  @js.native
  sealed trait change
    extends ElementEvent
       with PricingEvent
       with RecurlyEvent
  @scala.inline
  def change: change = "change".asInstanceOf[change]
  
  @js.native
  sealed trait error
    extends AdyenEvent
       with ApplePayEvent
       with PayPalEvent
       with RecurlyEvent
       with ThreeDSecureEvent
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait errorDotcoupon extends PricingEvent
  @scala.inline
  def errorDotcoupon: errorDotcoupon = "error.coupon".asInstanceOf[errorDotcoupon]
  
  @js.native
  sealed trait fieldColonsubmit extends RecurlyEvent
  @scala.inline
  def fieldColonsubmit: fieldColonsubmit = "field:submit".asInstanceOf[fieldColonsubmit]
  
  @js.native
  sealed trait focus extends ElementEvent
  @scala.inline
  def focus: focus = "focus".asInstanceOf[focus]
  
  @js.native
  sealed trait paymentAuthorized extends ApplePayEvent
  @scala.inline
  def paymentAuthorized: paymentAuthorized = "paymentAuthorized".asInstanceOf[paymentAuthorized]
  
  @js.native
  sealed trait ready
    extends ApplePayEvent
       with PayPalEvent
  @scala.inline
  def ready: ready = "ready".asInstanceOf[ready]
  
  @js.native
  sealed trait remove extends ElementEvent
  @scala.inline
  def remove: remove = "remove".asInstanceOf[remove]
  
  @js.native
  sealed trait setDotaddon extends PricingEvent
  @scala.inline
  def setDotaddon: setDotaddon = "set.addon".asInstanceOf[setDotaddon]
  
  @js.native
  sealed trait setDotaddress extends PricingEvent
  @scala.inline
  def setDotaddress: setDotaddress = "set.address".asInstanceOf[setDotaddress]
  
  @js.native
  sealed trait setDotadjustment extends PricingEvent
  @scala.inline
  def setDotadjustment: setDotadjustment = "set.adjustment".asInstanceOf[setDotadjustment]
  
  @js.native
  sealed trait setDotcoupon extends PricingEvent
  @scala.inline
  def setDotcoupon: setDotcoupon = "set.coupon".asInstanceOf[setDotcoupon]
  
  @js.native
  sealed trait setDotgift_card extends PricingEvent
  @scala.inline
  def setDotgift_card: setDotgift_card = "set.gift_card".asInstanceOf[setDotgift_card]
  
  @js.native
  sealed trait setDotplan extends PricingEvent
  @scala.inline
  def setDotplan: setDotplan = "set.plan".asInstanceOf[setDotplan]
  
  @js.native
  sealed trait setDotshippingAddress extends PricingEvent
  @scala.inline
  def setDotshippingAddress: setDotshippingAddress = "set.shippingAddress".asInstanceOf[setDotshippingAddress]
  
  @js.native
  sealed trait setDotsubscription extends PricingEvent
  @scala.inline
  def setDotsubscription: setDotsubscription = "set.subscription".asInstanceOf[setDotsubscription]
  
  @js.native
  sealed trait setDottax extends PricingEvent
  @scala.inline
  def setDottax: setDottax = "set.tax".asInstanceOf[setDottax]
  
  @js.native
  sealed trait shippingContactSelected extends ApplePayEvent
  @scala.inline
  def shippingContactSelected: shippingContactSelected = "shippingContactSelected".asInstanceOf[shippingContactSelected]
  
  @js.native
  sealed trait shippingMethodSelected extends ApplePayEvent
  @scala.inline
  def shippingMethodSelected: shippingMethodSelected = "shippingMethodSelected".asInstanceOf[shippingMethodSelected]
  
  @js.native
  sealed trait submit extends ElementEvent
  @scala.inline
  def submit: submit = "submit".asInstanceOf[submit]
  
  @js.native
  sealed trait token
    extends AdyenEvent
       with ApplePayEvent
       with PayPalEvent
       with ThreeDSecureEvent
  @scala.inline
  def token: token = "token".asInstanceOf[token]
  
  @js.native
  sealed trait unsetDotcoupon extends PricingEvent
  @scala.inline
  def unsetDotcoupon: unsetDotcoupon = "unset.coupon".asInstanceOf[unsetDotcoupon]
  
  @js.native
  sealed trait unsetDotgift_card extends PricingEvent
  @scala.inline
  def unsetDotgift_card: unsetDotgift_card = "unset.gift_card".asInstanceOf[unsetDotgift_card]
}
