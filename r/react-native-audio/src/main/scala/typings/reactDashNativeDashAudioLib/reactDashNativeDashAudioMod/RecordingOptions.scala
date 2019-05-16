package typings
package reactDashNativeDashAudioLib.reactDashNativeDashAudioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecordingOptions extends js.Object {
  var AudioEncoding: js.UndefOr[AudioEncodingType] = js.undefined
  var AudioEncodingBitRate: js.UndefOr[scala.Double] = js.undefined
  var AudioQuality: js.UndefOr[
    reactDashNativeDashAudioLib.reactDashNativeDashAudioLibStrings.Low | reactDashNativeDashAudioLib.reactDashNativeDashAudioLibStrings.Medium | reactDashNativeDashAudioLib.reactDashNativeDashAudioLibStrings.High
  ] = js.undefined
  var AudioSource: js.UndefOr[scala.Double] = js.undefined
  var Channels: js.UndefOr[scala.Double] = js.undefined
  var IncludeBase64: js.UndefOr[scala.Boolean] = js.undefined
  var MeasurementMode: js.UndefOr[scala.Boolean] = js.undefined
  var MeteringEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var OutputFormat: js.UndefOr[java.lang.String] = js.undefined
  var SampleRate: js.UndefOr[scala.Double] = js.undefined
}

object RecordingOptions {
  @scala.inline
  def apply(
    AudioEncoding: AudioEncodingType = null,
    AudioEncodingBitRate: scala.Int | scala.Double = null,
    AudioQuality: reactDashNativeDashAudioLib.reactDashNativeDashAudioLibStrings.Low | reactDashNativeDashAudioLib.reactDashNativeDashAudioLibStrings.Medium | reactDashNativeDashAudioLib.reactDashNativeDashAudioLibStrings.High = null,
    AudioSource: scala.Int | scala.Double = null,
    Channels: scala.Int | scala.Double = null,
    IncludeBase64: js.UndefOr[scala.Boolean] = js.undefined,
    MeasurementMode: js.UndefOr[scala.Boolean] = js.undefined,
    MeteringEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    OutputFormat: java.lang.String = null,
    SampleRate: scala.Int | scala.Double = null
  ): RecordingOptions = {
    val __obj = js.Dynamic.literal()
    if (AudioEncoding != null) __obj.updateDynamic("AudioEncoding")(AudioEncoding)
    if (AudioEncodingBitRate != null) __obj.updateDynamic("AudioEncodingBitRate")(AudioEncodingBitRate.asInstanceOf[js.Any])
    if (AudioQuality != null) __obj.updateDynamic("AudioQuality")(AudioQuality.asInstanceOf[js.Any])
    if (AudioSource != null) __obj.updateDynamic("AudioSource")(AudioSource.asInstanceOf[js.Any])
    if (Channels != null) __obj.updateDynamic("Channels")(Channels.asInstanceOf[js.Any])
    if (!js.isUndefined(IncludeBase64)) __obj.updateDynamic("IncludeBase64")(IncludeBase64)
    if (!js.isUndefined(MeasurementMode)) __obj.updateDynamic("MeasurementMode")(MeasurementMode)
    if (!js.isUndefined(MeteringEnabled)) __obj.updateDynamic("MeteringEnabled")(MeteringEnabled)
    if (OutputFormat != null) __obj.updateDynamic("OutputFormat")(OutputFormat)
    if (SampleRate != null) __obj.updateDynamic("SampleRate")(SampleRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordingOptions]
  }
}

