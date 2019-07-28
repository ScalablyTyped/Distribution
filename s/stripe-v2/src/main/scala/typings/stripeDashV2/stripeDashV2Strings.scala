package typings.stripeDashV2

import typings.stripeDashV2.stripeNs.StripeApplePayBillingContactField
import typings.stripeDashV2.stripeNs.StripeApplePayShipping
import typings.stripeDashV2.stripeNs.StripeApplePayShippingContactField
import typings.stripeDashV2.stripeNs.StripeCardDataBrand
import typings.stripeDashV2.stripeNs.StripeCardDataFunding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object stripeDashV2Strings {
  @js.native
  sealed trait `American Express` extends StripeCardDataBrand
  
  @js.native
  sealed trait `Diners Club` extends StripeCardDataBrand
  
  @js.native
  sealed trait Discover extends StripeCardDataBrand
  
  @js.native
  sealed trait JCB extends StripeCardDataBrand
  
  @js.native
  sealed trait MasterCard extends StripeCardDataBrand
  
  @js.native
  sealed trait Unknown extends StripeCardDataBrand
  
  @js.native
  sealed trait Visa extends StripeCardDataBrand
  
  @js.native
  sealed trait credit extends StripeCardDataFunding
  
  @js.native
  sealed trait debit extends StripeCardDataFunding
  
  @js.native
  sealed trait delivery extends StripeApplePayShipping
  
  @js.native
  sealed trait email extends StripeApplePayShippingContactField
  
  @js.native
  sealed trait `final` extends js.Object
  
  @js.native
  sealed trait name extends StripeApplePayBillingContactField
  
  @js.native
  sealed trait pending extends js.Object
  
  @js.native
  sealed trait phone extends StripeApplePayShippingContactField
  
  @js.native
  sealed trait postalAddress extends StripeApplePayBillingContactField
  
  @js.native
  sealed trait prepaid extends StripeCardDataFunding
  
  @js.native
  sealed trait servicePickup extends StripeApplePayShipping
  
  @js.native
  sealed trait shipping extends StripeApplePayShipping
  
  @js.native
  sealed trait storePickup extends StripeApplePayShipping
  
  @js.native
  sealed trait unknown extends StripeCardDataFunding
  
  @scala.inline
  def `American Express`: `American Express` = "American Express".asInstanceOf[`American Express`]
  @scala.inline
  def `Diners Club`: `Diners Club` = "Diners Club".asInstanceOf[`Diners Club`]
  @scala.inline
  def Discover: Discover = "Discover".asInstanceOf[Discover]
  @scala.inline
  def JCB: JCB = "JCB".asInstanceOf[JCB]
  @scala.inline
  def MasterCard: MasterCard = "MasterCard".asInstanceOf[MasterCard]
  @scala.inline
  def Unknown: Unknown = "Unknown".asInstanceOf[Unknown]
  @scala.inline
  def Visa: Visa = "Visa".asInstanceOf[Visa]
  @scala.inline
  def credit: credit = "credit".asInstanceOf[credit]
  @scala.inline
  def debit: debit = "debit".asInstanceOf[debit]
  @scala.inline
  def delivery: delivery = "delivery".asInstanceOf[delivery]
  @scala.inline
  def email: email = "email".asInstanceOf[email]
  @scala.inline
  def `final`: `final` = "final".asInstanceOf[`final`]
  @scala.inline
  def name: name = "name".asInstanceOf[name]
  @scala.inline
  def pending: pending = "pending".asInstanceOf[pending]
  @scala.inline
  def phone: phone = "phone".asInstanceOf[phone]
  @scala.inline
  def postalAddress: postalAddress = "postalAddress".asInstanceOf[postalAddress]
  @scala.inline
  def prepaid: prepaid = "prepaid".asInstanceOf[prepaid]
  @scala.inline
  def servicePickup: servicePickup = "servicePickup".asInstanceOf[servicePickup]
  @scala.inline
  def shipping: shipping = "shipping".asInstanceOf[shipping]
  @scala.inline
  def storePickup: storePickup = "storePickup".asInstanceOf[storePickup]
  @scala.inline
  def unknown: unknown = "unknown".asInstanceOf[unknown]
}

