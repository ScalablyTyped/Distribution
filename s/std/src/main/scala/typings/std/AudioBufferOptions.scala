package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudioBufferOptions extends js.Object {
  var length: Double
  var numberOfChannels: js.UndefOr[Double] = js.undefined
  var sampleRate: Double
}

object AudioBufferOptions {
  @scala.inline
  def apply(length: Double, sampleRate: Double, numberOfChannels: js.UndefOr[Double] = js.undefined): AudioBufferOptions = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], sampleRate = sampleRate.asInstanceOf[js.Any])
    if (!js.isUndefined(numberOfChannels)) __obj.updateDynamic("numberOfChannels")(numberOfChannels.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioBufferOptions]
  }
}

