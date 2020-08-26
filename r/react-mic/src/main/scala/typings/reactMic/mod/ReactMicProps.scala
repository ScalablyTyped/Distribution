package typings.reactMic.mod

import typings.reactMic.reactMicNumbers.`1`
import typings.reactMic.reactMicNumbers.`2`
import typings.reactMic.reactMicStrings.audioSlashwav
import typings.reactMic.reactMicStrings.audioSlashwebm
import typings.reactMic.reactMicStrings.frequencyBars
import typings.reactMic.reactMicStrings.sinewave
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactMicProps extends js.Object {
  /** Enables/disables auto gain control, defaults -> false */
  var autoGainControl: js.UndefOr[Boolean] = js.native
  /** Background color */
  var backgroundColor: js.UndefOr[String] = js.native
  /** Specify 1 for mono, defaults -> 2 (stereo) */
  var channelCount: js.UndefOr[`1` | `2`] = js.native
  var className: js.UndefOr[String] = js.native
  /** Enables/disables echo cancellation, defaults -> false */
  var echoCancellation: js.UndefOr[Boolean] = js.native
  /** defaults -> "audio/webm".  Set to "audio/wav" for WAV or "audio/mp3" for MP3 audio format (available in React-Mic-Gold) */
  var mimeType: js.UndefOr[audioSlashwebm | audioSlashwav] = js.native
  /** Enables/disables background noise suppression, defaults -> false */
  var noiseSuppression: js.UndefOr[Boolean] = js.native
  /** Callback that is executed when chunk of audio is available */
  var onData: js.UndefOr[js.Function1[/* recordedData */ Blob, Unit]] = js.native
  /** Callback that is executed when audio stops recording */
  var onStop: js.UndefOr[js.Function1[/* recordedData */ ReactMicStopEvent, Unit]] = js.native
  /** Available in React-Mic-Plus upgrade only */
  var pause: js.UndefOr[Boolean] = js.native
  /** Set to true to begin recording */
  var record: js.UndefOr[Boolean] = js.native
  /** Sound wave color */
  var strokeColor: js.UndefOr[String] = js.native
  var visualSetting: js.UndefOr[sinewave | frequencyBars] = js.native
}

object ReactMicProps {
  @scala.inline
  def apply(): ReactMicProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactMicProps]
  }
  @scala.inline
  implicit class ReactMicPropsOps[Self <: ReactMicProps] (val x: Self) extends AnyVal {
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
    def setAutoGainControl(value: Boolean): Self = this.set("autoGainControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoGainControl: Self = this.set("autoGainControl", js.undefined)
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setChannelCount(value: `1` | `2`): Self = this.set("channelCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannelCount: Self = this.set("channelCount", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setEchoCancellation(value: Boolean): Self = this.set("echoCancellation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEchoCancellation: Self = this.set("echoCancellation", js.undefined)
    @scala.inline
    def setMimeType(value: audioSlashwebm | audioSlashwav): Self = this.set("mimeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMimeType: Self = this.set("mimeType", js.undefined)
    @scala.inline
    def setNoiseSuppression(value: Boolean): Self = this.set("noiseSuppression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoiseSuppression: Self = this.set("noiseSuppression", js.undefined)
    @scala.inline
    def setOnData(value: /* recordedData */ Blob => Unit): Self = this.set("onData", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnData: Self = this.set("onData", js.undefined)
    @scala.inline
    def setOnStop(value: /* recordedData */ ReactMicStopEvent => Unit): Self = this.set("onStop", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnStop: Self = this.set("onStop", js.undefined)
    @scala.inline
    def setPause(value: Boolean): Self = this.set("pause", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePause: Self = this.set("pause", js.undefined)
    @scala.inline
    def setRecord(value: Boolean): Self = this.set("record", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecord: Self = this.set("record", js.undefined)
    @scala.inline
    def setStrokeColor(value: String): Self = this.set("strokeColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeColor: Self = this.set("strokeColor", js.undefined)
    @scala.inline
    def setVisualSetting(value: sinewave | frequencyBars): Self = this.set("visualSetting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisualSetting: Self = this.set("visualSetting", js.undefined)
  }
  
}

