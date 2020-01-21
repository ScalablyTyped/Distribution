package typings.puppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.puppeteer.puppeteerStrings.load
  - typings.puppeteer.puppeteerStrings.domcontentloaded
  - typings.puppeteer.puppeteerStrings.networkidle0
  - typings.puppeteer.puppeteerStrings.networkidle2
*/
trait LoadEvent extends js.Object

object LoadEvent {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def domcontentloaded: typings.puppeteer.puppeteerStrings.domcontentloaded = this.cast("domcontentloaded")
  @scala.inline
  def load: typings.puppeteer.puppeteerStrings.load = this.cast("load")
  @scala.inline
  def networkidle0: typings.puppeteer.puppeteerStrings.networkidle0 = this.cast("networkidle0")
  @scala.inline
  def networkidle2: typings.puppeteer.puppeteerStrings.networkidle2 = this.cast("networkidle2")
}

