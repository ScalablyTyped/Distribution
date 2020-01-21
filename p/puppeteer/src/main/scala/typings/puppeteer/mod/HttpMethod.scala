package typings.puppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.puppeteer.puppeteerStrings.GET
  - typings.puppeteer.puppeteerStrings.POST
  - typings.puppeteer.puppeteerStrings.PATCH
  - typings.puppeteer.puppeteerStrings.PUT
  - typings.puppeteer.puppeteerStrings.DELETE
  - typings.puppeteer.puppeteerStrings.OPTIONS
*/
trait HttpMethod extends js.Object

object HttpMethod {
  @scala.inline
  def DELETE: typings.puppeteer.puppeteerStrings.DELETE = this.cast("DELETE")
  @scala.inline
  def GET: typings.puppeteer.puppeteerStrings.GET = this.cast("GET")
  @scala.inline
  def OPTIONS: typings.puppeteer.puppeteerStrings.OPTIONS = this.cast("OPTIONS")
  @scala.inline
  def PATCH: typings.puppeteer.puppeteerStrings.PATCH = this.cast("PATCH")
  @scala.inline
  def POST: typings.puppeteer.puppeteerStrings.POST = this.cast("POST")
  @scala.inline
  def PUT: typings.puppeteer.puppeteerStrings.PUT = this.cast("PUT")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

