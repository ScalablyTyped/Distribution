package typings.rdfDashExt

import typings.rdfDashJs.rdfDashJsMod.DefaultGraph
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdf-ext/lib/DefaultGraph", JSImport.Namespace)
@js.native
object libDefaultGraphMod extends js.Object {
  @js.native
  trait DefaultGraphExt extends DefaultGraph {
    def toCanonical(): String = js.native
    def toJSON(): Anon_TermTypeValue = js.native
  }
  
}

