package typings.rdfDatasetExt

import typings.rdfJs.mod.BaseQuad
import typings.rdfJs.mod.DatasetCore
import typings.rdfJs.mod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toStreamMod {
  
  inline def apply[Q /* <: BaseQuad */](dataset: DatasetCore[Q, Q]): Stream[Q] = ^.asInstanceOf[js.Dynamic].apply(dataset.asInstanceOf[js.Any]).asInstanceOf[Stream[Q]]
  
  @JSImport("rdf-dataset-ext/toStream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
