package typings.qIo.QioHTTP

import typings.q.mod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("QioHTTP.request")
@js.native
object request extends js.Object {
  def apply(request: Request_): Promise[Response] = js.native
  def apply(url: String): Promise[Response] = js.native
}

