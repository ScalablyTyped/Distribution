package typings.reactDashNativeDashAudio.reactDashNativeDashAudioMod

import typings.reactDashNativeDashAudio.reactDashNativeDashAudioStrings.High
import typings.reactDashNativeDashAudio.reactDashNativeDashAudioStrings.Low
import typings.reactDashNativeDashAudio.reactDashNativeDashAudioStrings.Medium
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecordingOptions extends js.Object {
  var AudioEncoding: js.UndefOr[AudioEncodingType] = js.undefined
  var AudioEncodingBitRate: js.UndefOr[Double] = js.undefined
  var AudioQuality: js.UndefOr[Low | Medium | High] = js.undefined
  var AudioSource: js.UndefOr[Double] = js.undefined
  var Channels: js.UndefOr[Double] = js.undefined
  var IncludeBase64: js.UndefOr[Boolean] = js.undefined
  var MeasurementMode: js.UndefOr[Boolean] = js.undefined
  var MeteringEnabled: js.UndefOr[Boolean] = js.undefined
  var OutputFormat: js.UndefOr[String] = js.undefined
  var SampleRate: js.UndefOr[Double] = js.undefined
}

object RecordingOptions {
  @scala.inline
  def apply(
    AudioEncoding: AudioEncodingType = null,
    AudioEncodingBitRate: Int | Double = null,
    AudioQuality: Low | Medium | High = null,
    AudioSource: Int | Double = null,
    Channels: Int | Double = null,
    IncludeBase64: js.UndefOr[Boolean] = js.undefined,
    MeasurementMode: js.UndefOr[Boolean] = js.undefined,
    MeteringEnabled: js.UndefOr[Boolean] = js.undefined,
    OutputFormat: String = null,
    SampleRate: Int | Double = null
  ): RecordingOptions = {
    val __obj = js.Dynamic.literal()
    if (AudioEncoding != null) __obj.updateDynamic("AudioEncoding")(AudioEncoding.asInstanceOf[js.Any])
    if (AudioEncodingBitRate != null) __obj.updateDynamic("AudioEncodingBitRate")(AudioEncodingBitRate.asInstanceOf[js.Any])
    if (AudioQuality != null) __obj.updateDynamic("AudioQuality")(AudioQuality.asInstanceOf[js.Any])
    if (AudioSource != null) __obj.updateDynamic("AudioSource")(AudioSource.asInstanceOf[js.Any])
    if (Channels != null) __obj.updateDynamic("Channels")(Channels.asInstanceOf[js.Any])
    if (!js.isUndefined(IncludeBase64)) __obj.updateDynamic("IncludeBase64")(IncludeBase64.asInstanceOf[js.Any])
    if (!js.isUndefined(MeasurementMode)) __obj.updateDynamic("MeasurementMode")(MeasurementMode.asInstanceOf[js.Any])
    if (!js.isUndefined(MeteringEnabled)) __obj.updateDynamic("MeteringEnabled")(MeteringEnabled.asInstanceOf[js.Any])
    if (OutputFormat != null) __obj.updateDynamic("OutputFormat")(OutputFormat.asInstanceOf[js.Any])
    if (SampleRate != null) __obj.updateDynamic("SampleRate")(SampleRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordingOptions]
  }
}

