package typings.relayDashRuntime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libNetworkRelayNetworkTypesMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.relayDashRuntime.libNetworkRelayObservableMod.ObservableFromValue
  import typings.relayDashRuntime.libNetworkRelayObservableMod.RelayObservable
  import typings.relayDashRuntime.libUtilRelayConcreteNodeMod.RequestParameters
  import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.CacheConfig
  import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.Disposable
  import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.Variables
  import typings.std.Blob
  import typings.std.File

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
  type LogRequestInfoFunction = js.Function1[/* arg */ js.Any, Unit]
  type PayloadData = StringDictionary[js.Any]
  type PayloadExtensions = StringDictionary[js.Any]
  type SubscribeFunction = js.Function4[
    /* request */ RequestParameters, 
    /* variables */ Variables, 
    /* cacheConfig */ CacheConfig, 
    /* observer */ js.UndefOr[LegacyObserver[GraphQLResponse]], 
    RelayObservable[GraphQLResponse] | Disposable
  ]
  type Uploadable = File | Blob
  type UploadableMap = StringDictionary[Uploadable]
}
