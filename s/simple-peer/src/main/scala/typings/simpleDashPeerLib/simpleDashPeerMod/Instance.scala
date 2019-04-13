package typings
package simpleDashPeerLib.simpleDashPeerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Instance
  extends nodeLib.streamMod.Duplex {
  // methods which are not documented
  val bufferSize: scala.Double = js.native
  // used for debug logging
  def _debug(): scala.Unit = js.native
  def _debug(message: js.Any, optionalParams: js.Any*): scala.Unit = js.native
  def address(): simpleDashPeerLib.Anon_Address = js.native
  def destroy(error: stdLib.Error): scala.Unit = js.native
  // https://github.com/feross/simple-peer/tree/v6.1.5#peersenddata
  def send(data: SimplePeerData): scala.Unit = js.native
  // https://github.com/feross/simple-peer/tree/v6.1.5#peersignaldata
  def signal(data: java.lang.String): scala.Unit = js.native
  def signal(data: SignalData): scala.Unit = js.native
}

