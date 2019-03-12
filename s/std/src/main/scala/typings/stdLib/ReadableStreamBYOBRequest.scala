package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadableStreamBYOBRequest extends js.Object {
  val view: ArrayBufferView
  def respond(bytesWritten: scala.Double): scala.Unit
  def respondWithNewView(view: ArrayBufferView): scala.Unit
}

object ReadableStreamBYOBRequest {
  @scala.inline
  def apply(
    respond: scala.Double => scala.Unit,
    respondWithNewView: ArrayBufferView => scala.Unit,
    view: ArrayBufferView
  ): ReadableStreamBYOBRequest = {
    val __obj = js.Dynamic.literal(respond = js.Any.fromFunction1(respond), respondWithNewView = js.Any.fromFunction1(respondWithNewView), view = view)
  
    __obj.asInstanceOf[ReadableStreamBYOBRequest]
  }
}

