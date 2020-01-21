package typings.reactFileReaderInput.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactFileReaderInput.reactFileReaderInputStrings.buffer
  - typings.reactFileReaderInput.reactFileReaderInputStrings.binary
  - typings.reactFileReaderInput.reactFileReaderInputStrings.url
  - typings.reactFileReaderInput.reactFileReaderInputStrings.text
*/
trait Format extends js.Object

object Format {
  @scala.inline
  def binary: typings.reactFileReaderInput.reactFileReaderInputStrings.binary = this.cast("binary")
  @scala.inline
  def buffer: typings.reactFileReaderInput.reactFileReaderInputStrings.buffer = this.cast("buffer")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def text: typings.reactFileReaderInput.reactFileReaderInputStrings.text = this.cast("text")
  @scala.inline
  def url: typings.reactFileReaderInput.reactFileReaderInputStrings.url = this.cast("url")
}

