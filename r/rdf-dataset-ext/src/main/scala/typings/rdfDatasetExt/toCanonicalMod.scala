package typings.rdfDatasetExt

import typings.rdfjsTypes.dataModelMod.BaseQuad
import typings.rdfjsTypes.datasetMod.DatasetCore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toCanonicalMod {
  
  /**
    * Returns the canonical representation of the dataset as string.
    */
  inline def apply(dataset: DatasetCore[BaseQuad, BaseQuad]): String = ^.asInstanceOf[js.Dynamic].apply(dataset.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("rdf-dataset-ext/toCanonical", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
