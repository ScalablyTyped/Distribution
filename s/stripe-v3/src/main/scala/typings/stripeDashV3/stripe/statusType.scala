package typings.stripeDashV3.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.stripeDashV3.stripeDashV3Strings.`new`
  - typings.stripeDashV3.stripeDashV3Strings.validated
  - typings.stripeDashV3.stripeDashV3Strings.verified
  - typings.stripeDashV3.stripeDashV3Strings.verification_failed
  - typings.stripeDashV3.stripeDashV3Strings.errored
*/
trait statusType extends js.Object

object statusType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def errored: typings.stripeDashV3.stripeDashV3Strings.errored = this.cast("errored")
  @scala.inline
  def `new`: typings.stripeDashV3.stripeDashV3Strings.`new` = this.cast("new")
  @scala.inline
  def validated: typings.stripeDashV3.stripeDashV3Strings.validated = this.cast("validated")
  @scala.inline
  def verification_failed: typings.stripeDashV3.stripeDashV3Strings.verification_failed = this.cast("verification_failed")
  @scala.inline
  def verified: typings.stripeDashV3.stripeDashV3Strings.verified = this.cast("verified")
}

