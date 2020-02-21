package typings.rdfDatasetIndexed

import typings.rdfJs.mod.BaseQuad
import typings.rdfJs.mod.DataFactory
import typings.rdfJs.mod.DatasetCore
import typings.rdfJs.mod.DatasetCoreFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdf-dataset-indexed", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply[Q /* <: BaseQuad */](): DatasetCore[Q, BaseQuad] = js.native
  def apply[Q /* <: BaseQuad */](quads: js.Array[Q]): DatasetCore[Q, BaseQuad] = js.native
  def apply[Q /* <: BaseQuad */](quads: js.Array[Q], dataFactory: DataFactory[Q] with (DatasetCoreFactory[Q, Q, DatasetCore[Q, Q]])): DatasetCore[Q, BaseQuad] = js.native
}

