package typings.rdfDatasetIndexed

import typings.rdfDatasetIndexed.datasetMod.DatasetIndexed
import typings.rdfJs.mod.BaseQuad
import typings.rdfJs.mod.DataFactory
import typings.rdfJs.mod.DatasetCore
import typings.rdfJs.mod.DatasetCoreFactory
import typings.rdfJs.mod.Quad
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rdf-dataset-indexed", JSImport.Namespace)
  @js.native
  def apply[Q /* <: BaseQuad */](): DatasetIndexed[Q, Quad] = js.native
  @JSImport("rdf-dataset-indexed", JSImport.Namespace)
  @js.native
  def apply[Q /* <: BaseQuad */](
    quads: js.UndefOr[scala.Nothing],
    dataFactory: (DataFactory[Q, Q]) with (DatasetCoreFactory[Q, Q, DatasetCore[Q, Q]])
  ): DatasetIndexed[Q, Quad] = js.native
  @JSImport("rdf-dataset-indexed", JSImport.Namespace)
  @js.native
  def apply[Q /* <: BaseQuad */](quads: js.Array[Q]): DatasetIndexed[Q, Quad] = js.native
  @JSImport("rdf-dataset-indexed", JSImport.Namespace)
  @js.native
  def apply[Q /* <: BaseQuad */](
    quads: js.Array[Q],
    dataFactory: (DataFactory[Q, Q]) with (DatasetCoreFactory[Q, Q, DatasetCore[Q, Q]])
  ): DatasetIndexed[Q, Quad] = js.native
}
