package typings.rdfExt

import typings.rdfExt.anon.TermTypeValue
import typings.rdfjsTypes.dataModelMod.NamedNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object namedNodeMod {
  
  // tslint:disable-next-line:no-unnecessary-class
  @JSImport("rdf-ext/lib/NamedNode", JSImport.Namespace)
  @js.native
  open class ^[Iri /* <: String */] protected ()
    extends StObject
       with NamedNodeExt[Iri] {
    def this(iri: Iri) = this()
  }
  
  // tslint:disable-next-line:no-unnecessary-class
  @js.native
  trait NamedNodeExt[Iri /* <: String */]
    extends StObject
       with NamedNode[Iri] {
    
    def toCanonical(): String = js.native
    
    def toJSON(): TermTypeValue = js.native
  }
}
