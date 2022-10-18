package typings.rdfExt

import typings.rdfExt.anon.Datatype
import typings.rdfjsTypes.dataModelMod.Literal
import typings.rdfjsTypes.dataModelMod.NamedNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLiteralMod {
  
  // tslint:disable-next-line:no-unnecessary-class
  @JSImport("rdf-ext/lib/Literal", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with LiteralExt {
    def this(value: String) = this()
    def this(value: String, language: String) = this()
    def this(value: String, language: String, datatype: NamedNode[String]) = this()
    def this(value: String, language: Null, datatype: NamedNode[String]) = this()
    def this(value: String, language: Unit, datatype: NamedNode[String]) = this()
  }
  
  // tslint:disable-next-line:no-unnecessary-class
  @js.native
  trait LiteralExt
    extends StObject
       with Literal {
    
    def toCanonical(): String = js.native
    
    def toJSON(): Datatype = js.native
  }
}
