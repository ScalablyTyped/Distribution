package typings.readableStream.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined readable-stream.readable-stream.ReadableStateOptions & {  read ? :(this : readable-stream.readable-stream._Readable, size : number): void,   destroy ? :(this : readable-stream.readable-stream._Readable, error : std.Error | null, callback : (error : std.Error | null): void): void} */
trait ReadableOptions extends js.Object {
  var defaultEncoding: js.UndefOr[String] = js.undefined
  var destroy: js.UndefOr[
    js.ThisFunction2[
      /* this */ _Readable, 
      /* error */ Error | Null, 
      /* callback */ js.Function1[/* error */ Error | Null, Unit], 
      Unit
    ]
  ] = js.undefined
  var encoding: js.UndefOr[String] = js.undefined
  var highWaterMark: js.UndefOr[Double] = js.undefined
  var objectMode: js.UndefOr[Boolean] = js.undefined
  var read: js.UndefOr[js.ThisFunction1[/* this */ _Readable, /* size */ Double, Unit]] = js.undefined
  var readableHighWaterMark: js.UndefOr[Double] = js.undefined
  var readableObjectMode: js.UndefOr[Boolean] = js.undefined
}

object ReadableOptions {
  @scala.inline
  def apply(
    defaultEncoding: String = null,
    destroy: js.ThisFunction2[
      /* this */ _Readable, 
      /* error */ Error | Null, 
      /* callback */ js.Function1[/* error */ Error | Null, Unit], 
      Unit
    ] = null,
    encoding: String = null,
    highWaterMark: Int | Double = null,
    objectMode: js.UndefOr[Boolean] = js.undefined,
    read: js.ThisFunction1[/* this */ _Readable, /* size */ Double, Unit] = null,
    readableHighWaterMark: Int | Double = null,
    readableObjectMode: js.UndefOr[Boolean] = js.undefined
  ): ReadableOptions = {
    val __obj = js.Dynamic.literal()
    if (defaultEncoding != null) __obj.updateDynamic("defaultEncoding")(defaultEncoding.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(destroy.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (highWaterMark != null) __obj.updateDynamic("highWaterMark")(highWaterMark.asInstanceOf[js.Any])
    if (!js.isUndefined(objectMode)) __obj.updateDynamic("objectMode")(objectMode.asInstanceOf[js.Any])
    if (read != null) __obj.updateDynamic("read")(read.asInstanceOf[js.Any])
    if (readableHighWaterMark != null) __obj.updateDynamic("readableHighWaterMark")(readableHighWaterMark.asInstanceOf[js.Any])
    if (!js.isUndefined(readableObjectMode)) __obj.updateDynamic("readableObjectMode")(readableObjectMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadableOptions]
  }
}

