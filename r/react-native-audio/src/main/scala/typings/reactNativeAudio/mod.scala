package typings.reactNativeAudio

import typings.reactNativeAudio.anon.AudioFileURL
import typings.reactNativeAudio.anon.CurrentTime
import typings.reactNativeAudio.reactNativeAudioStrings.High
import typings.reactNativeAudio.reactNativeAudioStrings.Low
import typings.reactNativeAudio.reactNativeAudioStrings.Medium
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object AudioRecorder {
    
    @JSImport("react-native-audio", "AudioRecorder")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def checkAuthorizationStatus(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("checkAuthorizationStatus")().asInstanceOf[js.Promise[Boolean]]
    
    @scala.inline
    def onFinished(res: AudioFileURL): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onFinished")(res.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def onProgress(res: CurrentTime): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onProgress")(res.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def pauseRecording(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("pauseRecording")().asInstanceOf[js.Promise[String]]
    
    @scala.inline
    def prepareRecordingAtPath(path: String, options: RecordingOptions): Unit | js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareRecordingAtPath")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit | js.Promise[String]]
    
    @scala.inline
    def requestAuthorization(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestAuthorization")().asInstanceOf[js.Promise[Boolean]]
    
    @scala.inline
    def resumeRecording(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("resumeRecording")().asInstanceOf[js.Promise[String]]
    
    @scala.inline
    def startRecording(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("startRecording")().asInstanceOf[js.Promise[String]]
    
    @scala.inline
    def stopRecording(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("stopRecording")().asInstanceOf[js.Promise[String]]
  }
  
  object AudioSource {
    
    @JSImport("react-native-audio", "AudioSource")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-audio", "AudioSource.CAMCORDER")
    @js.native
    def CAMCORDER: Double = js.native
    @scala.inline
    def CAMCORDER_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CAMCORDER")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-audio", "AudioSource.DEFAULT")
    @js.native
    def DEFAULT: Double = js.native
    @scala.inline
    def DEFAULT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-audio", "AudioSource.MIC")
    @js.native
    def MIC: Double = js.native
    @scala.inline
    def MIC_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIC")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-audio", "AudioSource.REMOTE_SUBMIX")
    @js.native
    def REMOTE_SUBMIX: Double = js.native
    @scala.inline
    def REMOTE_SUBMIX_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REMOTE_SUBMIX")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-audio", "AudioSource.UNPROCESSED")
    @js.native
    def UNPROCESSED: Double = js.native
    @scala.inline
    def UNPROCESSED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNPROCESSED")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-audio", "AudioSource.VOICE_CALL")
    @js.native
    def VOICE_CALL: Double = js.native
    @scala.inline
    def VOICE_CALL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VOICE_CALL")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-audio", "AudioSource.VOICE_COMMUNICATION")
    @js.native
    def VOICE_COMMUNICATION: Double = js.native
    @scala.inline
    def VOICE_COMMUNICATION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VOICE_COMMUNICATION")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-audio", "AudioSource.VOICE_DOWNLINK")
    @js.native
    def VOICE_DOWNLINK: Double = js.native
    @scala.inline
    def VOICE_DOWNLINK_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VOICE_DOWNLINK")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-audio", "AudioSource.VOICE_RECOGNITION")
    @js.native
    def VOICE_RECOGNITION: Double = js.native
    @scala.inline
    def VOICE_RECOGNITION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VOICE_RECOGNITION")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-audio", "AudioSource.VOICE_UPLINK")
    @js.native
    def VOICE_UPLINK: Double = js.native
    @scala.inline
    def VOICE_UPLINK_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VOICE_UPLINK")(x.asInstanceOf[js.Any])
  }
  
  object AudioUtils {
    
    @JSImport("react-native-audio", "AudioUtils")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-audio", "AudioUtils.CachesDirectoryPath")
    @js.native
    def CachesDirectoryPath: String = js.native
    @scala.inline
    def CachesDirectoryPath_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CachesDirectoryPath")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-audio", "AudioUtils.DocumentDirectoryPath")
    @js.native
    def DocumentDirectoryPath: String = js.native
    @scala.inline
    def DocumentDirectoryPath_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DocumentDirectoryPath")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-audio", "AudioUtils.DownloadsDirectoryPath")
    @js.native
    def DownloadsDirectoryPath: String = js.native
    @scala.inline
    def DownloadsDirectoryPath_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DownloadsDirectoryPath")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-audio", "AudioUtils.LibraryDirectoryPath")
    @js.native
    def LibraryDirectoryPath: String = js.native
    @scala.inline
    def LibraryDirectoryPath_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LibraryDirectoryPath")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-audio", "AudioUtils.MainBundlePath")
    @js.native
    def MainBundlePath: String = js.native
    @scala.inline
    def MainBundlePath_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MainBundlePath")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-audio", "AudioUtils.MusicDirectoryPath")
    @js.native
    def MusicDirectoryPath: String = js.native
    @scala.inline
    def MusicDirectoryPath_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MusicDirectoryPath")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-audio", "AudioUtils.PicturesDirectoryPath")
    @js.native
    def PicturesDirectoryPath: String = js.native
    @scala.inline
    def PicturesDirectoryPath_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PicturesDirectoryPath")(x.asInstanceOf[js.Any])
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeAudio.reactNativeAudioStrings.aac_eld
    - typings.reactNativeAudio.reactNativeAudioStrings.amr_nb
    - typings.reactNativeAudio.reactNativeAudioStrings.amr_wb
    - typings.reactNativeAudio.reactNativeAudioStrings.he_aac
    - typings.reactNativeAudio.reactNativeAudioStrings.vorbis
  */
  trait AudioEncodingAndroidType extends StObject
  object AudioEncodingAndroidType {
    
    @scala.inline
    def aac_eld: typings.reactNativeAudio.reactNativeAudioStrings.aac_eld = "aac_eld".asInstanceOf[typings.reactNativeAudio.reactNativeAudioStrings.aac_eld]
    
    @scala.inline
    def amr_nb: typings.reactNativeAudio.reactNativeAudioStrings.amr_nb = "amr_nb".asInstanceOf[typings.reactNativeAudio.reactNativeAudioStrings.amr_nb]
    
    @scala.inline
    def amr_wb: typings.reactNativeAudio.reactNativeAudioStrings.amr_wb = "amr_wb".asInstanceOf[typings.reactNativeAudio.reactNativeAudioStrings.amr_wb]
    
    @scala.inline
    def he_aac: typings.reactNativeAudio.reactNativeAudioStrings.he_aac = "he_aac".asInstanceOf[typings.reactNativeAudio.reactNativeAudioStrings.he_aac]
    
    @scala.inline
    def vorbis: typings.reactNativeAudio.reactNativeAudioStrings.vorbis = "vorbis".asInstanceOf[typings.reactNativeAudio.reactNativeAudioStrings.vorbis]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeAudio.reactNativeAudioStrings.lpcm
    - typings.reactNativeAudio.reactNativeAudioStrings.ima4
    - typings.reactNativeAudio.reactNativeAudioStrings.MAC3
    - typings.reactNativeAudio.reactNativeAudioStrings.MAC6
    - typings.reactNativeAudio.reactNativeAudioStrings.ulaw
    - typings.reactNativeAudio.reactNativeAudioStrings.alaw
    - typings.reactNativeAudio.reactNativeAudioStrings.mp1
    - typings.reactNativeAudio.reactNativeAudioStrings.mp2
    - typings.reactNativeAudio.reactNativeAudioStrings.alac
    - typings.reactNativeAudio.reactNativeAudioStrings.amr
  */
  trait AudioEncodingIOSType extends StObject
  object AudioEncodingIOSType {
    
    @scala.inline
    def MAC3: typings.reactNativeAudio.reactNativeAudioStrings.MAC3 = "MAC3".asInstanceOf[typings.reactNativeAudio.reactNativeAudioStrings.MAC3]
    
    @scala.inline
    def MAC6: typings.reactNativeAudio.reactNativeAudioStrings.MAC6 = "MAC6".asInstanceOf[typings.reactNativeAudio.reactNativeAudioStrings.MAC6]
    
    @scala.inline
    def alac: typings.reactNativeAudio.reactNativeAudioStrings.alac = "alac".asInstanceOf[typings.reactNativeAudio.reactNativeAudioStrings.alac]
    
    @scala.inline
    def alaw: typings.reactNativeAudio.reactNativeAudioStrings.alaw = "alaw".asInstanceOf[typings.reactNativeAudio.reactNativeAudioStrings.alaw]
    
    @scala.inline
    def amr: typings.reactNativeAudio.reactNativeAudioStrings.amr = "amr".asInstanceOf[typings.reactNativeAudio.reactNativeAudioStrings.amr]
    
    @scala.inline
    def ima4: typings.reactNativeAudio.reactNativeAudioStrings.ima4 = "ima4".asInstanceOf[typings.reactNativeAudio.reactNativeAudioStrings.ima4]
    
    @scala.inline
    def lpcm: typings.reactNativeAudio.reactNativeAudioStrings.lpcm = "lpcm".asInstanceOf[typings.reactNativeAudio.reactNativeAudioStrings.lpcm]
    
    @scala.inline
    def mp1: typings.reactNativeAudio.reactNativeAudioStrings.mp1 = "mp1".asInstanceOf[typings.reactNativeAudio.reactNativeAudioStrings.mp1]
    
    @scala.inline
    def mp2: typings.reactNativeAudio.reactNativeAudioStrings.mp2 = "mp2".asInstanceOf[typings.reactNativeAudio.reactNativeAudioStrings.mp2]
    
    @scala.inline
    def ulaw: typings.reactNativeAudio.reactNativeAudioStrings.ulaw = "ulaw".asInstanceOf[typings.reactNativeAudio.reactNativeAudioStrings.ulaw]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeAudio.reactNativeAudioStrings.aac
    - typings.reactNativeAudio.reactNativeAudioStrings.aac_eld
    - typings.reactNativeAudio.reactNativeAudioStrings.amr_nb
    - typings.reactNativeAudio.reactNativeAudioStrings.amr_wb
    - typings.reactNativeAudio.reactNativeAudioStrings.he_aac
    - typings.reactNativeAudio.reactNativeAudioStrings.vorbis
  */
  trait AudioEncodingType extends StObject
  object AudioEncodingType {
    
    @scala.inline
    def aac: typings.reactNativeAudio.reactNativeAudioStrings.aac = "aac".asInstanceOf[typings.reactNativeAudio.reactNativeAudioStrings.aac]
    
    @scala.inline
    def aac_eld: typings.reactNativeAudio.reactNativeAudioStrings.aac_eld = "aac_eld".asInstanceOf[typings.reactNativeAudio.reactNativeAudioStrings.aac_eld]
    
    @scala.inline
    def amr_nb: typings.reactNativeAudio.reactNativeAudioStrings.amr_nb = "amr_nb".asInstanceOf[typings.reactNativeAudio.reactNativeAudioStrings.amr_nb]
    
    @scala.inline
    def amr_wb: typings.reactNativeAudio.reactNativeAudioStrings.amr_wb = "amr_wb".asInstanceOf[typings.reactNativeAudio.reactNativeAudioStrings.amr_wb]
    
    @scala.inline
    def he_aac: typings.reactNativeAudio.reactNativeAudioStrings.he_aac = "he_aac".asInstanceOf[typings.reactNativeAudio.reactNativeAudioStrings.he_aac]
    
    @scala.inline
    def vorbis: typings.reactNativeAudio.reactNativeAudioStrings.vorbis = "vorbis".asInstanceOf[typings.reactNativeAudio.reactNativeAudioStrings.vorbis]
  }
  
  trait RecordingOptions extends StObject {
    
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
    def apply(): RecordingOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RecordingOptions]
    }
    
    @scala.inline
    implicit class RecordingOptionsMutableBuilder[Self <: RecordingOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAudioEncoding(value: AudioEncodingType): Self = StObject.set(x, "AudioEncoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAudioEncodingBitRate(value: Double): Self = StObject.set(x, "AudioEncodingBitRate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAudioEncodingBitRateUndefined: Self = StObject.set(x, "AudioEncodingBitRate", js.undefined)
      
      @scala.inline
      def setAudioEncodingUndefined: Self = StObject.set(x, "AudioEncoding", js.undefined)
      
      @scala.inline
      def setAudioQuality(value: Low | Medium | High): Self = StObject.set(x, "AudioQuality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAudioQualityUndefined: Self = StObject.set(x, "AudioQuality", js.undefined)
      
      @scala.inline
      def setAudioSource(value: Double): Self = StObject.set(x, "AudioSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAudioSourceUndefined: Self = StObject.set(x, "AudioSource", js.undefined)
      
      @scala.inline
      def setChannels(value: Double): Self = StObject.set(x, "Channels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannelsUndefined: Self = StObject.set(x, "Channels", js.undefined)
      
      @scala.inline
      def setIncludeBase64(value: Boolean): Self = StObject.set(x, "IncludeBase64", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeBase64Undefined: Self = StObject.set(x, "IncludeBase64", js.undefined)
      
      @scala.inline
      def setMeasurementMode(value: Boolean): Self = StObject.set(x, "MeasurementMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeasurementModeUndefined: Self = StObject.set(x, "MeasurementMode", js.undefined)
      
      @scala.inline
      def setMeteringEnabled(value: Boolean): Self = StObject.set(x, "MeteringEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeteringEnabledUndefined: Self = StObject.set(x, "MeteringEnabled", js.undefined)
      
      @scala.inline
      def setOutputFormat(value: String): Self = StObject.set(x, "OutputFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputFormatUndefined: Self = StObject.set(x, "OutputFormat", js.undefined)
      
      @scala.inline
      def setSampleRate(value: Double): Self = StObject.set(x, "SampleRate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSampleRateUndefined: Self = StObject.set(x, "SampleRate", js.undefined)
    }
  }
}
