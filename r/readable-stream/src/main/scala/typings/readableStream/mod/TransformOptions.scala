package typings.readableStream.mod

import typings.readableStream.AnonChunk
import typings.std.ArrayLike
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ==== _stream_transform ====
/* Inlined readable-stream.readable-stream.DuplexOptions & {  read ? :(this : readable-stream.readable-stream.Transform, size : number): void,   write ? :(this : readable-stream.readable-stream.Transform, chunk : any, encoding : string, callback : (error ? : std.Error | null): void): void,   writev ? :(this : readable-stream.readable-stream.Transform, chunks : std.Array<{  chunk  :any,   encoding  :string}>, callback : (error ? : std.Error | null): void): void,   final ? :(this : readable-stream.readable-stream.Transform, callback : (error ? : std.Error | null): void): void,   destroy ? :(this : readable-stream.readable-stream.Transform, error : std.Error | null, callback : (error : std.Error | null): void): void,   transform ? :(this : readable-stream.readable-stream.Transform, chunk : any, encoding : string, callback : (error ? : std.Error, data ? : any): void): void,   flush ? :(this : readable-stream.readable-stream.Transform, callback : (er : any, data : any): void): void} */
trait TransformOptions extends js.Object {
  var allowHalfOpen: js.UndefOr[Boolean] = js.undefined
  var decodeStrings: js.UndefOr[Boolean] = js.undefined
  var defaultEncoding: js.UndefOr[String] = js.undefined
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
    ]) with (js.ThisFunction2[
      /* this */ Transform, 
      /* error */ Error | Null, 
      /* callback */ js.Function1[/* error */ Error | Null, Unit], 
      Unit
    ])
  ] = js.undefined
  var encoding: js.UndefOr[String] = js.undefined
  var `final`: js.UndefOr[
    (js.ThisFunction1[
      /* this */ Writable, 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ]) with (js.ThisFunction1[
      /* this */ Duplex, 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ]) with (js.ThisFunction1[
      /* this */ Transform, 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ])
  ] = js.undefined
  var flush: js.UndefOr[
    js.ThisFunction1[
      /* this */ Transform, 
      /* callback */ js.Function2[/* er */ js.Any, /* data */ js.Any, Unit], 
      Unit
    ]
  ] = js.undefined
  var highWaterMark: js.UndefOr[Double] = js.undefined
  var objectMode: js.UndefOr[Boolean] = js.undefined
  var read: js.UndefOr[
    (js.ThisFunction1[/* this */ _Readable, /* size */ Double, Unit]) with (js.ThisFunction1[/* this */ Duplex, /* size */ Double, Unit]) with (js.ThisFunction1[/* this */ Transform, /* size */ Double, Unit])
  ] = js.undefined
  var readable: js.UndefOr[Boolean] = js.undefined
  var readableHighWaterMark: js.UndefOr[Double] = js.undefined
  var readableObjectMode: js.UndefOr[Boolean] = js.undefined
  var transform: js.UndefOr[
    js.ThisFunction3[
      /* this */ Transform, 
      /* chunk */ js.Any, 
      /* encoding */ String, 
      /* callback */ js.Function2[/* error */ js.UndefOr[Error], /* data */ js.UndefOr[js.Any], Unit], 
      Unit
    ]
  ] = js.undefined
  var writable: js.UndefOr[Boolean] = js.undefined
  var writableHighWaterMark: js.UndefOr[Double] = js.undefined
  var writableObjectMode: js.UndefOr[Boolean] = js.undefined
  var write: js.UndefOr[
    (js.ThisFunction3[
      /* this */ Writable, 
      /* chunk */ js.Any, 
      /* encoding */ String, 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ]) with (js.ThisFunction3[
      /* this */ Duplex, 
      /* chunk */ js.Any, 
      /* encoding */ String, 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ]) with (js.ThisFunction3[
      /* this */ Transform, 
      /* chunk */ js.Any, 
      /* encoding */ String, 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ])
  ] = js.undefined
  var writev: js.UndefOr[
    (js.ThisFunction2[
      /* this */ Writable, 
      /* chunk */ ArrayLike[AnonChunk], 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ]) with (js.ThisFunction2[
      /* this */ Duplex, 
      /* chunks */ js.Array[AnonChunk], 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ]) with (js.ThisFunction2[
      /* this */ Transform, 
      /* chunks */ js.Array[AnonChunk], 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ])
  ] = js.undefined
}

object TransformOptions {
  @scala.inline
  def apply(
    allowHalfOpen: js.UndefOr[Boolean] = js.undefined,
    decodeStrings: js.UndefOr[Boolean] = js.undefined,
    defaultEncoding: String = null,
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
    ]) with (js.ThisFunction2[
      /* this */ Transform, 
      /* error */ Error | Null, 
      /* callback */ js.Function1[/* error */ Error | Null, Unit], 
      Unit
    ]) = null,
    encoding: String = null,
    `final`: (js.ThisFunction1[
      /* this */ Writable, 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ]) with (js.ThisFunction1[
      /* this */ Duplex, 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ]) with (js.ThisFunction1[
      /* this */ Transform, 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ]) = null,
    flush: js.ThisFunction1[
      /* this */ Transform, 
      /* callback */ js.Function2[/* er */ js.Any, /* data */ js.Any, Unit], 
      Unit
    ] = null,
    highWaterMark: Int | Double = null,
    objectMode: js.UndefOr[Boolean] = js.undefined,
    read: (js.ThisFunction1[/* this */ _Readable, /* size */ Double, Unit]) with (js.ThisFunction1[/* this */ Duplex, /* size */ Double, Unit]) with (js.ThisFunction1[/* this */ Transform, /* size */ Double, Unit]) = null,
    readable: js.UndefOr[Boolean] = js.undefined,
    readableHighWaterMark: Int | Double = null,
    readableObjectMode: js.UndefOr[Boolean] = js.undefined,
    transform: js.ThisFunction3[
      /* this */ Transform, 
      /* chunk */ js.Any, 
      /* encoding */ String, 
      /* callback */ js.Function2[/* error */ js.UndefOr[Error], /* data */ js.UndefOr[js.Any], Unit], 
      Unit
    ] = null,
    writable: js.UndefOr[Boolean] = js.undefined,
    writableHighWaterMark: Int | Double = null,
    writableObjectMode: js.UndefOr[Boolean] = js.undefined,
    write: (js.ThisFunction3[
      /* this */ Writable, 
      /* chunk */ js.Any, 
      /* encoding */ String, 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ]) with (js.ThisFunction3[
      /* this */ Duplex, 
      /* chunk */ js.Any, 
      /* encoding */ String, 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ]) with (js.ThisFunction3[
      /* this */ Transform, 
      /* chunk */ js.Any, 
      /* encoding */ String, 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ]) = null,
    writev: (js.ThisFunction2[
      /* this */ Writable, 
      /* chunk */ ArrayLike[AnonChunk], 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ]) with (js.ThisFunction2[
      /* this */ Duplex, 
      /* chunks */ js.Array[AnonChunk], 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ]) with (js.ThisFunction2[
      /* this */ Transform, 
      /* chunks */ js.Array[AnonChunk], 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ]) = null
  ): TransformOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowHalfOpen)) __obj.updateDynamic("allowHalfOpen")(allowHalfOpen.asInstanceOf[js.Any])
    if (!js.isUndefined(decodeStrings)) __obj.updateDynamic("decodeStrings")(decodeStrings.asInstanceOf[js.Any])
    if (defaultEncoding != null) __obj.updateDynamic("defaultEncoding")(defaultEncoding.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(destroy.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (`final` != null) __obj.updateDynamic("final")(`final`.asInstanceOf[js.Any])
    if (flush != null) __obj.updateDynamic("flush")(flush.asInstanceOf[js.Any])
    if (highWaterMark != null) __obj.updateDynamic("highWaterMark")(highWaterMark.asInstanceOf[js.Any])
    if (!js.isUndefined(objectMode)) __obj.updateDynamic("objectMode")(objectMode.asInstanceOf[js.Any])
    if (read != null) __obj.updateDynamic("read")(read.asInstanceOf[js.Any])
    if (!js.isUndefined(readable)) __obj.updateDynamic("readable")(readable.asInstanceOf[js.Any])
    if (readableHighWaterMark != null) __obj.updateDynamic("readableHighWaterMark")(readableHighWaterMark.asInstanceOf[js.Any])
    if (!js.isUndefined(readableObjectMode)) __obj.updateDynamic("readableObjectMode")(readableObjectMode.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (!js.isUndefined(writable)) __obj.updateDynamic("writable")(writable.asInstanceOf[js.Any])
    if (writableHighWaterMark != null) __obj.updateDynamic("writableHighWaterMark")(writableHighWaterMark.asInstanceOf[js.Any])
    if (!js.isUndefined(writableObjectMode)) __obj.updateDynamic("writableObjectMode")(writableObjectMode.asInstanceOf[js.Any])
    if (write != null) __obj.updateDynamic("write")(write.asInstanceOf[js.Any])
    if (writev != null) __obj.updateDynamic("writev")(writev.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformOptions]
  }
}

