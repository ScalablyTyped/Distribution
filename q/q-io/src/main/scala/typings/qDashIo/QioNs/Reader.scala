package typings.qDashIo.QioNs

import typings.node.Buffer
import typings.node.NodeJSNs.ReadableStream
import typings.q.qMod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Reader extends ForEach {
  var node: ReadableStream = js.native
  def close(): Unit = js.native
  def read(): Promise[Buffer] = js.native
  def read(charset: String): Promise[String] = js.native
}

