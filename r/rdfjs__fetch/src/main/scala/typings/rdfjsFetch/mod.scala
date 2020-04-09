package typings.rdfjsFetch

import typings.rdfJs.mod.BaseQuad
import typings.rdfJs.mod.DatasetCore
import typings.rdfJs.mod.Quad
import typings.rdfjsFetchLite.mod.DatasetResponse
import typings.rdfjsFetchLite.mod.FactoryInit
import typings.rdfjsFetchLite.mod.RdfFetchResponse
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@rdfjs/fetch", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(url: String): js.Promise[RdfFetchResponse[Quad]] = js.native
  def apply(url: String, options: PartialFormatsInit): js.Promise[RdfFetchResponse[Quad]] = js.native
  def apply[D /* <: DatasetCore[OutQuad, InQuad] */, OutQuad /* <: BaseQuad */, InQuad /* <: BaseQuad */](url: String, options: Partial[FactoryInit[D, OutQuad, InQuad]]): js.Promise[DatasetResponse[D, OutQuad, InQuad]] = js.native
}

