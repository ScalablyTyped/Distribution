package typings.stompit.stompitMod

import typings.node.streamMod.Duplex
import typings.stompit.libSocketMod.SocketOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stompit", "Client")
@js.native
class Client protected ()
  extends typings.stompit.libClientMod.^ {
  def this(transportSocket: Duplex) = this()
  def this(transportSocket: Duplex, options: SocketOptions) = this()
}

