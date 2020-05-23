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

trait ReactMicProps extends js.Object {
  /** Enables/disables auto gain control, defaults -> false */
  var autoGainControl: js.UndefOr[Boolean] = js.undefined
  /** Background color */
  var backgroundColor: js.UndefOr[String] = js.undefined
  /** Specify 1 for mono, defaults -> 2 (stereo) */
  var channelCount: js.UndefOr[`1` | `2`] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  /** Enables/disables echo cancellation, defaults -> false */
  var echoCancellation: js.UndefOr[Boolean] = js.undefined
  /** defaults -> "audio/webm".  Set to "audio/wav" for WAV or "audio/mp3" for MP3 audio format (available in React-Mic-Gold) */
  var mimeType: js.UndefOr[audioSlashwebm | audioSlashwav] = js.undefined
  /** Enables/disables background noise suppression, defaults -> false */
  var noiseSuppression: js.UndefOr[Boolean] = js.undefined
  /** Callback that is executed when chunk of audio is available */
  var onData: js.UndefOr[js.Function1[/* recordedData */ Blob, Unit]] = js.undefined
  /** Callback that is executed when audio stops recording */
  var onStop: js.UndefOr[js.Function1[/* recordedData */ ReactMicStopEvent, Unit]] = js.undefined
  /** Available in React-Mic-Plus upgrade only */
  var pause: js.UndefOr[Boolean] = js.undefined
  /** Set to true to begin recording */
  var record: js.UndefOr[Boolean] = js.undefined
  /** Sound wave color */
  var strokeColor: js.UndefOr[String] = js.undefined
  var visualSetting: js.UndefOr[sinewave | frequencyBars] = js.undefined
}

object ReactMicProps {
  @scala.inline
  def apply(
    autoGainControl: js.UndefOr[Boolean] = js.undefined,
    backgroundColor: String = null,
    channelCount: `1` | `2` = null,
    className: String = null,
    echoCancellation: js.UndefOr[Boolean] = js.undefined,
    mimeType: audioSlashwebm | audioSlashwav = null,
    noiseSuppression: js.UndefOr[Boolean] = js.undefined,
    onData: /* recordedData */ Blob => Unit = null,
    onStop: /* recordedData */ ReactMicStopEvent => Unit = null,
    pause: js.UndefOr[Boolean] = js.undefined,
    record: js.UndefOr[Boolean] = js.undefined,
    strokeColor: String = null,
    visualSetting: sinewave | frequencyBars = null
  ): ReactMicProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoGainControl)) __obj.updateDynamic("autoGainControl")(autoGainControl.get.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (channelCount != null) __obj.updateDynamic("channelCount")(channelCount.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(echoCancellation)) __obj.updateDynamic("echoCancellation")(echoCancellation.get.asInstanceOf[js.Any])
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType.asInstanceOf[js.Any])
    if (!js.isUndefined(noiseSuppression)) __obj.updateDynamic("noiseSuppression")(noiseSuppression.get.asInstanceOf[js.Any])
    if (onData != null) __obj.updateDynamic("onData")(js.Any.fromFunction1(onData))
    if (onStop != null) __obj.updateDynamic("onStop")(js.Any.fromFunction1(onStop))
    if (!js.isUndefined(pause)) __obj.updateDynamic("pause")(pause.get.asInstanceOf[js.Any])
    if (!js.isUndefined(record)) __obj.updateDynamic("record")(record.get.asInstanceOf[js.Any])
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor.asInstanceOf[js.Any])
    if (visualSetting != null) __obj.updateDynamic("visualSetting")(visualSetting.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactMicProps]
  }
}

