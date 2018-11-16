package typings
package soupbintcpLib.soupbintcpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soupbintcp", "Client")
@js.native
class Client protected ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(options: soupbintcpLib.Anon_Host) = this()
  def this(options: soupbintcpLib.Anon_Host, callback: js.Function0[scala.Unit]) = this()
  def end(): scala.Unit = js.native
  def login(payload: LoginRequestPayload): scala.Unit = js.native
  def login(payload: LoginRequestPayload, callback: js.Function1[/* data */ js.UndefOr[js.Any], scala.Unit]): scala.Unit = js.native
  def logout(): scala.Unit = js.native
  def logout(callback: js.Function1[/* data */ js.UndefOr[js.Any], scala.Unit]): scala.Unit = js.native
  def send(payload: js.Any): scala.Unit = js.native
  def send(payload: js.Any, callback: js.Function1[/* data */ js.UndefOr[js.Any], scala.Unit]): scala.Unit = js.native
}

