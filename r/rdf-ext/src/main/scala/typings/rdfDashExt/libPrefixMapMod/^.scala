package typings.rdfDashExt.libPrefixMapMod

import typings.rdfDashJs.rdfDashJsMod.DataFactory
import typings.rdfDashJs.rdfDashJsMod.NamedNode
import typings.rdfDashJs.rdfDashJsMod.Quad
import typings.rdfDashJs.rdfDashJsMod.Stream
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdf-ext/lib/PrefixMap", JSImport.Namespace)
@js.native
class ^ protected () extends PrefixMap {
  def this(factory: DataFactory, prefixes: Prefixes) = this()
  /* CompleteClass */
  override var factory: DataFactory = js.native
  /* CompleteClass */
  override var map: Record[String, NamedNode] = js.native
  /* CompleteClass */
  override def addAll(prefixes: PrefixesRecord): this.type = js.native
  /* CompleteClass */
  override def export(stream: Stream[Quad]): this.type = js.native
  /* CompleteClass */
  override def `import`(stream: Stream[Quad]): js.Promise[this.type] = js.native
  /* CompleteClass */
  override def resolve(curie: String): NamedNode = js.native
  /* CompleteClass */
  override def shrink(iri: String): NamedNode = js.native
}

