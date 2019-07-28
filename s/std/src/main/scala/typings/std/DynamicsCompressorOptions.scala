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
    attack: Int | Double = null,
    channelCount: Int | Double = null,
    channelCountMode: ChannelCountMode = null,
    channelInterpretation: ChannelInterpretation = null,
    knee: Int | Double = null,
    ratio: Int | Double = null,
    release: Int | Double = null,
    threshold: Int | Double = null
  ): DynamicsCompressorOptions = {
    val __obj = js.Dynamic.literal()
    if (attack != null) __obj.updateDynamic("attack")(attack.asInstanceOf[js.Any])
    if (channelCount != null) __obj.updateDynamic("channelCount")(channelCount.asInstanceOf[js.Any])
    if (channelCountMode != null) __obj.updateDynamic("channelCountMode")(channelCountMode)
    if (channelInterpretation != null) __obj.updateDynamic("channelInterpretation")(channelInterpretation)
    if (knee != null) __obj.updateDynamic("knee")(knee.asInstanceOf[js.Any])
    if (ratio != null) __obj.updateDynamic("ratio")(ratio.asInstanceOf[js.Any])
    if (release != null) __obj.updateDynamic("release")(release.asInstanceOf[js.Any])
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamicsCompressorOptions]
  }
}

