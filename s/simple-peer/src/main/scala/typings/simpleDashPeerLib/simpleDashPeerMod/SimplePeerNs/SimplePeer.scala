package typings
package simpleDashPeerLib.simpleDashPeerMod.SimplePeerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/feross/simple-peer/tree/v6.1.5#peer--new-simplepeeropts
@js.native
trait SimplePeer
  extends ScalablyTyped.runtime.Instantiable0[Instance]
     with ScalablyTyped.runtime.Instantiable1[/* opts */ Options, Instance] {
  // https://github.com/feross/simple-peer/tree/v6.1.5#peerwebrtc_support
  val WEBRTC_SUPPORT: scala.Boolean = js.native
  def apply(): Instance = js.native
  def apply(opts: Options): Instance = js.native
}

