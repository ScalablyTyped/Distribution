package typings
package streamDashBuffersLib.streamDashBuffersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WritableStreamBufferOptions
  extends nodeLib.streamMod.internalNs.WritableOptions {
  var incrementAmount: js.UndefOr[scala.Double] = js.undefined
  var initialSize: js.UndefOr[scala.Double] = js.undefined
}

object WritableStreamBufferOptions {
  @scala.inline
  def apply(
    decodeStrings: js.UndefOr[scala.Boolean] = js.undefined,
    destroy: js.ThisFunction2[
      /* this */ nodeLib.streamMod.internalNs.Writable, 
      /* error */ nodeLib.Error | scala.Null, 
      /* callback */ js.Function1[/* error */ nodeLib.Error | scala.Null, scala.Unit], 
      scala.Unit
    ] = null,
    `final`: js.ThisFunction1[
      /* this */ nodeLib.streamMod.internalNs.Writable, 
      /* callback */ js.Function1[/* error */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit], 
      scala.Unit
    ] = null,
    highWaterMark: scala.Int | scala.Double = null,
    incrementAmount: scala.Int | scala.Double = null,
    initialSize: scala.Int | scala.Double = null,
    objectMode: js.UndefOr[scala.Boolean] = js.undefined,
    write: js.ThisFunction3[
      /* this */ nodeLib.streamMod.internalNs.Writable, 
      /* chunk */ js.Any, 
      /* encoding */ java.lang.String, 
      /* callback */ js.Function1[/* error */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit], 
      scala.Unit
    ] = null,
    writev: js.ThisFunction2[
      /* this */ nodeLib.streamMod.internalNs.Writable, 
      /* chunks */ js.Array[nodeLib.Anon_Chunk], 
      /* callback */ js.Function1[/* error */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit], 
      scala.Unit
    ] = null
  ): WritableStreamBufferOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(decodeStrings)) __obj.updateDynamic("decodeStrings")(decodeStrings)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (`final` != null) __obj.updateDynamic("final")(`final`)
    if (highWaterMark != null) __obj.updateDynamic("highWaterMark")(highWaterMark.asInstanceOf[js.Any])
    if (incrementAmount != null) __obj.updateDynamic("incrementAmount")(incrementAmount.asInstanceOf[js.Any])
    if (initialSize != null) __obj.updateDynamic("initialSize")(initialSize.asInstanceOf[js.Any])
    if (!js.isUndefined(objectMode)) __obj.updateDynamic("objectMode")(objectMode)
    if (write != null) __obj.updateDynamic("write")(write)
    if (writev != null) __obj.updateDynamic("writev")(writev)
    __obj.asInstanceOf[WritableStreamBufferOptions]
  }
}

