package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.Empty
  - typings.std.stdStrings.arraybuffer
  - typings.std.stdStrings.blob
  - typings.std.stdStrings.document
  - typings.std.stdStrings.json
  - typings.std.stdStrings.text
*/
trait XMLHttpRequestResponseType extends js.Object

object XMLHttpRequestResponseType {
  @scala.inline
  def Empty: typings.std.stdStrings.Empty = this.cast("")
  @scala.inline
  def arraybuffer: typings.std.stdStrings.arraybuffer = this.cast("arraybuffer")
  @scala.inline
  def blob: typings.std.stdStrings.blob = this.cast("blob")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def document: typings.std.stdStrings.document = this.cast("document")
  @scala.inline
  def json: typings.std.stdStrings.json = this.cast("json")
  @scala.inline
  def text: typings.std.stdStrings.text = this.cast("text")
}

