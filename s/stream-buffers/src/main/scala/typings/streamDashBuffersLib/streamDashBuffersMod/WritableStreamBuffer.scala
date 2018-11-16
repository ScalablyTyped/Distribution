package typings
package streamDashBuffersLib.streamDashBuffersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream-buffers", "WritableStreamBuffer")
@js.native
class WritableStreamBuffer ()
  extends nodeLib.streamMod.Writable {
  def this(options: WritableStreamBufferOptions) = this()
  def getContents(): nodeLib.Buffer = js.native
  def getContents(length: scala.Double): nodeLib.Buffer = js.native
  def getContentsAsString(): java.lang.String = js.native
  def getContentsAsString(encoding: java.lang.String): java.lang.String = js.native
  def getContentsAsString(encoding: java.lang.String, length: scala.Double): java.lang.String = js.native
  def maxSize(): scala.Double = js.native
  def size(): scala.Double = js.native
}

