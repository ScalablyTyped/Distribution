package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudioContextOptions extends js.Object {
  var latencyHint: js.UndefOr[AudioContextLatencyCategory | Double] = js.undefined
  var sampleRate: js.UndefOr[Double] = js.undefined
}

object AudioContextOptions {
  @scala.inline
  def apply(
    latencyHint: AudioContextLatencyCategory | Double = null,
    sampleRate: js.UndefOr[Double] = js.undefined
  ): AudioContextOptions = {
    val __obj = js.Dynamic.literal()
    if (latencyHint != null) __obj.updateDynamic("latencyHint")(latencyHint.asInstanceOf[js.Any])
    if (!js.isUndefined(sampleRate)) __obj.updateDynamic("sampleRate")(sampleRate.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioContextOptions]
  }
}

