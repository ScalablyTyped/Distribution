package typings.relayDashRuntime.relayDashRuntimeMod

import typings.relayDashRuntime.libQueryRelayModernGraphQLTagMod.GraphQLTaggedNode
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.CacheConfig
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.OperationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime", "fetchQuery")
@js.native
object fetchQuery_variables extends js.Object {
  def apply[T /* <: OperationType */](
    environment: typings.relayDashRuntime.libStoreRelayStoreTypesMod.Environment,
    taggedNode: GraphQLTaggedNode,
    variables: /* import warning: ImportType.apply Failed type conversion: T['variables'] */ js.Any
  ): js.Promise[
    /* import warning: ImportType.apply Failed type conversion: T['response'] */ js.Any
  ] = js.native
  def apply[T /* <: OperationType */](
    environment: typings.relayDashRuntime.libStoreRelayStoreTypesMod.Environment,
    taggedNode: GraphQLTaggedNode,
    variables: /* import warning: ImportType.apply Failed type conversion: T['variables'] */ js.Any,
    cacheConfig: CacheConfig
  ): js.Promise[
    /* import warning: ImportType.apply Failed type conversion: T['response'] */ js.Any
  ] = js.native
}

