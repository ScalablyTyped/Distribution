package typings
package simplecrawlerLib.streamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- simplecrawlerLib.streamMod.WritableOptions because var conflicts: highWaterMark, objectMode. Inlined decodeStrings, write, writev */ trait DuplexOptions extends ReadableOptions {
  var allowHalfOpen: js.UndefOr[scala.Boolean] = js.undefined
  var decodeStrings: js.UndefOr[scala.Boolean] = js.undefined
  var readableObjectMode: js.UndefOr[scala.Boolean] = js.undefined
  var writableObjectMode: js.UndefOr[scala.Boolean] = js.undefined
  var write: js.UndefOr[
    js.Function3[/* chunk */ js.Any, /* encoding */ java.lang.String, /* callback */ js.Function, _]
  ] = js.undefined
  var writev: js.UndefOr[
    js.Function2[/* chunks */ js.Array[simplecrawlerLib.Anon_Chunk], /* callback */ js.Function, _]
  ] = js.undefined
}

object DuplexOptions {
  @scala.inline
  def apply(
    allowHalfOpen: js.UndefOr[scala.Boolean] = js.undefined,
    decodeStrings: js.UndefOr[scala.Boolean] = js.undefined,
    encoding: java.lang.String = null,
    highWaterMark: scala.Int | scala.Double = null,
    objectMode: js.UndefOr[scala.Boolean] = js.undefined,
    read: js.ThisFunction1[/* this */ Readable, /* size */ js.UndefOr[scala.Double], _] = null,
    readableObjectMode: js.UndefOr[scala.Boolean] = js.undefined,
    writableObjectMode: js.UndefOr[scala.Boolean] = js.undefined,
    write: (/* chunk */ js.Any, /* encoding */ java.lang.String, /* callback */ js.Function) => _ = null,
    writev: (/* chunks */ js.Array[simplecrawlerLib.Anon_Chunk], /* callback */ js.Function) => _ = null
  ): DuplexOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowHalfOpen)) __obj.updateDynamic("allowHalfOpen")(allowHalfOpen)
    if (!js.isUndefined(decodeStrings)) __obj.updateDynamic("decodeStrings")(decodeStrings)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (highWaterMark != null) __obj.updateDynamic("highWaterMark")(highWaterMark.asInstanceOf[js.Any])
    if (!js.isUndefined(objectMode)) __obj.updateDynamic("objectMode")(objectMode)
    if (read != null) __obj.updateDynamic("read")(read)
    if (!js.isUndefined(readableObjectMode)) __obj.updateDynamic("readableObjectMode")(readableObjectMode)
    if (!js.isUndefined(writableObjectMode)) __obj.updateDynamic("writableObjectMode")(writableObjectMode)
    if (write != null) __obj.updateDynamic("write")(js.Any.fromFunction3(write))
    if (writev != null) __obj.updateDynamic("writev")(js.Any.fromFunction2(writev))
    __obj.asInstanceOf[DuplexOptions]
  }
}

