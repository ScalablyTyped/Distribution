package typings.rdfExt

import typings.rdfExt.anon.TermTypeValue
import typings.rdfJs.mod.NamedNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object namedNodeMod {
  
  @js.native
  trait NamedNodeExt[Iri /* <: String */]
    extends StObject
       with NamedNode[Iri] {
    
    def toCanonical(): String = js.native
    
    def toJSON(): TermTypeValue = js.native
  }
}
