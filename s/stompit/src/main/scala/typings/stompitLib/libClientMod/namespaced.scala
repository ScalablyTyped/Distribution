package typings
package stompitLib.libClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stompit/lib/Client", JSImport.Namespace)
@js.native
class namespaced protected () extends Client {
  def this(transportSocket: nodeLib.streamMod.Duplex) = this()
  def this(transportSocket: nodeLib.streamMod.Duplex, options: stompitLib.libSocketMod.SocketNs.SocketOptions) = this()
}

