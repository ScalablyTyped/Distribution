package typings.reactGoogleRecaptcha.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactGoogleRecaptcha.reactGoogleRecaptchaStrings.light
  - typings.reactGoogleRecaptcha.reactGoogleRecaptchaStrings.dark
*/
trait Theme extends js.Object

object Theme {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dark: typings.reactGoogleRecaptcha.reactGoogleRecaptchaStrings.dark = this.cast("dark")
  @scala.inline
  def light: typings.reactGoogleRecaptcha.reactGoogleRecaptchaStrings.light = this.cast("light")
}

