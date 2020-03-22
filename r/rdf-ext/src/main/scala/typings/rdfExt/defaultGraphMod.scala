package typings.rdfExt

import typings.rdfJs.mod.DefaultGraph
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdf-ext/lib/DefaultGraph", JSImport.Namespace)
@js.native
object defaultGraphMod extends js.Object {
  @js.native
  trait DefaultGraphExt extends DefaultGraph {
    def toCanonical(): String = js.native
    def toJSON(): AnonValue = js.native
  }
  
}

