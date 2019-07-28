package typings.simpleDashPeer.simpleDashPeerMod

import typings.node.streamMod.Duplex
import typings.simpleDashPeer.Anon_Address
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Instance extends Duplex {
  // methods which are not documented
  val bufferSize: Double = js.native
  // used for debug logging
  def _debug(): Unit = js.native
  def _debug(message: js.Any, optionalParams: js.Any*): Unit = js.native
  def address(): Anon_Address = js.native
  def destroy(error: Error): Unit = js.native
  // https://github.com/feross/simple-peer/tree/v6.1.5#peersenddata
  def send(data: SimplePeerData): Unit = js.native
  // https://github.com/feross/simple-peer/tree/v6.1.5#peersignaldata
  def signal(data: String): Unit = js.native
  def signal(data: SignalData): Unit = js.native
}

