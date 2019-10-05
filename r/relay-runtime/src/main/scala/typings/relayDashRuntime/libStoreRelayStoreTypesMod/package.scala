package typings.relayDashRuntime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libStoreRelayStoreTypesMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.relayDashRuntime.libStoreRelayOperationTrackerMod.RelayOperationTracker
  import typings.relayDashRuntime.libUtilReaderNodeMod.ReaderFragment

  type AsyncLoadCallback = js.Function1[/* loadingState */ LoadingState, Unit]
  type FragmentMap = StringDictionary[ReaderFragment]
  type FragmentReference = js.Any
  type FragmentSpecResults = StringDictionary[js.Any]
  type OperationTracker = RelayOperationTracker
  type Props = StringDictionary[js.Any]
  type Record = StringDictionary[js.Any]
  type RecordMap = // theoretically, this should be `[dataID: DataID]`, but `DataID` is a string.
  StringDictionary[js.UndefOr[Record | Null]]
  type Scheduler = js.Function1[/* callback */ js.Function0[Unit], Unit]
  type SelectorData = StringDictionary[js.Any]
  type SelectorStoreUpdater = js.Function2[/* store */ RecordSourceSelectorProxy, /* data */ js.Any, Unit]
  type Snapshot = TypedSnapshot[SelectorData]
  type StoreUpdater = js.Function1[/* store */ RecordSourceProxy, Unit]
  type UpdatedRecords = StringDictionary[Boolean]
}
