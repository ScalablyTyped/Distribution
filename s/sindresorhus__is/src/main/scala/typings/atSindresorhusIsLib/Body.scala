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
    arrayBuffer: () => Promise[ArrayBuffer],
    blob: () => Promise[Blob],
    bodyUsed: scala.Boolean,
    formData: () => Promise[FormData],
    json: () => Promise[_],
    text: () => Promise[java.lang.String],
    body: ReadableStream[Uint8Array] = null
  ): Body = {
    val __obj = js.Dynamic.literal(arrayBuffer = js.Any.fromFunction0(arrayBuffer), blob = js.Any.fromFunction0(blob), bodyUsed = bodyUsed, formData = js.Any.fromFunction0(formData), json = js.Any.fromFunction0(json), text = js.Any.fromFunction0(text))
    if (body != null) __obj.updateDynamic("body")(body)
    __obj.asInstanceOf[Body]
  }
}

