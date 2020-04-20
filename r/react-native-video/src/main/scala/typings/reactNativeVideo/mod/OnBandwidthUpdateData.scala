package typings.reactNativeVideo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnBandwidthUpdateData extends js.Object {
  var bitrate: Double
}

object OnBandwidthUpdateData {
  @scala.inline
  def apply(bitrate: Double): OnBandwidthUpdateData = {
    val __obj = js.Dynamic.literal(bitrate = bitrate.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnBandwidthUpdateData]
  }
}

