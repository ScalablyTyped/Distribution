package typings.streamBuffers.mod

import typings.node.BufferEncoding
import typings.node.streamMod.Readable
import typings.node.streamMod.ReadableOptions
import typings.std.Error
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
    chunkSize: js.UndefOr[Double] = js.undefined,
    destroy: js.ThisFunction2[
      /* this */ Readable, 
      /* error */ Error | Null, 
      /* callback */ js.Function1[/* error */ Error | Null, Unit], 
      Unit
    ] = null,
    encoding: BufferEncoding = null,
    frequency: js.UndefOr[Double] = js.undefined,
    highWaterMark: js.UndefOr[Double] = js.undefined,
    incrementAmount: js.UndefOr[Double] = js.undefined,
    initialSize: js.UndefOr[Double] = js.undefined,
    objectMode: js.UndefOr[Boolean] = js.undefined,
    read: js.ThisFunction1[/* this */ Readable, /* size */ Double, Unit] = null
  ): ReadableStreamBufferOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoDestroy)) __obj.updateDynamic("autoDestroy")(autoDestroy.get.asInstanceOf[js.Any])
    if (!js.isUndefined(chunkSize)) __obj.updateDynamic("chunkSize")(chunkSize.get.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(destroy.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (!js.isUndefined(frequency)) __obj.updateDynamic("frequency")(frequency.get.asInstanceOf[js.Any])
    if (!js.isUndefined(highWaterMark)) __obj.updateDynamic("highWaterMark")(highWaterMark.get.asInstanceOf[js.Any])
    if (!js.isUndefined(incrementAmount)) __obj.updateDynamic("incrementAmount")(incrementAmount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(initialSize)) __obj.updateDynamic("initialSize")(initialSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(objectMode)) __obj.updateDynamic("objectMode")(objectMode.get.asInstanceOf[js.Any])
    if (read != null) __obj.updateDynamic("read")(read.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadableStreamBufferOptions]
  }
}

