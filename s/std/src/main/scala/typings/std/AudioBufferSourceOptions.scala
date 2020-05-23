package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudioBufferSourceOptions extends js.Object {
  var buffer: js.UndefOr[AudioBuffer | Null] = js.undefined
  var detune: js.UndefOr[Double] = js.undefined
  var loop: js.UndefOr[scala.Boolean] = js.undefined
  var loopEnd: js.UndefOr[Double] = js.undefined
  var loopStart: js.UndefOr[Double] = js.undefined
  var playbackRate: js.UndefOr[Double] = js.undefined
}

object AudioBufferSourceOptions {
  @scala.inline
  def apply(
    buffer: js.UndefOr[Null | AudioBuffer] = js.undefined,
    detune: js.UndefOr[Double] = js.undefined,
    loop: js.UndefOr[scala.Boolean] = js.undefined,
    loopEnd: js.UndefOr[Double] = js.undefined,
    loopStart: js.UndefOr[Double] = js.undefined,
    playbackRate: js.UndefOr[Double] = js.undefined
  ): AudioBufferSourceOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(buffer)) __obj.updateDynamic("buffer")(buffer.asInstanceOf[js.Any])
    if (!js.isUndefined(detune)) __obj.updateDynamic("detune")(detune.get.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(loopEnd)) __obj.updateDynamic("loopEnd")(loopEnd.get.asInstanceOf[js.Any])
    if (!js.isUndefined(loopStart)) __obj.updateDynamic("loopStart")(loopStart.get.asInstanceOf[js.Any])
    if (!js.isUndefined(playbackRate)) __obj.updateDynamic("playbackRate")(playbackRate.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioBufferSourceOptions]
  }
}

