package typings.rdfExt

import typings.rdfExt.anon.TermTypeValue
import typings.rdfJs.mod.NamedNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rdf-ext/lib/NamedNode", JSImport.Namespace)
@js.native
object namedNodeMod extends js.Object {
  
  @js.native
  trait NamedNodeExt[Iri /* <: String */] extends NamedNode[Iri] {
    
    def toCanonical(): String = js.native
    
    def toJSON(): TermTypeValue = js.native
  }
}
