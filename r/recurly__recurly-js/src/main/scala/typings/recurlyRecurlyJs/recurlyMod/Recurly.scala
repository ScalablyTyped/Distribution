package typings.recurlyRecurlyJs.recurlyMod

import typings.recurlyRecurlyJs.`3dSecureMod`.Risk
import typings.recurlyRecurlyJs.adyenMod.Adyen
import typings.recurlyRecurlyJs.adyenMod.AdyenInstance
import typings.recurlyRecurlyJs.adyenMod.AdyenOptions
import typings.recurlyRecurlyJs.anon.ThreeDSecure
import typings.recurlyRecurlyJs.applePayMod.ApplePay
import typings.recurlyRecurlyJs.applePayMod.ApplePayConfig
import typings.recurlyRecurlyJs.applePayMod.ApplePayInstance
import typings.recurlyRecurlyJs.bankAccountMod.BankAccount
import typings.recurlyRecurlyJs.configureMod.Configure
import typings.recurlyRecurlyJs.configureMod.RecurlyOptions
import typings.recurlyRecurlyJs.elementsMod.Elements
import typings.recurlyRecurlyJs.elementsMod.ElementsInstance
import typings.recurlyRecurlyJs.emitterMod.Emitter
import typings.recurlyRecurlyJs.giftCardMod.Done
import typings.recurlyRecurlyJs.giftCardMod.GiftCard
import typings.recurlyRecurlyJs.giftCardMod.GiftCardOptions
import typings.recurlyRecurlyJs.paypalMod.PayPal
import typings.recurlyRecurlyJs.paypalMod.PayPalConfig
import typings.recurlyRecurlyJs.paypalMod.PayPalInstance
import typings.recurlyRecurlyJs.tokenMod.CustomerData
import typings.recurlyRecurlyJs.tokenMod.Token
import typings.recurlyRecurlyJs.tokenMod.TokenHandler
import typings.recurlyRecurlyJs.validateMod.Validate
import typings.std.HTMLFormElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Recurly extends Emitter[RecurlyEvent] {
  @JSName("Adyen")
  var Adyen_Original: Adyen = js.native
  @JSName("ApplePay")
  var ApplePay_Original: ApplePay = js.native
  @JSName("Elements")
  var Elements_Original: Elements = js.native
  @JSName("PayPal")
  var PayPal_Original: PayPal = js.native
  var Pricing: typings.recurlyRecurlyJs.pricingMod.Pricing = js.native
  @JSName("Risk")
  var Risk_Original: Risk = js.native
  var bankAccount: BankAccount = js.native
  @JSName("configure")
  var configure_Original: Configure = js.native
  @JSName("giftCard")
  var giftCard_Original: GiftCard = js.native
  @JSName("token")
  var token_Original: Token = js.native
  var validate: Validate = js.native
  def Adyen(): AdyenInstance = js.native
  def Adyen(adyenOptions: AdyenOptions): AdyenInstance = js.native
  def ApplePay(config: ApplePayConfig): ApplePayInstance = js.native
  def Elements(): ElementsInstance = js.native
  def PayPal(): PayPalInstance = js.native
  def PayPal(config: PayPalConfig): PayPalInstance = js.native
  def Risk(): ThreeDSecure = js.native
  def configure(recurlyConfig: String): Unit = js.native
  def configure(recurlyConfig: RecurlyOptions): Unit = js.native
  def giftCard(giftCardOptions: GiftCardOptions, done: Done): Unit = js.native
  def token(elements: ElementsInstance, second: CustomerData, third: TokenHandler): Unit = js.native
  def token(elements: ElementsInstance, second: HTMLFormElement, third: TokenHandler): Unit = js.native
  def token(form: CustomerData, second: TokenHandler): Unit = js.native
  def token(form: HTMLFormElement, second: TokenHandler): Unit = js.native
}

