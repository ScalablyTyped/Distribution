package typings.relayRuntime.anon

import typings.relayRuntime.normalizationNodeMod.NormalizationScalarField
import typings.relayRuntime.relayRuntimeStrings.scalar
import typings.relayRuntime.relayRuntimeTypesMod.Variables
import typings.relayRuntime.relayStoreTypesMod.MissingFieldHandler
import typings.relayRuntime.relayStoreTypesMod.ReadOnlyRecordSourceProxy
import typings.relayRuntime.relayStoreTypesMod.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Handle extends MissingFieldHandler {
  var kind: scalar = js.native
  def handle(
    field: NormalizationScalarField,
    record: js.UndefOr[Null | Record],
    args: Variables,
    store: ReadOnlyRecordSourceProxy
  ): js.Any = js.native
}

