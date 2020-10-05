package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCMediaStreamTrackStats extends RTCStats {
  var audioLevel: js.UndefOr[Double] = js.native
  var echoReturnLoss: js.UndefOr[Double] = js.native
  var echoReturnLossEnhancement: js.UndefOr[Double] = js.native
  var frameHeight: js.UndefOr[Double] = js.native
  var frameWidth: js.UndefOr[Double] = js.native
  var framesCorrupted: js.UndefOr[Double] = js.native
  var framesDecoded: js.UndefOr[Double] = js.native
  var framesDropped: js.UndefOr[Double] = js.native
  var framesPerSecond: js.UndefOr[Double] = js.native
  var framesReceived: js.UndefOr[Double] = js.native
  var framesSent: js.UndefOr[Double] = js.native
  var remoteSource: js.UndefOr[scala.Boolean] = js.native
  var ssrcIds: js.UndefOr[js.Array[java.lang.String]] = js.native
  var trackIdentifier: js.UndefOr[java.lang.String] = js.native
}

object RTCMediaStreamTrackStats {
  @scala.inline
  def apply(id: java.lang.String, timestamp: Double, `type`: RTCStatsType): RTCMediaStreamTrackStats = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCMediaStreamTrackStats]
  }
  @scala.inline
  implicit class RTCMediaStreamTrackStatsOps[Self <: RTCMediaStreamTrackStats] (val x: Self) extends AnyVal {
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
    def setAudioLevel(value: Double): Self = this.set("audioLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudioLevel: Self = this.set("audioLevel", js.undefined)
    @scala.inline
    def setEchoReturnLoss(value: Double): Self = this.set("echoReturnLoss", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEchoReturnLoss: Self = this.set("echoReturnLoss", js.undefined)
    @scala.inline
    def setEchoReturnLossEnhancement(value: Double): Self = this.set("echoReturnLossEnhancement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEchoReturnLossEnhancement: Self = this.set("echoReturnLossEnhancement", js.undefined)
    @scala.inline
    def setFrameHeight(value: Double): Self = this.set("frameHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrameHeight: Self = this.set("frameHeight", js.undefined)
    @scala.inline
    def setFrameWidth(value: Double): Self = this.set("frameWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrameWidth: Self = this.set("frameWidth", js.undefined)
    @scala.inline
    def setFramesCorrupted(value: Double): Self = this.set("framesCorrupted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFramesCorrupted: Self = this.set("framesCorrupted", js.undefined)
    @scala.inline
    def setFramesDecoded(value: Double): Self = this.set("framesDecoded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFramesDecoded: Self = this.set("framesDecoded", js.undefined)
    @scala.inline
    def setFramesDropped(value: Double): Self = this.set("framesDropped", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFramesDropped: Self = this.set("framesDropped", js.undefined)
    @scala.inline
    def setFramesPerSecond(value: Double): Self = this.set("framesPerSecond", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFramesPerSecond: Self = this.set("framesPerSecond", js.undefined)
    @scala.inline
    def setFramesReceived(value: Double): Self = this.set("framesReceived", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFramesReceived: Self = this.set("framesReceived", js.undefined)
    @scala.inline
    def setFramesSent(value: Double): Self = this.set("framesSent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFramesSent: Self = this.set("framesSent", js.undefined)
    @scala.inline
    def setRemoteSource(value: scala.Boolean): Self = this.set("remoteSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoteSource: Self = this.set("remoteSource", js.undefined)
    @scala.inline
    def setSsrcIdsVarargs(value: java.lang.String*): Self = this.set("ssrcIds", js.Array(value :_*))
    @scala.inline
    def setSsrcIds(value: js.Array[java.lang.String]): Self = this.set("ssrcIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSsrcIds: Self = this.set("ssrcIds", js.undefined)
    @scala.inline
    def setTrackIdentifier(value: java.lang.String): Self = this.set("trackIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrackIdentifier: Self = this.set("trackIdentifier", js.undefined)
  }
  
}

