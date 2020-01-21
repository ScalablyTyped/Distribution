package typings.rdfExt

import typings.rdfJs.mod.Literal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdf-ext/lib/Literal", JSImport.Namespace)
@js.native
object literalMod extends js.Object {
  @js.native
  trait LiteralExt extends Literal {
    def toCanonical(): String = js.native
    def toJSON(): AnonDatatype = js.native
  }
  
}

