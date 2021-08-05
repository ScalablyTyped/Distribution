package typings.rdfjsToNtriples

import typings.rdfJs.mod.Literal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object literalMod {
  
  inline def apply(literal: Literal): String = ^.asInstanceOf[js.Dynamic].apply(literal.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@rdfjs/to-ntriples/lib/literal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
