package typings.rdfExt

import typings.rdfExt.anon.TermTypeValue
import typings.rdfjsTypes.dataModelMod.NamedNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNamedNodeMod {
  
  @JSImport("rdf-ext/lib/NamedNode", JSImport.Default)
  @js.native
  open class default[Iri /* <: String */] protected () extends NamedNodeExt[Iri] {
    def this(iri: Iri) = this()
  }
  
  @JSImport("rdf-ext/lib/NamedNode", "NamedNodeExt")
  @js.native
  open class NamedNodeExt[Iri /* <: String */] protected ()
    extends StObject
       with NamedNode[Iri] {
    def this(iri: Iri) = this()
    
    def toCanonical(): String = js.native
    
    def toJSON(): TermTypeValue = js.native
  }
}
