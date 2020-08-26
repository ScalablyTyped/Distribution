package typings.skyway

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CallOptions extends js.Object {
  var audioBandwidth: js.UndefOr[Double] = js.native
  var audioCodec: js.UndefOr[String] = js.native
  var audioReceiveEnabled: js.UndefOr[Boolean] = js.native
  var label: js.UndefOr[String] = js.native
  var metadata: js.UndefOr[js.Any] = js.native
  var videoBandWidth: js.UndefOr[Double] = js.native
  var videoCodec: js.UndefOr[String] = js.native
  var videoReceiveEnabled: js.UndefOr[Boolean] = js.native
}

object CallOptions {
  @scala.inline
  def apply(): CallOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallOptions]
  }
  @scala.inline
  implicit class CallOptionsOps[Self <: CallOptions] (val x: Self) extends AnyVal {
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
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setMetadata(value: js.Any): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setVideoBandWidth(value: Double): Self = this.set("videoBandWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideoBandWidth: Self = this.set("videoBandWidth", js.undefined)
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

