package typings
package simplecrawlerLib.streamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WritableOptions extends js.Object {
  var decodeStrings: js.UndefOr[scala.Boolean] = js.undefined
  var highWaterMark: js.UndefOr[scala.Double] = js.undefined
  var objectMode: js.UndefOr[scala.Boolean] = js.undefined
  var write: js.UndefOr[
    js.Function3[/* chunk */ js.Any, /* encoding */ java.lang.String, /* callback */ js.Function, _]
  ] = js.undefined
  var writev: js.UndefOr[
    js.Function2[/* chunks */ js.Array[simplecrawlerLib.Anon_Chunk], /* callback */ js.Function, _]
  ] = js.undefined
}

object WritableOptions {
  @scala.inline
  def apply(
    decodeStrings: js.UndefOr[scala.Boolean] = js.undefined,
    highWaterMark: scala.Int | scala.Double = null,
    objectMode: js.UndefOr[scala.Boolean] = js.undefined,
    write: (/* chunk */ js.Any, /* encoding */ java.lang.String, /* callback */ js.Function) => _ = null,
    writev: (/* chunks */ js.Array[simplecrawlerLib.Anon_Chunk], /* callback */ js.Function) => _ = null
  ): WritableOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(decodeStrings)) __obj.updateDynamic("decodeStrings")(decodeStrings)
    if (highWaterMark != null) __obj.updateDynamic("highWaterMark")(highWaterMark.asInstanceOf[js.Any])
    if (!js.isUndefined(objectMode)) __obj.updateDynamic("objectMode")(objectMode)
    if (write != null) __obj.updateDynamic("write")(js.Any.fromFunction3(write))
    if (writev != null) __obj.updateDynamic("writev")(js.Any.fromFunction2(writev))
    __obj.asInstanceOf[WritableOptions]
  }
}

