package typings.relayRuntime.anon

import typings.relayRuntime.libStoreRelayStoreTypesMod.MissingFieldHandler
import typings.relayRuntime.libStoreRelayStoreTypesMod.ReadOnlyRecordSourceProxy
import typings.relayRuntime.libStoreRelayStoreTypesMod.Record
import typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationLinkedField
import typings.relayRuntime.libUtilRelayRuntimeTypesMod.DataID
import typings.relayRuntime.libUtilRelayRuntimeTypesMod.Variables
import typings.relayRuntime.relayRuntimeStrings.pluralLinked
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HandleKind
  extends StObject
     with MissingFieldHandler {
  
  def handle(field: NormalizationLinkedField, record: Null, args: Variables, store: ReadOnlyRecordSourceProxy): js.UndefOr[(js.Array[js.UndefOr[DataID | Null]]) | Null] = js.native
  def handle(field: NormalizationLinkedField, record: Unit, args: Variables, store: ReadOnlyRecordSourceProxy): js.UndefOr[(js.Array[js.UndefOr[DataID | Null]]) | Null] = js.native
  def handle(
    field: NormalizationLinkedField,
    record: Record[js.Object],
    args: Variables,
    store: ReadOnlyRecordSourceProxy
  ): js.UndefOr[(js.Array[js.UndefOr[DataID | Null]]) | Null] = js.native
  
  var kind: pluralLinked = js.native
}
