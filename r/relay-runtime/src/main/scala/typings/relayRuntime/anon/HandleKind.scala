package typings.relayRuntime.anon

import typings.relayRuntime.normalizationNodeMod.NormalizationLinkedField
import typings.relayRuntime.relayRuntimeStrings.pluralLinked
import typings.relayRuntime.relayRuntimeTypesMod.DataID
import typings.relayRuntime.relayRuntimeTypesMod.Variables
import typings.relayRuntime.relayStoreTypesMod.MissingFieldHandler
import typings.relayRuntime.relayStoreTypesMod.ReadOnlyRecordSourceProxy
import typings.relayRuntime.relayStoreTypesMod.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HandleKind
  extends StObject
     with MissingFieldHandler {
  
  def handle(field: NormalizationLinkedField, record: Null, args: Variables, store: ReadOnlyRecordSourceProxy): js.UndefOr[(js.Array[js.UndefOr[DataID | Null]]) | Null] = js.native
  def handle(field: NormalizationLinkedField, record: Unit, args: Variables, store: ReadOnlyRecordSourceProxy): js.UndefOr[(js.Array[js.UndefOr[DataID | Null]]) | Null] = js.native
  def handle(field: NormalizationLinkedField, record: Record, args: Variables, store: ReadOnlyRecordSourceProxy): js.UndefOr[(js.Array[js.UndefOr[DataID | Null]]) | Null] = js.native
  
  var kind: pluralLinked = js.native
}
