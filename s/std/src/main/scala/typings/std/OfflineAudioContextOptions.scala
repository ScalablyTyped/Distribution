package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OfflineAudioContextOptions extends js.Object {
  var length: Double
  var numberOfChannels: js.UndefOr[Double] = js.undefined
  var sampleRate: Double
}

object OfflineAudioContextOptions {
  @scala.inline
  def apply(length: Double, sampleRate: Double, numberOfChannels: Int | Double = null): OfflineAudioContextOptions = {
    val __obj = js.Dynamic.literal(length = length, sampleRate = sampleRate)
    if (numberOfChannels != null) __obj.updateDynamic("numberOfChannels")(numberOfChannels.asInstanceOf[js.Any])
    __obj.asInstanceOf[OfflineAudioContextOptions]
  }
}

