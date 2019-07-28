package typings.soupbintcp.soupbintcpMod

import typings.node.eventsMod.EventEmitter
import typings.soupbintcp.Anon_Host
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soupbintcp", "Client")
@js.native
class Client protected () extends EventEmitter {
  def this(options: Anon_Host) = this()
  def this(options: Anon_Host, callback: js.Function0[Unit]) = this()
  def end(): Unit = js.native
  def login(payload: LoginRequestPayload): Unit = js.native
  def login(payload: LoginRequestPayload, callback: js.Function1[/* data */ js.UndefOr[js.Any], Unit]): Unit = js.native
  def logout(): Unit = js.native
  def logout(callback: js.Function1[/* data */ js.UndefOr[js.Any], Unit]): Unit = js.native
  def send(payload: js.Any): Unit = js.native
  def send(payload: js.Any, callback: js.Function1[/* data */ js.UndefOr[js.Any], Unit]): Unit = js.native
}

