package typings.rabbitDotJs.rabbitDotJsMod

import typings.node.Anon_End
import typings.node.NodeJS.WritableStream
import typings.node.streamMod.Duplex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rabbit.js", "ReqSocket")
@js.native
class ReqSocket protected ()
  extends Duplex
     with Socket {
  def this(channel: String, opts: SocketOptions) = this()
  def handleReply(msg: RequestMessage): js.Any = js.native
  /* InferMemberOverrides */
  override def pipe[T /* <: WritableStream */](destination: T): T = js.native
  /* InferMemberOverrides */
  override def pipe[T /* <: WritableStream */](destination: T, options: Anon_End): T = js.native
}

