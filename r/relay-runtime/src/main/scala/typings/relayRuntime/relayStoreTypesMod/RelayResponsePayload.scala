package typings.relayRuntime.relayStoreTypesMod

import typings.relayRuntime.relayNetworkTypesMod.PayloadError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelayResponsePayload extends js.Object {
  val errors: js.UndefOr[js.Array[PayloadError] | Null] = js.undefined
  val fieldPayloads: js.UndefOr[js.Array[HandleFieldPayload] | Null] = js.undefined
  val incrementalPlaceholders: js.UndefOr[js.Array[IncrementalDataPlaceholder] | Null] = js.undefined
  val isFinal: Boolean
  val moduleImportPayloads: js.UndefOr[js.Array[ModuleImportPayload] | Null] = js.undefined
  val source: MutableRecordSource
}

object RelayResponsePayload {
  @scala.inline
  def apply(
    isFinal: Boolean,
    source: MutableRecordSource,
    errors: js.UndefOr[Null | js.Array[PayloadError]] = js.undefined,
    fieldPayloads: js.UndefOr[Null | js.Array[HandleFieldPayload]] = js.undefined,
    incrementalPlaceholders: js.UndefOr[Null | js.Array[IncrementalDataPlaceholder]] = js.undefined,
    moduleImportPayloads: js.UndefOr[Null | js.Array[ModuleImportPayload]] = js.undefined
  ): RelayResponsePayload = {
    val __obj = js.Dynamic.literal(isFinal = isFinal.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    if (!js.isUndefined(errors)) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (!js.isUndefined(fieldPayloads)) __obj.updateDynamic("fieldPayloads")(fieldPayloads.asInstanceOf[js.Any])
    if (!js.isUndefined(incrementalPlaceholders)) __obj.updateDynamic("incrementalPlaceholders")(incrementalPlaceholders.asInstanceOf[js.Any])
    if (!js.isUndefined(moduleImportPayloads)) __obj.updateDynamic("moduleImportPayloads")(moduleImportPayloads.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelayResponsePayload]
  }
}

