package typings.puppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.puppeteer.puppeteerStrings.mac
  - typings.puppeteer.puppeteerStrings.win32
  - typings.puppeteer.puppeteerStrings.win64
  - typings.puppeteer.puppeteerStrings.linux
*/
trait Platform extends js.Object

object Platform {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def linux: typings.puppeteer.puppeteerStrings.linux = this.cast("linux")
  @scala.inline
  def mac: typings.puppeteer.puppeteerStrings.mac = this.cast("mac")
  @scala.inline
  def win32: typings.puppeteer.puppeteerStrings.win32 = this.cast("win32")
  @scala.inline
  def win64: typings.puppeteer.puppeteerStrings.win64 = this.cast("win64")
}

