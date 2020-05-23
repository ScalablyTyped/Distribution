package typings.rdflib

import typings.rdflib.tfTypesMod.NamedNode
import typings.rdflib.tfTypesMod.RdfJsDataFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdflib/lib/namespace", JSImport.Namespace)
@js.native
object namespaceMod extends js.Object {
  def default(nsuri: String): js.Function1[/* ln */ String, NamedNode] = js.native
  def default(nsuri: String, factory: RdfJsDataFactory): js.Function1[/* ln */ String, NamedNode] = js.native
}

