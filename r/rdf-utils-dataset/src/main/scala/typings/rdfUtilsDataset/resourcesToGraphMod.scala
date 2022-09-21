package typings.rdfUtilsDataset

import typings.rdfDatasetIndexed.datasetMod.DatasetIndexed
import typings.rdfjsTypes.dataModelMod.BaseQuad
import typings.rdfjsTypes.dataModelMod.DataFactory
import typings.rdfjsTypes.datasetMod.DatasetCore
import typings.rdfjsTypes.datasetMod.DatasetCoreFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resourcesToGraphMod {
  
  inline def apply[F /* <: Factory[BaseQuad, BaseQuad, DatasetCore[BaseQuad, BaseQuad]] */](_input: DatasetIndexed[BaseQuad, BaseQuad]): DatasetOf[F] = ^.asInstanceOf[js.Dynamic].apply(_input.asInstanceOf[js.Any]).asInstanceOf[DatasetOf[F]]
  inline def apply[F /* <: Factory[BaseQuad, BaseQuad, DatasetCore[BaseQuad, BaseQuad]] */](_input: DatasetIndexed[BaseQuad, BaseQuad], options: Options[F]): DatasetOf[F] = (^.asInstanceOf[js.Dynamic].apply(_input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DatasetOf[F]]
  
  @JSImport("rdf-utils-dataset/resourcesToGraph", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type DatasetOf[F] = Any
  
  @js.native
  trait Factory[OutQuad /* <: BaseQuad */, InQuad /* <: BaseQuad */, D /* <: DatasetCore[OutQuad, InQuad] */]
    extends StObject
       with DataFactory[OutQuad, InQuad]
       with DatasetCoreFactory[OutQuad, InQuad, D]
  
  trait Options[F /* <: Factory[BaseQuad, BaseQuad, DatasetCore[BaseQuad, BaseQuad]] */] extends StObject {
    
    var factory: js.UndefOr[F] = js.undefined
  }
  object Options {
    
    inline def apply[F /* <: Factory[BaseQuad, BaseQuad, DatasetCore[BaseQuad, BaseQuad]] */](): Options[F] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[F]]
    }
    
    extension [Self <: Options[?], F /* <: Factory[BaseQuad, BaseQuad, DatasetCore[BaseQuad, BaseQuad]] */](x: Self & Options[F]) {
      
      inline def setFactory(value: F): Self = StObject.set(x, "factory", value.asInstanceOf[js.Any])
      
      inline def setFactoryUndefined: Self = StObject.set(x, "factory", js.undefined)
    }
  }
}
