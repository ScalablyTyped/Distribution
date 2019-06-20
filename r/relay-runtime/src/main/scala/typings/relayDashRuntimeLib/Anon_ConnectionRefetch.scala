package typings
package relayDashRuntimeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ConnectionRefetch extends js.Object {
  val connection: js.UndefOr[js.Array[relayDashRuntimeLib.relayDashRuntimeMod.ConnectionMetadata]] = js.undefined
  val refetch: relayDashRuntimeLib.relayDashRuntimeMod.ReaderRefetchMetadata
}

object Anon_ConnectionRefetch {
  @scala.inline
  def apply(
    refetch: relayDashRuntimeLib.relayDashRuntimeMod.ReaderRefetchMetadata,
    connection: js.Array[relayDashRuntimeLib.relayDashRuntimeMod.ConnectionMetadata] = null
  ): Anon_ConnectionRefetch = {
    val __obj = js.Dynamic.literal(refetch = refetch)
    if (connection != null) __obj.updateDynamic("connection")(connection)
    __obj.asInstanceOf[Anon_ConnectionRefetch]
  }
}

