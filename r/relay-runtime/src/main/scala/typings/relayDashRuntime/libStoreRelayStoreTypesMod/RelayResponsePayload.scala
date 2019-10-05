package typings.relayDashRuntime.libStoreRelayStoreTypesMod

import typings.relayDashRuntime.libNetworkRelayNetworkTypesMod.PayloadError
import typings.relayDashRuntime.libStoreRelayConnectionMod.ConnectionInternalEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelayResponsePayload extends js.Object {
  val connectionEvents: js.UndefOr[js.Array[ConnectionInternalEvent] | Null] = js.undefined
  val errors: js.UndefOr[js.Array[PayloadError] | Null] = js.undefined
  val fieldPayloads: js.UndefOr[js.Array[HandleFieldPayload] | Null] = js.undefined
  val incrementalPlaceholders: js.UndefOr[js.Array[IncrementalDataPlaceholder] | Null] = js.undefined
  val moduleImportPayloads: js.UndefOr[js.Array[ModuleImportPayload] | Null] = js.undefined
  val source: MutableRecordSource
}

object RelayResponsePayload {
  @scala.inline
  def apply(
    source: MutableRecordSource,
    connectionEvents: js.Array[ConnectionInternalEvent] = null,
    errors: js.Array[PayloadError] = null,
    fieldPayloads: js.Array[HandleFieldPayload] = null,
    incrementalPlaceholders: js.Array[IncrementalDataPlaceholder] = null,
    moduleImportPayloads: js.Array[ModuleImportPayload] = null
  ): RelayResponsePayload = {
    val __obj = js.Dynamic.literal(source = source)
    if (connectionEvents != null) __obj.updateDynamic("connectionEvents")(connectionEvents)
    if (errors != null) __obj.updateDynamic("errors")(errors)
    if (fieldPayloads != null) __obj.updateDynamic("fieldPayloads")(fieldPayloads)
    if (incrementalPlaceholders != null) __obj.updateDynamic("incrementalPlaceholders")(incrementalPlaceholders)
    if (moduleImportPayloads != null) __obj.updateDynamic("moduleImportPayloads")(moduleImportPayloads)
    __obj.asInstanceOf[RelayResponsePayload]
  }
}

