package typings.spdy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Handle extends js.Object {
  def assignClientRequest(req: js.Any): Unit = js.native
  def assignRequest(req: js.Any): Unit = js.native
  def assignResponse(res: js.Any): Unit = js.native
  def assignSocket(socket: Socket_, options: js.Object): Unit = js.native
  def create(options: js.Object, stream: js.Any, socket: Socket_): Handle = js.native
  def emitRequest(): Unit = js.native
  def emitResponse(status: js.Any, headers: js.Any): Unit = js.native
  def getStream(): js.Any = js.native
  def getStream(callback: js.Function1[/* stream */ js.Any, Unit]): js.Any = js.native
}

