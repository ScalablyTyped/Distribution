package typings.stripeDashV3.stripe

import typings.stripeDashV3.stripeDashV3Strings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.stripeDashV3.stripeDashV3Strings.credit
  - typings.stripeDashV3.stripeDashV3Strings.debit
  - typings.stripeDashV3.stripeDashV3Strings.prepaid
  - typings.stripeDashV3.stripeDashV3Strings.unknown_
*/
trait fundingType extends js.Object

object fundingType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def credit: typings.stripeDashV3.stripeDashV3Strings.credit = this.cast("credit")
  @scala.inline
  def debit: typings.stripeDashV3.stripeDashV3Strings.debit = this.cast("debit")
  @scala.inline
  def prepaid: typings.stripeDashV3.stripeDashV3Strings.prepaid = this.cast("prepaid")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
}

