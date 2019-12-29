package typings.rdfDashExt

import typings.rdfDashJs.rdfDashJsMod.BlankNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdf-ext/lib/BlankNode", JSImport.Namespace)
@js.native
object libBlankNodeMod extends js.Object {
  @js.native
  trait BlankNodeExt extends BlankNode {
    def toCanonical(): String = js.native
    def toJSON(): Anon_TermType = js.native
  }
  
}

