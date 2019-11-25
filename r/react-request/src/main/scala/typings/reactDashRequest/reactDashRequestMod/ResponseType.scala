package typings.reactDashRequest.reactDashRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactDashRequest.reactDashRequestStrings.arrayBuffer
  - typings.reactDashRequest.reactDashRequestStrings.blob
  - typings.reactDashRequest.reactDashRequestStrings.formData
  - typings.reactDashRequest.reactDashRequestStrings.json
  - typings.reactDashRequest.reactDashRequestStrings.text
*/
trait ResponseType extends js.Object

object ResponseType {
  @scala.inline
  def arrayBuffer: typings.reactDashRequest.reactDashRequestStrings.arrayBuffer = this.cast("arrayBuffer")
  @scala.inline
  def blob: typings.reactDashRequest.reactDashRequestStrings.blob = this.cast("blob")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def formData: typings.reactDashRequest.reactDashRequestStrings.formData = this.cast("formData")
  @scala.inline
  def json: typings.reactDashRequest.reactDashRequestStrings.json = this.cast("json")
  @scala.inline
  def text: typings.reactDashRequest.reactDashRequestStrings.text = this.cast("text")
}

