package typings.relayDashRuntime

import typings.relayDashRuntime.relayDashRuntimeMod.ConnectionMetadata
import typings.relayDashRuntime.relayDashRuntimeMod.ReaderRefetchMetadata
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
    val __obj = js.Dynamic.literal(refetch = refetch)
    if (connection != null) __obj.updateDynamic("connection")(connection)
    __obj.asInstanceOf[Anon_ConnectionRefetch]
  }
}

