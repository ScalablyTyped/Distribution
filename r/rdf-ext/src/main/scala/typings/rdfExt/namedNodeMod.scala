package typings.rdfExt

import typings.rdfExt.anon.TermTypeValue
import typings.rdfJs.mod.NamedNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdf-ext/lib/NamedNode", JSImport.Namespace)
@js.native
object namedNodeMod extends js.Object {
  @js.native
  trait NamedNodeExt extends NamedNode {
    def toCanonical(): String = js.native
    def toJSON(): TermTypeValue = js.native
  }
  
}

