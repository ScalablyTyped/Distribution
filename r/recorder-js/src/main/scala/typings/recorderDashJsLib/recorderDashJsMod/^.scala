package typings
package recorderDashJsLib.recorderDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("recorder-js", JSImport.Namespace)
@js.native
class ^ protected () extends Recorder {
  def this(audioContext: stdLib.AudioContext) = this()
  def this(audioContext: stdLib.AudioContext, config: RecorderConfig) = this()
  /* CompleteClass */
  override def init(stream: stdLib.MediaStream): js.Promise[scala.Unit] = js.native
  /* CompleteClass */
  override def start(): js.Promise[js.UndefOr[stdLib.MediaStream]] = js.native
  /* CompleteClass */
  override def stop(): js.Promise[RecorderResult] = js.native
}

@JSImport("recorder-js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def download(blob: stdLib.Blob, filename: java.lang.String): scala.Unit = js.native
}

