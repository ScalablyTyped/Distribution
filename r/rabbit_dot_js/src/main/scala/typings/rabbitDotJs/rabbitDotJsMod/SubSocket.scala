package typings.rabbitDotJs.rabbitDotJsMod

import typings.node.Anon_End
import typings.node.NodeJS.WritableStream
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rabbit.js", "SubSocket")
@js.native
class SubSocket protected ()
  extends Readable
     with Socket {
  def this(channel: String, opts: SocketOptions) = this()
  def connect(source: String, topic: String): js.Any = js.native
  def connect(source: String, topic: String, callback: js.Function): js.Any = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def pipe[T /* <: WritableStream */](destination: T): T = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def pipe[T /* <: WritableStream */](destination: T, options: Anon_End): T = js.native
}

