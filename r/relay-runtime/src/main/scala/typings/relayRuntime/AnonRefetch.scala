package typings.relayRuntime

import typings.relayRuntime.connectionHandlerMod.ConnectionMetadata
import typings.relayRuntime.readerNodeMod.ReaderRefetchMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRefetch extends js.Object {
  val connection: js.UndefOr[js.Array[ConnectionMetadata]] = js.undefined
  val refetch: ReaderRefetchMetadata
}

object AnonRefetch {
  @scala.inline
  def apply(refetch: ReaderRefetchMetadata, connection: js.Array[ConnectionMetadata] = null): AnonRefetch = {
    val __obj = js.Dynamic.literal(refetch = refetch.asInstanceOf[js.Any])
    if (connection != null) __obj.updateDynamic("connection")(connection.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRefetch]
  }
}

