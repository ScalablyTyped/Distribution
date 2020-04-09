package typings.recurlyRecurlyJs

import typings.recurlyRecurlyJs.`3dSecureMod`.ThreeDSecureEvent
import typings.recurlyRecurlyJs.adyenMod.AdyenEvent
import typings.recurlyRecurlyJs.applePayMod.ApplePayEvent
import typings.recurlyRecurlyJs.elementsMod.ElementEvent
import typings.recurlyRecurlyJs.indexMod.PricingEvent
import typings.recurlyRecurlyJs.paypalMod.PayPalEvent
import typings.recurlyRecurlyJs.recurlyMod.RecurlyEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object recurlyRecurlyJsStrings {
  @js.native
  sealed trait attach extends ElementEvent
  
  @js.native
  sealed trait blur extends ElementEvent
  
  @js.native
  sealed trait cancel extends ApplePayEvent
  
  @js.native
  sealed trait change
    extends ElementEvent
       with PricingEvent
       with RecurlyEvent
  
  @js.native
  sealed trait error
    extends AdyenEvent
       with ApplePayEvent
       with PayPalEvent
       with RecurlyEvent
       with ThreeDSecureEvent
  
  @js.native
  sealed trait errorDotcoupon extends PricingEvent
  
  @js.native
  sealed trait fieldColonsubmit extends RecurlyEvent
  
  @js.native
  sealed trait focus extends ElementEvent
  
  @js.native
  sealed trait paymentAuthorized extends ApplePayEvent
  
  @js.native
  sealed trait ready extends ApplePayEvent
  
  @js.native
  sealed trait remove extends ElementEvent
  
  @js.native
  sealed trait setDotaddon extends PricingEvent
  
  @js.native
  sealed trait setDotaddress extends PricingEvent
  
  @js.native
  sealed trait setDotadjustment extends PricingEvent
  
  @js.native
  sealed trait setDotcoupon extends PricingEvent
  
  @js.native
  sealed trait setDotgift_card extends PricingEvent
  
  @js.native
  sealed trait setDotplan extends PricingEvent
  
  @js.native
  sealed trait setDotshippingAddress extends PricingEvent
  
  @js.native
  sealed trait setDotsubscription extends PricingEvent
  
  @js.native
  sealed trait setDottax extends PricingEvent
  
  @js.native
  sealed trait shippingContactSelected extends ApplePayEvent
  
  @js.native
  sealed trait shippingMethodSelected extends ApplePayEvent
  
  @js.native
  sealed trait submit extends ElementEvent
  
  @js.native
  sealed trait token
    extends AdyenEvent
       with ApplePayEvent
       with PayPalEvent
       with ThreeDSecureEvent
  
  @js.native
  sealed trait unsetDotcoupon extends PricingEvent
  
  @js.native
  sealed trait unsetDotgift_card extends PricingEvent
  
  @scala.inline
  def attach: attach = "attach".asInstanceOf[attach]
  @scala.inline
  def blur: blur = "blur".asInstanceOf[blur]
  @scala.inline
  def cancel: cancel = "cancel".asInstanceOf[cancel]
  @scala.inline
  def change: change = "change".asInstanceOf[change]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def errorDotcoupon: errorDotcoupon = "error.coupon".asInstanceOf[errorDotcoupon]
  @scala.inline
  def fieldColonsubmit: fieldColonsubmit = "field:submit".asInstanceOf[fieldColonsubmit]
  @scala.inline
  def focus: focus = "focus".asInstanceOf[focus]
  @scala.inline
  def paymentAuthorized: paymentAuthorized = "paymentAuthorized".asInstanceOf[paymentAuthorized]
  @scala.inline
  def ready: ready = "ready".asInstanceOf[ready]
  @scala.inline
  def remove: remove = "remove".asInstanceOf[remove]
  @scala.inline
  def setDotaddon: setDotaddon = "set.addon".asInstanceOf[setDotaddon]
  @scala.inline
  def setDotaddress: setDotaddress = "set.address".asInstanceOf[setDotaddress]
  @scala.inline
  def setDotadjustment: setDotadjustment = "set.adjustment".asInstanceOf[setDotadjustment]
  @scala.inline
  def setDotcoupon: setDotcoupon = "set.coupon".asInstanceOf[setDotcoupon]
  @scala.inline
  def setDotgift_card: setDotgift_card = "set.gift_card".asInstanceOf[setDotgift_card]
  @scala.inline
  def setDotplan: setDotplan = "set.plan".asInstanceOf[setDotplan]
  @scala.inline
  def setDotshippingAddress: setDotshippingAddress = "set.shippingAddress".asInstanceOf[setDotshippingAddress]
  @scala.inline
  def setDotsubscription: setDotsubscription = "set.subscription".asInstanceOf[setDotsubscription]
  @scala.inline
  def setDottax: setDottax = "set.tax".asInstanceOf[setDottax]
  @scala.inline
  def shippingContactSelected: shippingContactSelected = "shippingContactSelected".asInstanceOf[shippingContactSelected]
  @scala.inline
  def shippingMethodSelected: shippingMethodSelected = "shippingMethodSelected".asInstanceOf[shippingMethodSelected]
  @scala.inline
  def submit: submit = "submit".asInstanceOf[submit]
  @scala.inline
  def token: token = "token".asInstanceOf[token]
  @scala.inline
  def unsetDotcoupon: unsetDotcoupon = "unset.coupon".asInstanceOf[unsetDotcoupon]
  @scala.inline
  def unsetDotgift_card: unsetDotgift_card = "unset.gift_card".asInstanceOf[unsetDotgift_card]
}

