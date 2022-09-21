package typings.relayRuntime.anon

import typings.relayRuntime.normalizationNodeMod.NormalizationScalarField
import typings.relayRuntime.relayRuntimeStrings.scalar
import typings.relayRuntime.relayRuntimeTypesMod.Variables
import typings.relayRuntime.relayStoreTypesMod.MissingFieldHandler
import typings.relayRuntime.relayStoreTypesMod.ReadOnlyRecordSourceProxy
import typings.relayRuntime.relayStoreTypesMod.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Handle
  extends StObject
     with MissingFieldHandler {
  
  def handle(field: NormalizationScalarField, record: Null, args: Variables, store: ReadOnlyRecordSourceProxy): Any = js.native
  def handle(field: NormalizationScalarField, record: Unit, args: Variables, store: ReadOnlyRecordSourceProxy): Any = js.native
  def handle(
    field: NormalizationScalarField,
    record: Record[js.Object],
    args: Variables,
    store: ReadOnlyRecordSourceProxy
  ): Any = js.native
  
  var kind: scalar = js.native
}
