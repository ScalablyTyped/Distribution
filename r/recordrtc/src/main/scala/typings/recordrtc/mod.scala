package typings.recordrtc

import typings.recordrtc.anon.Height
import typings.recordrtc.anon.Image
import typings.recordrtc.recordrtcNumbers.`1024`
import typings.recordrtc.recordrtcNumbers.`16384`
import typings.recordrtc.recordrtcNumbers.`1`
import typings.recordrtc.recordrtcNumbers.`2048`
import typings.recordrtc.recordrtcNumbers.`256`
import typings.recordrtc.recordrtcNumbers.`2`
import typings.recordrtc.recordrtcNumbers.`4096`
import typings.recordrtc.recordrtcNumbers.`512`
import typings.recordrtc.recordrtcNumbers.`8192`
import typings.recordrtc.recordrtcStrings.`videoSlashx-matroskaSemicoloncodecsEqualssignavc1`
import typings.recordrtc.recordrtcStrings.all
import typings.recordrtc.recordrtcStrings.audio
import typings.recordrtc.recordrtcStrings.audioSlashogg
import typings.recordrtc.recordrtcStrings.audioSlashwav
import typings.recordrtc.recordrtcStrings.audioSlashwebm
import typings.recordrtc.recordrtcStrings.audioSlashwebmSemicoloncodecsEqualssignpcm
import typings.recordrtc.recordrtcStrings.canvas
import typings.recordrtc.recordrtcStrings.gif
import typings.recordrtc.recordrtcStrings.video
import typings.recordrtc.recordrtcStrings.videoSlashmp4
import typings.recordrtc.recordrtcStrings.videoSlashmpeg
import typings.recordrtc.recordrtcStrings.videoSlashwebm
import typings.recordrtc.recordrtcStrings.videoSlashwebmSemicoloncodecsEqualssignh264
import typings.recordrtc.recordrtcStrings.videoSlashwebmSemicoloncodecsEqualssignvp8
import typings.recordrtc.recordrtcStrings.videoSlashwebmSemicoloncodecsEqualssignvp9
import typings.std.ArrayBuffer
import typings.std.Blob
import typings.std.File
import typings.std.HTMLCanvasElement
import typings.std.HTMLElement
import typings.std.HTMLVideoElement
import typings.std.MediaStream
import typings.std.MediaStreamTrack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("recordrtc", JSImport.Namespace)
  @js.native
  class ^ protected () extends RecordRTC {
    def this(stream: HTMLCanvasElement) = this()
    def this(stream: HTMLElement) = this()
    def this(stream: HTMLVideoElement) = this()
    def this(stream: MediaStream) = this()
    def this(stream: HTMLCanvasElement, options: Options) = this()
    def this(stream: HTMLElement, options: Options) = this()
    def this(stream: HTMLVideoElement, options: Options) = this()
    def this(stream: MediaStream, options: Options) = this()
  }
  @JSImport("recordrtc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("recordrtc", "CanvasRecorder")
  @js.native
  class CanvasRecorder protected () extends StObject {
    def this(htmlElement: js.Any, config: js.Any) = this()
  }
  
  @JSImport("recordrtc", "GifRecorder")
  @js.native
  class GifRecorder protected () extends StObject {
    def this(mediaStream: js.Any, config: js.Any) = this()
  }
  
  /* tslint:disable:no-unnecessary-class */
  @JSImport("recordrtc", "MediaStreamRecorder")
  @js.native
  class MediaStreamRecorder protected () extends StObject {
    def this(mediaStream: js.Any, config: js.Any) = this()
  }
  
  @JSImport("recordrtc", "StereoAudioRecorder")
  @js.native
  class StereoAudioRecorder protected () extends StObject {
    def this(mediaStream: js.Any, config: js.Any) = this()
  }
  
  @JSImport("recordrtc", "WebAssemblyRecorder")
  @js.native
  class WebAssemblyRecorder protected () extends StObject {
    def this(stream: js.Any, config: js.Any) = this()
  }
  
  @JSImport("recordrtc", "WhammyRecorder")
  @js.native
  class WhammyRecorder protected () extends StObject {
    def this(mediaStream: js.Any, config: js.Any) = this()
  }
  
  /** Given a number of bytes, this returns a human-readable string, e.g. 1.23 MB */
  /* static member */
  @JSImport("recordrtc", "bytesToSize")
  @js.native
  def bytesToSize(size: Double): String = js.native
  
  /** invokes the browser's Save-As dialog */
  /* static member */
  @JSImport("recordrtc", "invokeSaveAsDialog")
  @js.native
  def invokeSaveAsDialog(file: Blob, fileName: String): Unit = js.native
  @JSImport("recordrtc", "invokeSaveAsDialog")
  @js.native
  def invokeSaveAsDialog(file: File, fileName: String): Unit = js.native
  
  //
  // static helpers
  //
  /** RecordRTC version */
  /* static member */
  @JSImport("recordrtc", "version")
  @js.native
  def version: String = js.native
  @scala.inline
  def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  
  @js.native
  trait Disk extends StObject {
    
    var audio: js.UndefOr[Blob] = js.native
    
    var gif: js.UndefOr[Blob] = js.native
    
    var video: js.UndefOr[Blob] = js.native
  }
  object Disk {
    
    @scala.inline
    def apply(): Disk = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Disk]
    }
    
    @scala.inline
    implicit class DiskMutableBuilder[Self <: Disk] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAudio(value: Blob): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
      
      @scala.inline
      def setGif(value: Blob): Self = StObject.set(x, "gif", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGifUndefined: Self = StObject.set(x, "gif", js.undefined)
      
      @scala.inline
      def setVideo(value: Blob): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.recordrtc.recordrtcStrings.videoinput
    - typings.recordrtc.recordrtcStrings.audioinput
    - typings.recordrtc.recordrtcStrings.audiooutput
  */
  trait MediaStreamKind extends StObject
  object MediaStreamKind {
    
    @scala.inline
    def audioinput: typings.recordrtc.recordrtcStrings.audioinput = "audioinput".asInstanceOf[typings.recordrtc.recordrtcStrings.audioinput]
    
    @scala.inline
    def audiooutput: typings.recordrtc.recordrtcStrings.audiooutput = "audiooutput".asInstanceOf[typings.recordrtc.recordrtcStrings.audiooutput]
    
    @scala.inline
    def videoinput: typings.recordrtc.recordrtcStrings.videoinput = "videoinput".asInstanceOf[typings.recordrtc.recordrtcStrings.videoinput]
  }
  
  @js.native
  trait Options extends StObject {
    
    /** only for audio track */
    var audioBitsPerSecond: js.UndefOr[Double] = js.native
    
    /** used by WebAssemblyRecorder */
    var bitrate: js.UndefOr[Double] = js.native
    
    /** both for audio and video tracks */
    var bitsPerSecond: js.UndefOr[Double] = js.native
    
    /** used by StereoAudioRecorder */
    var bufferSize: js.UndefOr[`256` | `512` | `1024` | `2048` | `4096` | `8192` | `16384`] = js.native
    
    /** used by CanvasRecorder and WhammyRecorder */
    var canvas: js.UndefOr[Height] = js.native
    
    /** auto stop recording if camera stops */
    var checkForInactiveTracks: js.UndefOr[Boolean] = js.native
    
    /** used by StereoAudioRecorder. the range is 22050 to 96000 (kHz). */
    var desiredSampRate: js.UndefOr[Double] = js.native
    
    var disableLogs: js.UndefOr[Boolean] = js.native
    
    /** used by MultiStreamRecorder - to access HTMLCanvasElement */
    var elementClass: js.UndefOr[String] = js.native
    
    /** used by CanvasRecorder and WhammyRecorder, it is kind of a "frameRate" */
    var frameInterval: js.UndefOr[Double] = js.native
    
    /** used by WebAssemblyRecorder */
    var frameRate: js.UndefOr[Double] = js.native
    
    var mimeType: js.UndefOr[
        audioSlashwebm | audioSlashwebmSemicoloncodecsEqualssignpcm | videoSlashmp4 | videoSlashwebm | videoSlashwebmSemicoloncodecsEqualssignvp9 | videoSlashwebmSemicoloncodecsEqualssignvp8 | videoSlashwebmSemicoloncodecsEqualssignh264 | `videoSlashx-matroskaSemicoloncodecsEqualssignavc1` | videoSlashmpeg | audioSlashwav | audioSlashogg
      ] = js.native
    
    /** used by StereoAudioRecorder */
    var numberOfAudioChannels: js.UndefOr[`1` | `2`] = js.native
    
    /** requires timeSlice above */
    var onTimeStamp: js.UndefOr[js.Function2[/* timestamp */ Double, /* timestamps */ js.Array[Double], Unit]] = js.native
    
    /** requires `timeSlice` to be set */
    var ondataavailable: js.UndefOr[js.Function1[/* blob */ Blob, Unit]] = js.native
    
    /** if you are recording multiple streams into single file, this helps you see what is being recorded */
    var previewStream: js.UndefOr[js.Function1[/* stream */ MediaStream, Unit]] = js.native
    
    var recorderType: js.UndefOr[
        MediaStreamRecorder | StereoAudioRecorder | WebAssemblyRecorder | CanvasRecorder | GifRecorder | WhammyRecorder
      ] = js.native
    
    /** used by StereoAudioRecorder, the range is 22050 to 96000 (kHz). */
    var sampleRate: js.UndefOr[Double] = js.native
    
    /** get intervals based blobs value in milliseconds */
    var timeSlice: js.UndefOr[Double] = js.native
    
    var `type`: js.UndefOr[video | audio | canvas | gif] = js.native
    
    /** used by CanvasRecorder and WhammyRecorder */
    var video: js.UndefOr[HTMLVideoElement] = js.native
    
    /** only for video track */
    var videoBitsPerSecond: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAudioBitsPerSecond(value: Double): Self = StObject.set(x, "audioBitsPerSecond", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAudioBitsPerSecondUndefined: Self = StObject.set(x, "audioBitsPerSecond", js.undefined)
      
      @scala.inline
      def setBitrate(value: Double): Self = StObject.set(x, "bitrate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBitrateUndefined: Self = StObject.set(x, "bitrate", js.undefined)
      
      @scala.inline
      def setBitsPerSecond(value: Double): Self = StObject.set(x, "bitsPerSecond", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBitsPerSecondUndefined: Self = StObject.set(x, "bitsPerSecond", js.undefined)
      
      @scala.inline
      def setBufferSize(value: `256` | `512` | `1024` | `2048` | `4096` | `8192` | `16384`): Self = StObject.set(x, "bufferSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBufferSizeUndefined: Self = StObject.set(x, "bufferSize", js.undefined)
      
      @scala.inline
      def setCanvas(value: Height): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanvasUndefined: Self = StObject.set(x, "canvas", js.undefined)
      
      @scala.inline
      def setCheckForInactiveTracks(value: Boolean): Self = StObject.set(x, "checkForInactiveTracks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckForInactiveTracksUndefined: Self = StObject.set(x, "checkForInactiveTracks", js.undefined)
      
      @scala.inline
      def setDesiredSampRate(value: Double): Self = StObject.set(x, "desiredSampRate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDesiredSampRateUndefined: Self = StObject.set(x, "desiredSampRate", js.undefined)
      
      @scala.inline
      def setDisableLogs(value: Boolean): Self = StObject.set(x, "disableLogs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableLogsUndefined: Self = StObject.set(x, "disableLogs", js.undefined)
      
      @scala.inline
      def setElementClass(value: String): Self = StObject.set(x, "elementClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementClassUndefined: Self = StObject.set(x, "elementClass", js.undefined)
      
      @scala.inline
      def setFrameInterval(value: Double): Self = StObject.set(x, "frameInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrameIntervalUndefined: Self = StObject.set(x, "frameInterval", js.undefined)
      
      @scala.inline
      def setFrameRate(value: Double): Self = StObject.set(x, "frameRate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrameRateUndefined: Self = StObject.set(x, "frameRate", js.undefined)
      
      @scala.inline
      def setMimeType(
        value: audioSlashwebm | audioSlashwebmSemicoloncodecsEqualssignpcm | videoSlashmp4 | videoSlashwebm | videoSlashwebmSemicoloncodecsEqualssignvp9 | videoSlashwebmSemicoloncodecsEqualssignvp8 | videoSlashwebmSemicoloncodecsEqualssignh264 | `videoSlashx-matroskaSemicoloncodecsEqualssignavc1` | videoSlashmpeg | audioSlashwav | audioSlashogg
      ): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
      
      @scala.inline
      def setNumberOfAudioChannels(value: `1` | `2`): Self = StObject.set(x, "numberOfAudioChannels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberOfAudioChannelsUndefined: Self = StObject.set(x, "numberOfAudioChannels", js.undefined)
      
      @scala.inline
      def setOnTimeStamp(value: (/* timestamp */ Double, /* timestamps */ js.Array[Double]) => Unit): Self = StObject.set(x, "onTimeStamp", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnTimeStampUndefined: Self = StObject.set(x, "onTimeStamp", js.undefined)
      
      @scala.inline
      def setOndataavailable(value: /* blob */ Blob => Unit): Self = StObject.set(x, "ondataavailable", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOndataavailableUndefined: Self = StObject.set(x, "ondataavailable", js.undefined)
      
      @scala.inline
      def setPreviewStream(value: /* stream */ MediaStream => Unit): Self = StObject.set(x, "previewStream", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPreviewStreamUndefined: Self = StObject.set(x, "previewStream", js.undefined)
      
      @scala.inline
      def setRecorderType(
        value: MediaStreamRecorder | StereoAudioRecorder | WebAssemblyRecorder | CanvasRecorder | GifRecorder | WhammyRecorder
      ): Self = StObject.set(x, "recorderType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecorderTypeUndefined: Self = StObject.set(x, "recorderType", js.undefined)
      
      @scala.inline
      def setSampleRate(value: Double): Self = StObject.set(x, "sampleRate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSampleRateUndefined: Self = StObject.set(x, "sampleRate", js.undefined)
      
      @scala.inline
      def setTimeSlice(value: Double): Self = StObject.set(x, "timeSlice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeSliceUndefined: Self = StObject.set(x, "timeSlice", js.undefined)
      
      @scala.inline
      def setType(value: video | audio | canvas | gif): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setVideo(value: HTMLVideoElement): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVideoBitsPerSecond(value: Double): Self = StObject.set(x, "videoBitsPerSecond", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVideoBitsPerSecondUndefined: Self = StObject.set(x, "videoBitsPerSecond", js.undefined)
      
      @scala.inline
      def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
    }
  }
  
  @js.native
  trait RecordRTC extends StObject {
    
    /** recorded blob property */
    val blob: Blob = js.native
    
    /** array buffer; useful only for StereoAudioRecorder */
    val buffer: ArrayBuffer = js.native
    
    /** useful only for StereoAudioRecorder */
    val bufferSize: Double = js.native
    
    /** @deprecated clear recorded data */
    def clearRecordedData(): Unit = js.native
    
    /** clear memory; clear everything */
    def destroy(): Unit = js.native
    
    /** returns recorded Blob */
    def getBlob(): Blob = js.native
    
    /** returns Data-URL */
    def getDataURL(): String = js.native
    
    def getFromDisk(
      `type`: audio | video | gif,
      cb: js.Function2[/* dataURL */ String, /* type */ audio | video | gif, Unit]
    ): Unit = js.native
    /** get recorded blob from indexded-db storage */
    def getFromDisk(`type`: all, cb: js.Function2[/* dataURL */ String, /* type */ audio | video | gif, Unit]): Unit = js.native
    
    /** returns internal recorder */
    def getInternalRecorder(): Unit = js.native
    
    def getSeekableBlob(inputBlob: Blob, cb: js.Function1[/* outputBlob */ Blob, Unit]): Unit = js.native
    
    /** get recorder's state */
    def getState(): Unit = js.native
    
    def getTracks(stream: MediaStream, kind: MediaStreamKind): js.Array[MediaStreamTrack] = js.native
    
    /** @deprecated initialize the recorder */
    def initRecorder(): Unit = js.native
    
    /** fired if recorder's state changes */
    def onStateChanged(cb: js.Function1[/* state */ State, Unit]): Unit = js.native
    
    /** pause the recording */
    def pauseRecording(): Unit = js.native
    
    /** reset recorder states and remove the data */
    def reset(): Unit = js.native
    
    /** resume the recording */
    def resumeRecording(): Unit = js.native
    
    /** useful only for StereoAudioRecorder */
    val sampleRate: Double = js.native
    
    /** invoke save as dialog */
    def save(fileName: String): Unit = js.native
    
    /** @deprecated */
    def setAdvertisementArray(webPImages: js.Array[Image]): Unit = js.native
    
    /** auto stop recording after specific duration */
    def setRecordingDuration(): Unit = js.native
    
    /** start the recording */
    def startRecording(): Unit = js.native
    
    /** recorder's state */
    val state: String = js.native
    
    /** stop the recording. Call `getBlob` from inside callback function */
    def stopRecording(): Unit = js.native
    def stopRecording(cb: js.Function0[Unit]): Unit = js.native
    
    /** returns Blob-URL */
    def toURL(): String = js.native
    
    /** RecordRTC version */
    val version: String = js.native
    
    /** write recorded blob into indexed-db storage */
    def writeToDisk(options: Disk): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.recordrtc.recordrtcStrings.inactive
    - typings.recordrtc.recordrtcStrings.recording
    - typings.recordrtc.recordrtcStrings.stopped
    - typings.recordrtc.recordrtcStrings.paused
    - typings.recordrtc.recordrtcStrings.destroyed
  */
  trait State extends StObject
  object State {
    
    @scala.inline
    def destroyed: typings.recordrtc.recordrtcStrings.destroyed = "destroyed".asInstanceOf[typings.recordrtc.recordrtcStrings.destroyed]
    
    @scala.inline
    def inactive: typings.recordrtc.recordrtcStrings.inactive = "inactive".asInstanceOf[typings.recordrtc.recordrtcStrings.inactive]
    
    @scala.inline
    def paused: typings.recordrtc.recordrtcStrings.paused = "paused".asInstanceOf[typings.recordrtc.recordrtcStrings.paused]
    
    @scala.inline
    def recording: typings.recordrtc.recordrtcStrings.recording = "recording".asInstanceOf[typings.recordrtc.recordrtcStrings.recording]
    
    @scala.inline
    def stopped: typings.recordrtc.recordrtcStrings.stopped = "stopped".asInstanceOf[typings.recordrtc.recordrtcStrings.stopped]
  }
}
