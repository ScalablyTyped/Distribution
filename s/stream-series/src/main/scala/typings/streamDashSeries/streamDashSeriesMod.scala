package typings.streamDashSeries

import typings.node.NodeJSNs.ReadWriteStream
import typings.node.NodeJSNs.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream-series", JSImport.Namespace)
@js.native
object streamDashSeriesMod extends js.Object {
  def apply[T /* <: ReadableStream */](streams: T*): ReadWriteStream = js.native
}

