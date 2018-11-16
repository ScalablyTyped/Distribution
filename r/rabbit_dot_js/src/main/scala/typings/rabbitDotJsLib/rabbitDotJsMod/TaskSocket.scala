package typings
package rabbitDotJsLib.rabbitDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rabbit.js", "TaskSocket")
@js.native
class TaskSocket protected ()
  extends nodeLib.streamMod.Writable
     with Socket {
  def this(channel: java.lang.String, opts: SocketOptions) = this()
  def post(task: java.lang.String, chunk: java.lang.String): js.Any = js.native
  def post(task: java.lang.String, chunk: java.lang.String, encoding: java.lang.String): js.Any = js.native
  def post(task: java.lang.String, chunk: nodeLib.Buffer): js.Any = js.native
  def post(task: java.lang.String, chunk: nodeLib.Buffer, encoding: java.lang.String): js.Any = js.native
}

