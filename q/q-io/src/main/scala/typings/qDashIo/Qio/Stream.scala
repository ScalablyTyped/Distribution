package typings.qDashIo.Qio

import typings.node.Buffer
import typings.q.qMod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stream extends js.Object {
  var node: js.Any = js.native
  def close(): Unit = js.native
  def destroy(): Unit = js.native
  def flush(): Promise[Unit] = js.native
  def read(): Promise[Buffer] = js.native
  def read(charset: String): Promise[String] = js.native
  def write(content: String): Unit = js.native
  def write(content: Buffer): Unit = js.native
}

