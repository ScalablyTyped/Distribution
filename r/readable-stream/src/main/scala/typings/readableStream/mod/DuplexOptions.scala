package typings.readableStream.mod

import typings.node.BufferEncoding
import typings.readableStream.anon.Chunk
import typings.std.ArrayLike
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ==== _stream_duplex ====
/* Inlined readable-stream.readable-stream.ReadableOptions & readable-stream.readable-stream.WritableOptions & {  allowHalfOpen ? :boolean,   readable ? :boolean,   writable ? :boolean,   read ? :(this : readable-stream.readable-stream.Duplex, size : number): void,   write ? :(this : readable-stream.readable-stream.Duplex, chunk : any, encoding : node.BufferEncoding, callback : (error ? : std.Error | null): void): void,   writev ? :(this : readable-stream.readable-stream.Duplex, chunks : std.Array<{  chunk  :any,   encoding  :node.BufferEncoding}>, callback : (error ? : std.Error | null): void): void,   final ? :(this : readable-stream.readable-stream.Duplex, callback : (error ? : std.Error | null): void): void,   destroy ? :(this : readable-stream.readable-stream.Duplex, error : std.Error | null, callback : (error : std.Error | null): void): void} */
trait DuplexOptions extends js.Object {
  var allowHalfOpen: js.UndefOr[Boolean] = js.undefined
  var decodeStrings: js.UndefOr[Boolean] = js.undefined
  var defaultEncoding: js.UndefOr[BufferEncoding] = js.undefined
  var destroy: js.UndefOr[
    (js.ThisFunction2[
      /* this */ _Readable, 
      /* error */ Error | Null, 
      /* callback */ js.Function1[/* error */ Error | Null, Unit], 
      Unit
    ]) with (js.ThisFunction2[
      /* this */ Writable, 
      /* error */ Error | Null, 
      /* callback */ js.Function1[/* error */ Error | Null, Unit], 
      Unit
    ]) with (js.ThisFunction2[
      /* this */ Duplex, 
      /* error */ Error | Null, 
      /* callback */ js.Function1[/* error */ Error | Null, Unit], 
      Unit
    ])
  ] = js.undefined
  var encoding: js.UndefOr[BufferEncoding] = js.undefined
  var `final`: js.UndefOr[
    (js.ThisFunction1[
      /* this */ Writable, 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ]) with (js.ThisFunction1[
      /* this */ Duplex, 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ])
  ] = js.undefined
  var highWaterMark: js.UndefOr[Double] = js.undefined
  var objectMode: js.UndefOr[Boolean] = js.undefined
  var read: js.UndefOr[
    (js.ThisFunction1[/* this */ _Readable, /* size */ Double, Unit]) with (js.ThisFunction1[/* this */ Duplex, /* size */ Double, Unit])
  ] = js.undefined
  var readable: js.UndefOr[Boolean] = js.undefined
  var readableHighWaterMark: js.UndefOr[Double] = js.undefined
  var readableObjectMode: js.UndefOr[Boolean] = js.undefined
  var writable: js.UndefOr[Boolean] = js.undefined
  var writableHighWaterMark: js.UndefOr[Double] = js.undefined
  var writableObjectMode: js.UndefOr[Boolean] = js.undefined
  var write: js.UndefOr[
    (js.ThisFunction3[
      /* this */ Writable, 
      /* chunk */ js.Any, 
      /* encoding */ BufferEncoding, 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ]) with (js.ThisFunction3[
      /* this */ Duplex, 
      /* chunk */ js.Any, 
      /* encoding */ BufferEncoding, 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ])
  ] = js.undefined
  var writev: js.UndefOr[
    (js.ThisFunction2[
      /* this */ Writable, 
      /* chunk */ ArrayLike[Chunk], 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ]) with (js.ThisFunction2[
      /* this */ Duplex, 
      /* chunks */ js.Array[Chunk], 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ])
  ] = js.undefined
}

object DuplexOptions {
  @scala.inline
  def apply(
    allowHalfOpen: js.UndefOr[Boolean] = js.undefined,
    decodeStrings: js.UndefOr[Boolean] = js.undefined,
    defaultEncoding: BufferEncoding = null,
    destroy: (js.ThisFunction2[
      /* this */ _Readable, 
      /* error */ Error | Null, 
      /* callback */ js.Function1[/* error */ Error | Null, Unit], 
      Unit
    ]) with (js.ThisFunction2[
      /* this */ Writable, 
      /* error */ Error | Null, 
      /* callback */ js.Function1[/* error */ Error | Null, Unit], 
      Unit
    ]) with (js.ThisFunction2[
      /* this */ Duplex, 
      /* error */ Error | Null, 
      /* callback */ js.Function1[/* error */ Error | Null, Unit], 
      Unit
    ]) = null,
    encoding: BufferEncoding = null,
    `final`: (js.ThisFunction1[
      /* this */ Writable, 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ]) with (js.ThisFunction1[
      /* this */ Duplex, 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ]) = null,
    highWaterMark: js.UndefOr[Double] = js.undefined,
    objectMode: js.UndefOr[Boolean] = js.undefined,
    read: (js.ThisFunction1[/* this */ _Readable, /* size */ Double, Unit]) with (js.ThisFunction1[/* this */ Duplex, /* size */ Double, Unit]) = null,
    readable: js.UndefOr[Boolean] = js.undefined,
    readableHighWaterMark: js.UndefOr[Double] = js.undefined,
    readableObjectMode: js.UndefOr[Boolean] = js.undefined,
    writable: js.UndefOr[Boolean] = js.undefined,
    writableHighWaterMark: js.UndefOr[Double] = js.undefined,
    writableObjectMode: js.UndefOr[Boolean] = js.undefined,
    write: (js.ThisFunction3[
      /* this */ Writable, 
      /* chunk */ js.Any, 
      /* encoding */ BufferEncoding, 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ]) with (js.ThisFunction3[
      /* this */ Duplex, 
      /* chunk */ js.Any, 
      /* encoding */ BufferEncoding, 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ]) = null,
    writev: (js.ThisFunction2[
      /* this */ Writable, 
      /* chunk */ ArrayLike[Chunk], 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ]) with (js.ThisFunction2[
      /* this */ Duplex, 
      /* chunks */ js.Array[Chunk], 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ]) = null
  ): DuplexOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowHalfOpen)) __obj.updateDynamic("allowHalfOpen")(allowHalfOpen.get.asInstanceOf[js.Any])
    if (!js.isUndefined(decodeStrings)) __obj.updateDynamic("decodeStrings")(decodeStrings.get.asInstanceOf[js.Any])
    if (defaultEncoding != null) __obj.updateDynamic("defaultEncoding")(defaultEncoding.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(destroy.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (`final` != null) __obj.updateDynamic("final")(`final`.asInstanceOf[js.Any])
    if (!js.isUndefined(highWaterMark)) __obj.updateDynamic("highWaterMark")(highWaterMark.get.asInstanceOf[js.Any])
    if (!js.isUndefined(objectMode)) __obj.updateDynamic("objectMode")(objectMode.get.asInstanceOf[js.Any])
    if (read != null) __obj.updateDynamic("read")(read.asInstanceOf[js.Any])
    if (!js.isUndefined(readable)) __obj.updateDynamic("readable")(readable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(readableHighWaterMark)) __obj.updateDynamic("readableHighWaterMark")(readableHighWaterMark.get.asInstanceOf[js.Any])
    if (!js.isUndefined(readableObjectMode)) __obj.updateDynamic("readableObjectMode")(readableObjectMode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(writable)) __obj.updateDynamic("writable")(writable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(writableHighWaterMark)) __obj.updateDynamic("writableHighWaterMark")(writableHighWaterMark.get.asInstanceOf[js.Any])
    if (!js.isUndefined(writableObjectMode)) __obj.updateDynamic("writableObjectMode")(writableObjectMode.get.asInstanceOf[js.Any])
    if (write != null) __obj.updateDynamic("write")(write.asInstanceOf[js.Any])
    if (writev != null) __obj.updateDynamic("writev")(writev.asInstanceOf[js.Any])
    __obj.asInstanceOf[DuplexOptions]
  }
}

