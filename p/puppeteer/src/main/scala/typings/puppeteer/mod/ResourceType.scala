package typings.puppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.puppeteer.puppeteerStrings.document
  - typings.puppeteer.puppeteerStrings.stylesheet
  - typings.puppeteer.puppeteerStrings.image
  - typings.puppeteer.puppeteerStrings.media
  - typings.puppeteer.puppeteerStrings.font
  - typings.puppeteer.puppeteerStrings.script
  - typings.puppeteer.puppeteerStrings.texttrack
  - typings.puppeteer.puppeteerStrings.xhr
  - typings.puppeteer.puppeteerStrings.fetch
  - typings.puppeteer.puppeteerStrings.eventsource
  - typings.puppeteer.puppeteerStrings.websocket
  - typings.puppeteer.puppeteerStrings.manifest
  - typings.puppeteer.puppeteerStrings.other
*/
trait ResourceType extends js.Object

object ResourceType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def document: typings.puppeteer.puppeteerStrings.document = this.cast("document")
  @scala.inline
  def eventsource: typings.puppeteer.puppeteerStrings.eventsource = this.cast("eventsource")
  @scala.inline
  def fetch: typings.puppeteer.puppeteerStrings.fetch = this.cast("fetch")
  @scala.inline
  def font: typings.puppeteer.puppeteerStrings.font = this.cast("font")
  @scala.inline
  def image: typings.puppeteer.puppeteerStrings.image = this.cast("image")
  @scala.inline
  def manifest: typings.puppeteer.puppeteerStrings.manifest = this.cast("manifest")
  @scala.inline
  def media: typings.puppeteer.puppeteerStrings.media = this.cast("media")
  @scala.inline
  def other: typings.puppeteer.puppeteerStrings.other = this.cast("other")
  @scala.inline
  def script: typings.puppeteer.puppeteerStrings.script = this.cast("script")
  @scala.inline
  def stylesheet: typings.puppeteer.puppeteerStrings.stylesheet = this.cast("stylesheet")
  @scala.inline
  def texttrack: typings.puppeteer.puppeteerStrings.texttrack = this.cast("texttrack")
  @scala.inline
  def websocket: typings.puppeteer.puppeteerStrings.websocket = this.cast("websocket")
  @scala.inline
  def xhr: typings.puppeteer.puppeteerStrings.xhr = this.cast("xhr")
}

