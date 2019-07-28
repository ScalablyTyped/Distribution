package typings.stompit.libClientMod

import typings.node.streamMod.Duplex
import typings.stompit.libSocketMod.SocketOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stompit/lib/Client", JSImport.Namespace)
@js.native
class ^ protected () extends Client {
  def this(transportSocket: Duplex) = this()
  def this(transportSocket: Duplex, options: SocketOptions) = this()
}

