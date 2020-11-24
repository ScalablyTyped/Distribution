package typings.soupbintcp.mod

import typings.node.eventsMod.EventEmitter
import typings.soupbintcp.anon.Address
import typings.soupbintcp.anon.Host
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("soupbintcp", "Server")
@js.native
class Server protected () extends EventEmitter {
  def this(options: Host) = this()
  def this(options: Host, callback: js.Function1[/* data */ js.UndefOr[js.Any], Unit]) = this()
  
  def address(): Address = js.native
  
  def close(callback: js.Function0[Unit]): Unit = js.native
}
