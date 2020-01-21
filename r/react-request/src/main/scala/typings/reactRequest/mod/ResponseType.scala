package typings.reactRequest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactRequest.reactRequestStrings.arrayBuffer
  - typings.reactRequest.reactRequestStrings.blob
  - typings.reactRequest.reactRequestStrings.formData
  - typings.reactRequest.reactRequestStrings.json
  - typings.reactRequest.reactRequestStrings.text
*/
trait ResponseType extends js.Object

object ResponseType {
  @scala.inline
  def arrayBuffer: typings.reactRequest.reactRequestStrings.arrayBuffer = this.cast("arrayBuffer")
  @scala.inline
  def blob: typings.reactRequest.reactRequestStrings.blob = this.cast("blob")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def formData: typings.reactRequest.reactRequestStrings.formData = this.cast("formData")
  @scala.inline
  def json: typings.reactRequest.reactRequestStrings.json = this.cast("json")
  @scala.inline
  def text: typings.reactRequest.reactRequestStrings.text = this.cast("text")
}

