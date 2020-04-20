package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadableStreamBYOBRequest extends js.Object {
  val view: ArrayBufferView
  def respond(bytesWritten: Double): Unit
  def respondWithNewView(view: ArrayBufferView): Unit
}

object ReadableStreamBYOBRequest {
  @scala.inline
  def apply(respond: Double => Unit, respondWithNewView: ArrayBufferView => Unit, view: ArrayBufferView): ReadableStreamBYOBRequest = {
    val __obj = js.Dynamic.literal(respond = js.Any.fromFunction1(respond), respondWithNewView = js.Any.fromFunction1(respondWithNewView), view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadableStreamBYOBRequest]
  }
}

