package typings
package relayDashRuntimeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object relayDashRuntimeMod {
  type CSnapshot[TNode] = CSelector[TNode] with relayDashRuntimeLib.Anon_Data
  type ConcreteBatchRequest = js.Any
  type ConcreteFragment = js.Any
  type ConcreteFragmentDefinition = js.Object
  type ConcreteOperationDefinition = js.Object
  type ConcreteRequest = js.Any
  type DataID = java.lang.String
  type ExecuteFunction = js.Function4[
    /* operation */ js.Object, 
    /* variables */ Variables, 
    /* cacheConfig */ CacheConfig, 
    /* uploadables */ js.UndefOr[UploadableMap], 
    js.Promise[js.Any]
  ]
  type FetchFunction = js.Function4[
    /* operation */ RequestNode, 
    /* variables */ Variables, 
    /* cacheConfig */ CacheConfig, 
    /* uploadables */ js.UndefOr[UploadableMap], 
    ObservableFromValue[QueryPayload]
  ]
  type GraphQLTaggedNode = (js.Function0[ConcreteFragment | RequestNode]) | relayDashRuntimeLib.Anon_Classic
  type HandlerProvider = js.Function1[/* name */ java.lang.String, HandlerInterface | scala.Null]
  type MutableRecordSource = RecordSource
  type Observable[T] = RelayObservable[T]
  type ObservableFromValue[T] = RelayObservable[T] | js.Promise[T] | T
  type OperationSelector = COperationSelector[js.Any, js.Any]
  type OptimisticUpdate = js.Any
  type PayloadData = js.Any
  type RangeBehaviors = RangeBehaviorsFunction | RangeBehaviorsObject
  type RangeBehaviorsFunction = js.Function1[
    /* connectionArgs */ org.scalablytyped.runtime.StringDictionary[js.Any], 
    relayDashRuntimeLib.relayDashRuntimeLibStrings.APPEND | relayDashRuntimeLib.relayDashRuntimeLibStrings.IGNORE | relayDashRuntimeLib.relayDashRuntimeLibStrings.PREPEND | relayDashRuntimeLib.relayDashRuntimeLibStrings.REFETCH | relayDashRuntimeLib.relayDashRuntimeLibStrings.REMOVE
  ]
  type ReadyStateChangeCallback = js.Function1[/* readyState */ ReadyState, scala.Unit]
  type RelayConcreteNode = js.Any
  type RelayContainer = js.Any
  type RelayContainerErrorEventType = relayDashRuntimeLib.relayDashRuntimeLibStrings.CACHE_RESTORE_FAILED | relayDashRuntimeLib.relayDashRuntimeLibStrings.NETWORK_QUERY_ERROR
  type RelayContainerLoadingEventType = relayDashRuntimeLib.relayDashRuntimeLibStrings.ABORT | relayDashRuntimeLib.relayDashRuntimeLibStrings.CACHE_RESTORED_REQUIRED | relayDashRuntimeLib.relayDashRuntimeLibStrings.CACHE_RESTORE_START | relayDashRuntimeLib.relayDashRuntimeLibStrings.NETWORK_QUERY_RECEIVED_ALL | relayDashRuntimeLib.relayDashRuntimeLibStrings.NETWORK_QUERY_RECEIVED_REQUIRED | relayDashRuntimeLib.relayDashRuntimeLibStrings.NETWORK_QUERY_START | relayDashRuntimeLib.relayDashRuntimeLibStrings.STORE_FOUND_ALL | relayDashRuntimeLib.relayDashRuntimeLibStrings.STORE_FOUND_REQUIRED
  type RelayDebugger = js.Any
  type RelayMutationConfig = FIELDS_CHANGE | RANGE_ADD | NODE_DELETE | RANGE_DELETE | REQUIRED_CHILDREN
  type RelayMutationRequest = js.Any
  type RelayMutationTransaction = js.Any
  type RelayMutationTransactionCommitFailureCallback = js.Function2[
    /* transaction */ RelayMutationTransaction, 
    /* preventAutoRollback */ js.Function0[scala.Unit], 
    scala.Unit
  ]
  type RelayMutationTransactionCommitSuccessCallback = js.Function1[/* response */ org.scalablytyped.runtime.StringDictionary[js.Any], scala.Unit]
  type RelayQL = js.Function2[/* strings */ js.Array[java.lang.String], /* repeated */ js.Any, RelayConcreteNode]
  type RelayQueryRequest = js.Any
  type RelayResponsePayload = js.Any
  type RequestNode = ConcreteRequest | ConcreteBatchRequest
  type Selector = CSelector[js.Any]
  type SelectorStoreUpdater[T] = js.Function2[/* store */ RecordSourceSelectorProxy, /* data */ T, scala.Unit]
  type Snapshot = CSnapshot[js.Any]
  type Source[T] = js.Function0[js.Any]
  type StoreUpdater = js.Function1[/* store */ RecordSourceProxy, scala.Unit]
  type SubscribeFunction = js.Function4[
    /* operation */ RequestNode, 
    /* variables */ Variables, 
    /* cacheConfig */ CacheConfig, 
    /* observer */ LegacyObserver[QueryPayload], 
    RelayObservable[QueryPayload] | Disposable
  ]
  type Uploadable = stdLib.File | stdLib.Blob
}
