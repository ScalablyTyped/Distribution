package typings
package streamDashBuffersLib.streamDashBuffersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadableStreamBufferOptions
  extends nodeLib.streamMod.internalNs.ReadableOptions {
  var chunkSize: js.UndefOr[scala.Double] = js.undefined
  var frequency: js.UndefOr[scala.Double] = js.undefined
  var incrementAmount: js.UndefOr[scala.Double] = js.undefined
  var initialSize: js.UndefOr[scala.Double] = js.undefined
}

object ReadableStreamBufferOptions {
  @scala.inline
  def apply(
    autoDestroy: js.UndefOr[scala.Boolean] = js.undefined,
    chunkSize: scala.Int | scala.Double = null,
    destroy: js.ThisFunction2[
      /* this */ nodeLib.streamMod.internalNs.Readable, 
      /* error */ nodeLib.Error | scala.Null, 
      /* callback */ js.Function1[/* error */ nodeLib.Error | scala.Null, scala.Unit], 
      scala.Unit
    ] = null,
    encoding: java.lang.String = null,
    frequency: scala.Int | scala.Double = null,
    highWaterMark: scala.Int | scala.Double = null,
    incrementAmount: scala.Int | scala.Double = null,
    initialSize: scala.Int | scala.Double = null,
    objectMode: js.UndefOr[scala.Boolean] = js.undefined,
    read: js.ThisFunction1[
      /* this */ nodeLib.streamMod.internalNs.Readable, 
      /* size */ scala.Double, 
      scala.Unit
    ] = null
  ): ReadableStreamBufferOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoDestroy)) __obj.updateDynamic("autoDestroy")(autoDestroy)
    if (chunkSize != null) __obj.updateDynamic("chunkSize")(chunkSize.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (frequency != null) __obj.updateDynamic("frequency")(frequency.asInstanceOf[js.Any])
    if (highWaterMark != null) __obj.updateDynamic("highWaterMark")(highWaterMark.asInstanceOf[js.Any])
    if (incrementAmount != null) __obj.updateDynamic("incrementAmount")(incrementAmount.asInstanceOf[js.Any])
    if (initialSize != null) __obj.updateDynamic("initialSize")(initialSize.asInstanceOf[js.Any])
    if (!js.isUndefined(objectMode)) __obj.updateDynamic("objectMode")(objectMode)
    if (read != null) __obj.updateDynamic("read")(read)
    __obj.asInstanceOf[ReadableStreamBufferOptions]
  }
}

