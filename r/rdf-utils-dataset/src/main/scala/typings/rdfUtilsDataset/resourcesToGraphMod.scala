package typings.rdfUtilsDataset

import typings.rdfjsTypes.dataModelMod.BaseQuad
import typings.rdfjsTypes.dataModelMod.DataFactory
import typings.rdfjsTypes.datasetMod.DatasetCore
import typings.rdfjsTypes.datasetMod.DatasetCoreFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resourcesToGraphMod {
  
  @JSImport("rdf-utils-dataset/resourcesToGraph", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[F /* <: Factory[BaseQuad, BaseQuad, DatasetCore[BaseQuad, BaseQuad]] */](_input: DatasetCore[BaseQuad, BaseQuad]): DatasetOf[F] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(_input.asInstanceOf[js.Any]).asInstanceOf[DatasetOf[F]]
  inline def default[F /* <: Factory[BaseQuad, BaseQuad, DatasetCore[BaseQuad, BaseQuad]] */](_input: DatasetCore[BaseQuad, BaseQuad], options: Options[F]): DatasetOf[F] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(_input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DatasetOf[F]]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    F extends @rdfjs/types.@rdfjs/types/dataset.DatasetCoreFactory<any, any, infer D> ? D : never
    }}}
    */
  @js.native
  trait DatasetOf[F] extends StObject
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options[?], F /* <: Factory[BaseQuad, BaseQuad, DatasetCore[BaseQuad, BaseQuad]] */] (val x: Self & Options[F]) extends AnyVal {
      
      inline def setFactory(value: F): Self = StObject.set(x, "factory", value.asInstanceOf[js.Any])
      
      inline def setFactoryUndefined: Self = StObject.set(x, "factory", js.undefined)
    }
  }
}
