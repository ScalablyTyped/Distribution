package typings.rdfDatasetIndexed

import typings.rdfDatasetIndexed.datasetMod.DatasetIndexed
import typings.rdfjsTypes.dataModelMod.BaseQuad
import typings.rdfjsTypes.dataModelMod.DataFactory
import typings.rdfjsTypes.dataModelMod.Quad
import typings.rdfjsTypes.datasetMod.DatasetCore
import typings.rdfjsTypes.datasetMod.DatasetCoreFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[Q /* <: BaseQuad */](): DatasetIndexed[Q, Quad] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[DatasetIndexed[Q, Quad]]
  inline def apply[Q /* <: BaseQuad */](quads: js.Array[Q]): DatasetIndexed[Q, Quad] = ^.asInstanceOf[js.Dynamic].apply(quads.asInstanceOf[js.Any]).asInstanceOf[DatasetIndexed[Q, Quad]]
  inline def apply[Q /* <: BaseQuad */](
    quads: js.Array[Q],
    dataFactory: (DataFactory[Q, Q]) & (DatasetCoreFactory[Q, Q, DatasetCore[Q, Q]])
  ): DatasetIndexed[Q, Quad] = (^.asInstanceOf[js.Dynamic].apply(quads.asInstanceOf[js.Any], dataFactory.asInstanceOf[js.Any])).asInstanceOf[DatasetIndexed[Q, Quad]]
  inline def apply[Q /* <: BaseQuad */](quads: Unit, dataFactory: (DataFactory[Q, Q]) & (DatasetCoreFactory[Q, Q, DatasetCore[Q, Q]])): DatasetIndexed[Q, Quad] = (^.asInstanceOf[js.Dynamic].apply(quads.asInstanceOf[js.Any], dataFactory.asInstanceOf[js.Any])).asInstanceOf[DatasetIndexed[Q, Quad]]
  
  @JSImport("rdf-dataset-indexed", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
