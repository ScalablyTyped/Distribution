package typings.streamingJsonStringify

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typings.node.anon.Chunk
import typings.node.bufferMod.global.BufferEncoding
import typings.node.streamMod.Transform
import typings.node.streamMod.TransformCallback
import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("streaming-json-stringify", JSImport.Namespace)
  @js.native
  val ^ : js.Object & StringifyFactory = js.native
  
  @js.native
  trait Instance extends StObject {
    
    var closer: String = js.native
    
    var opener: String = js.native
    
    def replacer(key: String, value: Any): Any = js.native
    @JSName("replacer")
    var replacer_Original: Replacer = js.native
    
    var seperator: String = js.native
    
    var space: String | Double = js.native
    
    def stringifier(value: Any, replacer: Replacer, space: String): String = js.native
    def stringifier(value: Any, replacer: Replacer, space: Double): String = js.native
  }
  
  /* Inlined std.Partial<streaming-json-stringify.streaming-json-stringify.Instance> & node.stream.TransformOptions */
  trait Options extends StObject {
    
    var allowHalfOpen: js.UndefOr[Boolean] = js.undefined
    
    var autoDestroy: js.UndefOr[Boolean] = js.undefined
    
    var closer: js.UndefOr[String] = js.undefined
    
    var construct: js.UndefOr[
        js.ThisFunction1[
          /* this */ Transform, 
          /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var decodeStrings: js.UndefOr[Boolean] = js.undefined
    
    var defaultEncoding: js.UndefOr[BufferEncoding] = js.undefined
    
    var destroy: js.UndefOr[
        js.ThisFunction2[
          /* this */ Transform, 
          /* error */ js.Error | Null, 
          /* callback */ js.Function1[/* error */ js.Error | Null, Unit], 
          Unit
        ]
      ] = js.undefined
    
    var emitClose: js.UndefOr[Boolean] = js.undefined
    
    var encoding: js.UndefOr[BufferEncoding] = js.undefined
    
    var `final`: js.UndefOr[
        js.ThisFunction1[
          /* this */ Transform, 
          /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var flush: js.UndefOr[js.ThisFunction1[/* this */ Transform, /* callback */ TransformCallback, Unit]] = js.undefined
    
    var highWaterMark: js.UndefOr[Double] = js.undefined
    
    var objectMode: js.UndefOr[Boolean] = js.undefined
    
    var opener: js.UndefOr[String] = js.undefined
    
    var read: js.UndefOr[js.ThisFunction1[/* this */ Transform, /* size */ Double, Unit]] = js.undefined
    
    var readableHighWaterMark: js.UndefOr[Double] = js.undefined
    
    var readableObjectMode: js.UndefOr[Boolean] = js.undefined
    
    var replacer: js.UndefOr[Replacer] = js.undefined
    
    var seperator: js.UndefOr[String] = js.undefined
    
    /**
      * When provided the corresponding `AbortController` can be used to cancel an asynchronous action.
      */
    var signal: js.UndefOr[AbortSignal] = js.undefined
    
    var space: js.UndefOr[String | Double] = js.undefined
    
    var stringifier: js.UndefOr[
        js.Function3[/* value */ Any, /* replacer */ Replacer, /* space */ String | Double, String]
      ] = js.undefined
    
    var transform: js.UndefOr[
        js.ThisFunction3[
          /* this */ Transform, 
          /* chunk */ Any, 
          /* encoding */ BufferEncoding, 
          /* callback */ TransformCallback, 
          Unit
        ]
      ] = js.undefined
    
    var writableCorked: js.UndefOr[Double] = js.undefined
    
    var writableHighWaterMark: js.UndefOr[Double] = js.undefined
    
    var writableObjectMode: js.UndefOr[Boolean] = js.undefined
    
    var write: js.UndefOr[
        js.ThisFunction3[
          /* this */ Transform, 
          /* chunk */ Any, 
          /* encoding */ BufferEncoding, 
          /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var writev: js.UndefOr[
        js.ThisFunction2[
          /* this */ Transform, 
          /* chunks */ js.Array[Chunk], 
          /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
          Unit
        ]
      ] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAllowHalfOpen(value: Boolean): Self = StObject.set(x, "allowHalfOpen", value.asInstanceOf[js.Any])
      
      inline def setAllowHalfOpenUndefined: Self = StObject.set(x, "allowHalfOpen", js.undefined)
      
      inline def setAutoDestroy(value: Boolean): Self = StObject.set(x, "autoDestroy", value.asInstanceOf[js.Any])
      
      inline def setAutoDestroyUndefined: Self = StObject.set(x, "autoDestroy", js.undefined)
      
      inline def setCloser(value: String): Self = StObject.set(x, "closer", value.asInstanceOf[js.Any])
      
      inline def setCloserUndefined: Self = StObject.set(x, "closer", js.undefined)
      
      inline def setConstruct(
        value: js.ThisFunction1[
              /* this */ Transform, 
              /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
              Unit
            ]
      ): Self = StObject.set(x, "construct", value.asInstanceOf[js.Any])
      
      inline def setConstructUndefined: Self = StObject.set(x, "construct", js.undefined)
      
      inline def setDecodeStrings(value: Boolean): Self = StObject.set(x, "decodeStrings", value.asInstanceOf[js.Any])
      
      inline def setDecodeStringsUndefined: Self = StObject.set(x, "decodeStrings", js.undefined)
      
      inline def setDefaultEncoding(value: BufferEncoding): Self = StObject.set(x, "defaultEncoding", value.asInstanceOf[js.Any])
      
      inline def setDefaultEncodingUndefined: Self = StObject.set(x, "defaultEncoding", js.undefined)
      
      inline def setDestroy(
        value: js.ThisFunction2[
              /* this */ Transform, 
              /* error */ js.Error | Null, 
              /* callback */ js.Function1[/* error */ js.Error | Null, Unit], 
              Unit
            ]
      ): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
      
      inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      inline def setEmitClose(value: Boolean): Self = StObject.set(x, "emitClose", value.asInstanceOf[js.Any])
      
      inline def setEmitCloseUndefined: Self = StObject.set(x, "emitClose", js.undefined)
      
      inline def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setFinal(
        value: js.ThisFunction1[
              /* this */ Transform, 
              /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
              Unit
            ]
      ): Self = StObject.set(x, "final", value.asInstanceOf[js.Any])
      
      inline def setFinalUndefined: Self = StObject.set(x, "final", js.undefined)
      
      inline def setFlush(value: js.ThisFunction1[/* this */ Transform, /* callback */ TransformCallback, Unit]): Self = StObject.set(x, "flush", value.asInstanceOf[js.Any])
      
      inline def setFlushUndefined: Self = StObject.set(x, "flush", js.undefined)
      
      inline def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
      
      inline def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
      
      inline def setObjectMode(value: Boolean): Self = StObject.set(x, "objectMode", value.asInstanceOf[js.Any])
      
      inline def setObjectModeUndefined: Self = StObject.set(x, "objectMode", js.undefined)
      
      inline def setOpener(value: String): Self = StObject.set(x, "opener", value.asInstanceOf[js.Any])
      
      inline def setOpenerUndefined: Self = StObject.set(x, "opener", js.undefined)
      
      inline def setRead(value: js.ThisFunction1[/* this */ Transform, /* size */ Double, Unit]): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
      
      inline def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
      
      inline def setReadableHighWaterMark(value: Double): Self = StObject.set(x, "readableHighWaterMark", value.asInstanceOf[js.Any])
      
      inline def setReadableHighWaterMarkUndefined: Self = StObject.set(x, "readableHighWaterMark", js.undefined)
      
      inline def setReadableObjectMode(value: Boolean): Self = StObject.set(x, "readableObjectMode", value.asInstanceOf[js.Any])
      
      inline def setReadableObjectModeUndefined: Self = StObject.set(x, "readableObjectMode", js.undefined)
      
      inline def setReplacer(value: (/* key */ String, /* value */ Any) => Any): Self = StObject.set(x, "replacer", js.Any.fromFunction2(value))
      
      inline def setReplacerUndefined: Self = StObject.set(x, "replacer", js.undefined)
      
      inline def setSeperator(value: String): Self = StObject.set(x, "seperator", value.asInstanceOf[js.Any])
      
      inline def setSeperatorUndefined: Self = StObject.set(x, "seperator", js.undefined)
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
      
      inline def setSpace(value: String | Double): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
      
      inline def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
      
      inline def setStringifier(value: (/* value */ Any, /* replacer */ Replacer, /* space */ String | Double) => String): Self = StObject.set(x, "stringifier", js.Any.fromFunction3(value))
      
      inline def setStringifierUndefined: Self = StObject.set(x, "stringifier", js.undefined)
      
      inline def setTransform(
        value: js.ThisFunction3[
              /* this */ Transform, 
              /* chunk */ Any, 
              /* encoding */ BufferEncoding, 
              /* callback */ TransformCallback, 
              Unit
            ]
      ): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      inline def setWritableCorked(value: Double): Self = StObject.set(x, "writableCorked", value.asInstanceOf[js.Any])
      
      inline def setWritableCorkedUndefined: Self = StObject.set(x, "writableCorked", js.undefined)
      
      inline def setWritableHighWaterMark(value: Double): Self = StObject.set(x, "writableHighWaterMark", value.asInstanceOf[js.Any])
      
      inline def setWritableHighWaterMarkUndefined: Self = StObject.set(x, "writableHighWaterMark", js.undefined)
      
      inline def setWritableObjectMode(value: Boolean): Self = StObject.set(x, "writableObjectMode", value.asInstanceOf[js.Any])
      
      inline def setWritableObjectModeUndefined: Self = StObject.set(x, "writableObjectMode", js.undefined)
      
      inline def setWrite(
        value: js.ThisFunction3[
              /* this */ Transform, 
              /* chunk */ Any, 
              /* encoding */ BufferEncoding, 
              /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
              Unit
            ]
      ): Self = StObject.set(x, "write", value.asInstanceOf[js.Any])
      
      inline def setWriteUndefined: Self = StObject.set(x, "write", js.undefined)
      
      inline def setWritev(
        value: js.ThisFunction2[
              /* this */ Transform, 
              /* chunks */ js.Array[Chunk], 
              /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
              Unit
            ]
      ): Self = StObject.set(x, "writev", value.asInstanceOf[js.Any])
      
      inline def setWritevUndefined: Self = StObject.set(x, "writev", js.undefined)
    }
  }
  
  type Replacer = js.Function2[/* key */ String, /* value */ Any, Any]
  
  @js.native
  trait StringifyFactory
    extends StObject
       with Instantiable0[Instance & Transform]
       with Instantiable1[/* options */ Options, Instance & Transform] {
    
    def apply(): Instance & Transform = js.native
    def apply(options: Options): Instance & Transform = js.native
  }
  
  type _To = js.Object & StringifyFactory
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & StringifyFactory = ^
}
