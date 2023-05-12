package typings.rdfExt

import typings.rdfExt.anon.Value
import typings.rdfjsTypes.dataModelMod.DefaultGraph
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDefaultGraphMod {
  
  @JSImport("rdf-ext/lib/DefaultGraph", JSImport.Default)
  @js.native
  open class default () extends DefaultGraphExt
  
  @JSImport("rdf-ext/lib/DefaultGraph", "DefaultGraphExt")
  @js.native
  open class DefaultGraphExt ()
    extends StObject
       with DefaultGraph {
    
    def toCanonical(): String = js.native
    
    def toJSON(): Value = js.native
  }
}
