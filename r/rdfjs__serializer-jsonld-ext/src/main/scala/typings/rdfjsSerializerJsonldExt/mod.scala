package typings.rdfjsSerializerJsonldExt

import typings.jsonld.jsonldSpecMod.Context
import typings.jsonld.jsonldSpecMod.JsonLdObj
import typings.node.eventsMod.EventEmitter
import typings.rdfJs.mod.BaseQuad
import typings.rdfJs.mod.Sink
import typings.rdfJs.mod.Stream
import typings.rdfjsSerializerJsonldExt.rdfjsSerializerJsonldExtStrings.`object`
import typings.rdfjsSerializerJsonldExt.rdfjsSerializerJsonldExtStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@rdfjs/serializer-jsonld-ext", JSImport.Namespace)
  @js.native
  class ^[Q /* <: BaseQuad */] () extends Serializer[Q] {
    def this(options: SerializerOptions) = this()
  }
  
  @js.native
  trait Serializer[Q /* <: BaseQuad */] extends Sink[Stream[Q], EventEmitter] {
    
    def `import`(stream: Stream[Q], options: SerializerOptions): EventEmitter = js.native
  }
  
  @js.native
  trait SerializerOptions extends StObject {
    
    var compact: js.UndefOr[Boolean] = js.native
    
    var context: js.UndefOr[Context] = js.native
    
    var encoding: js.UndefOr[string | `object`] = js.native
    
    var flatten: js.UndefOr[Boolean] = js.native
    
    var frame: js.UndefOr[Boolean] = js.native
    
    var skipContext: js.UndefOr[Boolean] = js.native
    
    var skipGraphProperty: js.UndefOr[Boolean] = js.native
  }
  object SerializerOptions {
    
    @scala.inline
    def apply(): SerializerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SerializerOptions]
    }
    
    @scala.inline
    implicit class SerializerOptionsMutableBuilder[Self <: SerializerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      @scala.inline
      def setContext(value: Context): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setContextVarargs(value: JsonLdObj*): Self = StObject.set(x, "context", js.Array(value :_*))
      
      @scala.inline
      def setEncoding(value: string | `object`): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setFlatten(value: Boolean): Self = StObject.set(x, "flatten", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlattenUndefined: Self = StObject.set(x, "flatten", js.undefined)
      
      @scala.inline
      def setFrame(value: Boolean): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrameUndefined: Self = StObject.set(x, "frame", js.undefined)
      
      @scala.inline
      def setSkipContext(value: Boolean): Self = StObject.set(x, "skipContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipContextUndefined: Self = StObject.set(x, "skipContext", js.undefined)
      
      @scala.inline
      def setSkipGraphProperty(value: Boolean): Self = StObject.set(x, "skipGraphProperty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipGraphPropertyUndefined: Self = StObject.set(x, "skipGraphProperty", js.undefined)
    }
  }
}
