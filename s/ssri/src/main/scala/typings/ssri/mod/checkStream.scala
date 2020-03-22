package typings.ssri.mod

import typings.node.streamMod.Readable
import typings.ssri.AnonOptionsPickAlgorithm
import typings.ssri.AnonSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ssri", "checkStream")
@js.native
object checkStream extends js.Object {
  def apply(stream: Readable, sri: String): js.Thenable[Hash] = js.native
  def apply(stream: Readable, sri: String, opts: AnonOptionsPickAlgorithm): js.Thenable[Hash] = js.native
  def apply(stream: Readable, sri: String, opts: AnonSize): js.Promise[Hash] = js.native
  def apply(stream: Readable, sri: HashLike): js.Thenable[Hash] = js.native
  def apply(stream: Readable, sri: HashLike, opts: AnonOptionsPickAlgorithm): js.Thenable[Hash] = js.native
  def apply(stream: Readable, sri: HashLike, opts: AnonSize): js.Promise[Hash] = js.native
  def apply(stream: Readable, sri: IntegrityLike): js.Thenable[Hash] = js.native
  def apply(stream: Readable, sri: IntegrityLike, opts: AnonOptionsPickAlgorithm): js.Thenable[Hash] = js.native
  def apply(stream: Readable, sri: IntegrityLike, opts: AnonSize): js.Promise[Hash] = js.native
}

