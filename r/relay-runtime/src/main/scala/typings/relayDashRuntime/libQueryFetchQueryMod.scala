package typings.relayDashRuntime

import typings.relayDashRuntime.libQueryRelayModernGraphQLTagMod.GraphQLTaggedNode
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.Environment
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.CacheConfig
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.OperationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime/lib/query/fetchQuery", JSImport.Namespace)
@js.native
object libQueryFetchQueryMod extends js.Object {
  @JSName("fetchQuery")
  def fetchQuery_variables[T /* <: OperationType */](
    environment: Environment,
    taggedNode: GraphQLTaggedNode,
    variables: /* import warning: ImportType.apply Failed type conversion: T['variables'] */ js.Any
  ): js.Promise[
    /* import warning: ImportType.apply Failed type conversion: T['response'] */ js.Any
  ] = js.native
  @JSName("fetchQuery")
  def fetchQuery_variables[T /* <: OperationType */](
    environment: Environment,
    taggedNode: GraphQLTaggedNode,
    variables: /* import warning: ImportType.apply Failed type conversion: T['variables'] */ js.Any,
    cacheConfig: CacheConfig
  ): js.Promise[
    /* import warning: ImportType.apply Failed type conversion: T['response'] */ js.Any
  ] = js.native
}

