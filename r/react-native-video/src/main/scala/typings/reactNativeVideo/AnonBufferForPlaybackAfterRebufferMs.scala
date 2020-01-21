package typings.reactNativeVideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBufferForPlaybackAfterRebufferMs extends js.Object {
  var bufferForPlaybackAfterRebufferMs: js.UndefOr[Double] = js.undefined
  var bufferForPlaybackMs: js.UndefOr[Double] = js.undefined
  var maxBufferMs: js.UndefOr[Double] = js.undefined
  var minBufferMs: js.UndefOr[Double] = js.undefined
}

object AnonBufferForPlaybackAfterRebufferMs {
  @scala.inline
  def apply(
    bufferForPlaybackAfterRebufferMs: Int | Double = null,
    bufferForPlaybackMs: Int | Double = null,
    maxBufferMs: Int | Double = null,
    minBufferMs: Int | Double = null
  ): AnonBufferForPlaybackAfterRebufferMs = {
    val __obj = js.Dynamic.literal()
    if (bufferForPlaybackAfterRebufferMs != null) __obj.updateDynamic("bufferForPlaybackAfterRebufferMs")(bufferForPlaybackAfterRebufferMs.asInstanceOf[js.Any])
    if (bufferForPlaybackMs != null) __obj.updateDynamic("bufferForPlaybackMs")(bufferForPlaybackMs.asInstanceOf[js.Any])
    if (maxBufferMs != null) __obj.updateDynamic("maxBufferMs")(maxBufferMs.asInstanceOf[js.Any])
    if (minBufferMs != null) __obj.updateDynamic("minBufferMs")(minBufferMs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBufferForPlaybackAfterRebufferMs]
  }
}

