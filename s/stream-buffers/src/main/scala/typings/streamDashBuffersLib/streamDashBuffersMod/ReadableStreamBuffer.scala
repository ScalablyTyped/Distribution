package typings
package streamDashBuffersLib.streamDashBuffersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream-buffers", "ReadableStreamBuffer")
@js.native
class ReadableStreamBuffer ()
  extends nodeLib.streamMod.Readable {
  def this(options: ReadableStreamBufferOptions) = this()
  def maxSize(): scala.Double = js.native
  def put(data: java.lang.String): scala.Unit = js.native
  def put(data: java.lang.String, encoding: java.lang.String): scala.Unit = js.native
  def put(data: nodeLib.Buffer): scala.Unit = js.native
  def put(data: nodeLib.Buffer, encoding: java.lang.String): scala.Unit = js.native
  def size(): scala.Double = js.native
  def stop(): scala.Unit = js.native
}

