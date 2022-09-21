package typings.rdfUtilsDataset

import typings.rdfDatasetIndexed.datasetMod.DatasetIndexed
import typings.rdfjsTypes.dataModelMod.BaseQuad
import typings.rdfjsTypes.dataModelMod.Term
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resourceMod {
  
  inline def apply[D /* <: DatasetIndexed[BaseQuad, BaseQuad] */](input: D, subject: Term): D = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], subject.asInstanceOf[js.Any])).asInstanceOf[D]
  
  @JSImport("rdf-utils-dataset/resource", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
