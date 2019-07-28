package typings.soupbintcp.soupbintcpMod

import typings.node.eventsMod.EventEmitter
import typings.node.netMod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soupbintcp", "Session")
@js.native
class Session protected () extends EventEmitter {
  def this(socket: Socket) = this()
  def accept(payload: LoginAcceptedPayload): Unit = js.native
  def accept(payload: LoginAcceptedPayload, callback: js.Function1[/* data */ js.UndefOr[js.Any], Unit]): Unit = js.native
  def end(): Unit = js.native
  def ending(): Unit = js.native
  def ending(callback: js.Function1[/* data */ js.UndefOr[js.Any], Unit]): Unit = js.native
  def reject(payload: LoginRejectedPayload): Unit = js.native
  def reject(payload: LoginRejectedPayload, callback: js.Function1[/* data */ js.UndefOr[js.Any], Unit]): Unit = js.native
  def send(payload: js.Any): Unit = js.native
  def send(payload: js.Any, callback: js.Function1[/* data */ js.UndefOr[js.Any], Unit]): Unit = js.native
}

