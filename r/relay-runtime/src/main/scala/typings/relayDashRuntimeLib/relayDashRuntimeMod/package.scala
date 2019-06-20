package typings
package relayDashRuntimeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object relayDashRuntimeMod {
  type CFragmentMap[TFragment] = org.scalablytyped.runtime.StringDictionary[TFragment]
  type DataID = java.lang.String
  type ExecuteFunction = js.Function4[
    /* request */ RequestParameters, 
    /* variables */ Variables, 
    /* cacheConfig */ CacheConfig, 
    /* uploadables */ js.UndefOr[UploadableMap | scala.Null], 
    RelayObservable[GraphQLResponse]
  ]
  type FetchFunction = js.Function4[
    /* request */ RequestParameters, 
    /* variables */ Variables, 
    /* cacheConfig */ CacheConfig, 
    /* uploadables */ js.UndefOr[UploadableMap | scala.Null], 
    ObservableFromValue[GraphQLResponse]
  ]
  type FragmentMap = CFragmentMap[ReaderFragment]
  type FragmentReference = scala.Nothing with relayDashRuntimeLib.Anon_FragmentReference
  type FragmentSpecResults = org.scalablytyped.runtime.StringDictionary[js.Any]
  /* Rewritten from type alias, can be one of: 
    - ReaderFragment
    - ConcreteRequest
    - js.Function0[ReaderFragment | ConcreteRequest]
    - relayDashRuntimeLib.Anon_Modern
  */
  type GraphQLTaggedNode = _GraphQLTaggedNode | (js.Function0[ReaderFragment | ConcreteRequest])
  type GraphiQLPrinter = js.Function2[/* request */ RequestParameters, /* variables */ Variables, java.lang.String]
  type HandlerProvider = js.Function1[/* name */ java.lang.String, js.UndefOr[Handler | scala.Null]]
  type NormalizationSelector = CNormalizationSelector[NormalizationSelectableNode]
  type ObservableFromValue[T] = Subscribable[T] | js.Promise[T] | T
  type OperationDescriptor = COperationDescriptor[ReaderSelectableNode, NormalizationSelectableNode, ConcreteRequest]
  type PayloadData = org.scalablytyped.runtime.StringDictionary[js.Any]
  type PayloadExtensions = org.scalablytyped.runtime.StringDictionary[js.Any]
  type ProfileHandler = js.Function2[
    /* name */ java.lang.String, 
    /* state */ js.UndefOr[js.Any], 
    js.Function1[/* error */ js.UndefOr[stdLib.Error], scala.Unit]
  ]
  type Props = org.scalablytyped.runtime.StringDictionary[js.Any]
  type RangeBehaviors = (js.Function1[
    /* connectionArgs */ org.scalablytyped.runtime.StringDictionary[js.Any], 
    RangeOperation
  ]) | org.scalablytyped.runtime.StringDictionary[RangeOperation]
  type ReaderSelector = CReaderSelector[ReaderSelectableNode]
  type Record = org.scalablytyped.runtime.StringDictionary[js.Any]
  type RecordMap = // theoretically, this should be `[dataID: DataID]`, but `DataID` is a string.
  org.scalablytyped.runtime.StringDictionary[js.UndefOr[Record]]
  type RelayContext = CRelayContext[Environment]
  type Scheduler = js.Function1[/* callback */ js.Function0[scala.Unit], scala.Unit]
  type SelectorData = org.scalablytyped.runtime.StringDictionary[js.Any]
  type SelectorStoreUpdater[TData] = js.Function2[/* store */ RecordSourceSelectorProxy, /* data */ TData, scala.Unit]
  type Snapshot = CSnapshot[ReaderSelectableNode, OperationDescriptor]
  type Source[T] = js.Function1[/* sink */ Sink[T], scala.Unit | Subscription | js.Function0[js.Any]]
  type StoreUpdater = js.Function1[/* store */ RecordSourceProxy, scala.Unit]
  type SubscribeFunction = js.Function4[
    /* request */ RequestParameters, 
    /* variables */ Variables, 
    /* cacheConfig */ CacheConfig, 
    /* observer */ js.UndefOr[LegacyObserver[GraphQLResponse]], 
    RelayObservable[GraphQLResponse] | Disposable
  ]
  type Uploadable = stdLib.File | stdLib.Blob
  type UploadableMap = org.scalablytyped.runtime.StringDictionary[Uploadable]
  type Variables = org.scalablytyped.runtime.StringDictionary[js.Any]
}
