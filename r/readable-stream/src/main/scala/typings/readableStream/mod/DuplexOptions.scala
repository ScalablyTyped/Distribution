package typings.readableStream.mod

import typings.node.BufferEncoding
import typings.readableStream.anon.Chunk
import typings.readableStream.anon.Encoding
import typings.std.ArrayLike
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// ==== _stream_duplex ====
/* Inlined readable-stream.readable-stream.ReadableOptions & readable-stream.readable-stream.WritableOptions & {  allowHalfOpen :boolean | undefined,   readable :boolean | undefined,   writable :boolean | undefined,   read :(this : readable-stream.readable-stream.Duplex, size : number): void | undefined,   write :(this : readable-stream.readable-stream.Duplex, chunk : any, encoding : node.BufferEncoding, callback : (error : std.Error | null | undefined): void): void | undefined,   writev :(this : readable-stream.readable-stream.Duplex, chunks : std.Array<{  chunk :any,   encoding :node.BufferEncoding}>, callback : (error : std.Error | null | undefined): void): void | undefined,   final :(this : readable-stream.readable-stream.Duplex, callback : (error : std.Error | null | undefined): void): void | undefined,   destroy :(this : readable-stream.readable-stream.Duplex, error : std.Error | null, callback : (error : std.Error | null): void): void | undefined} */
@js.native
trait DuplexOptions extends js.Object {
  
  var allowHalfOpen: js.UndefOr[Boolean] = js.native
  
  var decodeStrings: js.UndefOr[Boolean] = js.native
  
  var defaultEncoding: js.UndefOr[BufferEncoding] = js.native
  
  var destroy: (js.UndefOr[
    js.ThisFunction2[
      /* this */ _Readable, 
      /* error */ Error | Null, 
      /* callback */ js.Function1[/* error */ Error | Null, Unit], 
      Unit
    ]
  ]) with (js.UndefOr[
    js.ThisFunction2[
      /* this */ Writable, 
      /* error */ Error | Null, 
      /* callback */ js.Function1[/* error */ Error | Null, Unit], 
      Unit
    ]
  ]) with (js.UndefOr[
    js.ThisFunction2[
      /* this */ Duplex, 
      /* error */ Error | Null, 
      /* callback */ js.Function1[/* error */ Error | Null, Unit], 
      Unit
    ]
  ]) = js.native
  
  var encoding: js.UndefOr[BufferEncoding] = js.native
  
  var `final`: (js.UndefOr[
    js.ThisFunction1[
      /* this */ Writable, 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ]
  ]) with (js.UndefOr[
    js.ThisFunction1[
      /* this */ Duplex, 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ]
  ]) = js.native
  
  var highWaterMark: js.UndefOr[Double] = js.native
  
  var objectMode: js.UndefOr[Boolean] = js.native
  
  var read: (js.UndefOr[js.ThisFunction1[/* this */ _Readable, /* size */ Double, Unit]]) with (js.UndefOr[js.ThisFunction1[/* this */ Duplex, /* size */ Double, Unit]]) = js.native
  
  var readable: js.UndefOr[Boolean] = js.native
  
  var readableHighWaterMark: js.UndefOr[Double] = js.native
  
  var readableObjectMode: js.UndefOr[Boolean] = js.native
  
  var writable: js.UndefOr[Boolean] = js.native
  
  var writableHighWaterMark: js.UndefOr[Double] = js.native
  
  var writableObjectMode: js.UndefOr[Boolean] = js.native
  
  var write: (js.UndefOr[
    js.ThisFunction3[
      /* this */ Writable, 
      /* chunk */ js.Any, 
      /* encoding */ BufferEncoding | String, 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ]
  ]) with (js.UndefOr[
    js.ThisFunction3[
      /* this */ Duplex, 
      /* chunk */ js.Any, 
      /* encoding */ BufferEncoding, 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ]
  ]) = js.native
  
  var writev: (js.UndefOr[
    js.ThisFunction2[
      /* this */ Writable, 
      /* chunk */ ArrayLike[Chunk], 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ]
  ]) with (js.UndefOr[
    js.ThisFunction2[
      /* this */ Duplex, 
      /* chunks */ js.Array[Encoding], 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ]
  ]) = js.native
}
object DuplexOptions {
  
  @scala.inline
  def apply(
    destroy: (js.UndefOr[
      js.ThisFunction2[
        /* this */ _Readable, 
        /* error */ Error | Null, 
        /* callback */ js.Function1[/* error */ Error | Null, Unit], 
        Unit
      ]
    ]) with (js.UndefOr[
      js.ThisFunction2[
        /* this */ Writable, 
        /* error */ Error | Null, 
        /* callback */ js.Function1[/* error */ Error | Null, Unit], 
        Unit
      ]
    ]) with (js.UndefOr[
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
    ]) with (js.UndefOr[
      js.ThisFunction1[
        /* this */ Duplex, 
        /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
        Unit
      ]
    ]),
    read: (js.UndefOr[js.ThisFunction1[/* this */ _Readable, /* size */ Double, Unit]]) with (js.UndefOr[js.ThisFunction1[/* this */ Duplex, /* size */ Double, Unit]]),
    write: (js.UndefOr[
      js.ThisFunction3[
        /* this */ Writable, 
        /* chunk */ js.Any, 
        /* encoding */ BufferEncoding | String, 
        /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
        Unit
      ]
    ]) with (js.UndefOr[
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
    ]) with (js.UndefOr[
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
  
  @scala.inline
  implicit class DuplexOptionsOps[Self <: DuplexOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDestroy(
      value: (js.UndefOr[
          js.ThisFunction2[
            /* this */ _Readable, 
            /* error */ Error | Null, 
            /* callback */ js.Function1[/* error */ Error | Null, Unit], 
            Unit
          ]
        ]) with (js.UndefOr[
          js.ThisFunction2[
            /* this */ Writable, 
            /* error */ Error | Null, 
            /* callback */ js.Function1[/* error */ Error | Null, Unit], 
            Unit
          ]
        ]) with (js.UndefOr[
          js.ThisFunction2[
            /* this */ Duplex, 
            /* error */ Error | Null, 
            /* callback */ js.Function1[/* error */ Error | Null, Unit], 
            Unit
          ]
        ])
    ): Self = this.set("destroy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinal(
      value: (js.UndefOr[
          js.ThisFunction1[
            /* this */ Writable, 
            /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
            Unit
          ]
        ]) with (js.UndefOr[
          js.ThisFunction1[
            /* this */ Duplex, 
            /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
            Unit
          ]
        ])
    ): Self = this.set("final", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRead(
      value: (js.UndefOr[js.ThisFunction1[/* this */ _Readable, /* size */ Double, Unit]]) with (js.UndefOr[js.ThisFunction1[/* this */ Duplex, /* size */ Double, Unit]])
    ): Self = this.set("read", value.asInstanceOf[js.Any])
    
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
        ]) with (js.UndefOr[
          js.ThisFunction3[
            /* this */ Duplex, 
            /* chunk */ js.Any, 
            /* encoding */ BufferEncoding, 
            /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
            Unit
          ]
        ])
    ): Self = this.set("write", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWritev(
      value: (js.UndefOr[
          js.ThisFunction2[
            /* this */ Writable, 
            /* chunk */ ArrayLike[Chunk], 
            /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
            Unit
          ]
        ]) with (js.UndefOr[
          js.ThisFunction2[
            /* this */ Duplex, 
            /* chunks */ js.Array[Encoding], 
            /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
            Unit
          ]
        ])
    ): Self = this.set("writev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowHalfOpen(value: Boolean): Self = this.set("allowHalfOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowHalfOpen: Self = this.set("allowHalfOpen", js.undefined)
    
    @scala.inline
    def setDecodeStrings(value: Boolean): Self = this.set("decodeStrings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecodeStrings: Self = this.set("decodeStrings", js.undefined)
    
    @scala.inline
    def setDefaultEncoding(value: BufferEncoding): Self = this.set("defaultEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultEncoding: Self = this.set("defaultEncoding", js.undefined)
    
    @scala.inline
    def setEncoding(value: BufferEncoding): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    
    @scala.inline
    def setHighWaterMark(value: Double): Self = this.set("highWaterMark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighWaterMark: Self = this.set("highWaterMark", js.undefined)
    
    @scala.inline
    def setObjectMode(value: Boolean): Self = this.set("objectMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectMode: Self = this.set("objectMode", js.undefined)
    
    @scala.inline
    def setReadable(value: Boolean): Self = this.set("readable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadable: Self = this.set("readable", js.undefined)
    
    @scala.inline
    def setReadableHighWaterMark(value: Double): Self = this.set("readableHighWaterMark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadableHighWaterMark: Self = this.set("readableHighWaterMark", js.undefined)
    
    @scala.inline
    def setReadableObjectMode(value: Boolean): Self = this.set("readableObjectMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadableObjectMode: Self = this.set("readableObjectMode", js.undefined)
    
    @scala.inline
    def setWritable(value: Boolean): Self = this.set("writable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWritable: Self = this.set("writable", js.undefined)
    
    @scala.inline
    def setWritableHighWaterMark(value: Double): Self = this.set("writableHighWaterMark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWritableHighWaterMark: Self = this.set("writableHighWaterMark", js.undefined)
    
    @scala.inline
    def setWritableObjectMode(value: Boolean): Self = this.set("writableObjectMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWritableObjectMode: Self = this.set("writableObjectMode", js.undefined)
  }
}
