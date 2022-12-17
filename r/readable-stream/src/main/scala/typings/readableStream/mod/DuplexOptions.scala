package typings.readableStream.mod

import typings.node.bufferMod.global.BufferEncoding
import typings.readableStream.anon.Chunk
import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// ==== _stream_duplex ====
/* Inlined readable-stream.readable-stream.ReadableOptions & readable-stream.readable-stream.WritableOptions & {  allowHalfOpen :boolean | undefined,   readable :boolean | undefined,   writable :boolean | undefined,   read :(this : readable-stream.readable-stream.Duplex, size : number): void | undefined,   write :(this : readable-stream.readable-stream.Duplex, chunk : any, encoding : node.buffer.<global>.BufferEncoding, callback : (error : std.Error | null | undefined): void): void | undefined,   writev :(this : readable-stream.readable-stream.Duplex, chunks : std.Array<{  chunk :any,   encoding :node.buffer.<global>.BufferEncoding}>, callback : (error : std.Error | null | undefined): void): void | undefined,   final :(this : readable-stream.readable-stream.Duplex, callback : (error : std.Error | null | undefined): void): void | undefined,   destroy :(this : readable-stream.readable-stream.Duplex, error : std.Error | null, callback : (error : std.Error | null): void): void | undefined} */
trait DuplexOptions extends StObject {
  
  var allowHalfOpen: js.UndefOr[Boolean] = js.undefined
  
  var decodeStrings: js.UndefOr[Boolean] = js.undefined
  
  var defaultEncoding: js.UndefOr[BufferEncoding] = js.undefined
  
  var destroy: js.UndefOr[
    js.ThisFunction2[
      /* this */ IReadable, 
      /* error */ js.Error | Null, 
      /* callback */ js.Function1[/* error */ js.Error | Null, Unit], 
      Unit
    ]
  ] = js.undefined
  
  var encoding: js.UndefOr[BufferEncoding] = js.undefined
  
  var `final`: js.UndefOr[
    js.ThisFunction1[
      /* this */ IWritable, 
      /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
      Unit
    ]
  ] = js.undefined
  
  var highWaterMark: js.UndefOr[Double] = js.undefined
  
  var objectMode: js.UndefOr[Boolean] = js.undefined
  
  var read: js.UndefOr[js.ThisFunction1[/* this */ IReadable, /* size */ Double, Unit]] = js.undefined
  
  var readable: js.UndefOr[Boolean] = js.undefined
  
  var readableHighWaterMark: js.UndefOr[Double] = js.undefined
  
  var readableObjectMode: js.UndefOr[Boolean] = js.undefined
  
  var writable: js.UndefOr[Boolean] = js.undefined
  
  var writableHighWaterMark: js.UndefOr[Double] = js.undefined
  
  var writableObjectMode: js.UndefOr[Boolean] = js.undefined
  
  var write: js.UndefOr[
    js.ThisFunction3[
      /* this */ IWritable, 
      /* chunk */ Any, 
      /* encoding */ BufferEncoding | String, 
      /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
      Unit
    ]
  ] = js.undefined
  
  var writev: js.UndefOr[
    js.ThisFunction2[
      /* this */ IWritable, 
      /* chunk */ ArrayLike[Chunk], 
      /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
      Unit
    ]
  ] = js.undefined
}
object DuplexOptions {
  
  inline def apply(): DuplexOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DuplexOptions]
  }
  
  extension [Self <: DuplexOptions](x: Self) {
    
    inline def setAllowHalfOpen(value: Boolean): Self = StObject.set(x, "allowHalfOpen", value.asInstanceOf[js.Any])
    
    inline def setAllowHalfOpenUndefined: Self = StObject.set(x, "allowHalfOpen", js.undefined)
    
    inline def setDecodeStrings(value: Boolean): Self = StObject.set(x, "decodeStrings", value.asInstanceOf[js.Any])
    
    inline def setDecodeStringsUndefined: Self = StObject.set(x, "decodeStrings", js.undefined)
    
    inline def setDefaultEncoding(value: BufferEncoding): Self = StObject.set(x, "defaultEncoding", value.asInstanceOf[js.Any])
    
    inline def setDefaultEncodingUndefined: Self = StObject.set(x, "defaultEncoding", js.undefined)
    
    inline def setDestroy(
      value: js.ThisFunction2[
          /* this */ IReadable, 
          /* error */ js.Error | Null, 
          /* callback */ js.Function1[/* error */ js.Error | Null, Unit], 
          Unit
        ]
    ): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
    
    inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
    
    inline def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setFinal(
      value: js.ThisFunction1[
          /* this */ IWritable, 
          /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
          Unit
        ]
    ): Self = StObject.set(x, "final", value.asInstanceOf[js.Any])
    
    inline def setFinalUndefined: Self = StObject.set(x, "final", js.undefined)
    
    inline def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
    
    inline def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
    
    inline def setObjectMode(value: Boolean): Self = StObject.set(x, "objectMode", value.asInstanceOf[js.Any])
    
    inline def setObjectModeUndefined: Self = StObject.set(x, "objectMode", js.undefined)
    
    inline def setRead(value: js.ThisFunction1[/* this */ IReadable, /* size */ Double, Unit]): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
    
    inline def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
    
    inline def setReadable(value: Boolean): Self = StObject.set(x, "readable", value.asInstanceOf[js.Any])
    
    inline def setReadableHighWaterMark(value: Double): Self = StObject.set(x, "readableHighWaterMark", value.asInstanceOf[js.Any])
    
    inline def setReadableHighWaterMarkUndefined: Self = StObject.set(x, "readableHighWaterMark", js.undefined)
    
    inline def setReadableObjectMode(value: Boolean): Self = StObject.set(x, "readableObjectMode", value.asInstanceOf[js.Any])
    
    inline def setReadableObjectModeUndefined: Self = StObject.set(x, "readableObjectMode", js.undefined)
    
    inline def setReadableUndefined: Self = StObject.set(x, "readable", js.undefined)
    
    inline def setWritable(value: Boolean): Self = StObject.set(x, "writable", value.asInstanceOf[js.Any])
    
    inline def setWritableHighWaterMark(value: Double): Self = StObject.set(x, "writableHighWaterMark", value.asInstanceOf[js.Any])
    
    inline def setWritableHighWaterMarkUndefined: Self = StObject.set(x, "writableHighWaterMark", js.undefined)
    
    inline def setWritableObjectMode(value: Boolean): Self = StObject.set(x, "writableObjectMode", value.asInstanceOf[js.Any])
    
    inline def setWritableObjectModeUndefined: Self = StObject.set(x, "writableObjectMode", js.undefined)
    
    inline def setWritableUndefined: Self = StObject.set(x, "writable", js.undefined)
    
    inline def setWrite(
      value: js.ThisFunction3[
          /* this */ IWritable, 
          /* chunk */ Any, 
          /* encoding */ BufferEncoding | String, 
          /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
          Unit
        ]
    ): Self = StObject.set(x, "write", value.asInstanceOf[js.Any])
    
    inline def setWriteUndefined: Self = StObject.set(x, "write", js.undefined)
    
    inline def setWritev(
      value: js.ThisFunction2[
          /* this */ IWritable, 
          /* chunk */ ArrayLike[Chunk], 
          /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
          Unit
        ]
    ): Self = StObject.set(x, "writev", value.asInstanceOf[js.Any])
    
    inline def setWritevUndefined: Self = StObject.set(x, "writev", js.undefined)
  }
}
