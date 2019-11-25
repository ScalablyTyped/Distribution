package typings.puppeteer.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.puppeteer.puppeteerStrings.screen
  - typings.puppeteer.puppeteerStrings.print
*/
trait MediaType extends js.Object

object MediaType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def print: typings.puppeteer.puppeteerStrings.print = this.cast("print")
  @scala.inline
  def screen: typings.puppeteer.puppeteerStrings.screen = this.cast("screen")
}

