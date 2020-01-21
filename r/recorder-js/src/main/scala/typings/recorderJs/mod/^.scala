package typings.recorderJs.mod

import typings.std.AudioContext
import typings.std.Blob
import typings.std.MediaStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("recorder-js", JSImport.Namespace)
@js.native
class ^ protected () extends Recorder {
  def this(audioContext: AudioContext) = this()
  def this(audioContext: AudioContext, config: RecorderConfig) = this()
  /* CompleteClass */
  override def init(stream: MediaStream): js.Promise[Unit] = js.native
  /* CompleteClass */
  override def start(): js.Promise[js.UndefOr[MediaStream]] = js.native
  /* CompleteClass */
  override def stop(): js.Promise[RecorderResult] = js.native
}

@JSImport("recorder-js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def download(blob: Blob, filename: String): Unit = js.native
}

