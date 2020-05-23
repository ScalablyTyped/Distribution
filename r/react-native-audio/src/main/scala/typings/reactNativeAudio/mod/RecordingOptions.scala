package typings.reactNativeAudio.mod

import typings.reactNativeAudio.reactNativeAudioStrings.High
import typings.reactNativeAudio.reactNativeAudioStrings.Low
import typings.reactNativeAudio.reactNativeAudioStrings.Medium
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
    AudioEncodingBitRate: js.UndefOr[Double] = js.undefined,
    AudioQuality: Low | Medium | High = null,
    AudioSource: js.UndefOr[Double] = js.undefined,
    Channels: js.UndefOr[Double] = js.undefined,
    IncludeBase64: js.UndefOr[Boolean] = js.undefined,
    MeasurementMode: js.UndefOr[Boolean] = js.undefined,
    MeteringEnabled: js.UndefOr[Boolean] = js.undefined,
    OutputFormat: String = null,
    SampleRate: js.UndefOr[Double] = js.undefined
  ): RecordingOptions = {
    val __obj = js.Dynamic.literal()
    if (AudioEncoding != null) __obj.updateDynamic("AudioEncoding")(AudioEncoding.asInstanceOf[js.Any])
    if (!js.isUndefined(AudioEncodingBitRate)) __obj.updateDynamic("AudioEncodingBitRate")(AudioEncodingBitRate.get.asInstanceOf[js.Any])
    if (AudioQuality != null) __obj.updateDynamic("AudioQuality")(AudioQuality.asInstanceOf[js.Any])
    if (!js.isUndefined(AudioSource)) __obj.updateDynamic("AudioSource")(AudioSource.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Channels)) __obj.updateDynamic("Channels")(Channels.get.asInstanceOf[js.Any])
    if (!js.isUndefined(IncludeBase64)) __obj.updateDynamic("IncludeBase64")(IncludeBase64.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MeasurementMode)) __obj.updateDynamic("MeasurementMode")(MeasurementMode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MeteringEnabled)) __obj.updateDynamic("MeteringEnabled")(MeteringEnabled.get.asInstanceOf[js.Any])
    if (OutputFormat != null) __obj.updateDynamic("OutputFormat")(OutputFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(SampleRate)) __obj.updateDynamic("SampleRate")(SampleRate.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordingOptions]
  }
}

