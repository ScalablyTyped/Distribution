package typings.scChannel.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sc-channel", JSImport.Namespace)
@js.native
class ^[T] protected () extends SCChannel[T] {
  def this(
    name: String,
    client: Client,
    eventDemux: typings.streamDemux.mod.^[T],
    dataStream: typings.asyncIterableStream.mod.^[T]
  ) = this()
}

