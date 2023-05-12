package typings.rdfjsPrefixMap

import typings.rdfjsPrefixMap.anon.Factory
import typings.rdfjsTypes.dataModelMod.NamedNode
import typings.rdfjsTypes.dataModelMod.Quad
import typings.rdfjsTypes.streamMod.Stream
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object prefixMapMod {
  
  @JSImport("@rdfjs/prefix-map/PrefixMap", JSImport.Default)
  @js.native
  open class default () extends PrefixMap {
    def this(prefixes: PrefixMapInit) = this()
    def this(prefixes: Unit, options: Factory) = this()
    def this(prefixes: PrefixMapInit, options: Factory) = this()
  }
  
  @JSImport("@rdfjs/prefix-map/PrefixMap", "PrefixMap")
  @js.native
  open class PrefixMap ()
    extends StObject
       with Map[String, NamedNode[String]] {
    def this(prefixes: PrefixMapInit) = this()
    def this(prefixes: Unit, options: Factory) = this()
    def this(prefixes: PrefixMapInit, options: Factory) = this()
    
    def `export`(stream: Stream[Quad]): this.type = js.native
    
    def `import`(stream: Stream[Quad]): js.Promise[this.type] = js.native
    
    def resolve(prefixedName: NamedNode[String]): NamedNode[String] = js.native
    
    def shrink(term: NamedNode[String]): NamedNode[String] = js.native
  }
  
  type PrefixMapInit = js.Array[js.Tuple2[String, NamedNode[String]]]
}
