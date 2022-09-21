package typings.rdfExt

import typings.rdfjsTypes.dataModelMod.DataFactory
import typings.rdfjsTypes.dataModelMod.NamedNode
import typings.rdfjsTypes.dataModelMod.Quad
import typings.rdfjsTypes.streamMod.Stream
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object prefixMapMod {
  
  @JSImport("rdf-ext/lib/PrefixMap", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with PrefixMap {
    def this(factory: DataFactory[Quad, Quad], prefixes: Prefixes) = this()
    
    /* CompleteClass */
    override def addAll(prefixes: PrefixesRecord): this.type = js.native
    
    /* CompleteClass */
    override def `export`(stream: Stream[Quad]): this.type = js.native
    
    /* CompleteClass */
    var factory: DataFactory[Quad, Quad] = js.native
    
    /* CompleteClass */
    override def `import`(stream: Stream[Quad]): js.Promise[this.type] = js.native
    
    /* CompleteClass */
    var map: Record[String, NamedNode[String]] = js.native
    
    /* CompleteClass */
    override def resolve(curie: String): NamedNode[String] = js.native
    
    /* CompleteClass */
    override def shrink(iri: String): NamedNode[String] = js.native
  }
  
  trait PrefixMap extends StObject {
    
    def addAll(prefixes: PrefixesRecord): this.type
    
    def `export`(stream: Stream[Quad]): this.type
    
    var factory: DataFactory[Quad, Quad]
    
    def `import`(stream: Stream[Quad]): js.Promise[this.type]
    
    var map: Record[String, NamedNode[String]]
    
    def resolve(curie: String): NamedNode[String]
    
    def shrink(iri: String): NamedNode[String]
  }
  object PrefixMap {
    
    inline def apply(
      addAll: PrefixesRecord => PrefixMap,
      `export`: Stream[Quad] => PrefixMap,
      factory: DataFactory[Quad, Quad],
      `import`: Stream[Quad] => js.Promise[PrefixMap],
      map: Record[String, NamedNode[String]],
      resolve: String => NamedNode[String],
      shrink: String => NamedNode[String]
    ): PrefixMap = {
      val __obj = js.Dynamic.literal(addAll = js.Any.fromFunction1(addAll), factory = factory.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], resolve = js.Any.fromFunction1(resolve), shrink = js.Any.fromFunction1(shrink))
      __obj.updateDynamic("export")(js.Any.fromFunction1(`export`))
      __obj.updateDynamic("import")(js.Any.fromFunction1(`import`))
      __obj.asInstanceOf[PrefixMap]
    }
    
    extension [Self <: PrefixMap](x: Self) {
      
      inline def setAddAll(value: PrefixesRecord => PrefixMap): Self = StObject.set(x, "addAll", js.Any.fromFunction1(value))
      
      inline def setExport(value: Stream[Quad] => PrefixMap): Self = StObject.set(x, "export", js.Any.fromFunction1(value))
      
      inline def setFactory(value: DataFactory[Quad, Quad]): Self = StObject.set(x, "factory", value.asInstanceOf[js.Any])
      
      inline def setImport(value: Stream[Quad] => js.Promise[PrefixMap]): Self = StObject.set(x, "import", js.Any.fromFunction1(value))
      
      inline def setMap(value: Record[String, NamedNode[String]]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setResolve(value: String => NamedNode[String]): Self = StObject.set(x, "resolve", js.Any.fromFunction1(value))
      
      inline def setShrink(value: String => NamedNode[String]): Self = StObject.set(x, "shrink", js.Any.fromFunction1(value))
    }
  }
  
  type Prefixes = PrefixMap | PrefixesRecord
  
  type PrefixesRecord = Record[String, NamedNode[String] | String]
}
