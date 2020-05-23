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
trait Options extends js.Object {
  var allowHalfOpen: js.UndefOr[Boolean] = js.undefined
  var autoDestroy: js.UndefOr[Boolean] = js.undefined
  var closer: js.UndefOr[String] = js.undefined
  var decodeStrings: js.UndefOr[Boolean] = js.undefined
  var defaultencoding: js.UndefOr[BufferEncoding] = js.undefined
  var destroy: js.UndefOr[
    js.ThisFunction2[
      /* this */ Transform, 
      /* error */ Error | Null, 
      /* callback */ js.Function1[/* error */ Error | Null, Unit], 
      Unit
    ]
  ] = js.undefined
  var emitClose: js.UndefOr[Boolean] = js.undefined
  var encoding: js.UndefOr[BufferEncoding] = js.undefined
  var `final`: js.UndefOr[
    js.ThisFunction1[
      /* this */ Transform, 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ]
  ] = js.undefined
  var flush: js.UndefOr[js.ThisFunction1[/* this */ Transform, /* callback */ TransformCallback, Unit]] = js.undefined
  var highWaterMark: js.UndefOr[Double] = js.undefined
  var objectMode: js.UndefOr[Boolean] = js.undefined
  var opener: js.UndefOr[String] = js.undefined
  var read: js.UndefOr[js.ThisFunction1[/* this */ Transform, /* size */ Double, Unit]] = js.undefined
  var readableHighWaterMark: js.UndefOr[Double] = js.undefined
  var readableObjectMode: js.UndefOr[Boolean] = js.undefined
  var replacer: js.UndefOr[Replacer] = js.undefined
  var seperator: js.UndefOr[String] = js.undefined
  var space: js.UndefOr[String | Double] = js.undefined
  var stringifier: js.UndefOr[
    js.Function3[/* value */ js.Any, /* replacer */ Replacer, /* space */ String | Double, String]
  ] = js.undefined
  var transform: js.UndefOr[
    js.ThisFunction3[
      /* this */ Transform, 
      /* chunk */ js.Any, 
      /* encoding */ BufferEncoding, 
      /* callback */ TransformCallback, 
      Unit
    ]
  ] = js.undefined
  var writableCorked: js.UndefOr[Double] = js.undefined
  var writableHighWaterMark: js.UndefOr[Double] = js.undefined
  var writableObjectMode: js.UndefOr[Boolean] = js.undefined
  var write: js.UndefOr[
    js.ThisFunction3[
      /* this */ Transform, 
      /* chunk */ js.Any, 
      /* encoding */ BufferEncoding, 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ]
  ] = js.undefined
  var writev: js.UndefOr[
    js.ThisFunction2[
      /* this */ Transform, 
      /* chunks */ js.Array[Chunk], 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ]
  ] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    allowHalfOpen: js.UndefOr[Boolean] = js.undefined,
    autoDestroy: js.UndefOr[Boolean] = js.undefined,
    closer: String = null,
    decodeStrings: js.UndefOr[Boolean] = js.undefined,
    defaultencoding: BufferEncoding = null,
    destroy: js.ThisFunction2[
      /* this */ Transform, 
      /* error */ Error | Null, 
      /* callback */ js.Function1[/* error */ Error | Null, Unit], 
      Unit
    ] = null,
    emitClose: js.UndefOr[Boolean] = js.undefined,
    encoding: BufferEncoding = null,
    `final`: js.ThisFunction1[
      /* this */ Transform, 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ] = null,
    flush: js.ThisFunction1[/* this */ Transform, /* callback */ TransformCallback, Unit] = null,
    highWaterMark: js.UndefOr[Double] = js.undefined,
    objectMode: js.UndefOr[Boolean] = js.undefined,
    opener: String = null,
    read: js.ThisFunction1[/* this */ Transform, /* size */ Double, Unit] = null,
    readableHighWaterMark: js.UndefOr[Double] = js.undefined,
    readableObjectMode: js.UndefOr[Boolean] = js.undefined,
    replacer: (/* key */ String, /* value */ js.Any) => js.Any = null,
    seperator: String = null,
    space: String | Double = null,
    stringifier: (/* value */ js.Any, /* replacer */ Replacer, /* space */ String | Double) => String = null,
    transform: js.ThisFunction3[
      /* this */ Transform, 
      /* chunk */ js.Any, 
      /* encoding */ BufferEncoding, 
      /* callback */ TransformCallback, 
      Unit
    ] = null,
    writableCorked: js.UndefOr[Double] = js.undefined,
    writableHighWaterMark: js.UndefOr[Double] = js.undefined,
    writableObjectMode: js.UndefOr[Boolean] = js.undefined,
    write: js.ThisFunction3[
      /* this */ Transform, 
      /* chunk */ js.Any, 
      /* encoding */ BufferEncoding, 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ] = null,
    writev: js.ThisFunction2[
      /* this */ Transform, 
      /* chunks */ js.Array[Chunk], 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowHalfOpen)) __obj.updateDynamic("allowHalfOpen")(allowHalfOpen.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoDestroy)) __obj.updateDynamic("autoDestroy")(autoDestroy.get.asInstanceOf[js.Any])
    if (closer != null) __obj.updateDynamic("closer")(closer.asInstanceOf[js.Any])
    if (!js.isUndefined(decodeStrings)) __obj.updateDynamic("decodeStrings")(decodeStrings.get.asInstanceOf[js.Any])
    if (defaultencoding != null) __obj.updateDynamic("defaultencoding")(defaultencoding.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(destroy.asInstanceOf[js.Any])
    if (!js.isUndefined(emitClose)) __obj.updateDynamic("emitClose")(emitClose.get.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (`final` != null) __obj.updateDynamic("final")(`final`.asInstanceOf[js.Any])
    if (flush != null) __obj.updateDynamic("flush")(flush.asInstanceOf[js.Any])
    if (!js.isUndefined(highWaterMark)) __obj.updateDynamic("highWaterMark")(highWaterMark.get.asInstanceOf[js.Any])
    if (!js.isUndefined(objectMode)) __obj.updateDynamic("objectMode")(objectMode.get.asInstanceOf[js.Any])
    if (opener != null) __obj.updateDynamic("opener")(opener.asInstanceOf[js.Any])
    if (read != null) __obj.updateDynamic("read")(read.asInstanceOf[js.Any])
    if (!js.isUndefined(readableHighWaterMark)) __obj.updateDynamic("readableHighWaterMark")(readableHighWaterMark.get.asInstanceOf[js.Any])
    if (!js.isUndefined(readableObjectMode)) __obj.updateDynamic("readableObjectMode")(readableObjectMode.get.asInstanceOf[js.Any])
    if (replacer != null) __obj.updateDynamic("replacer")(js.Any.fromFunction2(replacer))
    if (seperator != null) __obj.updateDynamic("seperator")(seperator.asInstanceOf[js.Any])
    if (space != null) __obj.updateDynamic("space")(space.asInstanceOf[js.Any])
    if (stringifier != null) __obj.updateDynamic("stringifier")(js.Any.fromFunction3(stringifier))
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (!js.isUndefined(writableCorked)) __obj.updateDynamic("writableCorked")(writableCorked.get.asInstanceOf[js.Any])
    if (!js.isUndefined(writableHighWaterMark)) __obj.updateDynamic("writableHighWaterMark")(writableHighWaterMark.get.asInstanceOf[js.Any])
    if (!js.isUndefined(writableObjectMode)) __obj.updateDynamic("writableObjectMode")(writableObjectMode.get.asInstanceOf[js.Any])
    if (write != null) __obj.updateDynamic("write")(write.asInstanceOf[js.Any])
    if (writev != null) __obj.updateDynamic("writev")(writev.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

