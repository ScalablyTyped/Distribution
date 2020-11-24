package typings.rdfExt.prefixMapMod

import typings.rdfJs.mod.DataFactory
import typings.rdfJs.mod.NamedNode
import typings.rdfJs.mod.Quad
import typings.rdfJs.mod.Stream
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrefixMap extends js.Object {
  
  def addAll(prefixes: PrefixesRecord): this.type = js.native
  
  def export(stream: Stream[Quad]): this.type = js.native
  
  var factory: DataFactory[Quad, Quad] = js.native
  
  def `import`(stream: Stream[Quad]): js.Promise[this.type] = js.native
  
  var map: Record[String, NamedNode[String]] = js.native
  
  def resolve(curie: String): NamedNode[String] = js.native
  
  def shrink(iri: String): NamedNode[String] = js.native
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
  
  @scala.inline
  implicit class PrefixMapOps[Self <: PrefixMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddAll(value: PrefixesRecord => PrefixMap): Self = this.set("addAll", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExport(value: Stream[Quad] => PrefixMap): Self = this.set("export", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFactory(value: DataFactory[Quad, Quad]): Self = this.set("factory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImport(value: Stream[Quad] => js.Promise[PrefixMap]): Self = this.set("import", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMap(value: Record[String, NamedNode[String]]): Self = this.set("map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolve(value: String => NamedNode[String]): Self = this.set("resolve", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShrink(value: String => NamedNode[String]): Self = this.set("shrink", js.Any.fromFunction1(value))
  }
}
