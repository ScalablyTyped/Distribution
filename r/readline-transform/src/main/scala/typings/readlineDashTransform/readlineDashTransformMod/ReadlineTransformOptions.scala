package typings.readlineDashTransform.readlineDashTransformMod

import typings.node.Anon_Chunk
import typings.node.Error
import typings.node.streamMod.Duplex
import typings.node.streamMod.Readable
import typings.node.streamMod.Transform
import typings.node.streamMod.TransformCallback
import typings.node.streamMod.TransformOptions
import typings.node.streamMod.Writable
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadlineTransformOptions extends TransformOptions {
  /** line break matcher for str.split() (default: /\r?\n/) */
  var breakMatcher: js.UndefOr[RegExp] = js.undefined
  /** if content ends with line break, ignore last empty line (default: true) */
  var ignoreEndOfBreak: js.UndefOr[Boolean] = js.undefined
  /** if line is empty string, skip it (default: false) */
  var skipEmpty: js.UndefOr[Boolean] = js.undefined
}

object ReadlineTransformOptions {
  @scala.inline
  def apply(
    allowHalfOpen: js.UndefOr[Boolean] = js.undefined,
    autoDestroy: js.UndefOr[Boolean] = js.undefined,
    breakMatcher: RegExp = null,
    decodeStrings: js.UndefOr[Boolean] = js.undefined,
    defaultEncoding: String = null,
    destroy: js.ThisFunction2[
      /* this */ Readable, 
      /* error */ Error | Null, 
      /* callback */ js.Function1[/* error */ Error | Null, Unit], 
      Unit
    ] = null,
    destroy_DuplexOptions: js.ThisFunction2[
      /* this */ Duplex, 
      /* error */ Error | Null, 
      /* callback */ js.Function1[/* error */ Error | Null, Unit], 
      Unit
    ] = null,
    destroy_TransformOptions: js.ThisFunction2[
      /* this */ Transform, 
      /* error */ Error | Null, 
      /* callback */ js.Function1[/* error */ Error | Null, Unit], 
      Unit
    ] = null,
    emitClose: js.UndefOr[Boolean] = js.undefined,
    encoding: String = null,
    `final`: js.ThisFunction1[
      (/* this */ Duplex) | (/* this */ Writable), 
      /* callback */ js.Function1[js.UndefOr[Error | Null], Unit], 
      Unit
    ] = null,
    final_TransformOptions: js.ThisFunction1[
      /* this */ Transform, 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ] = null,
    flush: js.ThisFunction1[/* this */ Transform, /* callback */ TransformCallback, Unit] = null,
    highWaterMark: Int | Double = null,
    ignoreEndOfBreak: js.UndefOr[Boolean] = js.undefined,
    objectMode: js.UndefOr[Boolean] = js.undefined,
    read: js.ThisFunction1[/* this */ Readable, /* size */ Double, Unit] = null,
    read_DuplexOptions: js.ThisFunction1[/* this */ Duplex, /* size */ Double, Unit] = null,
    read_TransformOptions: js.ThisFunction1[/* this */ Transform, /* size */ Double, Unit] = null,
    readableObjectMode: js.UndefOr[Boolean] = js.undefined,
    skipEmpty: js.UndefOr[Boolean] = js.undefined,
    transform: js.ThisFunction3[
      /* this */ Transform, 
      /* chunk */ js.Any, 
      /* encoding */ String, 
      /* callback */ TransformCallback, 
      Unit
    ] = null,
    writableObjectMode: js.UndefOr[Boolean] = js.undefined,
    write: js.ThisFunction3[
      (/* this */ Duplex) | (/* this */ Writable), 
      /* chunk */ js.Any, 
      /* encoding */ String, 
      /* callback */ js.Function1[js.UndefOr[Error | Null], Unit], 
      Unit
    ] = null,
    write_TransformOptions: js.ThisFunction3[
      /* this */ Transform, 
      /* chunk */ js.Any, 
      /* encoding */ String, 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ] = null,
    writev: js.ThisFunction2[
      (/* this */ Duplex) | (/* this */ Writable), 
      /* chunks */ js.Array[Anon_Chunk], 
      /* callback */ js.Function1[js.UndefOr[Error | Null], Unit], 
      Unit
    ] = null,
    writev_TransformOptions: js.ThisFunction2[
      /* this */ Transform, 
      /* chunks */ js.Array[Anon_Chunk], 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ] = null
  ): ReadlineTransformOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowHalfOpen)) __obj.updateDynamic("allowHalfOpen")(allowHalfOpen)
    if (!js.isUndefined(autoDestroy)) __obj.updateDynamic("autoDestroy")(autoDestroy)
    if (breakMatcher != null) __obj.updateDynamic("breakMatcher")(breakMatcher)
    if (!js.isUndefined(decodeStrings)) __obj.updateDynamic("decodeStrings")(decodeStrings)
    if (defaultEncoding != null) __obj.updateDynamic("defaultEncoding")(defaultEncoding)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (destroy_DuplexOptions != null) __obj.updateDynamic("destroy")(destroy_DuplexOptions)
    if (destroy_TransformOptions != null) __obj.updateDynamic("destroy")(destroy_TransformOptions)
    if (!js.isUndefined(emitClose)) __obj.updateDynamic("emitClose")(emitClose)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (`final` != null) __obj.updateDynamic("final")(`final`)
    if (final_TransformOptions != null) __obj.updateDynamic("final")(final_TransformOptions)
    if (flush != null) __obj.updateDynamic("flush")(flush)
    if (highWaterMark != null) __obj.updateDynamic("highWaterMark")(highWaterMark.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreEndOfBreak)) __obj.updateDynamic("ignoreEndOfBreak")(ignoreEndOfBreak)
    if (!js.isUndefined(objectMode)) __obj.updateDynamic("objectMode")(objectMode)
    if (read != null) __obj.updateDynamic("read")(read)
    if (read_DuplexOptions != null) __obj.updateDynamic("read")(read_DuplexOptions)
    if (read_TransformOptions != null) __obj.updateDynamic("read")(read_TransformOptions)
    if (!js.isUndefined(readableObjectMode)) __obj.updateDynamic("readableObjectMode")(readableObjectMode)
    if (!js.isUndefined(skipEmpty)) __obj.updateDynamic("skipEmpty")(skipEmpty)
    if (transform != null) __obj.updateDynamic("transform")(transform)
    if (!js.isUndefined(writableObjectMode)) __obj.updateDynamic("writableObjectMode")(writableObjectMode)
    if (write != null) __obj.updateDynamic("write")(write)
    if (write_TransformOptions != null) __obj.updateDynamic("write")(write_TransformOptions)
    if (writev != null) __obj.updateDynamic("writev")(writev)
    if (writev_TransformOptions != null) __obj.updateDynamic("writev")(writev_TransformOptions)
    __obj.asInstanceOf[ReadlineTransformOptions]
  }
}

