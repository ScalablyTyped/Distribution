package typings.recordrtc.mod

import typings.recordrtc.anon.Height
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
import typings.std.HTMLVideoElement
import typings.std.MediaStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
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
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setAudioBitsPerSecond(value: Double): Self = this.set("audioBitsPerSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudioBitsPerSecond: Self = this.set("audioBitsPerSecond", js.undefined)
    
    @scala.inline
    def setBitrate(value: Double): Self = this.set("bitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBitrate: Self = this.set("bitrate", js.undefined)
    
    @scala.inline
    def setBitsPerSecond(value: Double): Self = this.set("bitsPerSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBitsPerSecond: Self = this.set("bitsPerSecond", js.undefined)
    
    @scala.inline
    def setBufferSize(value: `256` | `512` | `1024` | `2048` | `4096` | `8192` | `16384`): Self = this.set("bufferSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBufferSize: Self = this.set("bufferSize", js.undefined)
    
    @scala.inline
    def setCanvas(value: Height): Self = this.set("canvas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanvas: Self = this.set("canvas", js.undefined)
    
    @scala.inline
    def setCheckForInactiveTracks(value: Boolean): Self = this.set("checkForInactiveTracks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckForInactiveTracks: Self = this.set("checkForInactiveTracks", js.undefined)
    
    @scala.inline
    def setDesiredSampRate(value: Double): Self = this.set("desiredSampRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDesiredSampRate: Self = this.set("desiredSampRate", js.undefined)
    
    @scala.inline
    def setDisableLogs(value: Boolean): Self = this.set("disableLogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableLogs: Self = this.set("disableLogs", js.undefined)
    
    @scala.inline
    def setElementClass(value: String): Self = this.set("elementClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElementClass: Self = this.set("elementClass", js.undefined)
    
    @scala.inline
    def setFrameInterval(value: Double): Self = this.set("frameInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrameInterval: Self = this.set("frameInterval", js.undefined)
    
    @scala.inline
    def setFrameRate(value: Double): Self = this.set("frameRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrameRate: Self = this.set("frameRate", js.undefined)
    
    @scala.inline
    def setMimeType(
      value: audioSlashwebm | audioSlashwebmSemicoloncodecsEqualssignpcm | videoSlashmp4 | videoSlashwebm | videoSlashwebmSemicoloncodecsEqualssignvp9 | videoSlashwebmSemicoloncodecsEqualssignvp8 | videoSlashwebmSemicoloncodecsEqualssignh264 | `videoSlashx-matroskaSemicoloncodecsEqualssignavc1` | videoSlashmpeg | audioSlashwav | audioSlashogg
    ): Self = this.set("mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMimeType: Self = this.set("mimeType", js.undefined)
    
    @scala.inline
    def setNumberOfAudioChannels(value: `1` | `2`): Self = this.set("numberOfAudioChannels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberOfAudioChannels: Self = this.set("numberOfAudioChannels", js.undefined)
    
    @scala.inline
    def setOnTimeStamp(value: (/* timestamp */ Double, /* timestamps */ js.Array[Double]) => Unit): Self = this.set("onTimeStamp", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnTimeStamp: Self = this.set("onTimeStamp", js.undefined)
    
    @scala.inline
    def setOndataavailable(value: /* blob */ Blob => Unit): Self = this.set("ondataavailable", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOndataavailable: Self = this.set("ondataavailable", js.undefined)
    
    @scala.inline
    def setPreviewStream(value: /* stream */ MediaStream => Unit): Self = this.set("previewStream", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePreviewStream: Self = this.set("previewStream", js.undefined)
    
    @scala.inline
    def setRecorderType(
      value: MediaStreamRecorder | StereoAudioRecorder | WebAssemblyRecorder | CanvasRecorder | GifRecorder | WhammyRecorder
    ): Self = this.set("recorderType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecorderType: Self = this.set("recorderType", js.undefined)
    
    @scala.inline
    def setSampleRate(value: Double): Self = this.set("sampleRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSampleRate: Self = this.set("sampleRate", js.undefined)
    
    @scala.inline
    def setTimeSlice(value: Double): Self = this.set("timeSlice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeSlice: Self = this.set("timeSlice", js.undefined)
    
    @scala.inline
    def setType(value: video | audio | canvas | gif): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setVideo(value: HTMLVideoElement): Self = this.set("video", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideo: Self = this.set("video", js.undefined)
    
    @scala.inline
    def setVideoBitsPerSecond(value: Double): Self = this.set("videoBitsPerSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoBitsPerSecond: Self = this.set("videoBitsPerSecond", js.undefined)
  }
}
