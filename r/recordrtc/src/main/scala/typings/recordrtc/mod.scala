package typings.recordrtc

import typings.recordrtc.anon.Height
import typings.recordrtc.anon.Image
import typings.recordrtc.anon.KinDiskStorageTypeBlob
import typings.recordrtc.anon.OnRecordingStopped
import typings.recordrtc.recordrtcInts.`1024`
import typings.recordrtc.recordrtcInts.`16384`
import typings.recordrtc.recordrtcInts.`1`
import typings.recordrtc.recordrtcInts.`2048`
import typings.recordrtc.recordrtcInts.`256`
import typings.recordrtc.recordrtcInts.`2`
import typings.recordrtc.recordrtcInts.`4096`
import typings.recordrtc.recordrtcInts.`512`
import typings.recordrtc.recordrtcInts.`8192`
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
import typings.std.Blob
import typings.std.File
import typings.std.HTMLCanvasElement
import typings.std.HTMLElement
import typings.std.HTMLVideoElement
import typings.std.MediaStream
import typings.std.MediaStreamTrack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("recordrtc", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with RecordRTC {
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
  open class CanvasRecorder protected ()
    extends StObject
       with Recorder {
    def this(htmlElement: MediaStream, config: Any) = this()
  }
  
  /** DiskStorage is a standalone object used by RecordRTC to store recorded blobs in IndexedDB storage. */
  /* static member */
  object DiskStorage {
    
    @JSImport("recordrtc", "DiskStorage")
    @js.native
    val ^ : js.Any = js.native
    
    inline def Fetch(cb: js.Function2[/* dataURL */ String, /* type */ DiskStorageType, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Fetch")(cb.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def Store(data: KinDiskStorageTypeBlob): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Store")(data.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("recordrtc", "DiskStorage.dataStoreName")
    @js.native
    def dataStoreName: String = js.native
    inline def dataStoreName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dataStoreName")(x.asInstanceOf[js.Any])
    
    inline def init(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[Unit]
    
    inline def onError(error: js.Error): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onError")(error.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSImport("recordrtc", "GifRecorder")
  @js.native
  open class GifRecorder protected ()
    extends StObject
       with Recorder {
    def this(mediaStream: MediaStream, config: Any) = this()
  }
  
  /* tslint:disable:no-unnecessary-class */
  @JSImport("recordrtc", "MediaStreamRecorder")
  @js.native
  open class MediaStreamRecorder protected ()
    extends StObject
       with Recorder {
    def this(mediaStream: MediaStream, config: Any) = this()
  }
  
  @JSImport("recordrtc", "MultiStreamRecorder")
  @js.native
  /**
    * MultiStreamRecorder can record multiple videos in single container.
    * @summary Multi-videos recorder.
    * @license {@link https://github.com/muaz-khan/RecordRTC/blob/master/LICENSE|MIT}
    * @example
    * var options = {
    *     mimeType: 'video/webm'
    * }
    * var recorder = new MultiStreamRecorder(ArrayOfMediaStreams, options);
    * recorder.record();
    * recorder.stop(function(blob) {
    *     video.src = URL.createObjectURL(blob);
    *
    *     // or
    *     var blob = recorder.blob;
    * });
    * @see {@link https://github.com/muaz-khan/RecordRTC|RecordRTC Source Code}
    * @param mediaStreams - Array of MediaStreams.
    * @param config - {disableLogs:true, frameInterval: 1, mimeType: "video/webm"}
    */
  open class MultiStreamRecorder ()
    extends StObject
       with Recorder {
    def this(stream: js.Array[MediaStream]) = this()
    def this(stream: js.Array[MediaStream], config: Any) = this()
    def this(stream: Unit, config: Any) = this()
    
    /**
      * Add extra media-streams to existing recordings.
      * @param mediaStreams - Array of MediaStreams
      * @example
      * recorder.addStreams([newAudioStream, newVideoStream]);
      */
    def addStreams(streams: js.Array[MediaStream]): Unit = js.native
    
    /**
      * This method resets currently recorded data.
      * @example
      * recorder.clearRecordedData();
      */
    def clearRecordedData(): Unit = js.native
    
    /**
      * Returns MultiStreamsMixer
      * @param mediaStreams - Array of MediaStreams
      * @example
      * let mixer = recorder.getMixer();
      * mixer.appendStreams([newStream]);
      */
    def getMixer(): MultiStreamsMixer = js.native
    
    /**
      * This method pauses the recording process.
      * @example
      * recorder.pause();
      */
    def pause(): Unit = js.native
    
    /**
      * This method records all MediaStreams.
      * @example
      * recorder.record();
      */
    def record(): Unit = js.native
    
    /**
      * Reset videos during live recording. Replace old videos e.g. replace cameras with full-screen.
      * @param mediaStreams - Array of MediaStreams
      * @example
      * recorder.resetVideoStreams([newVideo1, newVideo2]);
      */
    def resetVideoStreams(streams: js.Array[MediaStream]): Unit = js.native
    
    /**
      * This method resumes the recording process.
      * @example
      * recorder.resume();
      */
    def resume(): Unit = js.native
    
    /**
      * This method stops recording MediaStream.
      * @param callback - Callback function, that is used to pass recorded blob back to the callee.
      * @example
      * recorder.stop(function(blob) {
      *     video.src = URL.createObjectURL(blob);
      * });
      */
    def stop(callback: js.Function1[/* blob */ Blob, Unit]): Unit = js.native
  }
  
  @JSImport("recordrtc", "MultiStreamsMixer")
  @js.native
  open class MultiStreamsMixer protected ()
    extends StObject
       with Recorder {
    def this(arrayOfMediaStreams: js.Array[MediaStream], elementClass: String) = this()
  }
  
  @JSImport("recordrtc", "RecordRTCPromisesHandler")
  @js.native
  open class RecordRTCPromisesHandler protected ()
    extends StObject
       with Recorder {
    def this(stream: HTMLCanvasElement) = this()
    def this(stream: HTMLElement) = this()
    def this(stream: HTMLVideoElement) = this()
    def this(stream: MediaStream) = this()
    def this(stream: HTMLCanvasElement, options: Options) = this()
    def this(stream: HTMLElement, options: Options) = this()
    def this(stream: HTMLVideoElement, options: Options) = this()
    def this(stream: MediaStream, options: Options) = this()
    
    var blob: Blob | Null = js.native
    
    def destroy(): js.Promise[Unit] = js.native
    
    def getBlob(): js.Promise[Blob] = js.native
    
    def getDataURL(): js.Promise[String] = js.native
    
    def getInternalRecorder(): js.Promise[Recorder] = js.native
    
    def getState(): js.Promise[State] = js.native
    
    def pauseRecording(): js.Promise[Unit] = js.native
    
    var recordRTC: RecordRTC = js.native
    
    def reset(): js.Promise[Unit] = js.native
    
    def resumeRecording(): js.Promise[Unit] = js.native
    
    def startRecording(): js.Promise[Unit] = js.native
    
    def stopRecording(): js.Promise[String] = js.native
    
    var version: String = js.native
  }
  
  @JSImport("recordrtc", "StereoAudioRecorder")
  @js.native
  open class StereoAudioRecorder protected ()
    extends StObject
       with Recorder {
    def this(mediaStream: MediaStream) = this()
    def this(mediaStream: MediaStream, config: Options) = this()
    
    /**
      * The recorded blob object.
      */
    var blob: Blob = js.native
    
    /**
      * The recorded buffer object.
      */
    var buffer: js.typedarray.ArrayBuffer = js.native
    
    /**
      * Buffer-size for how frequently the audioprocess event is dispatched.
      * @example
      * recorder = new StereoAudioRecorder(mediaStream, {
      *     bufferSize: 4096
      * });
      */
    var bufferSize: Double = js.native
    
    /**
      * This method resets currently recorded data.
      */
    def clearRecordedData(): Unit = js.native
    
    /**
      * Desired Bits per sample * 1000
      * @example
      * var recorder = StereoAudioRecorder(mediaStream, {
      *        desiredSampRate: 16 * 1000 // bits-per-sample * 1000
      *       });
      */
    var desiredSampRate: Double = js.native
    
    /**
      * This method is called on "onaudioprocess" event's first invocation.
      */
    def onAudioProcessStarted(): Unit = js.native
    
    /**
      * This method pauses the recording process.
      */
    def pause(): Unit = js.native
    
    /**
      * This method records MediaStream.
      */
    def record(): Unit = js.native
    
    /**
      * This method resumes the recording process.
      */
    def resume(): Unit = js.native
    
    /**
      * The sample rate (in sample-frames per second) at which the AudioContext handles audio
      *
      * @example
      * recorder = new StereoAudioRecorder(mediaStream, {
      *     sampleRate: 44100
      * });
      */
    var sampleRate: Double = js.native
    
    /**
      * This method stops recording MediaStream.
      * @param callback - Callback function, that is used to pass recorded blob back to the callee.
      * @example
      * recorder.stop(function(blob) {
      *     video.src = URL.createObjectURL(blob);
      * });
      */
    def stop(callback: js.Function1[/* blob */ Blob, Unit]): Unit = js.native
    
    /**
      * The recorded data-view object.
      */
    var view: Any = js.native
  }
  
  @JSImport("recordrtc", "WebAssemblyRecorder")
  @js.native
  open class WebAssemblyRecorder protected ()
    extends StObject
       with Recorder {
    def this(mediaStream: MediaStream, config: Any) = this()
  }
  
  @JSImport("recordrtc", "WhammyRecorder")
  @js.native
  open class WhammyRecorder protected ()
    extends StObject
       with Recorder {
    def this(mediaStream: MediaStream, config: Any) = this()
  }
  
  /** Given a number of bytes, this returns a human-readable string, e.g. 1.23 MB */
  /* static member */
  inline def bytesToSize(size: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("bytesToSize")(size.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* static member */
  inline def getSeekableBlob(inputBlob: Blob, cb: js.Function1[/* outputBlob */ Blob, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getSeekableBlob")(inputBlob.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** invokes the browser's Save-As dialog */
  /* static member */
  inline def invokeSaveAsDialog(file: Blob): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("invokeSaveAsDialog")(file.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def invokeSaveAsDialog(file: Blob, fileName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("invokeSaveAsDialog")(file.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def invokeSaveAsDialog(file: File): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("invokeSaveAsDialog")(file.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def invokeSaveAsDialog(file: File, fileName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("invokeSaveAsDialog")(file.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** returns true if running in an Electron environment */
  /* static member */
  inline def isElectron(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isElectron")().asInstanceOf[Boolean]
  
  //
  // static helpers
  //
  /** RecordRTC version */
  /* static member */
  @JSImport("recordrtc", "version")
  @js.native
  def version: String = js.native
  inline def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  
  trait Disk extends StObject {
    
    var audio: js.UndefOr[Blob] = js.undefined
    
    var gif: js.UndefOr[Blob] = js.undefined
    
    var video: js.UndefOr[Blob] = js.undefined
  }
  object Disk {
    
    inline def apply(): Disk = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Disk]
    }
    
    extension [Self <: Disk](x: Self) {
      
      inline def setAudio(value: Blob): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
      
      inline def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
      
      inline def setGif(value: Blob): Self = StObject.set(x, "gif", value.asInstanceOf[js.Any])
      
      inline def setGifUndefined: Self = StObject.set(x, "gif", js.undefined)
      
      inline def setVideo(value: Blob): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
      
      inline def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.recordrtc.recordrtcStrings.audioBlob
    - typings.recordrtc.recordrtcStrings.videoBlob
    - typings.recordrtc.recordrtcStrings.gifBlob
  */
  trait DiskStorageType extends StObject
  object DiskStorageType {
    
    inline def audioBlob: typings.recordrtc.recordrtcStrings.audioBlob = "audioBlob".asInstanceOf[typings.recordrtc.recordrtcStrings.audioBlob]
    
    inline def gifBlob: typings.recordrtc.recordrtcStrings.gifBlob = "gifBlob".asInstanceOf[typings.recordrtc.recordrtcStrings.gifBlob]
    
    inline def videoBlob: typings.recordrtc.recordrtcStrings.videoBlob = "videoBlob".asInstanceOf[typings.recordrtc.recordrtcStrings.videoBlob]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.recordrtc.recordrtcStrings.videoinput
    - typings.recordrtc.recordrtcStrings.audioinput
    - typings.recordrtc.recordrtcStrings.audiooutput
  */
  trait MediaStreamKind extends StObject
  object MediaStreamKind {
    
    inline def audioinput: typings.recordrtc.recordrtcStrings.audioinput = "audioinput".asInstanceOf[typings.recordrtc.recordrtcStrings.audioinput]
    
    inline def audiooutput: typings.recordrtc.recordrtcStrings.audiooutput = "audiooutput".asInstanceOf[typings.recordrtc.recordrtcStrings.audiooutput]
    
    inline def videoinput: typings.recordrtc.recordrtcStrings.videoinput = "videoinput".asInstanceOf[typings.recordrtc.recordrtcStrings.videoinput]
  }
  
  trait Options extends StObject {
    
    /** only for audio track */
    var audioBitsPerSecond: js.UndefOr[Double] = js.undefined
    
    /** used by WebAssemblyRecorder */
    var bitrate: js.UndefOr[Double] = js.undefined
    
    /** both for audio and video tracks */
    var bitsPerSecond: js.UndefOr[Double] = js.undefined
    
    /** used by StereoAudioRecorder */
    var bufferSize: js.UndefOr[`256` | `512` | `1024` | `2048` | `4096` | `8192` | `16384`] = js.undefined
    
    /** used by CanvasRecorder and WhammyRecorder */
    var canvas: js.UndefOr[Height] = js.undefined
    
    /** auto stop recording if camera stops */
    var checkForInactiveTracks: js.UndefOr[Boolean] = js.undefined
    
    /** used by StereoAudioRecorder. the range is 22050 to 96000 (kHz). */
    var desiredSampRate: js.UndefOr[Double] = js.undefined
    
    var disableLogs: js.UndefOr[Boolean] = js.undefined
    
    /** used by MultiStreamRecorder - to access HTMLCanvasElement */
    var elementClass: js.UndefOr[String] = js.undefined
    
    /** used by CanvasRecorder and WhammyRecorder, it is kind of a "frameRate" */
    var frameInterval: js.UndefOr[Double] = js.undefined
    
    /** used by WebAssemblyRecorder */
    var frameRate: js.UndefOr[Double] = js.undefined
    
    var mimeType: js.UndefOr[
        audioSlashwebm | audioSlashwebmSemicoloncodecsEqualssignpcm | videoSlashmp4 | videoSlashwebm | videoSlashwebmSemicoloncodecsEqualssignvp9 | videoSlashwebmSemicoloncodecsEqualssignvp8 | videoSlashwebmSemicoloncodecsEqualssignh264 | `videoSlashx-matroskaSemicoloncodecsEqualssignavc1` | videoSlashmpeg | audioSlashwav | audioSlashogg
      ] = js.undefined
    
    /** used by StereoAudioRecorder */
    var numberOfAudioChannels: js.UndefOr[`1` | `2`] = js.undefined
    
    /** requires timeSlice above */
    var onTimeStamp: js.UndefOr[js.Function2[/* timestamp */ Double, /* timestamps */ js.Array[Double], Unit]] = js.undefined
    
    /** requires `timeSlice` to be set */
    var ondataavailable: js.UndefOr[js.Function1[/* blob */ Blob, Unit]] = js.undefined
    
    /** if you are recording multiple streams into single file, this helps you see what is being recorded */
    var previewStream: js.UndefOr[js.Function1[/* stream */ MediaStream, Unit]] = js.undefined
    
    var recorderType: js.UndefOr[Recorder] = js.undefined
    
    /** used by StereoAudioRecorder, the range is 22050 to 96000 (kHz). */
    var sampleRate: js.UndefOr[Double] = js.undefined
    
    /** get intervals based blobs value in milliseconds */
    var timeSlice: js.UndefOr[Double] = js.undefined
    
    var `type`: js.UndefOr[video | audio | canvas | gif] = js.undefined
    
    /** used by CanvasRecorder and WhammyRecorder */
    var video: js.UndefOr[HTMLVideoElement] = js.undefined
    
    /** only for video track */
    var videoBitsPerSecond: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAudioBitsPerSecond(value: Double): Self = StObject.set(x, "audioBitsPerSecond", value.asInstanceOf[js.Any])
      
      inline def setAudioBitsPerSecondUndefined: Self = StObject.set(x, "audioBitsPerSecond", js.undefined)
      
      inline def setBitrate(value: Double): Self = StObject.set(x, "bitrate", value.asInstanceOf[js.Any])
      
      inline def setBitrateUndefined: Self = StObject.set(x, "bitrate", js.undefined)
      
      inline def setBitsPerSecond(value: Double): Self = StObject.set(x, "bitsPerSecond", value.asInstanceOf[js.Any])
      
      inline def setBitsPerSecondUndefined: Self = StObject.set(x, "bitsPerSecond", js.undefined)
      
      inline def setBufferSize(value: `256` | `512` | `1024` | `2048` | `4096` | `8192` | `16384`): Self = StObject.set(x, "bufferSize", value.asInstanceOf[js.Any])
      
      inline def setBufferSizeUndefined: Self = StObject.set(x, "bufferSize", js.undefined)
      
      inline def setCanvas(value: Height): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
      
      inline def setCanvasUndefined: Self = StObject.set(x, "canvas", js.undefined)
      
      inline def setCheckForInactiveTracks(value: Boolean): Self = StObject.set(x, "checkForInactiveTracks", value.asInstanceOf[js.Any])
      
      inline def setCheckForInactiveTracksUndefined: Self = StObject.set(x, "checkForInactiveTracks", js.undefined)
      
      inline def setDesiredSampRate(value: Double): Self = StObject.set(x, "desiredSampRate", value.asInstanceOf[js.Any])
      
      inline def setDesiredSampRateUndefined: Self = StObject.set(x, "desiredSampRate", js.undefined)
      
      inline def setDisableLogs(value: Boolean): Self = StObject.set(x, "disableLogs", value.asInstanceOf[js.Any])
      
      inline def setDisableLogsUndefined: Self = StObject.set(x, "disableLogs", js.undefined)
      
      inline def setElementClass(value: String): Self = StObject.set(x, "elementClass", value.asInstanceOf[js.Any])
      
      inline def setElementClassUndefined: Self = StObject.set(x, "elementClass", js.undefined)
      
      inline def setFrameInterval(value: Double): Self = StObject.set(x, "frameInterval", value.asInstanceOf[js.Any])
      
      inline def setFrameIntervalUndefined: Self = StObject.set(x, "frameInterval", js.undefined)
      
      inline def setFrameRate(value: Double): Self = StObject.set(x, "frameRate", value.asInstanceOf[js.Any])
      
      inline def setFrameRateUndefined: Self = StObject.set(x, "frameRate", js.undefined)
      
      inline def setMimeType(
        value: audioSlashwebm | audioSlashwebmSemicoloncodecsEqualssignpcm | videoSlashmp4 | videoSlashwebm | videoSlashwebmSemicoloncodecsEqualssignvp9 | videoSlashwebmSemicoloncodecsEqualssignvp8 | videoSlashwebmSemicoloncodecsEqualssignh264 | `videoSlashx-matroskaSemicoloncodecsEqualssignavc1` | videoSlashmpeg | audioSlashwav | audioSlashogg
      ): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
      
      inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
      
      inline def setNumberOfAudioChannels(value: `1` | `2`): Self = StObject.set(x, "numberOfAudioChannels", value.asInstanceOf[js.Any])
      
      inline def setNumberOfAudioChannelsUndefined: Self = StObject.set(x, "numberOfAudioChannels", js.undefined)
      
      inline def setOnTimeStamp(value: (/* timestamp */ Double, /* timestamps */ js.Array[Double]) => Unit): Self = StObject.set(x, "onTimeStamp", js.Any.fromFunction2(value))
      
      inline def setOnTimeStampUndefined: Self = StObject.set(x, "onTimeStamp", js.undefined)
      
      inline def setOndataavailable(value: /* blob */ Blob => Unit): Self = StObject.set(x, "ondataavailable", js.Any.fromFunction1(value))
      
      inline def setOndataavailableUndefined: Self = StObject.set(x, "ondataavailable", js.undefined)
      
      inline def setPreviewStream(value: /* stream */ MediaStream => Unit): Self = StObject.set(x, "previewStream", js.Any.fromFunction1(value))
      
      inline def setPreviewStreamUndefined: Self = StObject.set(x, "previewStream", js.undefined)
      
      inline def setRecorderType(value: Recorder): Self = StObject.set(x, "recorderType", value.asInstanceOf[js.Any])
      
      inline def setRecorderTypeUndefined: Self = StObject.set(x, "recorderType", js.undefined)
      
      inline def setSampleRate(value: Double): Self = StObject.set(x, "sampleRate", value.asInstanceOf[js.Any])
      
      inline def setSampleRateUndefined: Self = StObject.set(x, "sampleRate", js.undefined)
      
      inline def setTimeSlice(value: Double): Self = StObject.set(x, "timeSlice", value.asInstanceOf[js.Any])
      
      inline def setTimeSliceUndefined: Self = StObject.set(x, "timeSlice", js.undefined)
      
      inline def setType(value: video | audio | canvas | gif): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setVideo(value: HTMLVideoElement): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
      
      inline def setVideoBitsPerSecond(value: Double): Self = StObject.set(x, "videoBitsPerSecond", value.asInstanceOf[js.Any])
      
      inline def setVideoBitsPerSecondUndefined: Self = StObject.set(x, "videoBitsPerSecond", js.undefined)
      
      inline def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
    }
  }
  
  @js.native
  trait RecordRTC extends StObject {
    
    /** recorded blob property */
    val blob: Blob = js.native
    
    /** array buffer; useful only for StereoAudioRecorder */
    val buffer: js.typedarray.ArrayBuffer = js.native
    
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
    
    /** get recorded blob from indexded-db storage */
    def getFromDisk(
      `type`: audio | video | gif,
      cb: js.Function2[/* dataURL */ String, /* type */ audio | video | gif, Unit]
    ): Unit = js.native
    def getFromDisk(`type`: all, cb: js.Function2[/* dataURL */ String, /* type */ audio | video | gif, Unit]): Unit = js.native
    
    /** returns internal recorder */
    def getInternalRecorder(): Recorder = js.native
    
    /** get recorder's state */
    def getState(): State = js.native
    
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
    def setRecordingDuration(milliSeconds: Double): OnRecordingStopped = js.native
    /** auto stop recording after specific duration */
    def setRecordingDuration(milliSeconds: Double, onRecordingStopped: js.Function0[Unit]): Unit = js.native
    
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
    - typings.recordrtc.mod.MediaStreamRecorder
    - typings.recordrtc.mod.StereoAudioRecorder
    - typings.recordrtc.mod.WebAssemblyRecorder
    - typings.recordrtc.mod.CanvasRecorder
    - typings.recordrtc.mod.GifRecorder
    - typings.recordrtc.mod.WhammyRecorder
    - typings.recordrtc.mod.MultiStreamsMixer
    - typings.recordrtc.mod.MultiStreamRecorder
    - typings.recordrtc.mod.RecordRTCPromisesHandler
  */
  trait Recorder extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.recordrtc.recordrtcStrings.inactive
    - typings.recordrtc.recordrtcStrings.recording
    - typings.recordrtc.recordrtcStrings.stopped
    - typings.recordrtc.recordrtcStrings.paused
    - typings.recordrtc.recordrtcStrings.destroyed
  */
  trait State extends StObject
  object State {
    
    inline def destroyed: typings.recordrtc.recordrtcStrings.destroyed = "destroyed".asInstanceOf[typings.recordrtc.recordrtcStrings.destroyed]
    
    inline def inactive: typings.recordrtc.recordrtcStrings.inactive = "inactive".asInstanceOf[typings.recordrtc.recordrtcStrings.inactive]
    
    inline def paused: typings.recordrtc.recordrtcStrings.paused = "paused".asInstanceOf[typings.recordrtc.recordrtcStrings.paused]
    
    inline def recording: typings.recordrtc.recordrtcStrings.recording = "recording".asInstanceOf[typings.recordrtc.recordrtcStrings.recording]
    
    inline def stopped: typings.recordrtc.recordrtcStrings.stopped = "stopped".asInstanceOf[typings.recordrtc.recordrtcStrings.stopped]
  }
}
