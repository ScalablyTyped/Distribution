package typings.relayRuntime.anon

import typings.relayRuntime.libStoreRelayStoreTypesMod.MissingFieldHandler
import typings.relayRuntime.libStoreRelayStoreTypesMod.ReadOnlyRecordProxy
import typings.relayRuntime.libStoreRelayStoreTypesMod.ReadOnlyRecordSourceProxy
import typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationScalarField
import typings.relayRuntime.libUtilRelayRuntimeTypesMod.Variables
import typings.relayRuntime.relayRuntimeStrings.scalar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Handle
  extends StObject
     with MissingFieldHandler {
  
  def handle(
    field: NormalizationScalarField,
    parentRecord: Null,
    args: Variables,
    store: ReadOnlyRecordSourceProxy
  ): Any = js.native
  def handle(
    field: NormalizationScalarField,
    parentRecord: Unit,
    args: Variables,
    store: ReadOnlyRecordSourceProxy
  ): Any = js.native
  def handle(
    field: NormalizationScalarField,
    parentRecord: ReadOnlyRecordProxy,
    args: Variables,
    store: ReadOnlyRecordSourceProxy
  ): Any = js.native
  
  var kind: scalar = js.native
}
