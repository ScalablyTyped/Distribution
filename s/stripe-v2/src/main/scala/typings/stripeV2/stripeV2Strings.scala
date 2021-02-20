package typings.stripeV2

import typings.stripeV2.stripe.StripeApplePayBillingContactField
import typings.stripeV2.stripe.StripeApplePayShipping
import typings.stripeV2.stripe.StripeApplePayShippingContactField
import typings.stripeV2.stripe.StripeCardDataBrand
import typings.stripeV2.stripe.StripeCardDataFunding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stripeV2Strings {
  
  @js.native
  sealed trait `American Express` extends StripeCardDataBrand
  @scala.inline
  def `American Express`: `American Express` = ("American Express").asInstanceOf[`American Express`]
  
  @js.native
  sealed trait `Diners Club` extends StripeCardDataBrand
  @scala.inline
  def `Diners Club`: `Diners Club` = ("Diners Club").asInstanceOf[`Diners Club`]
  
  @js.native
  sealed trait Discover extends StripeCardDataBrand
  @scala.inline
  def Discover: Discover = "Discover".asInstanceOf[Discover]
  
  @js.native
  sealed trait JCB extends StripeCardDataBrand
  @scala.inline
  def JCB: JCB = "JCB".asInstanceOf[JCB]
  
  @js.native
  sealed trait MasterCard extends StripeCardDataBrand
  @scala.inline
  def MasterCard: MasterCard = "MasterCard".asInstanceOf[MasterCard]
  
  @js.native
  sealed trait Unknown extends StripeCardDataBrand
  @scala.inline
  def Unknown: Unknown = "Unknown".asInstanceOf[Unknown]
  
  @js.native
  sealed trait Visa extends StripeCardDataBrand
  @scala.inline
  def Visa: Visa = "Visa".asInstanceOf[Visa]
  
  @js.native
  sealed trait credit extends StripeCardDataFunding
  @scala.inline
  def credit: credit = "credit".asInstanceOf[credit]
  
  @js.native
  sealed trait debit extends StripeCardDataFunding
  @scala.inline
  def debit: debit = "debit".asInstanceOf[debit]
  
  @js.native
  sealed trait delivery extends StripeApplePayShipping
  @scala.inline
  def delivery: delivery = "delivery".asInstanceOf[delivery]
  
  @js.native
  sealed trait email extends StripeApplePayShippingContactField
  @scala.inline
  def email: email = "email".asInstanceOf[email]
  
  @js.native
  sealed trait `final` extends StObject
  @scala.inline
  def `final`: `final` = "final".asInstanceOf[`final`]
  
  @js.native
  sealed trait name
    extends StripeApplePayBillingContactField
       with StripeApplePayShippingContactField
  @scala.inline
  def name: name = "name".asInstanceOf[name]
  
  @js.native
  sealed trait pending extends StObject
  @scala.inline
  def pending: pending = "pending".asInstanceOf[pending]
  
  @js.native
  sealed trait phone extends StripeApplePayShippingContactField
  @scala.inline
  def phone: phone = "phone".asInstanceOf[phone]
  
  @js.native
  sealed trait postalAddress
    extends StripeApplePayBillingContactField
       with StripeApplePayShippingContactField
  @scala.inline
  def postalAddress: postalAddress = "postalAddress".asInstanceOf[postalAddress]
  
  @js.native
  sealed trait prepaid extends StripeCardDataFunding
  @scala.inline
  def prepaid: prepaid = "prepaid".asInstanceOf[prepaid]
  
  @js.native
  sealed trait servicePickup extends StripeApplePayShipping
  @scala.inline
  def servicePickup: servicePickup = "servicePickup".asInstanceOf[servicePickup]
  
  @js.native
  sealed trait shipping extends StripeApplePayShipping
  @scala.inline
  def shipping: shipping = "shipping".asInstanceOf[shipping]
  
  @js.native
  sealed trait storePickup extends StripeApplePayShipping
  @scala.inline
  def storePickup: storePickup = "storePickup".asInstanceOf[storePickup]
  
  @js.native
  sealed trait unknown_ extends StripeCardDataFunding
  @scala.inline
  def unknown_ : unknown_ = "unknown".asInstanceOf[unknown_]
}
