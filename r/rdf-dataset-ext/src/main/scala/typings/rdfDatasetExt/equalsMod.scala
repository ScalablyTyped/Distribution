package typings.rdfDatasetExt

import typings.rdfJs.mod.BaseQuad
import typings.rdfJs.mod.DatasetCore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object equalsMod {
  
  inline def apply(a: DatasetCore[BaseQuad, BaseQuad], b: DatasetCore[BaseQuad, BaseQuad]): Boolean = (^.asInstanceOf[js.Dynamic].apply(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("rdf-dataset-ext/equals", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
