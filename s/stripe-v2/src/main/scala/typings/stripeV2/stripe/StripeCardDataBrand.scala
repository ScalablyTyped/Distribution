package typings.stripeV2.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.stripeV2.stripeV2Strings.Visa
  - typings.stripeV2.stripeV2Strings.`American Express`
  - typings.stripeV2.stripeV2Strings.MasterCard
  - typings.stripeV2.stripeV2Strings.Discover
  - typings.stripeV2.stripeV2Strings.JCB
  - typings.stripeV2.stripeV2Strings.`Diners Club`
  - typings.stripeV2.stripeV2Strings.Unknown
*/
trait StripeCardDataBrand extends js.Object

object StripeCardDataBrand {
  @scala.inline
  def `American Express`: typings.stripeV2.stripeV2Strings.`American Express` = this.cast("American Express")
  @scala.inline
  def `Diners Club`: typings.stripeV2.stripeV2Strings.`Diners Club` = this.cast("Diners Club")
  @scala.inline
  def Discover: typings.stripeV2.stripeV2Strings.Discover = this.cast("Discover")
  @scala.inline
  def JCB: typings.stripeV2.stripeV2Strings.JCB = this.cast("JCB")
  @scala.inline
  def MasterCard: typings.stripeV2.stripeV2Strings.MasterCard = this.cast("MasterCard")
  @scala.inline
  def Unknown: typings.stripeV2.stripeV2Strings.Unknown = this.cast("Unknown")
  @scala.inline
  def Visa: typings.stripeV2.stripeV2Strings.Visa = this.cast("Visa")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

