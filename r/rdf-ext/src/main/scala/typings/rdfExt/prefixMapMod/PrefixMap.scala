package typings.rdfExt.prefixMapMod

import typings.rdfJs.mod.DataFactory
import typings.rdfJs.mod.NamedNode
import typings.rdfJs.mod.Quad
import typings.rdfJs.mod.Stream
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrefixMap extends js.Object {
  var factory: DataFactory[Quad, Quad]
  var map: Record[String, NamedNode[String]]
  def addAll(prefixes: PrefixesRecord): this.type
  def export(stream: Stream[Quad]): this.type
  def `import`(stream: Stream[Quad]): js.Promise[this.type]
  def resolve(curie: String): NamedNode[String]
  def shrink(iri: String): NamedNode[String]
}

object PrefixMap {
  @scala.inline
  def apply(
    addAll: PrefixesRecord => PrefixMap,
    export: Stream[Quad] => PrefixMap,
    factory: DataFactory[Quad, Quad],
    `import`: Stream[Quad] => js.Promise[PrefixMap],
    map: Record[String, NamedNode[String]],
    resolve: String => NamedNode[String],
    shrink: String => NamedNode[String]
  ): PrefixMap = {
    val __obj = js.Dynamic.literal(addAll = js.Any.fromFunction1(addAll), export = js.Any.fromFunction1(export), factory = factory.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], resolve = js.Any.fromFunction1(resolve), shrink = js.Any.fromFunction1(shrink))
    __obj.updateDynamic("import")(js.Any.fromFunction1(`import`))
    __obj.asInstanceOf[PrefixMap]
  }
}

