package typings.relayRuntime

import typings.relayRuntime.connectionHandlerMod.ConnectionMetadata
import typings.relayRuntime.readerNodeMod.ReaderRefetchMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConnectionRefetchAnonConnectionReaderPaginationMetadata extends js.Object {
  val connection: js.Array[ConnectionMetadata]
  val refetch: ReaderRefetchMetadata with AnonConnectionReaderPaginationMetadata
}

object AnonConnectionRefetchAnonConnectionReaderPaginationMetadata {
  @scala.inline
  def apply(
    connection: js.Array[ConnectionMetadata],
    refetch: ReaderRefetchMetadata with AnonConnectionReaderPaginationMetadata
  ): AnonConnectionRefetchAnonConnectionReaderPaginationMetadata = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], refetch = refetch.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonConnectionRefetchAnonConnectionReaderPaginationMetadata]
  }
}

