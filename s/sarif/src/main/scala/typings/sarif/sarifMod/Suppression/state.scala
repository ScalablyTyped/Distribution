package typings.sarif.sarifMod.Suppression

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.sarif.sarifStrings.accepted
  - typings.sarif.sarifStrings.underReview
  - typings.sarif.sarifStrings.rejected
*/
trait state extends js.Object

object state {
  @scala.inline
  def accepted: typings.sarif.sarifStrings.accepted = this.cast("accepted")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def rejected: typings.sarif.sarifStrings.rejected = this.cast("rejected")
  @scala.inline
  def underReview: typings.sarif.sarifStrings.underReview = this.cast("underReview")
}

