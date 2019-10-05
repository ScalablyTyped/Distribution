package typings.streamDashSeries

import typings.node.NodeJS.ReadWriteStream
import typings.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream-series", JSImport.Namespace)
@js.native
object streamDashSeriesMod extends js.Object {
  def apply[T /* <: ReadableStream */](streams: T*): ReadWriteStream = js.native
}

