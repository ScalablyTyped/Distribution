package typings.readableStream.mod

import typings.node.BufferEncoding
import typings.readableStream.anon.Chunk
import typings.std.ArrayLike
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined readable-stream.readable-stream.WritableStateOptions & {  write :(this : readable-stream.readable-stream.Writable, chunk : any, encoding : node.BufferEncoding | string, callback : (error : std.Error | null | undefined): void): void | undefined,   writev :(this : readable-stream.readable-stream.Writable, chunk : std.ArrayLike<{  chunk :any,   encoding :node.BufferEncoding | string}>, callback : (error : std.Error | null | undefined): void): void | undefined,   destroy :(this : readable-stream.readable-stream.Writable, error : std.Error | null, callback : (error : std.Error | null): void): void | undefined,   final :(this : readable-stream.readable-stream.Writable, callback : (error : std.Error | null | undefined): void): void | undefined} */
@js.native
trait WritableOptions extends js.Object {
  var decodeStrings: js.UndefOr[Boolean] = js.native
  var defaultEncoding: js.UndefOr[BufferEncoding] = js.native
  var destroy: js.UndefOr[
    js.ThisFunction2[
      /* this */ Writable, 
      /* error */ Error | Null, 
      /* callback */ js.Function1[/* error */ Error | Null, Unit], 
      Unit
    ]
  ] = js.native
  var `final`: js.UndefOr[
    js.ThisFunction1[
      /* this */ Writable, 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ]
  ] = js.native
  var highWaterMark: js.UndefOr[Double] = js.native
  var objectMode: js.UndefOr[Boolean] = js.native
  var writableHighWaterMark: js.UndefOr[Double] = js.native
  var writableObjectMode: js.UndefOr[Boolean] = js.native
  var write: js.UndefOr[
    js.ThisFunction3[
      /* this */ Writable, 
      /* chunk */ js.Any, 
      /* encoding */ BufferEncoding | String, 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ]
  ] = js.native
  var writev: js.UndefOr[
    js.ThisFunction2[
      /* this */ Writable, 
      /* chunk */ ArrayLike[Chunk], 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ]
  ] = js.native
}

object WritableOptions {
  @scala.inline
  def apply(): WritableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WritableOptions]
  }
  @scala.inline
  implicit class WritableOptionsOps[Self <: WritableOptions] (val x: Self) extends AnyVal {
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
    def setDecodeStrings(value: Boolean): Self = this.set("decodeStrings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecodeStrings: Self = this.set("decodeStrings", js.undefined)
    @scala.inline
    def setDefaultEncoding(value: BufferEncoding): Self = this.set("defaultEncoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultEncoding: Self = this.set("defaultEncoding", js.undefined)
    @scala.inline
    def setDestroy(
      value: js.ThisFunction2[
          /* this */ Writable, 
          /* error */ Error | Null, 
          /* callback */ js.Function1[/* error */ Error | Null, Unit], 
          Unit
        ]
    ): Self = this.set("destroy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    @scala.inline
    def setFinal(
      value: js.ThisFunction1[
          /* this */ Writable, 
          /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
          Unit
        ]
    ): Self = this.set("final", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFinal: Self = this.set("final", js.undefined)
    @scala.inline
    def setHighWaterMark(value: Double): Self = this.set("highWaterMark", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighWaterMark: Self = this.set("highWaterMark", js.undefined)
    @scala.inline
    def setObjectMode(value: Boolean): Self = this.set("objectMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectMode: Self = this.set("objectMode", js.undefined)
    @scala.inline
    def setWritableHighWaterMark(value: Double): Self = this.set("writableHighWaterMark", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWritableHighWaterMark: Self = this.set("writableHighWaterMark", js.undefined)
    @scala.inline
    def setWritableObjectMode(value: Boolean): Self = this.set("writableObjectMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWritableObjectMode: Self = this.set("writableObjectMode", js.undefined)
    @scala.inline
    def setWrite(
      value: js.ThisFunction3[
          /* this */ Writable, 
          /* chunk */ js.Any, 
          /* encoding */ BufferEncoding | String, 
          /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
          Unit
        ]
    ): Self = this.set("write", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrite: Self = this.set("write", js.undefined)
    @scala.inline
    def setWritev(
      value: js.ThisFunction2[
          /* this */ Writable, 
          /* chunk */ ArrayLike[Chunk], 
          /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
          Unit
        ]
    ): Self = this.set("writev", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWritev: Self = this.set("writev", js.undefined)
  }
  
}

