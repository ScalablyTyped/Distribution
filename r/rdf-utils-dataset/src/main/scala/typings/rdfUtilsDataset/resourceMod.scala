package typings.rdfUtilsDataset

import typings.rdfjsTypes.dataModelMod.BaseQuad
import typings.rdfjsTypes.dataModelMod.Term
import typings.rdfjsTypes.datasetMod.DatasetCore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resourceMod {
  
  @JSImport("rdf-utils-dataset/resource", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[D /* <: DatasetCore[BaseQuad, BaseQuad] */](input: D, subject: Term): D = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any], subject.asInstanceOf[js.Any])).asInstanceOf[D]
}
