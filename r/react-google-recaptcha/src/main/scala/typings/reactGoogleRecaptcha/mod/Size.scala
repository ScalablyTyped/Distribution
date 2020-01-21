package typings.reactGoogleRecaptcha.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactGoogleRecaptcha.reactGoogleRecaptchaStrings.compact
  - typings.reactGoogleRecaptcha.reactGoogleRecaptchaStrings.normal
  - typings.reactGoogleRecaptcha.reactGoogleRecaptchaStrings.invisible
*/
trait Size extends js.Object

object Size {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def compact: typings.reactGoogleRecaptcha.reactGoogleRecaptchaStrings.compact = this.cast("compact")
  @scala.inline
  def invisible: typings.reactGoogleRecaptcha.reactGoogleRecaptchaStrings.invisible = this.cast("invisible")
  @scala.inline
  def normal: typings.reactGoogleRecaptcha.reactGoogleRecaptchaStrings.normal = this.cast("normal")
}

