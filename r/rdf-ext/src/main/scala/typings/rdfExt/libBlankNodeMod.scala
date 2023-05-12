package typings.rdfExt

import typings.rdfExt.anon.TermType
import typings.rdfjsTypes.dataModelMod.BlankNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBlankNodeMod {
  
  @JSImport("rdf-ext/lib/BlankNode", JSImport.Default)
  @js.native
  open class default protected () extends BlankNodeExt {
    def this(id: String) = this()
  }
  
  @JSImport("rdf-ext/lib/BlankNode", "BlankNodeExt")
  @js.native
  open class BlankNodeExt protected ()
    extends StObject
       with BlankNode {
    def this(id: String) = this()
    
    def toCanonical(): String = js.native
    
    def toJSON(): TermType = js.native
  }
}
