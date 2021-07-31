package typings.readableStream.mod

import typings.node.BufferEncoding
import typings.readableStream.anon.Chunk
import typings.readableStream.anon.Encoding
import typings.std.ArrayLike
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// ==== _stream_transform ====
/* Inlined readable-stream.readable-stream.DuplexOptions & {  read :(this : readable-stream.readable-stream.Transform, size : number): void | undefined,   write :(this : readable-stream.readable-stream.Transform, chunk : any, encoding : node.BufferEncoding, callback : (error : std.Error | null | undefined): void): void | undefined,   writev :(this : readable-stream.readable-stream.Transform, chunks : std.Array<{  chunk :any,   encoding :node.BufferEncoding}>, callback : (error : std.Error | null | undefined): void): void | undefined,   final :(this : readable-stream.readable-stream.Transform, callback : (error : std.Error | null | undefined): void): void | undefined,   destroy :(this : readable-stream.readable-stream.Transform, error : std.Error | null, callback : (error : std.Error | null): void): void | undefined,   transform :(this : readable-stream.readable-stream.Transform, chunk : any, encoding : node.BufferEncoding, callback : (error : std.Error | undefined, data : any | undefined): void): void | undefined,   flush :(this : readable-stream.readable-stream.Transform, callback : (er : any, data : any): void): void | undefined} */
trait TransformOptions extends StObject {
  
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
  ]) & (js.UndefOr[
    js.ThisFunction2[
      /* this */ Transform, 
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
  ]) & (js.UndefOr[
    js.ThisFunction1[
      /* this */ Transform, 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ]
  ])
  
  var flush: js.UndefOr[
    js.ThisFunction1[
      /* this */ Transform, 
      /* callback */ js.Function2[/* er */ js.Any, /* data */ js.Any, Unit], 
      Unit
    ]
  ] = js.undefined
  
  var highWaterMark: js.UndefOr[Double] = js.undefined
  
  var objectMode: js.UndefOr[Boolean] = js.undefined
  
  var read: (js.UndefOr[js.ThisFunction1[/* this */ _Readable, /* size */ Double, Unit]]) & (js.UndefOr[js.ThisFunction1[/* this */ Duplex, /* size */ Double, Unit]]) & (js.UndefOr[js.ThisFunction1[/* this */ Transform, /* size */ Double, Unit]])
  
  var readable: js.UndefOr[Boolean] = js.undefined
  
  var readableHighWaterMark: js.UndefOr[Double] = js.undefined
  
  var readableObjectMode: js.UndefOr[Boolean] = js.undefined
  
  var transform: js.UndefOr[
    js.ThisFunction3[
      /* this */ Transform, 
      /* chunk */ js.Any, 
      /* encoding */ BufferEncoding, 
      /* callback */ js.Function2[/* error */ js.UndefOr[Error], /* data */ js.UndefOr[js.Any], Unit], 
      Unit
    ]
  ] = js.undefined
  
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
  ]) & (js.UndefOr[
    js.ThisFunction3[
      /* this */ Transform, 
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
  ]) & (js.UndefOr[
    js.ThisFunction2[
      /* this */ Transform, 
      /* chunks */ js.Array[Encoding], 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ]
  ])
}
object TransformOptions {
  
  @scala.inline
  def apply(
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
    ]) & (js.UndefOr[
      js.ThisFunction2[
        /* this */ Transform, 
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
    ]) & (js.UndefOr[
      js.ThisFunction1[
        /* this */ Transform, 
        /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
        Unit
      ]
    ]),
    read: (js.UndefOr[js.ThisFunction1[/* this */ _Readable, /* size */ Double, Unit]]) & (js.UndefOr[js.ThisFunction1[/* this */ Duplex, /* size */ Double, Unit]]) & (js.UndefOr[js.ThisFunction1[/* this */ Transform, /* size */ Double, Unit]]),
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
    ]) & (js.UndefOr[
      js.ThisFunction3[
        /* this */ Transform, 
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
    ]) & (js.UndefOr[
      js.ThisFunction2[
        /* this */ Transform, 
        /* chunks */ js.Array[Encoding], 
        /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
        Unit
      ]
    ])
  ): TransformOptions = {
    val __obj = js.Dynamic.literal(destroy = destroy.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any], write = write.asInstanceOf[js.Any], writev = writev.asInstanceOf[js.Any])
    __obj.updateDynamic("final")(`final`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformOptions]
  }
  
  @scala.inline
  implicit class TransformOptionsMutableBuilder[Self <: TransformOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowHalfOpen(value: Boolean): Self = StObject.set(x, "allowHalfOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowHalfOpenUndefined: Self = StObject.set(x, "allowHalfOpen", js.undefined)
    
    @scala.inline
    def setDecodeStrings(value: Boolean): Self = StObject.set(x, "decodeStrings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecodeStringsUndefined: Self = StObject.set(x, "decodeStrings", js.undefined)
    
    @scala.inline
    def setDefaultEncoding(value: BufferEncoding): Self = StObject.set(x, "defaultEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultEncodingUndefined: Self = StObject.set(x, "defaultEncoding", js.undefined)
    
    @scala.inline
    def setDestroy(
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
        ]) & (js.UndefOr[
          js.ThisFunction2[
            /* this */ Transform, 
            /* error */ Error | Null, 
            /* callback */ js.Function1[/* error */ Error | Null, Unit], 
            Unit
          ]
        ])
    ): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    @scala.inline
    def setFinal(
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
        ]) & (js.UndefOr[
          js.ThisFunction1[
            /* this */ Transform, 
            /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
            Unit
          ]
        ])
    ): Self = StObject.set(x, "final", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlush(
      value: js.ThisFunction1[
          /* this */ Transform, 
          /* callback */ js.Function2[/* er */ js.Any, /* data */ js.Any, Unit], 
          Unit
        ]
    ): Self = StObject.set(x, "flush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlushUndefined: Self = StObject.set(x, "flush", js.undefined)
    
    @scala.inline
    def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
    
    @scala.inline
    def setObjectMode(value: Boolean): Self = StObject.set(x, "objectMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectModeUndefined: Self = StObject.set(x, "objectMode", js.undefined)
    
    @scala.inline
    def setRead(
      value: (js.UndefOr[js.ThisFunction1[/* this */ _Readable, /* size */ Double, Unit]]) & (js.UndefOr[js.ThisFunction1[/* this */ Duplex, /* size */ Double, Unit]]) & (js.UndefOr[js.ThisFunction1[/* this */ Transform, /* size */ Double, Unit]])
    ): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadable(value: Boolean): Self = StObject.set(x, "readable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadableHighWaterMark(value: Double): Self = StObject.set(x, "readableHighWaterMark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadableHighWaterMarkUndefined: Self = StObject.set(x, "readableHighWaterMark", js.undefined)
    
    @scala.inline
    def setReadableObjectMode(value: Boolean): Self = StObject.set(x, "readableObjectMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadableObjectModeUndefined: Self = StObject.set(x, "readableObjectMode", js.undefined)
    
    @scala.inline
    def setReadableUndefined: Self = StObject.set(x, "readable", js.undefined)
    
    @scala.inline
    def setTransform(
      value: js.ThisFunction3[
          /* this */ Transform, 
          /* chunk */ js.Any, 
          /* encoding */ BufferEncoding, 
          /* callback */ js.Function2[/* error */ js.UndefOr[Error], /* data */ js.UndefOr[js.Any], Unit], 
          Unit
        ]
    ): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    @scala.inline
    def setWritable(value: Boolean): Self = StObject.set(x, "writable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWritableHighWaterMark(value: Double): Self = StObject.set(x, "writableHighWaterMark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWritableHighWaterMarkUndefined: Self = StObject.set(x, "writableHighWaterMark", js.undefined)
    
    @scala.inline
    def setWritableObjectMode(value: Boolean): Self = StObject.set(x, "writableObjectMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWritableObjectModeUndefined: Self = StObject.set(x, "writableObjectMode", js.undefined)
    
    @scala.inline
    def setWritableUndefined: Self = StObject.set(x, "writable", js.undefined)
    
    @scala.inline
    def setWrite(
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
        ]) & (js.UndefOr[
          js.ThisFunction3[
            /* this */ Transform, 
            /* chunk */ js.Any, 
            /* encoding */ BufferEncoding, 
            /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
            Unit
          ]
        ])
    ): Self = StObject.set(x, "write", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWritev(
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
        ]) & (js.UndefOr[
          js.ThisFunction2[
            /* this */ Transform, 
            /* chunks */ js.Array[Encoding], 
            /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
            Unit
          ]
        ])
    ): Self = StObject.set(x, "writev", value.asInstanceOf[js.Any])
  }
}
