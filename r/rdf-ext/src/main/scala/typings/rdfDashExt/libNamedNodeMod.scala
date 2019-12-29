package typings.rdfDashExt

import typings.rdfDashJs.rdfDashJsMod.NamedNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdf-ext/lib/NamedNode", JSImport.Namespace)
@js.native
object libNamedNodeMod extends js.Object {
  @js.native
  trait NamedNodeExt extends NamedNode {
    def toCanonical(): String = js.native
    def toJSON(): Anon_TermTypeValueNamedNode = js.native
  }
  
}

