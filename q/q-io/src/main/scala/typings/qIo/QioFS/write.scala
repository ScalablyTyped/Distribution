package typings.qIo.QioFS

import typings.node.Buffer
import typings.q.mod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("QioFS.write")
@js.native
object write extends js.Object {
  def apply(path: String, content: String): Promise[Unit] = js.native
  def apply(path: String, content: String, options: js.Any): Promise[Unit] = js.native
  def apply(path: String, content: Buffer): Promise[Unit] = js.native
  def apply(path: String, content: Buffer, options: js.Any): Promise[Unit] = js.native
}

