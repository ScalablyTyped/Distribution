package typings.streamEvents

import typings.node.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream-events", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply[StreamType /* <: Stream */](stream: StreamType): StreamType = js.native
}

