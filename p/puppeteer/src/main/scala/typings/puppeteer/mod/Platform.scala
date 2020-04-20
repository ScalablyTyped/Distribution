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
  def linux: typings.puppeteer.puppeteerStrings.linux = "linux".asInstanceOf[typings.puppeteer.puppeteerStrings.linux]
  @scala.inline
  def mac: typings.puppeteer.puppeteerStrings.mac = "mac".asInstanceOf[typings.puppeteer.puppeteerStrings.mac]
  @scala.inline
  def win32: typings.puppeteer.puppeteerStrings.win32 = "win32".asInstanceOf[typings.puppeteer.puppeteerStrings.win32]
  @scala.inline
  def win64: typings.puppeteer.puppeteerStrings.win64 = "win64".asInstanceOf[typings.puppeteer.puppeteerStrings.win64]
}

