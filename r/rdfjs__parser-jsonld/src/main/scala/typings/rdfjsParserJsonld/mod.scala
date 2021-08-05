package typings.rdfjsParserJsonld

import typings.jsonld.jsonldSpecMod.Context
import typings.jsonld.jsonldSpecMod.JsonLdObj
import typings.node.eventsMod.EventEmitter
import typings.rdfJs.mod.BaseQuad
import typings.rdfJs.mod.DataFactory
import typings.rdfJs.mod.Quad
import typings.rdfJs.mod.Sink
import typings.rdfJs.mod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@rdfjs/parser-jsonld", JSImport.Namespace)
  @js.native
  class ^[Q /* <: BaseQuad */] ()
    extends StObject
       with Parser[Q] {
    def this(options: ParserOptions) = this()
    
    /**
      * Consumes the given stream.
      *
      * The `end` and `error` events are used like described in the Stream interface.
      * Depending on the use case, subtypes of EventEmitter or Stream are used.
      * @see Stream
      *
      * @param stream The stream that will be consumed.
      * @return The resulting event emitter.
      */
    /* CompleteClass */
    override def `import`(stream: EventEmitter): Stream[Q] = js.native
  }
  
  @js.native
  trait Parser[Q /* <: BaseQuad */]
    extends StObject
       with Sink[EventEmitter, Stream[Q]] {
    
    def `import`(stream: EventEmitter, options: ParserOptions): Stream[Q] = js.native
  }
  
  trait ParserOptions extends StObject {
    
    var baseIRI: js.UndefOr[String] = js.undefined
    
    var context: js.UndefOr[Context] = js.undefined
    
    var factory: js.UndefOr[DataFactory[Quad, Quad]] = js.undefined
  }
  object ParserOptions {
    
    inline def apply(): ParserOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParserOptions]
    }
    
    extension [Self <: ParserOptions](x: Self) {
      
      inline def setBaseIRI(value: String): Self = StObject.set(x, "baseIRI", value.asInstanceOf[js.Any])
      
      inline def setBaseIRIUndefined: Self = StObject.set(x, "baseIRI", js.undefined)
      
      inline def setContext(value: Context): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setContextVarargs(value: JsonLdObj*): Self = StObject.set(x, "context", js.Array(value :_*))
      
      inline def setFactory(value: DataFactory[Quad, Quad]): Self = StObject.set(x, "factory", value.asInstanceOf[js.Any])
      
      inline def setFactoryUndefined: Self = StObject.set(x, "factory", js.undefined)
    }
  }
}
