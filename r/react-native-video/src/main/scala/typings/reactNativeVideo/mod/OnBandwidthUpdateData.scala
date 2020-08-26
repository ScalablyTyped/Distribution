package typings.reactNativeVideo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnBandwidthUpdateData extends js.Object {
  var bitrate: Double = js.native
}

object OnBandwidthUpdateData {
  @scala.inline
  def apply(bitrate: Double): OnBandwidthUpdateData = {
    val __obj = js.Dynamic.literal(bitrate = bitrate.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnBandwidthUpdateData]
  }
  @scala.inline
  implicit class OnBandwidthUpdateDataOps[Self <: OnBandwidthUpdateData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBitrate(value: Double): Self = this.set("bitrate", value.asInstanceOf[js.Any])
  }
  
}

