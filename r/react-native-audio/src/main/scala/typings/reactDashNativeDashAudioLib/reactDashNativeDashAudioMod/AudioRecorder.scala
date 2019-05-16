package typings
package reactDashNativeDashAudioLib.reactDashNativeDashAudioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-audio", "AudioRecorder")
@js.native
object AudioRecorder extends js.Object {
  def checkAuthorizationStatus(): js.Promise[scala.Boolean] = js.native
  def onFinished(res: reactDashNativeDashAudioLib.Anon_AudioFileURL): scala.Unit = js.native
  def onProgress(res: reactDashNativeDashAudioLib.Anon_CurrentTime): scala.Unit = js.native
  def pauseRecording(): js.Promise[java.lang.String] = js.native
  def prepareRecordingAtPath(
    path: java.lang.String,
    options: reactDashNativeDashAudioLib.reactDashNativeDashAudioMod.RecordingOptions
  ): js.Promise[java.lang.String] = js.native
  def requestAuthorization(): js.Promise[scala.Boolean] = js.native
  def resumeRecording(): js.Promise[java.lang.String] = js.native
  def startRecording(): js.Promise[java.lang.String] = js.native
  def stopRecording(): js.Promise[java.lang.String] = js.native
}

