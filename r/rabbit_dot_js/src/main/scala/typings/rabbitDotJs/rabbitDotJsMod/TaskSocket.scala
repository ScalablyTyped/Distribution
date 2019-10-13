package typings.rabbitDotJs.rabbitDotJsMod

import typings.node.Buffer
import typings.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rabbit.js", "TaskSocket")
@js.native
class TaskSocket protected ()
  extends Writable
     with Socket {
  def this(channel: String, opts: SocketOptions) = this()
  def post(task: String, chunk: String): js.Any = js.native
  def post(task: String, chunk: String, encoding: String): js.Any = js.native
  def post(task: String, chunk: Buffer): js.Any = js.native
  def post(task: String, chunk: Buffer, encoding: String): js.Any = js.native
}

