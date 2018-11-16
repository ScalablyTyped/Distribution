package typings
package spdyLib.spdyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Handle extends js.Object {
  def assignClientRequest(req: js.Any): scala.Unit = js.native
  def assignRequest(req: js.Any): scala.Unit = js.native
  def assignResponse(res: js.Any): scala.Unit = js.native
  def assignSocket(socket: Socket, options: js.Object): scala.Unit = js.native
  def create(options: js.Object, stream: js.Any, socket: Socket): Handle = js.native
  def emitRequest(): scala.Unit = js.native
  def emitResponse(status: js.Any, headers: js.Any): scala.Unit = js.native
  def getStream(): js.Any = js.native
  def getStream(callback: js.Function1[/* stream */ js.Any, scala.Unit]): js.Any = js.native
}

