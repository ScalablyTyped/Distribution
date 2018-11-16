package typings
package rabbitDotJsLib.rabbitDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rabbit.js", "SubSocket")
@js.native
class SubSocket protected ()
  extends nodeLib.streamMod.Readable
     with Socket {
  def this(channel: java.lang.String, opts: SocketOptions) = this()
  def connect(source: java.lang.String, topic: java.lang.String): js.Any = js.native
  def connect(source: java.lang.String, topic: java.lang.String, callback: js.Function): js.Any = js.native
  /* InferMemberOverrides */
  override def pipe[T /* <: nodeLib.NodeJSNs.WritableStream */](destination: T): T = js.native
  /* InferMemberOverrides */
  override def pipe[T /* <: nodeLib.NodeJSNs.WritableStream */](destination: T, options: nodeLib.Anon_End): T = js.native
}

