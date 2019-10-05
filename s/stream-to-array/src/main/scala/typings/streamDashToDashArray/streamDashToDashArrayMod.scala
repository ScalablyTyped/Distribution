package typings.streamDashToDashArray

import typings.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream-to-array", JSImport.Namespace)
@js.native
object streamDashToDashArrayMod extends js.Object {
  def apply(`this`: ReadableStream): js.Promise[js.Array[_]] = js.native
  def apply(`this`: ReadableStream, callback: js.Function2[/* err */ js.Any, /* arr */ js.Array[_], Unit]): js.Promise[js.Array[_]] = js.native
}

