package typings.reactDashNativeDashAudio.reactDashNativeDashAudioMod

import typings.reactDashNativeDashAudio.Anon_AudioFileURL
import typings.reactDashNativeDashAudio.Anon_CurrentTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-audio", "AudioRecorder")
@js.native
object AudioRecorder extends js.Object {
  def checkAuthorizationStatus(): js.Promise[Boolean] = js.native
  def onFinished(res: Anon_AudioFileURL): Unit = js.native
  def onProgress(res: Anon_CurrentTime): Unit = js.native
  def pauseRecording(): js.Promise[String] = js.native
  def prepareRecordingAtPath(path: String, options: RecordingOptions): js.Promise[String] = js.native
  def requestAuthorization(): js.Promise[Boolean] = js.native
  def resumeRecording(): js.Promise[String] = js.native
  def startRecording(): js.Promise[String] = js.native
  def stopRecording(): js.Promise[String] = js.native
}

