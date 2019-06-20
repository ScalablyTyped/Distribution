package typings
package reactDashRelayLib.reactDashRelayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-relay", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val ReactRelayContext: reactLib.reactMod.Context[relayDashRuntimeLib.relayDashRuntimeMod.RelayContext | scala.Null] = js.native
  // Helpers (can be implemented via the above API)
  // ./mutations/applyRelayModernOptimisticMutation
  def applyOptimisticMutation(
    environment: relayDashRuntimeLib.relayDashRuntimeMod.Environment,
    config: relayDashRuntimeLib.relayDashRuntimeMod.OptimisticMutationConfig
  ): relayDashRuntimeLib.relayDashRuntimeMod.Disposable = js.native
  def commitLocalUpdate(
    environment: relayDashRuntimeLib.relayDashRuntimeMod.Environment,
    updater: relayDashRuntimeLib.relayDashRuntimeMod.StoreUpdater
  ): scala.Unit = js.native
  // ./mutations/commitRelayModernMutation
  def commitMutation[TOperation /* <: relayDashRuntimeLib.relayDashRuntimeMod.OperationType */](
    environment: relayDashRuntimeLib.relayDashRuntimeMod.Environment,
    // tslint:disable-next-line no-unnecessary-generics
  config: relayDashRuntimeLib.relayDashRuntimeMod.MutationConfig[TOperation]
  ): relayDashRuntimeLib.relayDashRuntimeMod.Disposable = js.native
  def createFragmentContainer[Props](
    Component: reactLib.reactMod.ComponentType[Props with reactDashRelayLib.Anon_Relay],
    fragmentSpec: GeneratedNodeMap
  ): Container[Props] = js.native
  def createFragmentContainer[Props](
    Component: reactLib.reactMod.ComponentType[Props with reactDashRelayLib.Anon_Relay],
    fragmentSpec: relayDashRuntimeLib.relayDashRuntimeMod.GraphQLTaggedNode
  ): Container[Props] = js.native
  def createPaginationContainer[Props](
    Component: reactLib.reactMod.ComponentType[Props with reactDashRelayLib.Anon_RelayRelayPaginationProp],
    fragmentSpec: GeneratedNodeMap,
    connectionConfig: ConnectionConfig[Props]
  ): Container[Props] = js.native
  def createPaginationContainer[Props](
    Component: reactLib.reactMod.ComponentType[Props with reactDashRelayLib.Anon_RelayRelayPaginationProp],
    fragmentSpec: relayDashRuntimeLib.relayDashRuntimeMod.GraphQLTaggedNode,
    connectionConfig: ConnectionConfig[Props]
  ): Container[Props] = js.native
  def createRefetchContainer[Props](
    Component: reactLib.reactMod.ComponentType[Props with reactDashRelayLib.Anon_RelayRelayRefetchProp],
    fragmentSpec: GeneratedNodeMap,
    taggedNode: relayDashRuntimeLib.relayDashRuntimeMod.GraphQLTaggedNode
  ): Container[Props] = js.native
  def createRefetchContainer[Props](
    Component: reactLib.reactMod.ComponentType[Props with reactDashRelayLib.Anon_RelayRelayRefetchProp],
    fragmentSpec: relayDashRuntimeLib.relayDashRuntimeMod.GraphQLTaggedNode,
    taggedNode: relayDashRuntimeLib.relayDashRuntimeMod.GraphQLTaggedNode
  ): Container[Props] = js.native
  @JSName("fetchQuery")
  def fetchQuery_variables[T /* <: relayDashRuntimeLib.relayDashRuntimeMod.OperationType */](
    environment: relayDashRuntimeLib.relayDashRuntimeMod.RelayModernEnvironment,
    taggedNode: relayDashRuntimeLib.relayDashRuntimeMod.GraphQLTaggedNode,
    variables: /* import warning: ImportType.apply Failed type conversion: T['variables'] */ js.Any
  ): js.Promise[
    /* import warning: ImportType.apply Failed type conversion: T['response'] */ js.Any
  ] = js.native
  @JSName("fetchQuery")
  def fetchQuery_variables[T /* <: relayDashRuntimeLib.relayDashRuntimeMod.OperationType */](
    environment: relayDashRuntimeLib.relayDashRuntimeMod.RelayModernEnvironment,
    taggedNode: relayDashRuntimeLib.relayDashRuntimeMod.GraphQLTaggedNode,
    variables: /* import warning: ImportType.apply Failed type conversion: T['variables'] */ js.Any,
    cacheConfig: relayDashRuntimeLib.relayDashRuntimeMod.CacheConfig
  ): js.Promise[
    /* import warning: ImportType.apply Failed type conversion: T['response'] */ js.Any
  ] = js.native
  def graphql(strings: js.Array[java.lang.String]): relayDashRuntimeLib.relayDashRuntimeMod.GraphQLTaggedNode = js.native
  // ./subscription/requestRelaySubscription
  def requestSubscription(
    environment: relayDashRuntimeLib.relayDashRuntimeMod.Environment,
    config: relayDashRuntimeLib.relayDashRuntimeMod.GraphQLSubscriptionConfig[js.Object]
  ): relayDashRuntimeLib.relayDashRuntimeMod.Disposable = js.native
}

