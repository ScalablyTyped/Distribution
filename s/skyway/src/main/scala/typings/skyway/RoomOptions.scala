package typings.skyway

import typings.std.MediaStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoomOptions extends js.Object {
  var audioBandwidth: js.UndefOr[Double] = js.native
  var audioCodec: js.UndefOr[String] = js.native
  var audioReceiveEnabled: js.UndefOr[Boolean] = js.native
  var mode: js.UndefOr[String] = js.native
  var stream: js.UndefOr[MediaStream] = js.native
  var videoBandwidth: js.UndefOr[Double] = js.native
  var videoCodec: js.UndefOr[String] = js.native
  var videoReceiveEnabled: js.UndefOr[Boolean] = js.native
}

object RoomOptions {
  @scala.inline
  def apply(): RoomOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoomOptions]
  }
  @scala.inline
  implicit class RoomOptionsOps[Self <: RoomOptions] (val x: Self) extends AnyVal {
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
    def setAudioBandwidth(value: Double): Self = this.set("audioBandwidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudioBandwidth: Self = this.set("audioBandwidth", js.undefined)
    @scala.inline
    def setAudioCodec(value: String): Self = this.set("audioCodec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudioCodec: Self = this.set("audioCodec", js.undefined)
    @scala.inline
    def setAudioReceiveEnabled(value: Boolean): Self = this.set("audioReceiveEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudioReceiveEnabled: Self = this.set("audioReceiveEnabled", js.undefined)
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setStream(value: MediaStream): Self = this.set("stream", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStream: Self = this.set("stream", js.undefined)
    @scala.inline
    def setVideoBandwidth(value: Double): Self = this.set("videoBandwidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideoBandwidth: Self = this.set("videoBandwidth", js.undefined)
    @scala.inline
    def setVideoCodec(value: String): Self = this.set("videoCodec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideoCodec: Self = this.set("videoCodec", js.undefined)
    @scala.inline
    def setVideoReceiveEnabled(value: Boolean): Self = this.set("videoReceiveEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideoReceiveEnabled: Self = this.set("videoReceiveEnabled", js.undefined)
  }
  
}

