package typings.relayRuntime

import typings.relayRuntime.connectionHandlerMod.ConnectionMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConnectionRefetch extends js.Object {
  val connection: js.Array[ConnectionMetadata]
  val refetch: ReaderRefetchMetadataconn
}

object AnonConnectionRefetch {
  @scala.inline
  def apply(connection: js.Array[ConnectionMetadata], refetch: ReaderRefetchMetadataconn): AnonConnectionRefetch = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], refetch = refetch.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonConnectionRefetch]
  }
}

