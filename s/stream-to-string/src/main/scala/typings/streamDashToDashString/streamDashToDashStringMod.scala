package typings.streamDashToDashString

import typings.node.NodeJS.ReadableStream
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream-to-string", JSImport.Namespace)
@js.native
object streamDashToDashStringMod extends js.Object {
  def apply(stream: ReadableStream): js.Promise[String] = js.native
  def apply(stream: ReadableStream, cb: Callback): js.Promise[String] = js.native
  def apply(stream: ReadableStream, enc: String): js.Promise[String] = js.native
  def apply(stream: ReadableStream, enc: String, cb: Callback): js.Promise[String] = js.native
  type Callback = js.Function2[/* error */ js.UndefOr[Error], /* str */ String, Unit]
}

