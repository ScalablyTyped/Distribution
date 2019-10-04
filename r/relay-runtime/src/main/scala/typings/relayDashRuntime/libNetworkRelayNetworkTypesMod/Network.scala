package typings.relayDashRuntime.libNetworkRelayNetworkTypesMod

import typings.relayDashRuntime.libNetworkRelayObservableMod.RelayObservable
import typings.relayDashRuntime.libUtilRelayConcreteNodeMod.RequestParameters
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.CacheConfig
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Network extends js.Object {
  @JSName("execute")
  var execute_Original: ExecuteFunction = js.native
  def execute(request: RequestParameters, variables: Variables, cacheConfig: CacheConfig): RelayObservable[GraphQLResponse] = js.native
  def execute(
    request: RequestParameters,
    variables: Variables,
    cacheConfig: CacheConfig,
    uploadables: UploadableMap
  ): RelayObservable[GraphQLResponse] = js.native
}

