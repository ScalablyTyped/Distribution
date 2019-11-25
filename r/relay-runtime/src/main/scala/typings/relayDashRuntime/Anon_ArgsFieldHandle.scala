package typings.relayDashRuntime

import typings.relayDashRuntime.libStoreRelayStoreTypesMod.MissingFieldHandler
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.ReadOnlyRecordSourceProxy
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.Record
import typings.relayDashRuntime.libUtilNormalizationNodeMod.NormalizationLinkedField
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.DataID
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.Variables
import typings.relayDashRuntime.relayDashRuntimeStrings.linked
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ArgsFieldHandle extends MissingFieldHandler {
  var kind: linked = js.native
  def handle(
    field: NormalizationLinkedField,
    record: js.UndefOr[scala.Nothing],
    args: Variables,
    store: ReadOnlyRecordSourceProxy
  ): js.UndefOr[DataID | Null] = js.native
  def handle(field: NormalizationLinkedField, record: Null, args: Variables, store: ReadOnlyRecordSourceProxy): js.UndefOr[DataID | Null] = js.native
  def handle(field: NormalizationLinkedField, record: Record, args: Variables, store: ReadOnlyRecordSourceProxy): js.UndefOr[DataID | Null] = js.native
}

