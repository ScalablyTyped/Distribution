package typings.reactNativeAudio.mod

import typings.reactNativeAudio.reactNativeAudioStrings.High
import typings.reactNativeAudio.reactNativeAudioStrings.Low
import typings.reactNativeAudio.reactNativeAudioStrings.Medium
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecordingOptions extends js.Object {
  
  var AudioEncoding: js.UndefOr[AudioEncodingType] = js.native
  
  var AudioEncodingBitRate: js.UndefOr[Double] = js.native
  
  var AudioQuality: js.UndefOr[Low | Medium | High] = js.native
  
  var AudioSource: js.UndefOr[Double] = js.native
  
  var Channels: js.UndefOr[Double] = js.native
  
  var IncludeBase64: js.UndefOr[Boolean] = js.native
  
  var MeasurementMode: js.UndefOr[Boolean] = js.native
  
  var MeteringEnabled: js.UndefOr[Boolean] = js.native
  
  var OutputFormat: js.UndefOr[String] = js.native
  
  var SampleRate: js.UndefOr[Double] = js.native
}
object RecordingOptions {
  
  @scala.inline
  def apply(): RecordingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecordingOptions]
  }
  
  @scala.inline
  implicit class RecordingOptionsOps[Self <: RecordingOptions] (val x: Self) extends AnyVal {
    
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
    def setAudioEncoding(value: AudioEncodingType): Self = this.set("AudioEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudioEncoding: Self = this.set("AudioEncoding", js.undefined)
    
    @scala.inline
    def setAudioEncodingBitRate(value: Double): Self = this.set("AudioEncodingBitRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudioEncodingBitRate: Self = this.set("AudioEncodingBitRate", js.undefined)
    
    @scala.inline
    def setAudioQuality(value: Low | Medium | High): Self = this.set("AudioQuality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudioQuality: Self = this.set("AudioQuality", js.undefined)
    
    @scala.inline
    def setAudioSource(value: Double): Self = this.set("AudioSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudioSource: Self = this.set("AudioSource", js.undefined)
    
    @scala.inline
    def setChannels(value: Double): Self = this.set("Channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannels: Self = this.set("Channels", js.undefined)
    
    @scala.inline
    def setIncludeBase64(value: Boolean): Self = this.set("IncludeBase64", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeBase64: Self = this.set("IncludeBase64", js.undefined)
    
    @scala.inline
    def setMeasurementMode(value: Boolean): Self = this.set("MeasurementMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeasurementMode: Self = this.set("MeasurementMode", js.undefined)
    
    @scala.inline
    def setMeteringEnabled(value: Boolean): Self = this.set("MeteringEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeteringEnabled: Self = this.set("MeteringEnabled", js.undefined)
    
    @scala.inline
    def setOutputFormat(value: String): Self = this.set("OutputFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputFormat: Self = this.set("OutputFormat", js.undefined)
    
    @scala.inline
    def setSampleRate(value: Double): Self = this.set("SampleRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSampleRate: Self = this.set("SampleRate", js.undefined)
  }
}
