package typings.readableStream.mod

import typings.node.bufferMod.global.BufferEncoding
import typings.readableStream.anon.Chunk
import typings.readableStream.anon.Encoding
import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// ==== _stream_transform ====
/* Inlined readable-stream.readable-stream.ReadableOptions & readable-stream.readable-stream.WritableOptions & {  read :(this : readable-stream.readable-stream._ITransform, size : number): void | undefined,   write :(this : readable-stream.readable-stream._ITransform, chunk : any, encoding : node.buffer.<global>.BufferEncoding, callback : (error : std.Error | null | undefined): void): void | undefined,   writev :(this : readable-stream.readable-stream._ITransform, chunks : std.Array<{  chunk :any,   encoding :node.buffer.<global>.BufferEncoding}>, callback : (error : std.Error | null | undefined): void): void | undefined,   final :(this : readable-stream.readable-stream._ITransform, callback : (error : std.Error | null | undefined): void): void | undefined,   destroy :(this : readable-stream.readable-stream._ITransform, error : std.Error | null, callback : (error : std.Error | null): void): void | undefined,   transform :(this : readable-stream.readable-stream._ITransform, chunk : any, encoding : node.buffer.<global>.BufferEncoding, callback : (error : std.Error | null | undefined, data : any | undefined): void): void | undefined,   flush :(callback : (error : std.Error | null | undefined, data : any | undefined): void): void | undefined} */
trait TransformOptions extends StObject {
  
  var decodeStrings: js.UndefOr[Boolean] = js.undefined
  
  var defaultEncoding: js.UndefOr[BufferEncoding] = js.undefined
  
  var destroy: (js.UndefOr[
    js.ThisFunction2[
      /* this */ IReadable, 
      /* error */ js.Error | Null, 
      /* callback */ js.Function1[/* error */ js.Error | Null, Unit], 
      Unit
    ]
  ]) & (js.UndefOr[
    js.ThisFunction2[
      /* this */ IWritable, 
      /* error */ js.Error | Null, 
      /* callback */ js.Function1[/* error */ js.Error | Null, Unit], 
      Unit
    ]
  ]) & (js.UndefOr[
    js.ThisFunction2[
      /* this */ ITransform, 
      /* error */ js.Error | Null, 
      /* callback */ js.Function1[/* error */ js.Error | Null, Unit], 
      Unit
    ]
  ])
  
  var encoding: js.UndefOr[BufferEncoding] = js.undefined
  
  var `final`: (js.UndefOr[
    js.ThisFunction1[
      /* this */ IWritable, 
      /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
      Unit
    ]
  ]) & (js.UndefOr[
    js.ThisFunction1[
      /* this */ ITransform, 
      /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
      Unit
    ]
  ])
  
  var flush: js.UndefOr[
    js.Function1[
      /* callback */ js.Function2[/* error */ js.UndefOr[js.Error | Null], /* data */ js.UndefOr[Any], Unit], 
      Unit
    ]
  ] = js.undefined
  
  var highWaterMark: js.UndefOr[Double] = js.undefined
  
  var objectMode: js.UndefOr[Boolean] = js.undefined
  
  var read: (js.UndefOr[js.ThisFunction1[/* this */ IReadable, /* size */ Double, Unit]]) & (js.UndefOr[js.ThisFunction1[/* this */ ITransform, /* size */ Double, Unit]])
  
  var readableHighWaterMark: js.UndefOr[Double] = js.undefined
  
  var readableObjectMode: js.UndefOr[Boolean] = js.undefined
  
  var transform: js.UndefOr[
    js.ThisFunction3[
      /* this */ ITransform, 
      /* chunk */ Any, 
      /* encoding */ BufferEncoding, 
      /* callback */ js.Function2[/* error */ js.UndefOr[js.Error | Null], /* data */ js.UndefOr[Any], Unit], 
      Unit
    ]
  ] = js.undefined
  
  var writableHighWaterMark: js.UndefOr[Double] = js.undefined
  
  var writableObjectMode: js.UndefOr[Boolean] = js.undefined
  
  var write: (js.UndefOr[
    js.ThisFunction3[
      /* this */ IWritable, 
      /* chunk */ Any, 
      /* encoding */ BufferEncoding | String, 
      /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
      Unit
    ]
  ]) & (js.UndefOr[
    js.ThisFunction3[
      /* this */ ITransform, 
      /* chunk */ Any, 
      /* encoding */ BufferEncoding, 
      /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
      Unit
    ]
  ])
  
  var writev: (js.UndefOr[
    js.ThisFunction2[
      /* this */ IWritable, 
      /* chunk */ ArrayLike[Chunk], 
      /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
      Unit
    ]
  ]) & (js.UndefOr[
    js.ThisFunction2[
      /* this */ ITransform, 
      /* chunks */ js.Array[Encoding], 
      /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
      Unit
    ]
  ])
}
object TransformOptions {
  
  inline def apply(
    destroy: (js.UndefOr[
      js.ThisFunction2[
        /* this */ IReadable, 
        /* error */ js.Error | Null, 
        /* callback */ js.Function1[/* error */ js.Error | Null, Unit], 
        Unit
      ]
    ]) & (js.UndefOr[
      js.ThisFunction2[
        /* this */ IWritable, 
        /* error */ js.Error | Null, 
        /* callback */ js.Function1[/* error */ js.Error | Null, Unit], 
        Unit
      ]
    ]) & (js.UndefOr[
      js.ThisFunction2[
        /* this */ ITransform, 
        /* error */ js.Error | Null, 
        /* callback */ js.Function1[/* error */ js.Error | Null, Unit], 
        Unit
      ]
    ]),
    `final`: (js.UndefOr[
      js.ThisFunction1[
        /* this */ IWritable, 
        /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
        Unit
      ]
    ]) & (js.UndefOr[
      js.ThisFunction1[
        /* this */ ITransform, 
        /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
        Unit
      ]
    ]),
    read: (js.UndefOr[js.ThisFunction1[/* this */ IReadable, /* size */ Double, Unit]]) & (js.UndefOr[js.ThisFunction1[/* this */ ITransform, /* size */ Double, Unit]]),
    write: (js.UndefOr[
      js.ThisFunction3[
        /* this */ IWritable, 
        /* chunk */ Any, 
        /* encoding */ BufferEncoding | String, 
        /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
        Unit
      ]
    ]) & (js.UndefOr[
      js.ThisFunction3[
        /* this */ ITransform, 
        /* chunk */ Any, 
        /* encoding */ BufferEncoding, 
        /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
        Unit
      ]
    ]),
    writev: (js.UndefOr[
      js.ThisFunction2[
        /* this */ IWritable, 
        /* chunk */ ArrayLike[Chunk], 
        /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
        Unit
      ]
    ]) & (js.UndefOr[
      js.ThisFunction2[
        /* this */ ITransform, 
        /* chunks */ js.Array[Encoding], 
        /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
        Unit
      ]
    ])
  ): TransformOptions = {
    val __obj = js.Dynamic.literal(destroy = destroy.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any], write = write.asInstanceOf[js.Any], writev = writev.asInstanceOf[js.Any])
    __obj.updateDynamic("final")(`final`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformOptions]
  }
  
  extension [Self <: TransformOptions](x: Self) {
    
    inline def setDecodeStrings(value: Boolean): Self = StObject.set(x, "decodeStrings", value.asInstanceOf[js.Any])
    
    inline def setDecodeStringsUndefined: Self = StObject.set(x, "decodeStrings", js.undefined)
    
    inline def setDefaultEncoding(value: BufferEncoding): Self = StObject.set(x, "defaultEncoding", value.asInstanceOf[js.Any])
    
    inline def setDefaultEncodingUndefined: Self = StObject.set(x, "defaultEncoding", js.undefined)
    
    inline def setDestroy(
      value: (js.UndefOr[
          js.ThisFunction2[
            /* this */ IReadable, 
            /* error */ js.Error | Null, 
            /* callback */ js.Function1[/* error */ js.Error | Null, Unit], 
            Unit
          ]
        ]) & (js.UndefOr[
          js.ThisFunction2[
            /* this */ IWritable, 
            /* error */ js.Error | Null, 
            /* callback */ js.Function1[/* error */ js.Error | Null, Unit], 
            Unit
          ]
        ]) & (js.UndefOr[
          js.ThisFunction2[
            /* this */ ITransform, 
            /* error */ js.Error | Null, 
            /* callback */ js.Function1[/* error */ js.Error | Null, Unit], 
            Unit
          ]
        ])
    ): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
    
    inline def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setFinal(
      value: (js.UndefOr[
          js.ThisFunction1[
            /* this */ IWritable, 
            /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
            Unit
          ]
        ]) & (js.UndefOr[
          js.ThisFunction1[
            /* this */ ITransform, 
            /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
            Unit
          ]
        ])
    ): Self = StObject.set(x, "final", value.asInstanceOf[js.Any])
    
    inline def setFlush(
      value: /* callback */ js.Function2[/* error */ js.UndefOr[js.Error | Null], /* data */ js.UndefOr[Any], Unit] => Unit
    ): Self = StObject.set(x, "flush", js.Any.fromFunction1(value))
    
    inline def setFlushUndefined: Self = StObject.set(x, "flush", js.undefined)
    
    inline def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
    
    inline def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
    
    inline def setObjectMode(value: Boolean): Self = StObject.set(x, "objectMode", value.asInstanceOf[js.Any])
    
    inline def setObjectModeUndefined: Self = StObject.set(x, "objectMode", js.undefined)
    
    inline def setRead(
      value: (js.UndefOr[js.ThisFunction1[/* this */ IReadable, /* size */ Double, Unit]]) & (js.UndefOr[js.ThisFunction1[/* this */ ITransform, /* size */ Double, Unit]])
    ): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
    
    inline def setReadableHighWaterMark(value: Double): Self = StObject.set(x, "readableHighWaterMark", value.asInstanceOf[js.Any])
    
    inline def setReadableHighWaterMarkUndefined: Self = StObject.set(x, "readableHighWaterMark", js.undefined)
    
    inline def setReadableObjectMode(value: Boolean): Self = StObject.set(x, "readableObjectMode", value.asInstanceOf[js.Any])
    
    inline def setReadableObjectModeUndefined: Self = StObject.set(x, "readableObjectMode", js.undefined)
    
    inline def setTransform(
      value: js.ThisFunction3[
          /* this */ ITransform, 
          /* chunk */ Any, 
          /* encoding */ BufferEncoding, 
          /* callback */ js.Function2[/* error */ js.UndefOr[js.Error | Null], /* data */ js.UndefOr[Any], Unit], 
          Unit
        ]
    ): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    inline def setWritableHighWaterMark(value: Double): Self = StObject.set(x, "writableHighWaterMark", value.asInstanceOf[js.Any])
    
    inline def setWritableHighWaterMarkUndefined: Self = StObject.set(x, "writableHighWaterMark", js.undefined)
    
    inline def setWritableObjectMode(value: Boolean): Self = StObject.set(x, "writableObjectMode", value.asInstanceOf[js.Any])
    
    inline def setWritableObjectModeUndefined: Self = StObject.set(x, "writableObjectMode", js.undefined)
    
    inline def setWrite(
      value: (js.UndefOr[
          js.ThisFunction3[
            /* this */ IWritable, 
            /* chunk */ Any, 
            /* encoding */ BufferEncoding | String, 
            /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
            Unit
          ]
        ]) & (js.UndefOr[
          js.ThisFunction3[
            /* this */ ITransform, 
            /* chunk */ Any, 
            /* encoding */ BufferEncoding, 
            /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
            Unit
          ]
        ])
    ): Self = StObject.set(x, "write", value.asInstanceOf[js.Any])
    
    inline def setWritev(
      value: (js.UndefOr[
          js.ThisFunction2[
            /* this */ IWritable, 
            /* chunk */ ArrayLike[Chunk], 
            /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
            Unit
          ]
        ]) & (js.UndefOr[
          js.ThisFunction2[
            /* this */ ITransform, 
            /* chunks */ js.Array[Encoding], 
            /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
            Unit
          ]
        ])
    ): Self = StObject.set(x, "writev", value.asInstanceOf[js.Any])
  }
}
