package typings.stripeDashV3.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.stripeDashV3.stripeDashV3Strings.Visa
  - typings.stripeDashV3.stripeDashV3Strings.`American Express`
  - typings.stripeDashV3.stripeDashV3Strings.MasterCard
  - typings.stripeDashV3.stripeDashV3Strings.Discover
  - typings.stripeDashV3.stripeDashV3Strings.JCB
  - typings.stripeDashV3.stripeDashV3Strings.`Diners Club`
  - typings.stripeDashV3.stripeDashV3Strings.Unknown
*/
trait brandType extends js.Object

object brandType {
  @scala.inline
  def `American Express`: typings.stripeDashV3.stripeDashV3Strings.`American Express` = this.cast("American Express")
  @scala.inline
  def `Diners Club`: typings.stripeDashV3.stripeDashV3Strings.`Diners Club` = this.cast("Diners Club")
  @scala.inline
  def Discover: typings.stripeDashV3.stripeDashV3Strings.Discover = this.cast("Discover")
  @scala.inline
  def JCB: typings.stripeDashV3.stripeDashV3Strings.JCB = this.cast("JCB")
  @scala.inline
  def MasterCard: typings.stripeDashV3.stripeDashV3Strings.MasterCard = this.cast("MasterCard")
  @scala.inline
  def Unknown: typings.stripeDashV3.stripeDashV3Strings.Unknown = this.cast("Unknown")
  @scala.inline
  def Visa: typings.stripeDashV3.stripeDashV3Strings.Visa = this.cast("Visa")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

