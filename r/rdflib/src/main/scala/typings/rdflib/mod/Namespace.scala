package typings.rdflib.mod

import typings.rdflib.tfTypesMod.RdfJsDataFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdflib", "Namespace")
@js.native
object Namespace extends js.Object {
  def apply(nsuri: String): js.Function1[/* ln */ String, typings.rdflib.tfTypesMod.NamedNode] = js.native
  def apply(nsuri: String, factory: RdfJsDataFactory): js.Function1[/* ln */ String, typings.rdflib.tfTypesMod.NamedNode] = js.native
}

