package typings.relayDashRuntime

import typings.relayDashRuntime.libHandlersConnectionRelayConnectionHandlerMod.ConnectionMetadata
import typings.relayDashRuntime.libUtilReaderNodeMod.ReaderRefetchMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Connection extends js.Object {
  val connection: js.UndefOr[js.Array[ConnectionMetadata]] = js.undefined
  val mask: js.UndefOr[Boolean] = js.undefined
  val plural: js.UndefOr[Boolean] = js.undefined
  val refetch: js.UndefOr[ReaderRefetchMetadata] = js.undefined
}

object Anon_Connection {
  @scala.inline
  def apply(
    connection: js.Array[ConnectionMetadata] = null,
    mask: js.UndefOr[Boolean] = js.undefined,
    plural: js.UndefOr[Boolean] = js.undefined,
    refetch: ReaderRefetchMetadata = null
  ): Anon_Connection = {
    val __obj = js.Dynamic.literal()
    if (connection != null) __obj.updateDynamic("connection")(connection.asInstanceOf[js.Any])
    if (!js.isUndefined(mask)) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (!js.isUndefined(plural)) __obj.updateDynamic("plural")(plural.asInstanceOf[js.Any])
    if (refetch != null) __obj.updateDynamic("refetch")(refetch.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Connection]
  }
}

