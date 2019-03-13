package typings
package recorderDashJsLib.recorderDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("recorder-js", JSImport.Namespace)
@js.native
class namespaced protected () extends Recorder {
  def this(audioContext: stdLib.AudioContext) = this()
  def this(audioContext: stdLib.AudioContext, config: recorderDashJsLib.recorderDashJsMod.RecorderNs.RecorderConfig) = this()
  /* CompleteClass */
  override def init(stream: stdLib.MediaStream): js.Promise[scala.Unit] = js.native
  /* CompleteClass */
  override def start(): js.Promise[js.UndefOr[stdLib.MediaStream]] = js.native
  /* CompleteClass */
  override def stop(): js.Promise[recorderDashJsLib.recorderDashJsMod.RecorderNs.RecorderResult] = js.native
}

/* static members */
@JSImport("recorder-js", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  def download(blob: stdLib.Blob, filename: java.lang.String): scala.Unit = js.native
}

