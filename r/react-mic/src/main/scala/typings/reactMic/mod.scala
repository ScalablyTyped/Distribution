package typings.reactMic

import typings.react.mod.PureComponent
import typings.reactMic.anon.AudioBitsPerSecond
import typings.reactMic.reactMicNumbers.`1`
import typings.reactMic.reactMicNumbers.`2`
import typings.reactMic.reactMicStrings.audioSlashwav
import typings.reactMic.reactMicStrings.audioSlashwebm
import typings.reactMic.reactMicStrings.frequencyBars
import typings.reactMic.reactMicStrings.sinewave
import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-mic", "ReactMic")
  @js.native
  class ReactMic protected ()
    extends PureComponent[ReactMicProps, js.Object, js.Any] {
    def this(props: ReactMicProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ReactMicProps, context: js.Any) = this()
  }
  
  @js.native
  trait ReactMicProps extends StObject {
    
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
    implicit class ReactMicPropsMutableBuilder[Self <: ReactMicProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoGainControl(value: Boolean): Self = StObject.set(x, "autoGainControl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoGainControlUndefined: Self = StObject.set(x, "autoGainControl", js.undefined)
      
      @scala.inline
      def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      @scala.inline
      def setChannelCount(value: `1` | `2`): Self = StObject.set(x, "channelCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannelCountUndefined: Self = StObject.set(x, "channelCount", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setEchoCancellation(value: Boolean): Self = StObject.set(x, "echoCancellation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEchoCancellationUndefined: Self = StObject.set(x, "echoCancellation", js.undefined)
      
      @scala.inline
      def setMimeType(value: audioSlashwebm | audioSlashwav): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
      
      @scala.inline
      def setNoiseSuppression(value: Boolean): Self = StObject.set(x, "noiseSuppression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoiseSuppressionUndefined: Self = StObject.set(x, "noiseSuppression", js.undefined)
      
      @scala.inline
      def setOnData(value: /* recordedData */ Blob => Unit): Self = StObject.set(x, "onData", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDataUndefined: Self = StObject.set(x, "onData", js.undefined)
      
      @scala.inline
      def setOnStop(value: /* recordedData */ ReactMicStopEvent => Unit): Self = StObject.set(x, "onStop", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnStopUndefined: Self = StObject.set(x, "onStop", js.undefined)
      
      @scala.inline
      def setPause(value: Boolean): Self = StObject.set(x, "pause", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPauseUndefined: Self = StObject.set(x, "pause", js.undefined)
      
      @scala.inline
      def setRecord(value: Boolean): Self = StObject.set(x, "record", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecordUndefined: Self = StObject.set(x, "record", js.undefined)
      
      @scala.inline
      def setStrokeColor(value: String): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
      
      @scala.inline
      def setVisualSetting(value: sinewave | frequencyBars): Self = StObject.set(x, "visualSetting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisualSettingUndefined: Self = StObject.set(x, "visualSetting", js.undefined)
    }
  }
  
  @js.native
  trait ReactMicStopEvent extends StObject {
    
    var blob: Blob = js.native
    
    var blobURL: String = js.native
    
    var option: AudioBitsPerSecond = js.native
    
    var startTime: Double = js.native
    
    var stopTime: Double = js.native
  }
  object ReactMicStopEvent {
    
    @scala.inline
    def apply(blob: Blob, blobURL: String, option: AudioBitsPerSecond, startTime: Double, stopTime: Double): ReactMicStopEvent = {
      val __obj = js.Dynamic.literal(blob = blob.asInstanceOf[js.Any], blobURL = blobURL.asInstanceOf[js.Any], option = option.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], stopTime = stopTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactMicStopEvent]
    }
    
    @scala.inline
    implicit class ReactMicStopEventMutableBuilder[Self <: ReactMicStopEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlob(value: Blob): Self = StObject.set(x, "blob", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlobURL(value: String): Self = StObject.set(x, "blobURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOption(value: AudioBitsPerSecond): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStopTime(value: Double): Self = StObject.set(x, "stopTime", value.asInstanceOf[js.Any])
    }
  }
}
