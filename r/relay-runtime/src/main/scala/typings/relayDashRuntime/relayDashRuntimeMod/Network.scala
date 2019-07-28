package typings.relayDashRuntime.relayDashRuntimeMod

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

// ./network/RelayNetwork
@JSImport("relay-runtime", "Network")
@js.native
object Network extends js.Object {
  def create(fetchFn: FetchFunction): Network = js.native
  def create(fetchFn: FetchFunction, subscribeFn: SubscribeFunction): Network = js.native
}

