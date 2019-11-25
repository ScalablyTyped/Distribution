package typings.stripeDashV2.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.stripeDashV2.stripeDashV2Strings.Visa
  - typings.stripeDashV2.stripeDashV2Strings.`American Express`
  - typings.stripeDashV2.stripeDashV2Strings.MasterCard
  - typings.stripeDashV2.stripeDashV2Strings.Discover
  - typings.stripeDashV2.stripeDashV2Strings.JCB
  - typings.stripeDashV2.stripeDashV2Strings.`Diners Club`
  - typings.stripeDashV2.stripeDashV2Strings.Unknown
*/
trait StripeCardDataBrand extends js.Object

object StripeCardDataBrand {
  @scala.inline
  def `American Express`: typings.stripeDashV2.stripeDashV2Strings.`American Express` = this.cast("American Express")
  @scala.inline
  def `Diners Club`: typings.stripeDashV2.stripeDashV2Strings.`Diners Club` = this.cast("Diners Club")
  @scala.inline
  def Discover: typings.stripeDashV2.stripeDashV2Strings.Discover = this.cast("Discover")
  @scala.inline
  def JCB: typings.stripeDashV2.stripeDashV2Strings.JCB = this.cast("JCB")
  @scala.inline
  def MasterCard: typings.stripeDashV2.stripeDashV2Strings.MasterCard = this.cast("MasterCard")
  @scala.inline
  def Unknown: typings.stripeDashV2.stripeDashV2Strings.Unknown = this.cast("Unknown")
  @scala.inline
  def Visa: typings.stripeDashV2.stripeDashV2Strings.Visa = this.cast("Visa")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

