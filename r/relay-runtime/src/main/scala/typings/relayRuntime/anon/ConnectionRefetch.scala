package typings.relayRuntime.anon

import typings.relayRuntime.connectionHandlerMod.ConnectionMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionRefetch extends js.Object {
  val connection: js.Array[ConnectionMetadata]
  val refetch: ReaderRefetchMetadataconn
}

object ConnectionRefetch {
  @scala.inline
  def apply(connection: js.Array[ConnectionMetadata], refetch: ReaderRefetchMetadataconn): ConnectionRefetch = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], refetch = refetch.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionRefetch]
  }
}

