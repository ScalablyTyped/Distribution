package typings.relayDashRuntime

import org.scalablytyped.runtime.StringDictionary
import typings.relayDashRuntime.Anon_FragmentReference
import typings.std.Blob
import typings.std.Error
import typings.std.File
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object relayDashRuntimeMod {
  type CFragmentMap[TFragment] = StringDictionary[TFragment]
  type DataID = String
  type ExecuteFunction = js.Function4[
    /* request */ RequestParameters, 
    /* variables */ Variables, 
    /* cacheConfig */ CacheConfig, 
    /* uploadables */ js.UndefOr[UploadableMap | Null], 
    RelayObservable[GraphQLResponse]
  ]
  type FetchFunction = js.Function4[
    /* request */ RequestParameters, 
    /* variables */ Variables, 
    /* cacheConfig */ CacheConfig, 
    /* uploadables */ js.UndefOr[UploadableMap | Null], 
    ObservableFromValue[GraphQLResponse]
  ]
  type FragmentMap = CFragmentMap[ReaderFragment]
  type FragmentReference = scala.Nothing with Anon_FragmentReference
  type FragmentSpecResults = StringDictionary[js.Any]
  /* Rewritten from type alias, can be one of: 
    - typings.relayDashRuntime.relayDashRuntimeMod.ReaderFragment
    - typings.relayDashRuntime.relayDashRuntimeMod.ConcreteRequest
    - js.Function0[
  typings.relayDashRuntime.relayDashRuntimeMod.ReaderFragment | typings.relayDashRuntime.relayDashRuntimeMod.ConcreteRequest]
    - typings.relayDashRuntime.Anon_Modern
  */
  type GraphQLTaggedNode = _GraphQLTaggedNode | (js.Function0[ReaderFragment | ConcreteRequest])
  type GraphiQLPrinter = js.Function2[/* request */ RequestParameters, /* variables */ Variables, String]
  type HandlerProvider = js.Function1[/* name */ String, js.UndefOr[Handler | Null]]
  type NormalizationSelector = CNormalizationSelector[NormalizationSelectableNode]
  type ObservableFromValue[T] = Subscribable[T] | js.Promise[T] | T
  type OperationDescriptor = COperationDescriptor[ReaderSelectableNode, NormalizationSelectableNode, ConcreteRequest]
  type PayloadData = StringDictionary[js.Any]
  type PayloadExtensions = StringDictionary[js.Any]
  type ProfileHandler = js.Function2[
    /* name */ String, 
    /* state */ js.UndefOr[js.Any], 
    js.Function1[/* error */ js.UndefOr[Error], Unit]
  ]
  type Props = StringDictionary[js.Any]
  type RangeBehaviors = (js.Function1[/* connectionArgs */ StringDictionary[js.Any], RangeOperation]) | StringDictionary[RangeOperation]
  type ReaderSelector = CReaderSelector[ReaderSelectableNode]
  type RecordMap = // theoretically, this should be `[dataID: DataID]`, but `DataID` is a string.
  StringDictionary[js.UndefOr[Record[String, js.Any]]]
  type RelayContext = CRelayContext[Environment]
  type Scheduler = js.Function1[/* callback */ js.Function0[Unit], Unit]
  type SelectorData = StringDictionary[js.Any]
  type SelectorStoreUpdater[TData] = js.Function2[/* store */ RecordSourceSelectorProxy, /* data */ TData, Unit]
  type Snapshot = CSnapshot[ReaderSelectableNode, OperationDescriptor]
  type Source[T] = js.Function1[/* sink */ Sink[T], Unit | Subscription | js.Function0[js.Any]]
  type StoreUpdater = js.Function1[/* store */ RecordSourceProxy, Unit]
  type SubscribeFunction = js.Function4[
    /* request */ RequestParameters, 
    /* variables */ Variables, 
    /* cacheConfig */ CacheConfig, 
    /* observer */ js.UndefOr[LegacyObserver[GraphQLResponse]], 
    RelayObservable[GraphQLResponse] | Disposable
  ]
  type Uploadable = File | Blob
  type UploadableMap = StringDictionary[Uploadable]
  type Variables = StringDictionary[js.Any]
}
