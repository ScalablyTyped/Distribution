package typings.puppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.puppeteer.puppeteerStrings.Strict
  - typings.puppeteer.puppeteerStrings.Lax
*/
trait SameSiteSetting extends js.Object

object SameSiteSetting {
  @scala.inline
  def Lax: typings.puppeteer.puppeteerStrings.Lax = this.cast("Lax")
  @scala.inline
  def Strict: typings.puppeteer.puppeteerStrings.Strict = this.cast("Strict")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

