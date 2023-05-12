package typings.rdfUtilsDataset

import typings.rdfUtilsDataset.resourcesToGraphMod.DatasetOf
import typings.rdfUtilsDataset.resourcesToGraphMod.Factory
import typings.rdfUtilsDataset.resourcesToGraphMod.Options
import typings.rdfjsTypes.dataModelMod.BaseQuad
import typings.rdfjsTypes.dataModelMod.Term
import typings.rdfjsTypes.datasetMod.DatasetCore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rdf-utils-dataset", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resource[D /* <: DatasetCore[BaseQuad, BaseQuad] */](input: D, subject: Term): D = (^.asInstanceOf[js.Dynamic].applyDynamic("resource")(input.asInstanceOf[js.Any], subject.asInstanceOf[js.Any])).asInstanceOf[D]
  
  inline def resourcesToGraph[F /* <: Factory[BaseQuad, BaseQuad, DatasetCore[BaseQuad, BaseQuad]] */](_input: DatasetCore[BaseQuad, BaseQuad]): DatasetOf[F] = ^.asInstanceOf[js.Dynamic].applyDynamic("resourcesToGraph")(_input.asInstanceOf[js.Any]).asInstanceOf[DatasetOf[F]]
  inline def resourcesToGraph[F /* <: Factory[BaseQuad, BaseQuad, DatasetCore[BaseQuad, BaseQuad]] */](_input: DatasetCore[BaseQuad, BaseQuad], options: Options[F]): DatasetOf[F] = (^.asInstanceOf[js.Dynamic].applyDynamic("resourcesToGraph")(_input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DatasetOf[F]]
}
