package typings.simplePeer.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/feross/simple-peer/tree/v6.1.5#peer--new-simplepeeropts
@js.native
trait SimplePeer
  extends Instantiable0[Instance]
     with Instantiable1[/* opts */ Options, Instance] {
  // https://github.com/feross/simple-peer/tree/v6.1.5#peerwebrtc_support
  val WEBRTC_SUPPORT: Boolean = js.native
  def apply(): Instance = js.native
  def apply(opts: Options): Instance = js.native
}

