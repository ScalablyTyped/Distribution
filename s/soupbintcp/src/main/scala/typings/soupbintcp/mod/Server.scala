package typings.soupbintcp.mod

import typings.node.eventsMod.EventEmitter
import typings.soupbintcp.AnonAddress
import typings.soupbintcp.AnonHost
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soupbintcp", "Server")
@js.native
class Server protected () extends EventEmitter {
  def this(options: AnonHost) = this()
  def this(options: AnonHost, callback: js.Function1[/* data */ js.UndefOr[js.Any], Unit]) = this()
  def address(): AnonAddress = js.native
  def close(callback: js.Function0[Unit]): Unit = js.native
}

