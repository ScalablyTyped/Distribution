package typings.soupbintcp.soupbintcpMod

import typings.node.eventsMod.EventEmitter
import typings.soupbintcp.Anon_Address
import typings.soupbintcp.Anon_Host
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soupbintcp", "Server")
@js.native
class Server protected () extends EventEmitter {
  def this(options: Anon_Host) = this()
  def this(options: Anon_Host, callback: js.Function1[/* data */ js.UndefOr[js.Any], Unit]) = this()
  def address(): Anon_Address = js.native
  def close(callback: js.Function0[Unit]): Unit = js.native
}

