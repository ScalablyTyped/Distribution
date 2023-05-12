package typings.rdfExt

import typings.rdfExt.anon.TermTypePropType
import typings.rdfjsTypes.dataModelMod.Variable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libVariableMod {
  
  @JSImport("rdf-ext/lib/Variable", JSImport.Default)
  @js.native
  open class default protected () extends VariableExt {
    def this(name: String) = this()
  }
  
  @JSImport("rdf-ext/lib/Variable", "VariableExt")
  @js.native
  open class VariableExt protected ()
    extends StObject
       with Variable {
    def this(name: String) = this()
    
    def toCanonical(): String = js.native
    
    def toJSON(): TermTypePropType = js.native
  }
}
