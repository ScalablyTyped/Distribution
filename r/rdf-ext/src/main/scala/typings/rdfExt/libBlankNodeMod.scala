package typings.rdfExt

import typings.rdfExt.anon.TermType
import typings.rdfjsTypes.dataModelMod.BlankNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBlankNodeMod {
  
  // tslint:disable-next-line:no-unnecessary-class
  @JSImport("rdf-ext/lib/BlankNode", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with BlankNodeExt {
    def this(id: String) = this()
  }
  
  // tslint:disable-next-line:no-unnecessary-class
  @js.native
  trait BlankNodeExt
    extends StObject
       with BlankNode {
    
    def toCanonical(): String = js.native
    
    def toJSON(): TermType = js.native
  }
}
