package typings.relayRuntime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object relayNetworkTypesMod {
  type ExecuteFunction = js.Function4[
    /* request */ typings.relayRuntime.relayConcreteNodeMod.RequestParameters, 
    /* variables */ typings.relayRuntime.relayRuntimeTypesMod.Variables, 
    /* cacheConfig */ typings.relayRuntime.relayRuntimeTypesMod.CacheConfig, 
    /* uploadables */ js.UndefOr[typings.relayRuntime.relayNetworkTypesMod.UploadableMap | scala.Null], 
    typings.relayRuntime.relayObservableMod.RelayObservable[typings.relayRuntime.relayNetworkTypesMod.GraphQLResponse]
  ]
  type FetchFunction = js.Function4[
    /* request */ typings.relayRuntime.relayConcreteNodeMod.RequestParameters, 
    /* variables */ typings.relayRuntime.relayRuntimeTypesMod.Variables, 
    /* cacheConfig */ typings.relayRuntime.relayRuntimeTypesMod.CacheConfig, 
    /* uploadables */ js.UndefOr[typings.relayRuntime.relayNetworkTypesMod.UploadableMap | scala.Null], 
    typings.relayRuntime.relayObservableMod.ObservableFromValue[typings.relayRuntime.relayNetworkTypesMod.GraphQLResponse]
  ]
  type GraphQLResponse = typings.relayRuntime.relayNetworkTypesMod.GraphQLSingularResponse | js.Array[typings.relayRuntime.relayNetworkTypesMod.GraphQLSingularResponse]
  type LogRequestInfoFunction = js.Function1[/* arg */ js.Any, scala.Unit]
  type PayloadData = org.scalablytyped.runtime.StringDictionary[js.Any]
  type PayloadExtensions = org.scalablytyped.runtime.StringDictionary[js.Any]
  type SubscribeFunction = js.Function4[
    /* request */ typings.relayRuntime.relayConcreteNodeMod.RequestParameters, 
    /* variables */ typings.relayRuntime.relayRuntimeTypesMod.Variables, 
    /* cacheConfig */ typings.relayRuntime.relayRuntimeTypesMod.CacheConfig, 
    /* observer */ js.UndefOr[
      typings.relayRuntime.relayNetworkTypesMod.LegacyObserver[typings.relayRuntime.relayNetworkTypesMod.GraphQLResponse]
    ], 
    typings.relayRuntime.relayObservableMod.RelayObservable[typings.relayRuntime.relayNetworkTypesMod.GraphQLResponse] | typings.relayRuntime.relayRuntimeTypesMod.Disposable
  ]
  type Uploadable = typings.std.File | typings.std.Blob
  type UploadableMap = org.scalablytyped.runtime.StringDictionary[typings.relayRuntime.relayNetworkTypesMod.Uploadable]
}
