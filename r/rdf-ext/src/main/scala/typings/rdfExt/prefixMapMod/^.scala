package typings.rdfExt.prefixMapMod

import typings.rdfJs.mod.DataFactory
import typings.rdfJs.mod.NamedNode
import typings.rdfJs.mod.Quad
import typings.rdfJs.mod.Stream
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdf-ext/lib/PrefixMap", JSImport.Namespace)
@js.native
class ^ protected () extends PrefixMap {
  def this(factory: DataFactory[Quad, Quad], prefixes: Prefixes) = this()
  /* CompleteClass */
  override var factory: DataFactory[Quad, Quad] = js.native
  /* CompleteClass */
  override var map: Record[String, NamedNode[String]] = js.native
  /* CompleteClass */
  override def addAll(prefixes: PrefixesRecord): this.type = js.native
  /* CompleteClass */
  override def export(stream: Stream[Quad]): this.type = js.native
  /* CompleteClass */
  override def `import`(stream: Stream[Quad]): js.Promise[this.type] = js.native
  /* CompleteClass */
  override def resolve(curie: String): NamedNode[String] = js.native
  /* CompleteClass */
  override def shrink(iri: String): NamedNode[String] = js.native
}

