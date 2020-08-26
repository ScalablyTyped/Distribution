package typings.streamBuffers.mod

import typings.node.Buffer
import typings.node.streamMod.Writable
import typings.streamBuffers.streamBuffersBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream-buffers", "WritableStreamBuffer")
@js.native
class WritableStreamBuffer () extends Writable {
  def this(options: WritableStreamBufferOptions) = this()
  def getContents(): Buffer | `false` = js.native
  def getContents(length: Double): Buffer | `false` = js.native
  def getContentsAsString(): String | `false` = js.native
  def getContentsAsString(encoding: js.UndefOr[scala.Nothing], length: Double): String | `false` = js.native
  def getContentsAsString(encoding: String): String | `false` = js.native
  def getContentsAsString(encoding: String, length: Double): String | `false` = js.native
  def maxSize(): Double = js.native
  def size(): Double = js.native
}

