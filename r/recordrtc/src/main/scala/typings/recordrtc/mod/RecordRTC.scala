package typings.recordrtc.mod

import typings.recordrtc.anon.Image
import typings.recordrtc.recordrtcStrings.all
import typings.recordrtc.recordrtcStrings.audio
import typings.recordrtc.recordrtcStrings.gif
import typings.recordrtc.recordrtcStrings.video
import typings.std.ArrayBuffer
import typings.std.Blob
import typings.std.MediaStream
import typings.std.MediaStreamTrack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecordRTC extends js.Object {
  
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
