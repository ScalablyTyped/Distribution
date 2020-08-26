package typings.streamingJsonStringify.mod

import typings.node.BufferEncoding
import typings.node.anon.Chunk
import typings.node.streamMod.Transform
import typings.node.streamMod.TransformCallback
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<streaming-json-stringify.streaming-json-stringify.Instance> & node.stream.TransformOptions */
@js.native
trait Options extends js.Object {
  var allowHalfOpen: js.UndefOr[Boolean] = js.native
  var autoDestroy: js.UndefOr[Boolean] = js.native
  var closer: js.UndefOr[String] = js.native
  var decodeStrings: js.UndefOr[Boolean] = js.native
  var defaultEncoding: js.UndefOr[BufferEncoding] = js.native
  var destroy: js.UndefOr[
    js.ThisFunction2[
      /* this */ Transform, 
      /* error */ Error | Null, 
      /* callback */ js.Function1[/* error */ Error | Null, Unit], 
      Unit
    ]
  ] = js.native
  var emitClose: js.UndefOr[Boolean] = js.native
  var encoding: js.UndefOr[BufferEncoding] = js.native
  var `final`: js.UndefOr[
    js.ThisFunction1[
      /* this */ Transform, 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ]
  ] = js.native
  var flush: js.UndefOr[js.ThisFunction1[/* this */ Transform, /* callback */ TransformCallback, Unit]] = js.native
  var highWaterMark: js.UndefOr[Double] = js.native
  var objectMode: js.UndefOr[Boolean] = js.native
  var opener: js.UndefOr[String] = js.native
  var read: js.UndefOr[js.ThisFunction1[/* this */ Transform, /* size */ Double, Unit]] = js.native
  var readableHighWaterMark: js.UndefOr[Double] = js.native
  var readableObjectMode: js.UndefOr[Boolean] = js.native
  var replacer: js.UndefOr[Replacer] = js.native
  var seperator: js.UndefOr[String] = js.native
  var space: js.UndefOr[String | Double] = js.native
  var stringifier: js.UndefOr[
    js.Function3[/* value */ js.Any, /* replacer */ Replacer, /* space */ String | Double, String]
  ] = js.native
  var transform: js.UndefOr[
    js.ThisFunction3[
      /* this */ Transform, 
      /* chunk */ js.Any, 
      /* encoding */ BufferEncoding, 
      /* callback */ TransformCallback, 
      Unit
    ]
  ] = js.native
  var writableCorked: js.UndefOr[Double] = js.native
  var writableHighWaterMark: js.UndefOr[Double] = js.native
  var writableObjectMode: js.UndefOr[Boolean] = js.native
  var write: js.UndefOr[
    js.ThisFunction3[
      /* this */ Transform, 
      /* chunk */ js.Any, 
      /* encoding */ BufferEncoding, 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ]
  ] = js.native
  var writev: js.UndefOr[
    js.ThisFunction2[
      /* this */ Transform, 
      /* chunks */ js.Array[Chunk], 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ]
  ] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setAllowHalfOpen(value: Boolean): Self = this.set("allowHalfOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowHalfOpen: Self = this.set("allowHalfOpen", js.undefined)
    @scala.inline
    def setAutoDestroy(value: Boolean): Self = this.set("autoDestroy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoDestroy: Self = this.set("autoDestroy", js.undefined)
    @scala.inline
    def setCloser(value: String): Self = this.set("closer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloser: Self = this.set("closer", js.undefined)
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
          /* this */ Transform, 
          /* error */ Error | Null, 
          /* callback */ js.Function1[/* error */ Error | Null, Unit], 
          Unit
        ]
    ): Self = this.set("destroy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    @scala.inline
    def setEmitClose(value: Boolean): Self = this.set("emitClose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmitClose: Self = this.set("emitClose", js.undefined)
    @scala.inline
    def setEncoding(value: BufferEncoding): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    @scala.inline
    def setFinal(
      value: js.ThisFunction1[
          /* this */ Transform, 
          /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
          Unit
        ]
    ): Self = this.set("final", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFinal: Self = this.set("final", js.undefined)
    @scala.inline
    def setFlush(value: js.ThisFunction1[/* this */ Transform, /* callback */ TransformCallback, Unit]): Self = this.set("flush", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlush: Self = this.set("flush", js.undefined)
    @scala.inline
    def setHighWaterMark(value: Double): Self = this.set("highWaterMark", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighWaterMark: Self = this.set("highWaterMark", js.undefined)
    @scala.inline
    def setObjectMode(value: Boolean): Self = this.set("objectMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectMode: Self = this.set("objectMode", js.undefined)
    @scala.inline
    def setOpener(value: String): Self = this.set("opener", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpener: Self = this.set("opener", js.undefined)
    @scala.inline
    def setRead(value: js.ThisFunction1[/* this */ Transform, /* size */ Double, Unit]): Self = this.set("read", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRead: Self = this.set("read", js.undefined)
    @scala.inline
    def setReadableHighWaterMark(value: Double): Self = this.set("readableHighWaterMark", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadableHighWaterMark: Self = this.set("readableHighWaterMark", js.undefined)
    @scala.inline
    def setReadableObjectMode(value: Boolean): Self = this.set("readableObjectMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadableObjectMode: Self = this.set("readableObjectMode", js.undefined)
    @scala.inline
    def setReplacer(value: (/* key */ String, /* value */ js.Any) => js.Any): Self = this.set("replacer", js.Any.fromFunction2(value))
    @scala.inline
    def deleteReplacer: Self = this.set("replacer", js.undefined)
    @scala.inline
    def setSeperator(value: String): Self = this.set("seperator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeperator: Self = this.set("seperator", js.undefined)
    @scala.inline
    def setSpace(value: String | Double): Self = this.set("space", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpace: Self = this.set("space", js.undefined)
    @scala.inline
    def setStringifier(value: (/* value */ js.Any, /* replacer */ Replacer, /* space */ String | Double) => String): Self = this.set("stringifier", js.Any.fromFunction3(value))
    @scala.inline
    def deleteStringifier: Self = this.set("stringifier", js.undefined)
    @scala.inline
    def setTransform(
      value: js.ThisFunction3[
          /* this */ Transform, 
          /* chunk */ js.Any, 
          /* encoding */ BufferEncoding, 
          /* callback */ TransformCallback, 
          Unit
        ]
    ): Self = this.set("transform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
    @scala.inline
    def setWritableCorked(value: Double): Self = this.set("writableCorked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWritableCorked: Self = this.set("writableCorked", js.undefined)
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
          /* this */ Transform, 
          /* chunk */ js.Any, 
          /* encoding */ BufferEncoding, 
          /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
          Unit
        ]
    ): Self = this.set("write", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrite: Self = this.set("write", js.undefined)
    @scala.inline
    def setWritev(
      value: js.ThisFunction2[
          /* this */ Transform, 
          /* chunks */ js.Array[Chunk], 
          /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
          Unit
        ]
    ): Self = this.set("writev", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWritev: Self = this.set("writev", js.undefined)
  }
  
}

