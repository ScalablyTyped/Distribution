package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCRtpContributingSource extends js.Object {
  var audioLevel: js.UndefOr[Double] = js.native
  var rtpTimestamp: Double = js.native
  var source: Double = js.native
  var timestamp: Double = js.native
}

object RTCRtpContributingSource {
  @scala.inline
  def apply(rtpTimestamp: Double, source: Double, timestamp: Double): RTCRtpContributingSource = {
    val __obj = js.Dynamic.literal(rtpTimestamp = rtpTimestamp.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpContributingSource]
  }
  @scala.inline
  implicit class RTCRtpContributingSourceOps[Self <: RTCRtpContributingSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRtpTimestamp(value: Double): Self = this.set("rtpTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource(value: Double): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setAudioLevel(value: Double): Self = this.set("audioLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudioLevel: Self = this.set("audioLevel", js.undefined)
  }
  
}

