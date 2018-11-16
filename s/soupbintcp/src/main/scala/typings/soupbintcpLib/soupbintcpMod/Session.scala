package typings
package soupbintcpLib.soupbintcpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soupbintcp", "Session")
@js.native
class Session protected ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(socket: nodeLib.netMod.Socket) = this()
  def accept(payload: LoginAcceptedPayload): scala.Unit = js.native
  def accept(payload: LoginAcceptedPayload, callback: js.Function1[/* data */ js.UndefOr[js.Any], scala.Unit]): scala.Unit = js.native
  def end(): scala.Unit = js.native
  def ending(): scala.Unit = js.native
  def ending(callback: js.Function1[/* data */ js.UndefOr[js.Any], scala.Unit]): scala.Unit = js.native
  def reject(payload: LoginRejectedPayload): scala.Unit = js.native
  def reject(payload: LoginRejectedPayload, callback: js.Function1[/* data */ js.UndefOr[js.Any], scala.Unit]): scala.Unit = js.native
  def send(payload: js.Any): scala.Unit = js.native
  def send(payload: js.Any, callback: js.Function1[/* data */ js.UndefOr[js.Any], scala.Unit]): scala.Unit = js.native
}

