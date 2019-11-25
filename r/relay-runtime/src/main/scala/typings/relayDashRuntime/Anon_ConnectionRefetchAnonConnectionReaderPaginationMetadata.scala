package typings.relayDashRuntime

import typings.relayDashRuntime.libHandlersConnectionRelayConnectionHandlerMod.ConnectionMetadata
import typings.relayDashRuntime.libUtilReaderNodeMod.ReaderRefetchMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ConnectionRefetchAnonConnectionReaderPaginationMetadata extends js.Object {
  val connection: js.Array[ConnectionMetadata]
  val refetch: ReaderRefetchMetadata with Anon_ConnectionReaderPaginationMetadata
}

object Anon_ConnectionRefetchAnonConnectionReaderPaginationMetadata {
  @scala.inline
  def apply(
    connection: js.Array[ConnectionMetadata],
    refetch: ReaderRefetchMetadata with Anon_ConnectionReaderPaginationMetadata
  ): Anon_ConnectionRefetchAnonConnectionReaderPaginationMetadata = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], refetch = refetch.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ConnectionRefetchAnonConnectionReaderPaginationMetadata]
  }
}

