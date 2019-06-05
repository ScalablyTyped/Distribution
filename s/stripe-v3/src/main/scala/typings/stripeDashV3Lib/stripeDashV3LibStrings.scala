package typings
package stripeDashV3Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object stripeDashV3LibStrings {
  @js.native
  sealed trait `American Express`
    extends stripeDashV3Lib.stripeNs.brandType
  
  @js.native
  sealed trait `Diners Club`
    extends stripeDashV3Lib.stripeNs.brandType
  
  @js.native
  sealed trait Discover
    extends stripeDashV3Lib.stripeNs.brandType
  
  @js.native
  sealed trait Empty
    extends stripeDashV3Lib.stripeNs.billingAddressCollectionType
  
  @js.native
  sealed trait JCB
    extends stripeDashV3Lib.stripeNs.brandType
  
  @js.native
  sealed trait MasterCard
    extends stripeDashV3Lib.stripeNs.brandType
  
  @js.native
  sealed trait Unknown
    extends stripeDashV3Lib.stripeNs.brandType
  
  @js.native
  sealed trait Visa
    extends stripeDashV3Lib.stripeNs.brandType
  
  @js.native
  sealed trait android_pay
    extends stripeDashV3Lib.stripeNs.tokenizationType
  
  @js.native
  sealed trait apple_pay
    extends stripeDashV3Lib.stripeNs.tokenizationType
  
  @js.native
  sealed trait auto
    extends stripeDashV3Lib.stripeNs.billingAddressCollectionType
  
  @js.native
  sealed trait bank_account extends js.Object
  
  @js.native
  sealed trait blur
    extends stripeDashV3Lib.stripeNs.elementsNs.eventTypes
  
  @js.native
  sealed trait buy extends js.Object
  
  @js.native
  sealed trait cancel extends js.Object
  
  @js.native
  sealed trait canceled
    extends stripeDashV3Lib.stripeNs.paymentIntentNs.paymentIntentStatus
  
  @js.native
  sealed trait card
    extends stripeDashV3Lib.stripeNs.elementsNs.elementsType
       with stripeDashV3Lib.stripeNs.paymentMethodType
  
  @js.native
  sealed trait cardCvc
    extends stripeDashV3Lib.stripeNs.elementsNs.elementsType
  
  @js.native
  sealed trait cardExpiry
    extends stripeDashV3Lib.stripeNs.elementsNs.elementsType
  
  @js.native
  sealed trait cardNumber
    extends stripeDashV3Lib.stripeNs.elementsNs.elementsType
  
  @js.native
  sealed trait card_present
    extends stripeDashV3Lib.stripeNs.paymentMethodType
  
  @js.native
  sealed trait change
    extends stripeDashV3Lib.stripeNs.elementsNs.eventTypes
  
  @js.native
  sealed trait click extends js.Object
  
  @js.native
  sealed trait code_verification extends js.Object
  
  @js.native
  sealed trait credit
    extends stripeDashV3Lib.stripeNs.fundingType
  
  @js.native
  sealed trait dark extends js.Object
  
  @js.native
  sealed trait debit
    extends stripeDashV3Lib.stripeNs.fundingType
  
  @js.native
  sealed trait default extends js.Object
  
  @js.native
  sealed trait donate extends js.Object
  
  @js.native
  sealed trait errored
    extends stripeDashV3Lib.stripeNs.statusType
  
  @js.native
  sealed trait fail
    extends stripeDashV3Lib.stripeNs.checkType
  
  @js.native
  sealed trait focus
    extends stripeDashV3Lib.stripeNs.elementsNs.eventTypes
  
  @js.native
  sealed trait iban
    extends stripeDashV3Lib.stripeNs.elementsNs.elementsType
  
  @js.native
  sealed trait idealBank
    extends stripeDashV3Lib.stripeNs.elementsNs.elementsType
  
  @js.native
  sealed trait invalid_shipping_address extends js.Object
  
  @js.native
  sealed trait light extends js.Object
  
  @js.native
  sealed trait `light-outline` extends js.Object
  
  @js.native
  sealed trait `new`
    extends stripeDashV3Lib.stripeNs.statusType
  
  @js.native
  sealed trait none extends js.Object
  
  @js.native
  sealed trait not_supported extends js.Object
  
  @js.native
  sealed trait optional extends js.Object
  
  @js.native
  sealed trait pass
    extends stripeDashV3Lib.stripeNs.checkType
  
  @js.native
  sealed trait paymentRequestButton
    extends stripeDashV3Lib.stripeNs.elementsNs.elementsType
  
  @js.native
  sealed trait payment_intent extends js.Object
  
  @js.native
  sealed trait pii extends js.Object
  
  @js.native
  sealed trait postalCode
    extends stripeDashV3Lib.stripeNs.elementsNs.elementsType
  
  @js.native
  sealed trait prepaid
    extends stripeDashV3Lib.stripeNs.fundingType
  
  @js.native
  sealed trait processing
    extends stripeDashV3Lib.stripeNs.paymentIntentNs.paymentIntentStatus
  
  @js.native
  sealed trait ready
    extends stripeDashV3Lib.stripeNs.elementsNs.eventTypes
  
  @js.native
  sealed trait receiver extends js.Object
  
  @js.native
  sealed trait recommended extends js.Object
  
  @js.native
  sealed trait redirect extends js.Object
  
  @js.native
  sealed trait redirect_to_url
    extends stripeDashV3Lib.stripeNs.paymentIntentNs.nextActionType
  
  @js.native
  sealed trait required
    extends stripeDashV3Lib.stripeNs.billingAddressCollectionType
  
  @js.native
  sealed trait requires_action
    extends stripeDashV3Lib.stripeNs.paymentIntentNs.paymentIntentStatus
  
  @js.native
  sealed trait requires_capture
    extends stripeDashV3Lib.stripeNs.paymentIntentNs.paymentIntentStatus
  
  @js.native
  sealed trait requires_confirmation
    extends stripeDashV3Lib.stripeNs.paymentIntentNs.paymentIntentStatus
  
  @js.native
  sealed trait requires_payment_method
    extends stripeDashV3Lib.stripeNs.paymentIntentNs.paymentIntentStatus
  
  @js.native
  sealed trait reusable extends js.Object
  
  @js.native
  sealed trait shippingaddresschange extends js.Object
  
  @js.native
  sealed trait shippingoptionchange extends js.Object
  
  @js.native
  sealed trait single_use extends js.Object
  
  @js.native
  sealed trait solid extends js.Object
  
  @js.native
  sealed trait source extends js.Object
  
  @js.native
  sealed trait succeeded
    extends stripeDashV3Lib.stripeNs.paymentIntentNs.paymentIntentStatus
  
  @js.native
  sealed trait success extends js.Object
  
  @js.native
  sealed trait token extends js.Object
  
  @js.native
  sealed trait unavailable
    extends stripeDashV3Lib.stripeNs.checkType
  
  @js.native
  sealed trait unchecked
    extends stripeDashV3Lib.stripeNs.checkType
  
  @js.native
  sealed trait unknown
    extends stripeDashV3Lib.stripeNs.fundingType
  
  @js.native
  sealed trait use_stripe_sdk
    extends stripeDashV3Lib.stripeNs.paymentIntentNs.nextActionType
  
  @js.native
  sealed trait validated
    extends stripeDashV3Lib.stripeNs.statusType
  
  @js.native
  sealed trait verification_failed
    extends stripeDashV3Lib.stripeNs.statusType
  
  @js.native
  sealed trait verified
    extends stripeDashV3Lib.stripeNs.statusType
  
  @scala.inline
  def `American Express`: `American Express` = "American Express".asInstanceOf[`American Express`]
  @scala.inline
  def `Diners Club`: `Diners Club` = "Diners Club".asInstanceOf[`Diners Club`]
  @scala.inline
  def Discover: Discover = "Discover".asInstanceOf[Discover]
  @scala.inline
  def Empty: Empty = "".asInstanceOf[Empty]
  @scala.inline
  def JCB: JCB = "JCB".asInstanceOf[JCB]
  @scala.inline
  def MasterCard: MasterCard = "MasterCard".asInstanceOf[MasterCard]
  @scala.inline
  def Unknown: Unknown = "Unknown".asInstanceOf[Unknown]
  @scala.inline
  def Visa: Visa = "Visa".asInstanceOf[Visa]
  @scala.inline
  def android_pay: android_pay = "android_pay".asInstanceOf[android_pay]
  @scala.inline
  def apple_pay: apple_pay = "apple_pay".asInstanceOf[apple_pay]
  @scala.inline
  def auto: auto = "auto".asInstanceOf[auto]
  @scala.inline
  def bank_account: bank_account = "bank_account".asInstanceOf[bank_account]
  @scala.inline
  def blur: blur = "blur".asInstanceOf[blur]
  @scala.inline
  def buy: buy = "buy".asInstanceOf[buy]
  @scala.inline
  def cancel: cancel = "cancel".asInstanceOf[cancel]
  @scala.inline
  def canceled: canceled = "canceled".asInstanceOf[canceled]
  @scala.inline
  def card: card = "card".asInstanceOf[card]
  @scala.inline
  def cardCvc: cardCvc = "cardCvc".asInstanceOf[cardCvc]
  @scala.inline
  def cardExpiry: cardExpiry = "cardExpiry".asInstanceOf[cardExpiry]
  @scala.inline
  def cardNumber: cardNumber = "cardNumber".asInstanceOf[cardNumber]
  @scala.inline
  def card_present: card_present = "card_present".asInstanceOf[card_present]
  @scala.inline
  def change: change = "change".asInstanceOf[change]
  @scala.inline
  def click: click = "click".asInstanceOf[click]
  @scala.inline
  def code_verification: code_verification = "code_verification".asInstanceOf[code_verification]
  @scala.inline
  def credit: credit = "credit".asInstanceOf[credit]
  @scala.inline
  def dark: dark = "dark".asInstanceOf[dark]
  @scala.inline
  def debit: debit = "debit".asInstanceOf[debit]
  @scala.inline
  def default: default = "default".asInstanceOf[default]
  @scala.inline
  def donate: donate = "donate".asInstanceOf[donate]
  @scala.inline
  def errored: errored = "errored".asInstanceOf[errored]
  @scala.inline
  def fail: fail = "fail".asInstanceOf[fail]
  @scala.inline
  def focus: focus = "focus".asInstanceOf[focus]
  @scala.inline
  def iban: iban = "iban".asInstanceOf[iban]
  @scala.inline
  def idealBank: idealBank = "idealBank".asInstanceOf[idealBank]
  @scala.inline
  def invalid_shipping_address: invalid_shipping_address = "invalid_shipping_address".asInstanceOf[invalid_shipping_address]
  @scala.inline
  def light: light = "light".asInstanceOf[light]
  @scala.inline
  def `light-outline`: `light-outline` = "light-outline".asInstanceOf[`light-outline`]
  @scala.inline
  def `new`: `new` = "new".asInstanceOf[`new`]
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  @scala.inline
  def not_supported: not_supported = "not_supported".asInstanceOf[not_supported]
  @scala.inline
  def optional: optional = "optional".asInstanceOf[optional]
  @scala.inline
  def pass: pass = "pass".asInstanceOf[pass]
  @scala.inline
  def paymentRequestButton: paymentRequestButton = "paymentRequestButton".asInstanceOf[paymentRequestButton]
  @scala.inline
  def payment_intent: payment_intent = "payment_intent".asInstanceOf[payment_intent]
  @scala.inline
  def pii: pii = "pii".asInstanceOf[pii]
  @scala.inline
  def postalCode: postalCode = "postalCode".asInstanceOf[postalCode]
  @scala.inline
  def prepaid: prepaid = "prepaid".asInstanceOf[prepaid]
  @scala.inline
  def processing: processing = "processing".asInstanceOf[processing]
  @scala.inline
  def ready: ready = "ready".asInstanceOf[ready]
  @scala.inline
  def receiver: receiver = "receiver".asInstanceOf[receiver]
  @scala.inline
  def recommended: recommended = "recommended".asInstanceOf[recommended]
  @scala.inline
  def redirect: redirect = "redirect".asInstanceOf[redirect]
  @scala.inline
  def redirect_to_url: redirect_to_url = "redirect_to_url".asInstanceOf[redirect_to_url]
  @scala.inline
  def required: required = "required".asInstanceOf[required]
  @scala.inline
  def requires_action: requires_action = "requires_action".asInstanceOf[requires_action]
  @scala.inline
  def requires_capture: requires_capture = "requires_capture".asInstanceOf[requires_capture]
  @scala.inline
  def requires_confirmation: requires_confirmation = "requires_confirmation".asInstanceOf[requires_confirmation]
  @scala.inline
  def requires_payment_method: requires_payment_method = "requires_payment_method".asInstanceOf[requires_payment_method]
  @scala.inline
  def reusable: reusable = "reusable".asInstanceOf[reusable]
  @scala.inline
  def shippingaddresschange: shippingaddresschange = "shippingaddresschange".asInstanceOf[shippingaddresschange]
  @scala.inline
  def shippingoptionchange: shippingoptionchange = "shippingoptionchange".asInstanceOf[shippingoptionchange]
  @scala.inline
  def single_use: single_use = "single_use".asInstanceOf[single_use]
  @scala.inline
  def solid: solid = "solid".asInstanceOf[solid]
  @scala.inline
  def source: source = "source".asInstanceOf[source]
  @scala.inline
  def succeeded: succeeded = "succeeded".asInstanceOf[succeeded]
  @scala.inline
  def success: success = "success".asInstanceOf[success]
  @scala.inline
  def token: token = "token".asInstanceOf[token]
  @scala.inline
  def unavailable: unavailable = "unavailable".asInstanceOf[unavailable]
  @scala.inline
  def unchecked: unchecked = "unchecked".asInstanceOf[unchecked]
  @scala.inline
  def unknown: unknown = "unknown".asInstanceOf[unknown]
  @scala.inline
  def use_stripe_sdk: use_stripe_sdk = "use_stripe_sdk".asInstanceOf[use_stripe_sdk]
  @scala.inline
  def validated: validated = "validated".asInstanceOf[validated]
  @scala.inline
  def verification_failed: verification_failed = "verification_failed".asInstanceOf[verification_failed]
  @scala.inline
  def verified: verified = "verified".asInstanceOf[verified]
}

