package typings.rdfjsParserN3

import typings.node.eventsMod.EventEmitter
import typings.rdfJs.mod.BaseQuad
import typings.rdfJs.mod.DataFactory
import typings.rdfJs.mod.Quad
import typings.rdfJs.mod.Sink
import typings.rdfJs.mod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@rdfjs/parser-n3", JSImport.Namespace)
  @js.native
  class ^[Q /* <: BaseQuad */] () extends Parser[Q] {
    def this(options: ParserOptions) = this()
  }
  
  @js.native
  trait Parser[Q /* <: BaseQuad */] extends Sink[EventEmitter, Stream[Q]] {
    
    def `import`(stream: EventEmitter, options: ParserOptions): Stream[Q] = js.native
  }
  
  @js.native
  trait ParserOptions extends StObject {
    
    var baseIRI: js.UndefOr[String] = js.native
    
    var factory: js.UndefOr[DataFactory[Quad, Quad]] = js.native
  }
  object ParserOptions {
    
    @scala.inline
    def apply(): ParserOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParserOptions]
    }
    
    @scala.inline
    implicit class ParserOptionsMutableBuilder[Self <: ParserOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaseIRI(value: String): Self = StObject.set(x, "baseIRI", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseIRIUndefined: Self = StObject.set(x, "baseIRI", js.undefined)
      
      @scala.inline
      def setFactory(value: DataFactory[Quad, Quad]): Self = StObject.set(x, "factory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFactoryUndefined: Self = StObject.set(x, "factory", js.undefined)
    }
  }
}
