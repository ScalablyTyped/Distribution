package typings.rdfExt

import typings.rdfExt.anon.Datatype
import typings.rdfjsTypes.dataModelMod.Literal
import typings.rdfjsTypes.dataModelMod.NamedNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLiteralMod {
  
  @JSImport("rdf-ext/lib/Literal", JSImport.Default)
  @js.native
  open class default protected () extends LiteralExt {
    def this(value: String) = this()
    def this(value: String, language: String) = this()
    def this(value: String, language: String, datatype: NamedNode[String]) = this()
    def this(value: String, language: Null, datatype: NamedNode[String]) = this()
    def this(value: String, language: Unit, datatype: NamedNode[String]) = this()
  }
  
  @JSImport("rdf-ext/lib/Literal", "LiteralExt")
  @js.native
  open class LiteralExt protected ()
    extends StObject
       with Literal {
    def this(value: String) = this()
    def this(value: String, language: String) = this()
    def this(value: String, language: String, datatype: NamedNode[String]) = this()
    def this(value: String, language: Null, datatype: NamedNode[String]) = this()
    def this(value: String, language: Unit, datatype: NamedNode[String]) = this()
    
    def toCanonical(): String = js.native
    
    def toJSON(): Datatype = js.native
  }
}
