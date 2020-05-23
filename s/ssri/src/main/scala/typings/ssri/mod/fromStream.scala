package typings.ssri.mod

import typings.node.streamMod.Readable
import typings.ssri.anon.Algorithms
import typings.ssri.anon.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ssri", "fromStream")
@js.native
object fromStream extends js.Object {
  def apply(stream: Readable): js.Thenable[IntegrityMap] = js.native
  def apply(stream: Readable, opts: Algorithms): js.Promise[IntegrityMap] = js.native
  def apply(stream: Readable, opts: Promise): js.Thenable[IntegrityMap] = js.native
}

