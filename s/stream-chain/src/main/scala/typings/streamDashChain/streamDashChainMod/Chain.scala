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

@JSImport("stream-chain", "chain")
@js.native
object chain extends js.Object {
  def apply(fns: js.Array[StreamItem]): Chain = js.native
  def apply(fns: js.Array[StreamItem], options: ChainOptions): Chain = js.native
}

