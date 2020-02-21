package typings.relayRuntime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object relayStoreTypesMod {
  type AsyncLoadCallback = js.Function1[
    /* loadingState */ typings.relayRuntime.relayStoreTypesMod.LoadingState, 
    scala.Unit
  ]
  type FragmentMap = org.scalablytyped.runtime.StringDictionary[typings.relayRuntime.readerNodeMod.ReaderFragment]
  type FragmentReference = js.Any
  type FragmentSpecResults = org.scalablytyped.runtime.StringDictionary[js.Any]
  type LogFunction = js.Function1[/* logEvent */ typings.relayRuntime.relayStoreTypesMod.LogEvent, scala.Unit]
  type OperationTracker = typings.relayRuntime.relayOperationTrackerMod.RelayOperationTracker
  type Primitive = js.UndefOr[java.lang.String | scala.Double | scala.Boolean | scala.Null]
  type Props = org.scalablytyped.runtime.StringDictionary[js.Any]
  type Record = org.scalablytyped.runtime.StringDictionary[js.Any]
  type RecordMap = // theoretically, this should be `[dataID: DataID]`, but `DataID` is a string.
  org.scalablytyped.runtime.StringDictionary[js.UndefOr[typings.relayRuntime.relayStoreTypesMod.Record | scala.Null]]
  type Scheduler = js.Function1[/* callback */ js.Function0[scala.Unit], scala.Unit]
  type SelectorData = org.scalablytyped.runtime.StringDictionary[js.Any]
  type SelectorStoreUpdater[T] = js.Function2[
    /* store */ typings.relayRuntime.relayStoreTypesMod.RecordSourceSelectorProxy[T], 
    /* data */ T, 
    scala.Unit
  ]
  type Snapshot = typings.relayRuntime.relayStoreTypesMod.TypedSnapshot[typings.relayRuntime.relayStoreTypesMod.SelectorData]
  type StoreUpdater = js.Function1[/* store */ typings.relayRuntime.relayStoreTypesMod.RecordSourceProxy, scala.Unit]
  type Unarray[T] = T
  type UpdatedRecords = org.scalablytyped.runtime.StringDictionary[scala.Boolean]
}
