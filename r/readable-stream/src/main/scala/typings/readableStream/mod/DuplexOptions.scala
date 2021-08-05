package typings.readableStream.mod

import typings.node.BufferEncoding
import typings.readableStream.anon.Chunk
import typings.readableStream.anon.Encoding
import typings.std.ArrayLike
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// ==== _stream_duplex ====
/* Inlined readable-stream.readable-stream.ReadableOptions & readable-stream.readable-stream.WritableOptions & {  allowHalfOpen :boolean | undefined,   readable :boolean | undefined,   writable :boolean | undefined,   read :(this : readable-stream.readable-stream.Duplex, size : number): void | undefined,   write :(this : readable-stream.readable-stream.Duplex, chunk : any, encoding : node.BufferEncoding, callback : (error : std.Error | null | undefined): void): void | undefined,   writev :(this : readable-stream.readable-stream.Duplex, chunks : std.Array<{  chunk :any,   encoding :node.BufferEncoding}>, callback : (error : std.Error | null | undefined): void): void | undefined,   final :(this : readable-stream.readable-stream.Duplex, callback : (error : std.Error | null | undefined): void): void | undefined,   destroy :(this : readable-stream.readable-stream.Duplex, error : std.Error | null, callback : (error : std.Error | null): void): void | undefined} */
trait DuplexOptions extends StObject {
  
  var allowHalfOpen: js.UndefOr[Boolean] = js.undefined
  
  var decodeStrings: js.UndefOr[Boolean] = js.undefined
  
  var defaultEncoding: js.UndefOr[BufferEncoding] = js.undefined
  
  var destroy: (js.UndefOr[
    js.ThisFunction2[
      /* this */ _Readable, 
      /* error */ Error | Null, 
      /* callback */ js.Function1[/* error */ Error | Null, Unit], 
      Unit
    ]
  ]) & (js.UndefOr[
    js.ThisFunction2[
      /* this */ Writable, 
      /* error */ Error | Null, 
      /* callback */ js.Function1[/* error */ Error | Null, Unit], 
      Unit
    ]
  ]) & (js.UndefOr[
    js.ThisFunction2[
      /* this */ Duplex, 
      /* error */ Error | Null, 
      /* callback */ js.Function1[/* error */ Error | Null, Unit], 
      Unit
    ]
  ])
  
  var encoding: js.UndefOr[BufferEncoding] = js.undefined
  
  var `final`: (js.UndefOr[
    js.ThisFunction1[
      /* this */ Writable, 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ]
  ]) & (js.UndefOr[
    js.ThisFunction1[
      /* this */ Duplex, 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ]
  ])
  
  var highWaterMark: js.UndefOr[Double] = js.undefined
  
  var objectMode: js.UndefOr[Boolean] = js.undefined
  
  var read: (js.UndefOr[js.ThisFunction1[/* this */ _Readable, /* size */ Double, Unit]]) & (js.UndefOr[js.ThisFunction1[/* this */ Duplex, /* size */ Double, Unit]])
  
  var readable: js.UndefOr[Boolean] = js.undefined
  
  var readableHighWaterMark: js.UndefOr[Double] = js.undefined
  
  var readableObjectMode: js.UndefOr[Boolean] = js.undefined
  
  var writable: js.UndefOr[Boolean] = js.undefined
  
  var writableHighWaterMark: js.UndefOr[Double] = js.undefined
  
  var writableObjectMode: js.UndefOr[Boolean] = js.undefined
  
  var write: (js.UndefOr[
    js.ThisFunction3[
      /* this */ Writable, 
      /* chunk */ js.Any, 
      /* encoding */ BufferEncoding | String, 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ]
  ]) & (js.UndefOr[
    js.ThisFunction3[
      /* this */ Duplex, 
      /* chunk */ js.Any, 
      /* encoding */ BufferEncoding, 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ]
  ])
  
  var writev: (js.UndefOr[
    js.ThisFunction2[
      /* this */ Writable, 
      /* chunk */ ArrayLike[Chunk], 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ]
  ]) & (js.UndefOr[
    js.ThisFunction2[
      /* this */ Duplex, 
      /* chunks */ js.Array[Encoding], 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ]
  ])
}
object DuplexOptions {
  
  inline def apply(
    destroy: (js.UndefOr[
      js.ThisFunction2[
        /* this */ _Readable, 
        /* error */ Error | Null, 
        /* callback */ js.Function1[/* error */ Error | Null, Unit], 
        Unit
      ]
    ]) & (js.UndefOr[
      js.ThisFunction2[
        /* this */ Writable, 
        /* error */ Error | Null, 
        /* callback */ js.Function1[/* error */ Error | Null, Unit], 
        Unit
      ]
    ]) & (js.UndefOr[
      js.ThisFunction2[
        /* this */ Duplex, 
        /* error */ Error | Null, 
        /* callback */ js.Function1[/* error */ Error | Null, Unit], 
        Unit
      ]
    ]),
    `final`: (js.UndefOr[
      js.ThisFunction1[
        /* this */ Writable, 
        /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
        Unit
      ]
    ]) & (js.UndefOr[
      js.ThisFunction1[
        /* this */ Duplex, 
        /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
        Unit
      ]
    ]),
    read: (js.UndefOr[js.ThisFunction1[/* this */ _Readable, /* size */ Double, Unit]]) & (js.UndefOr[js.ThisFunction1[/* this */ Duplex, /* size */ Double, Unit]]),
    write: (js.UndefOr[
      js.ThisFunction3[
        /* this */ Writable, 
        /* chunk */ js.Any, 
        /* encoding */ BufferEncoding | String, 
        /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
        Unit
      ]
    ]) & (js.UndefOr[
      js.ThisFunction3[
        /* this */ Duplex, 
        /* chunk */ js.Any, 
        /* encoding */ BufferEncoding, 
        /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
        Unit
      ]
    ]),
    writev: (js.UndefOr[
      js.ThisFunction2[
        /* this */ Writable, 
        /* chunk */ ArrayLike[Chunk], 
        /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
        Unit
      ]
    ]) & (js.UndefOr[
      js.ThisFunction2[
        /* this */ Duplex, 
        /* chunks */ js.Array[Encoding], 
        /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
        Unit
      ]
    ])
  ): DuplexOptions = {
    val __obj = js.Dynamic.literal(destroy = destroy.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any], write = write.asInstanceOf[js.Any], writev = writev.asInstanceOf[js.Any])
    __obj.updateDynamic("final")(`final`.asInstanceOf[js.Any])
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
      value: (js.UndefOr[
          js.ThisFunction2[
            /* this */ _Readable, 
            /* error */ Error | Null, 
            /* callback */ js.Function1[/* error */ Error | Null, Unit], 
            Unit
          ]
        ]) & (js.UndefOr[
          js.ThisFunction2[
            /* this */ Writable, 
            /* error */ Error | Null, 
            /* callback */ js.Function1[/* error */ Error | Null, Unit], 
            Unit
          ]
        ]) & (js.UndefOr[
          js.ThisFunction2[
            /* this */ Duplex, 
            /* error */ Error | Null, 
            /* callback */ js.Function1[/* error */ Error | Null, Unit], 
            Unit
          ]
        ])
    ): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
    
    inline def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setFinal(
      value: (js.UndefOr[
          js.ThisFunction1[
            /* this */ Writable, 
            /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
            Unit
          ]
        ]) & (js.UndefOr[
          js.ThisFunction1[
            /* this */ Duplex, 
            /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
            Unit
          ]
        ])
    ): Self = StObject.set(x, "final", value.asInstanceOf[js.Any])
    
    inline def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
    
    inline def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
    
    inline def setObjectMode(value: Boolean): Self = StObject.set(x, "objectMode", value.asInstanceOf[js.Any])
    
    inline def setObjectModeUndefined: Self = StObject.set(x, "objectMode", js.undefined)
    
    inline def setRead(
      value: (js.UndefOr[js.ThisFunction1[/* this */ _Readable, /* size */ Double, Unit]]) & (js.UndefOr[js.ThisFunction1[/* this */ Duplex, /* size */ Double, Unit]])
    ): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
    
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
      value: (js.UndefOr[
          js.ThisFunction3[
            /* this */ Writable, 
            /* chunk */ js.Any, 
            /* encoding */ BufferEncoding | String, 
            /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
            Unit
          ]
        ]) & (js.UndefOr[
          js.ThisFunction3[
            /* this */ Duplex, 
            /* chunk */ js.Any, 
            /* encoding */ BufferEncoding, 
            /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
            Unit
          ]
        ])
    ): Self = StObject.set(x, "write", value.asInstanceOf[js.Any])
    
    inline def setWritev(
      value: (js.UndefOr[
          js.ThisFunction2[
            /* this */ Writable, 
            /* chunk */ ArrayLike[Chunk], 
            /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
            Unit
          ]
        ]) & (js.UndefOr[
          js.ThisFunction2[
            /* this */ Duplex, 
            /* chunks */ js.Array[Encoding], 
            /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
            Unit
          ]
        ])
    ): Self = StObject.set(x, "writev", value.asInstanceOf[js.Any])
  }
}
