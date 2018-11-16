package typings
package stompitLib.stompitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stompit", "Client")
@js.native
class Client protected ()
  extends stompitLib.libClientMod.namespaced {
  def this(transportSocket: nodeLib.streamMod.Duplex) = this()
  def this(transportSocket: nodeLib.streamMod.Duplex, options: stompitLib.libSocketMod.SocketNs.SocketOptions) = this()
}

