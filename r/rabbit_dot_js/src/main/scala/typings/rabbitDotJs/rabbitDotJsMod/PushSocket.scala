package typings.rabbitDotJs.rabbitDotJsMod

import typings.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rabbit.js", "PushSocket")
@js.native
class PushSocket protected ()
  extends Writable
     with Socket {
  def this(channel: String, opts: SocketOptions) = this()
}

