package typings.rdfDashExt

import typings.rdfDashJs.rdfDashJsMod.Literal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdf-ext/lib/Literal", JSImport.Namespace)
@js.native
object libLiteralMod extends js.Object {
  @js.native
  trait LiteralExt extends Literal {
    def toCanonical(): String = js.native
    def toJSON(): Anon_Datatype = js.native
  }
  
}

