package typings.rdfDatasetExt

import typings.rdfJs.mod.BaseQuad
import typings.rdfJs.mod.DatasetCore
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addAllMod {
  
  inline def apply[Q /* <: BaseQuad */, D /* <: DatasetCore[Q, Q] */](dataset: D, iterable: Iterable[Q]): D = (^.asInstanceOf[js.Dynamic].apply(dataset.asInstanceOf[js.Any], iterable.asInstanceOf[js.Any])).asInstanceOf[D]
  
  @JSImport("rdf-dataset-ext/addAll", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
