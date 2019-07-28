package typings.streamDashToDashString.streamDashToDashStringMod

import typings.node.NodeJSNs.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream-to-string", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(stream: ReadableStream): js.Promise[String] = js.native
  def apply(stream: ReadableStream, cb: Callback): js.Promise[String] = js.native
  def apply(stream: ReadableStream, enc: String): js.Promise[String] = js.native
  def apply(stream: ReadableStream, enc: String, cb: Callback): js.Promise[String] = js.native
}

