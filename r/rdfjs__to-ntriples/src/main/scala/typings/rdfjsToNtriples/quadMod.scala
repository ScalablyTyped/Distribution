package typings.rdfjsToNtriples

import typings.rdfJs.mod.Quad
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object quadMod {
  
  @scala.inline
  def apply(quad: Quad): String = ^.asInstanceOf[js.Dynamic].apply(quad.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@rdfjs/to-ntriples/lib/quad", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
