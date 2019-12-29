package typings.rdfDashExt.libPrefixMapMod

import typings.rdfDashJs.rdfDashJsMod.DataFactory
import typings.rdfDashJs.rdfDashJsMod.NamedNode
import typings.rdfDashJs.rdfDashJsMod.Quad
import typings.rdfDashJs.rdfDashJsMod.Stream
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrefixMap extends js.Object {
  var factory: DataFactory
  var map: Record[String, NamedNode]
  def addAll(prefixes: PrefixesRecord): this.type
  def export(stream: Stream[Quad]): this.type
  def `import`(stream: Stream[Quad]): js.Promise[this.type]
  def resolve(curie: String): NamedNode
  def shrink(iri: String): NamedNode
}

object PrefixMap {
  @scala.inline
  def apply(
    addAll: PrefixesRecord => PrefixMap,
    export: Stream[Quad] => PrefixMap,
    factory: DataFactory,
    `import`: Stream[Quad] => js.Promise[PrefixMap],
    map: Record[String, NamedNode],
    resolve: String => NamedNode,
    shrink: String => NamedNode
  ): PrefixMap = {
    val __obj = js.Dynamic.literal(addAll = js.Any.fromFunction1(addAll), export = js.Any.fromFunction1(export), factory = factory.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], resolve = js.Any.fromFunction1(resolve), shrink = js.Any.fromFunction1(shrink))
    __obj.updateDynamic("import")(js.Any.fromFunction1(`import`))
    __obj.asInstanceOf[PrefixMap]
  }
}

