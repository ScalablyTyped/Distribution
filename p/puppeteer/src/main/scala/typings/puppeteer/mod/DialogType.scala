package typings.puppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.puppeteer.puppeteerStrings.alert
  - typings.puppeteer.puppeteerStrings.beforeunload
  - typings.puppeteer.puppeteerStrings.confirm
  - typings.puppeteer.puppeteerStrings.prompt
*/
trait DialogType extends js.Object

object DialogType {
  @scala.inline
  def alert: typings.puppeteer.puppeteerStrings.alert = this.cast("alert")
  @scala.inline
  def beforeunload: typings.puppeteer.puppeteerStrings.beforeunload = this.cast("beforeunload")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def confirm: typings.puppeteer.puppeteerStrings.confirm = this.cast("confirm")
  @scala.inline
  def prompt: typings.puppeteer.puppeteerStrings.prompt = this.cast("prompt")
}

