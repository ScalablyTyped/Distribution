package typings
package relayDashRuntimeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ConnectionRefetchAnonConnectionReaderPaginationMetadata extends js.Object {
  val connection: js.Array[relayDashRuntimeLib.relayDashRuntimeMod.ConnectionMetadata]
  val refetch: relayDashRuntimeLib.relayDashRuntimeMod.ReaderRefetchMetadata with Anon_ConnectionReaderPaginationMetadata
}

object Anon_ConnectionRefetchAnonConnectionReaderPaginationMetadata {
  @scala.inline
  def apply(
    connection: js.Array[relayDashRuntimeLib.relayDashRuntimeMod.ConnectionMetadata],
    refetch: relayDashRuntimeLib.relayDashRuntimeMod.ReaderRefetchMetadata with Anon_ConnectionReaderPaginationMetadata
  ): Anon_ConnectionRefetchAnonConnectionReaderPaginationMetadata = {
    val __obj = js.Dynamic.literal(connection = connection, refetch = refetch)
  
    __obj.asInstanceOf[Anon_ConnectionRefetchAnonConnectionReaderPaginationMetadata]
  }
}

