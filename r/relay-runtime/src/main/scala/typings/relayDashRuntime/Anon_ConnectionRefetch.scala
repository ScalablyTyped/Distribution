package typings.relayDashRuntime

import typings.relayDashRuntime.libHandlersConnectionConnectionHandlerMod.ConnectionMetadata
import typings.relayDashRuntime.libUtilReaderNodeMod.ReaderRefetchMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ConnectionRefetch extends js.Object {
  val connection: js.UndefOr[js.Array[ConnectionMetadata]] = js.undefined
  val refetch: ReaderRefetchMetadata
}

object Anon_ConnectionRefetch {
  @scala.inline
  def apply(refetch: ReaderRefetchMetadata, connection: js.Array[ConnectionMetadata] = null): Anon_ConnectionRefetch = {
    val __obj = js.Dynamic.literal(refetch = refetch.asInstanceOf[js.Any])
    if (connection != null) __obj.updateDynamic("connection")(connection.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ConnectionRefetch]
  }
}

