package typings.rdfDatasetIndexed

import typings.rdfDatasetIndexed.datasetMod.DatasetIndexed
import typings.rdfJs.mod.BaseQuad
import typings.rdfJs.mod.DataFactory
import typings.rdfJs.mod.DatasetCore
import typings.rdfJs.mod.DatasetCoreFactory
import typings.rdfJs.mod.Quad
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdf-dataset-indexed", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply[Q /* <: BaseQuad */](): DatasetIndexed[Q, Quad] = js.native
  def apply[Q /* <: BaseQuad */](
    quads: js.UndefOr[scala.Nothing],
    dataFactory: (DataFactory[Q, Q]) with (DatasetCoreFactory[Q, Q, DatasetCore[Q, Q]])
  ): DatasetIndexed[Q, Quad] = js.native
  def apply[Q /* <: BaseQuad */](quads: js.Array[Q]): DatasetIndexed[Q, Quad] = js.native
  def apply[Q /* <: BaseQuad */](
    quads: js.Array[Q],
    dataFactory: (DataFactory[Q, Q]) with (DatasetCoreFactory[Q, Q, DatasetCore[Q, Q]])
  ): DatasetIndexed[Q, Quad] = js.native
}

