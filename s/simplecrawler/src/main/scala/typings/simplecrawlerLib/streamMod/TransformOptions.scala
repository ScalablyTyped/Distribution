package typings
package simplecrawlerLib.streamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformOptions extends DuplexOptions {
  var flush: js.UndefOr[js.Function1[/* callback */ js.Function, _]] = js.undefined
  var transform: js.UndefOr[
    js.Function3[
      /* chunk */ java.lang.String | simplecrawlerLib.Buffer, 
      /* encoding */ java.lang.String, 
      /* callback */ js.Function, 
      _
    ]
  ] = js.undefined
}

object TransformOptions {
  @scala.inline
  def apply(
    allowHalfOpen: js.UndefOr[scala.Boolean] = js.undefined,
    decodeStrings: js.UndefOr[scala.Boolean] = js.undefined,
    encoding: java.lang.String = null,
    flush: /* callback */ js.Function => _ = null,
    highWaterMark: scala.Int | scala.Double = null,
    objectMode: js.UndefOr[scala.Boolean] = js.undefined,
    read: js.ThisFunction1[/* this */ Readable, /* size */ js.UndefOr[scala.Double], _] = null,
    readableObjectMode: js.UndefOr[scala.Boolean] = js.undefined,
    transform: (/* chunk */ java.lang.String | simplecrawlerLib.Buffer, /* encoding */ java.lang.String, /* callback */ js.Function) => _ = null,
    writableObjectMode: js.UndefOr[scala.Boolean] = js.undefined,
    write: (/* chunk */ js.Any, /* encoding */ java.lang.String, /* callback */ js.Function) => _ = null,
    writev: (/* chunks */ js.Array[simplecrawlerLib.Anon_Chunk], /* callback */ js.Function) => _ = null
  ): TransformOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowHalfOpen)) __obj.updateDynamic("allowHalfOpen")(allowHalfOpen)
    if (!js.isUndefined(decodeStrings)) __obj.updateDynamic("decodeStrings")(decodeStrings)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (flush != null) __obj.updateDynamic("flush")(js.Any.fromFunction1(flush))
    if (highWaterMark != null) __obj.updateDynamic("highWaterMark")(highWaterMark.asInstanceOf[js.Any])
    if (!js.isUndefined(objectMode)) __obj.updateDynamic("objectMode")(objectMode)
    if (read != null) __obj.updateDynamic("read")(read)
    if (!js.isUndefined(readableObjectMode)) __obj.updateDynamic("readableObjectMode")(readableObjectMode)
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction3(transform))
    if (!js.isUndefined(writableObjectMode)) __obj.updateDynamic("writableObjectMode")(writableObjectMode)
    if (write != null) __obj.updateDynamic("write")(js.Any.fromFunction3(write))
    if (writev != null) __obj.updateDynamic("writev")(js.Any.fromFunction2(writev))
    __obj.asInstanceOf[TransformOptions]
  }
}

