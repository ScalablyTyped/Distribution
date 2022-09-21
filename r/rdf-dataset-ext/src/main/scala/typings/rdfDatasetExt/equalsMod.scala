package typings.rdfDatasetExt

import typings.rdfjsTypes.dataModelMod.BaseQuad
import typings.rdfjsTypes.datasetMod.DatasetCore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object equalsMod {
  
  /**
    * Tests if the datasets a and b contain the same quads without doing a normalization step beforehand.
    *
    * That means Blank Node labels must also match. The comparison is done by testing `.size` of both dataset for
    * equality and by looping over all quads of a and check if b contains it using the `.has` method. Returns `true` if
    * both datasets are equal. Otherwise `false `is returned.
    */
  inline def apply(a: DatasetCore[BaseQuad, BaseQuad], b: DatasetCore[BaseQuad, BaseQuad]): Boolean = (^.asInstanceOf[js.Dynamic].apply(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("rdf-dataset-ext/equals", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
