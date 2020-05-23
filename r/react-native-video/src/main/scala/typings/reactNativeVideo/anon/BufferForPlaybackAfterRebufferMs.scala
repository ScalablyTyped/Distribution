package typings.reactNativeVideo.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferForPlaybackAfterRebufferMs extends js.Object {
  var bufferForPlaybackAfterRebufferMs: js.UndefOr[Double] = js.undefined
  var bufferForPlaybackMs: js.UndefOr[Double] = js.undefined
  var maxBufferMs: js.UndefOr[Double] = js.undefined
  var minBufferMs: js.UndefOr[Double] = js.undefined
}

object BufferForPlaybackAfterRebufferMs {
  @scala.inline
  def apply(
    bufferForPlaybackAfterRebufferMs: js.UndefOr[Double] = js.undefined,
    bufferForPlaybackMs: js.UndefOr[Double] = js.undefined,
    maxBufferMs: js.UndefOr[Double] = js.undefined,
    minBufferMs: js.UndefOr[Double] = js.undefined
  ): BufferForPlaybackAfterRebufferMs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bufferForPlaybackAfterRebufferMs)) __obj.updateDynamic("bufferForPlaybackAfterRebufferMs")(bufferForPlaybackAfterRebufferMs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bufferForPlaybackMs)) __obj.updateDynamic("bufferForPlaybackMs")(bufferForPlaybackMs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxBufferMs)) __obj.updateDynamic("maxBufferMs")(maxBufferMs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minBufferMs)) __obj.updateDynamic("minBufferMs")(minBufferMs.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferForPlaybackAfterRebufferMs]
  }
}

