package typings.rdfjsDataset

import typings.rdfjsDataset.rdfjsDatasetStrings.dataset
import typings.rdfjsTypes.dataModelMod.BaseQuad
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object factoryMod {
  
  @JSImport("@rdfjs/dataset/Factory", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Factory
  /* static members */
  object default {
    
    @JSImport("@rdfjs/dataset/Factory", "default.exports")
    @js.native
    val exports: js.Array[dataset] = js.native
  }
  
  @js.native
  trait Factory extends StObject {
    
    def dataset[Q /* <: BaseQuad */](): typings.rdfjsDataset.datasetCoreMod.default[Q] = js.native
    def dataset[Q /* <: BaseQuad */](quads: js.Array[Q]): typings.rdfjsDataset.datasetCoreMod.default[Q] = js.native
  }
}
