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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@rdfjs/serializer-jsonld-ext", JSImport.Namespace)
  @js.native
  class ^[Q /* <: BaseQuad */] ()
    extends StObject
       with Serializer[Q] {
    def this(options: SerializerOptions) = this()
    
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
    override def `import`(stream: Stream[Q]): EventEmitter = js.native
  }
  
  @js.native
  trait Serializer[Q /* <: BaseQuad */]
    extends StObject
       with Sink[Stream[Q], EventEmitter] {
    
    def `import`(stream: Stream[Q], options: SerializerOptions): EventEmitter = js.native
  }
  
  trait SerializerOptions extends StObject {
    
    var compact: js.UndefOr[Boolean] = js.undefined
    
    var context: js.UndefOr[Context] = js.undefined
    
    var encoding: js.UndefOr[string | `object`] = js.undefined
    
    var flatten: js.UndefOr[Boolean] = js.undefined
    
    var frame: js.UndefOr[Boolean] = js.undefined
    
    var skipContext: js.UndefOr[Boolean] = js.undefined
    
    var skipGraphProperty: js.UndefOr[Boolean] = js.undefined
  }
  object SerializerOptions {
    
    inline def apply(): SerializerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SerializerOptions]
    }
    
    extension [Self <: SerializerOptions](x: Self) {
      
      inline def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      inline def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      inline def setContext(value: Context): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setContextVarargs(value: JsonLdObj*): Self = StObject.set(x, "context", js.Array(value :_*))
      
      inline def setEncoding(value: string | `object`): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setFlatten(value: Boolean): Self = StObject.set(x, "flatten", value.asInstanceOf[js.Any])
      
      inline def setFlattenUndefined: Self = StObject.set(x, "flatten", js.undefined)
      
      inline def setFrame(value: Boolean): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
      
      inline def setFrameUndefined: Self = StObject.set(x, "frame", js.undefined)
      
      inline def setSkipContext(value: Boolean): Self = StObject.set(x, "skipContext", value.asInstanceOf[js.Any])
      
      inline def setSkipContextUndefined: Self = StObject.set(x, "skipContext", js.undefined)
      
      inline def setSkipGraphProperty(value: Boolean): Self = StObject.set(x, "skipGraphProperty", value.asInstanceOf[js.Any])
      
      inline def setSkipGraphPropertyUndefined: Self = StObject.set(x, "skipGraphProperty", js.undefined)
    }
  }
}
