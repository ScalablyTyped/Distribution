package typings.rdfjsToNtriples

import typings.rdfjsTypes.dataModelMod.Quad
import typings.rdfjsTypes.dataModelMod.Term
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object quadMod {
  
  inline def apply(quad: Quad, toNT: js.Function1[/* term */ Term, String]): String = (^.asInstanceOf[js.Dynamic].apply(quad.asInstanceOf[js.Any], toNT.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("@rdfjs/to-ntriples/lib/quad", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
