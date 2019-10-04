package typings.relayDashRuntime.libStoreRelayStoreTypesMod

import typings.relayDashRuntime.libNetworkRelayNetworkTypesMod.PayloadError
import typings.relayDashRuntime.libStoreRelayConnectionMod.ConnectionInternalEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelayResponsePayload extends js.Object {
  var connectionEvents: js.Array[ConnectionInternalEvent]
  var errors: js.Array[PayloadError]
  var fieldPayloads: js.Array[HandleFieldPayload]
  var incrementalPlaceholders: js.Array[IncrementalDataPlaceholder]
  var moduleImportPayloads: js.Array[ModuleImportPayload]
  var source: MutableRecordSource
}

object RelayResponsePayload {
  @scala.inline
  def apply(
    connectionEvents: js.Array[ConnectionInternalEvent],
    errors: js.Array[PayloadError],
    fieldPayloads: js.Array[HandleFieldPayload],
    incrementalPlaceholders: js.Array[IncrementalDataPlaceholder],
    moduleImportPayloads: js.Array[ModuleImportPayload],
    source: MutableRecordSource
  ): RelayResponsePayload = {
    val __obj = js.Dynamic.literal(connectionEvents = connectionEvents, errors = errors, fieldPayloads = fieldPayloads, incrementalPlaceholders = incrementalPlaceholders, moduleImportPayloads = moduleImportPayloads, source = source)
  
    __obj.asInstanceOf[RelayResponsePayload]
  }
}

