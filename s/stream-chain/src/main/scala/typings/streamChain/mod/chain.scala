package typings.streamChain.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream-chain", "chain")
@js.native
object chain extends js.Object {
  def apply(fns: js.Array[StreamItem]): Chain_ = js.native
  def apply(fns: js.Array[StreamItem], options: ChainOptions): Chain_ = js.native
}

