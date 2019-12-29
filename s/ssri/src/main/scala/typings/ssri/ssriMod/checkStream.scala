package typings.ssri.ssriMod

import typings.node.streamMod.Readable
import typings.ssri.Anon_Algo1Algo2Options
import typings.ssri.Anon_Algo1Algo2OptionsPickAlgorithm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ssri", "checkStream")
@js.native
object checkStream extends js.Object {
  def apply(stream: Readable, sri: String): js.Thenable[Hash] = js.native
  def apply(stream: Readable, sri: String, opts: Anon_Algo1Algo2Options): js.Promise[Hash] = js.native
  def apply(stream: Readable, sri: String, opts: Anon_Algo1Algo2OptionsPickAlgorithm): js.Thenable[Hash] = js.native
  def apply(stream: Readable, sri: HashLike): js.Thenable[Hash] = js.native
  def apply(stream: Readable, sri: HashLike, opts: Anon_Algo1Algo2Options): js.Promise[Hash] = js.native
  def apply(stream: Readable, sri: HashLike, opts: Anon_Algo1Algo2OptionsPickAlgorithm): js.Thenable[Hash] = js.native
  def apply(stream: Readable, sri: IntegrityLike): js.Thenable[Hash] = js.native
  def apply(stream: Readable, sri: IntegrityLike, opts: Anon_Algo1Algo2Options): js.Promise[Hash] = js.native
  def apply(stream: Readable, sri: IntegrityLike, opts: Anon_Algo1Algo2OptionsPickAlgorithm): js.Thenable[Hash] = js.native
}

