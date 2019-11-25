package typings.relayDashRuntime

import typings.relayDashRuntime.libStoreRelayStoreTypesMod.MissingFieldHandler
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.ReadOnlyRecordSourceProxy
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.Record
import typings.relayDashRuntime.libUtilNormalizationNodeMod.NormalizationScalarField
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.Variables
import typings.relayDashRuntime.relayDashRuntimeStrings.scalar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ArgsField extends MissingFieldHandler {
  var kind: scalar = js.native
  def handle(
    field: NormalizationScalarField,
    record: js.UndefOr[scala.Nothing],
    args: Variables,
    store: ReadOnlyRecordSourceProxy
  ): js.Any = js.native
  def handle(field: NormalizationScalarField, record: Null, args: Variables, store: ReadOnlyRecordSourceProxy): js.Any = js.native
  def handle(field: NormalizationScalarField, record: Record, args: Variables, store: ReadOnlyRecordSourceProxy): js.Any = js.native
}

