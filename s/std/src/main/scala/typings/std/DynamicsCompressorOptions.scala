package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynamicsCompressorOptions extends AudioNodeOptions {
  var attack: js.UndefOr[Double] = js.undefined
  var knee: js.UndefOr[Double] = js.undefined
  var ratio: js.UndefOr[Double] = js.undefined
  var release: js.UndefOr[Double] = js.undefined
  var threshold: js.UndefOr[Double] = js.undefined
}

object DynamicsCompressorOptions {
  @scala.inline
  def apply(
    attack: js.UndefOr[Double] = js.undefined,
    channelCount: js.UndefOr[Double] = js.undefined,
    channelCountMode: ChannelCountMode = null,
    channelInterpretation: ChannelInterpretation = null,
    knee: js.UndefOr[Double] = js.undefined,
    ratio: js.UndefOr[Double] = js.undefined,
    release: js.UndefOr[Double] = js.undefined,
    threshold: js.UndefOr[Double] = js.undefined
  ): DynamicsCompressorOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(attack)) __obj.updateDynamic("attack")(attack.get.asInstanceOf[js.Any])
    if (!js.isUndefined(channelCount)) __obj.updateDynamic("channelCount")(channelCount.get.asInstanceOf[js.Any])
    if (channelCountMode != null) __obj.updateDynamic("channelCountMode")(channelCountMode.asInstanceOf[js.Any])
    if (channelInterpretation != null) __obj.updateDynamic("channelInterpretation")(channelInterpretation.asInstanceOf[js.Any])
    if (!js.isUndefined(knee)) __obj.updateDynamic("knee")(knee.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ratio)) __obj.updateDynamic("ratio")(ratio.get.asInstanceOf[js.Any])
    if (!js.isUndefined(release)) __obj.updateDynamic("release")(release.get.asInstanceOf[js.Any])
    if (!js.isUndefined(threshold)) __obj.updateDynamic("threshold")(threshold.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamicsCompressorOptions]
  }
}

