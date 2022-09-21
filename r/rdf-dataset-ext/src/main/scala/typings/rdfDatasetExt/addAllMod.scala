package typings.rdfDatasetExt

import typings.rdfjsTypes.dataModelMod.BaseQuad
import typings.rdfjsTypes.datasetMod.DatasetCore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addAllMod {
  
  /**
    * Iterates over iterable and adds all quads to dataset by calling `.add` for each quad.
    *
    * Returns the given dataset.
    */
  inline def apply[Q /* <: BaseQuad */, D /* <: DatasetCore[Q, Q] */](dataset: D, iterable: js.Iterable[Q]): D = (^.asInstanceOf[js.Dynamic].apply(dataset.asInstanceOf[js.Any], iterable.asInstanceOf[js.Any])).asInstanceOf[D]
  
  @JSImport("rdf-dataset-ext/addAll", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
