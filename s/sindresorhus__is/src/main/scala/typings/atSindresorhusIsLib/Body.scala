package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Body extends js.Object {
  val body: ReadableStream[Uint8Array] | scala.Null
  val bodyUsed: scala.Boolean
  def arrayBuffer(): Promise[ArrayBuffer]
  def blob(): Promise[Blob]
  def formData(): Promise[FormData]
  def json(): Promise[_]
  def text(): Promise[java.lang.String]
}

object Body {
  @scala.inline
  def apply(
    arrayBuffer: js.Function0[Promise[ArrayBuffer]],
    blob: js.Function0[Promise[Blob]],
    bodyUsed: scala.Boolean,
    formData: js.Function0[Promise[FormData]],
    json: js.Function0[Promise[_]],
    text: js.Function0[Promise[java.lang.String]],
    body: ReadableStream[Uint8Array] = null
  ): Body = {
    val __obj = js.Dynamic.literal(arrayBuffer = arrayBuffer, blob = blob, bodyUsed = bodyUsed, formData = formData, json = json, text = text)
    if (body != null) __obj.updateDynamic("body")(body)
    __obj.asInstanceOf[Body]
  }
}

