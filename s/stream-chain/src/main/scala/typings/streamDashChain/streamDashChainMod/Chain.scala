package typings.streamDashChain.streamDashChainMod

import typings.node.streamMod.Duplex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Chain extends Duplex {
  var input: Stream = js.native
  var output: Stream = js.native
  var streams: js.Array[Stream] = js.native
}

