package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Body extends js.Object {
  val body: ReadableStream[Uint8Array] | Null
  val bodyUsed: scala.Boolean
  def arrayBuffer(): js.Promise[ArrayBuffer]
  def blob(): js.Promise[Blob]
  def formData(): js.Promise[FormData]
  def json(): js.Promise[_]
  def text(): js.Promise[java.lang.String]
}

object Body {
  @scala.inline
  def apply(
    arrayBuffer: () => js.Promise[ArrayBuffer],
    blob: () => js.Promise[Blob],
    bodyUsed: scala.Boolean,
    formData: () => js.Promise[FormData],
    json: () => js.Promise[_],
    text: () => js.Promise[java.lang.String],
    body: ReadableStream[Uint8Array] = null
  ): Body = {
    val __obj = js.Dynamic.literal(arrayBuffer = js.Any.fromFunction0(arrayBuffer), blob = js.Any.fromFunction0(blob), bodyUsed = bodyUsed.asInstanceOf[js.Any], formData = js.Any.fromFunction0(formData), json = js.Any.fromFunction0(json), text = js.Any.fromFunction0(text), body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[Body]
  }
}

