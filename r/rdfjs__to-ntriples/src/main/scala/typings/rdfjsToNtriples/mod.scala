package typings.rdfjsToNtriples

import typings.rdfjsTypes.dataModelMod.Quad
import typings.rdfjsTypes.dataModelMod.Term
import typings.rdfjsTypes.datasetMod.DatasetCore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(term: Term): String = ^.asInstanceOf[js.Dynamic].apply(term.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(term: DatasetCore[Quad, Quad]): String = ^.asInstanceOf[js.Dynamic].apply(term.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@rdfjs/to-ntriples", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
