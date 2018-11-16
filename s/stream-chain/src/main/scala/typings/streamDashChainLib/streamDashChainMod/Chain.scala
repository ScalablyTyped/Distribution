package typings
package streamDashChainLib.streamDashChainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Chain
  extends nodeLib.streamMod.Duplex {
  var input: streamDashChainLib.Stream = js.native
  var output: streamDashChainLib.Stream = js.native
  var streams: js.Array[streamDashChainLib.Stream] = js.native
}

