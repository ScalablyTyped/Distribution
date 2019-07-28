package typings.streamDashBuffers.streamDashBuffersMod

import typings.node.Error
import typings.node.streamMod.Readable
import typings.node.streamMod.ReadableOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadableStreamBufferOptions extends ReadableOptions {
  var chunkSize: js.UndefOr[Double] = js.undefined
  var frequency: js.UndefOr[Double] = js.undefined
  var incrementAmount: js.UndefOr[Double] = js.undefined
  var initialSize: js.UndefOr[Double] = js.undefined
}

object ReadableStreamBufferOptions {
  @scala.inline
  def apply(
    autoDestroy: js.UndefOr[Boolean] = js.undefined,
    chunkSize: Int | Double = null,
    destroy: js.ThisFunction2[
      /* this */ Readable, 
      /* error */ Error | Null, 
      /* callback */ js.Function1[/* error */ Error | Null, Unit], 
      Unit
    ] = null,
    encoding: String = null,
    frequency: Int | Double = null,
    highWaterMark: Int | Double = null,
    incrementAmount: Int | Double = null,
    initialSize: Int | Double = null,
    objectMode: js.UndefOr[Boolean] = js.undefined,
    read: js.ThisFunction1[/* this */ Readable, /* size */ Double, Unit] = null
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

