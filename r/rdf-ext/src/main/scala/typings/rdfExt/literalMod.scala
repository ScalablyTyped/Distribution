package typings.rdfExt

import typings.rdfExt.anon.Datatype
import typings.rdfJs.mod.Literal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rdf-ext/lib/Literal", JSImport.Namespace)
@js.native
object literalMod extends js.Object {
  
  @js.native
  trait LiteralExt extends Literal {
    
    def toCanonical(): String = js.native
    
    def toJSON(): Datatype = js.native
  }
}
