package typings.ssri.mod

import typings.node.streamMod.Readable
import typings.ssri.anon.OptionsPickAlgorithm
import typings.ssri.anon.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ssri", "checkStream")
@js.native
object checkStream extends js.Object {
  
  def apply(stream: Readable, sri: String): js.Thenable[Hash] = js.native
  def apply(stream: Readable, sri: String, opts: OptionsPickAlgorithm): js.Thenable[Hash] = js.native
  def apply(stream: Readable, sri: String, opts: Size): js.Promise[Hash] = js.native
  def apply(stream: Readable, sri: HashLike): js.Thenable[Hash] = js.native
  def apply(stream: Readable, sri: HashLike, opts: OptionsPickAlgorithm): js.Thenable[Hash] = js.native
  def apply(stream: Readable, sri: HashLike, opts: Size): js.Promise[Hash] = js.native
  def apply(stream: Readable, sri: IntegrityLike): js.Thenable[Hash] = js.native
  def apply(stream: Readable, sri: IntegrityLike, opts: OptionsPickAlgorithm): js.Thenable[Hash] = js.native
  def apply(stream: Readable, sri: IntegrityLike, opts: Size): js.Promise[Hash] = js.native
}
