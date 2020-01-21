package typings.relayRuntime

import typings.relayRuntime.connectionHandlerMod.ConnectionMetadata
import typings.relayRuntime.readerNodeMod.ReaderRefetchMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConnection extends js.Object {
  val connection: js.UndefOr[js.Array[ConnectionMetadata]] = js.undefined
  val mask: js.UndefOr[Boolean] = js.undefined
  val plural: js.UndefOr[Boolean] = js.undefined
  val refetch: js.UndefOr[ReaderRefetchMetadata] = js.undefined
}

object AnonConnection {
  @scala.inline
  def apply(
    connection: js.Array[ConnectionMetadata] = null,
    mask: js.UndefOr[Boolean] = js.undefined,
    plural: js.UndefOr[Boolean] = js.undefined,
    refetch: ReaderRefetchMetadata = null
  ): AnonConnection = {
    val __obj = js.Dynamic.literal()
    if (connection != null) __obj.updateDynamic("connection")(connection.asInstanceOf[js.Any])
    if (!js.isUndefined(mask)) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (!js.isUndefined(plural)) __obj.updateDynamic("plural")(plural.asInstanceOf[js.Any])
    if (refetch != null) __obj.updateDynamic("refetch")(refetch.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConnection]
  }
}

