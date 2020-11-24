package typings.recorderJs.mod

import typings.std.AudioContext
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("recorder-js", JSImport.Namespace)
@js.native
class ^ protected () extends Recorder {
  def this(audioContext: AudioContext) = this()
  def this(audioContext: AudioContext, config: RecorderConfig) = this()
}
@JSImport("recorder-js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def download(blob: Blob, filename: String): Unit = js.native
}
