package typings
package atSindresorhusIsLib

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
    respond: js.Function1[scala.Double, scala.Unit],
    respondWithNewView: js.Function1[ArrayBufferView, scala.Unit],
    view: ArrayBufferView
  ): ReadableStreamBYOBRequest = {
    val __obj = js.Dynamic.literal(respond = respond, respondWithNewView = respondWithNewView, view = view)
  
    __obj.asInstanceOf[ReadableStreamBYOBRequest]
  }
}

