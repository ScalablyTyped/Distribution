package typings.reactNativeAudio.mod

import typings.reactNativeAudio.AnonAudioFileURL
import typings.reactNativeAudio.AnonCurrentTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-audio", "AudioRecorder")
@js.native
object AudioRecorder extends js.Object {
  def checkAuthorizationStatus(): js.Promise[Boolean] = js.native
  def onFinished(res: AnonAudioFileURL): Unit = js.native
  def onProgress(res: AnonCurrentTime): Unit = js.native
  def pauseRecording(): js.Promise[String] = js.native
  def prepareRecordingAtPath(path: String, options: RecordingOptions): js.Promise[String] = js.native
  def requestAuthorization(): js.Promise[Boolean] = js.native
  def resumeRecording(): js.Promise[String] = js.native
  def startRecording(): js.Promise[String] = js.native
  def stopRecording(): js.Promise[String] = js.native
}

