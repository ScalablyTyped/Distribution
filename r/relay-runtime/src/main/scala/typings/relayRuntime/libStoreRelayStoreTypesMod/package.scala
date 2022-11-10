package typings.relayRuntime.libStoreRelayStoreTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.relayRuntime.anon.Readonlykindmissingfieldl
import typings.relayRuntime.anon.Readonlykindmissingfieldt
import typings.relayRuntime.anon.Readonlykindrelayresolver
import typings.relayRuntime.libNetworkRelayNetworkTypesMod.ReactFlightServerTree
import typings.relayRuntime.libStoreRelayOperationTrackerMod.RelayOperationTracker
import typings.relayRuntime.libUtilReaderNodeMod.ReaderFragment
import typings.relayRuntime.libUtilRelayRuntimeTypesMod.DataID
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AsyncLoadCallback = js.Function1[/* loadingState */ LoadingState, Unit]

type DataIDSet = Set[DataID]

type FragmentMap = StringDictionary[ReaderFragment]

type FragmentSpecResults = StringDictionary[Any]

type FragmentType = Any

type LogFunction = js.Function1[/* logEvent */ LogEvent, Unit]

type OperationTracker = RelayOperationTracker

type Primitive = js.UndefOr[String | Double | Boolean | Null]

type Props = StringDictionary[Any]

type ReactFlightPayloadDeserializer = js.Function1[/* tree */ ReactFlightServerTree, ReactFlightClientResponse]

type Record[T /* <: js.Object */] = StringDictionary[T]

type RecordMap = // theoretically, this should be `[dataID: DataID]`, but `DataID` is a string.
StringDictionary[js.UndefOr[Record[js.Object] | Null]]

type RelayResolverErrors = js.Array[RelayResolverError]

type RequiredFieldLogger = js.Function1[
/* arg */ Readonlykindmissingfieldl | Readonlykindmissingfieldt | Readonlykindrelayresolver, 
Unit]

type Scheduler = js.Function1[/* callback */ js.Function0[Unit], Unit]

type SelectorData = StringDictionary[Any]

type SelectorStoreUpdater[T] = js.Function2[/* store */ RecordSourceSelectorProxy[T], /* data */ T, Unit]

type Snapshot = TypedSnapshot[SelectorData]

type StoreUpdater = js.Function1[/* store */ RecordSourceProxy, Unit]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends std.Array<infer U> | std.ReadonlyArray<infer U> ? U : T
  }}}
  */
type Unarray[T] = T
