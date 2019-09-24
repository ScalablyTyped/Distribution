package typings.reactDashRelay.reactDashRelayMod

import typings.react.reactMod.ComponentType
import typings.react.reactMod.Context
import typings.reactDashRelay.Anon_Relay
import typings.reactDashRelay.Anon_RelayRelayPaginationProp
import typings.reactDashRelay.Anon_RelayRelayRefetchProp
import typings.relayDashRuntime.relayDashRuntimeMod.CacheConfig
import typings.relayDashRuntime.relayDashRuntimeMod.Disposable
import typings.relayDashRuntime.relayDashRuntimeMod.GraphQLSubscriptionConfig
import typings.relayDashRuntime.relayDashRuntimeMod.GraphQLTaggedNode
import typings.relayDashRuntime.relayDashRuntimeMod.MutationConfig
import typings.relayDashRuntime.relayDashRuntimeMod.OperationType
import typings.relayDashRuntime.relayDashRuntimeMod.OptimisticMutationConfig
import typings.relayDashRuntime.relayDashRuntimeMod.RelayContext
import typings.relayDashRuntime.relayDashRuntimeMod.RelayModernEnvironment
import typings.relayDashRuntime.relayDashRuntimeMod.StoreUpdater
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-relay", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val ReactRelayContext: Context[RelayContext | Null] = js.native
  // Helpers (can be implemented via the above API)
  // ./mutations/applyRelayModernOptimisticMutation
  def applyOptimisticMutation(
    environment: typings.relayDashRuntime.relayDashRuntimeMod.Environment,
    config: OptimisticMutationConfig
  ): Disposable = js.native
  def commitLocalUpdate(environment: typings.relayDashRuntime.relayDashRuntimeMod.Environment, updater: StoreUpdater): Unit = js.native
  // ./mutations/commitRelayModernMutation
  def commitMutation[TOperation /* <: OperationType */](
    environment: typings.relayDashRuntime.relayDashRuntimeMod.Environment,
    // tslint:disable-next-line no-unnecessary-generics
  config: MutationConfig[TOperation]
  ): Disposable = js.native
  def createFragmentContainer[Props](Component: ComponentType[Props with Anon_Relay], fragmentSpec: GeneratedNodeMap): Container[Props] = js.native
  def createFragmentContainer[Props](Component: ComponentType[Props with Anon_Relay], fragmentSpec: GraphQLTaggedNode): Container[Props] = js.native
  def createPaginationContainer[Props](
    Component: ComponentType[Props with Anon_RelayRelayPaginationProp],
    fragmentSpec: GeneratedNodeMap,
    connectionConfig: ConnectionConfig[Props]
  ): Container[Props] = js.native
  def createPaginationContainer[Props](
    Component: ComponentType[Props with Anon_RelayRelayPaginationProp],
    fragmentSpec: GraphQLTaggedNode,
    connectionConfig: ConnectionConfig[Props]
  ): Container[Props] = js.native
  def createRefetchContainer[Props](
    Component: ComponentType[Props with Anon_RelayRelayRefetchProp],
    fragmentSpec: GeneratedNodeMap,
    taggedNode: GraphQLTaggedNode
  ): Container[Props] = js.native
  def createRefetchContainer[Props](
    Component: ComponentType[Props with Anon_RelayRelayRefetchProp],
    fragmentSpec: GraphQLTaggedNode,
    taggedNode: GraphQLTaggedNode
  ): Container[Props] = js.native
  @JSName("fetchQuery")
  def fetchQuery_variables[T /* <: OperationType */](
    environment: RelayModernEnvironment,
    taggedNode: GraphQLTaggedNode,
    variables: /* import warning: ImportType.apply Failed type conversion: T['variables'] */ js.Any
  ): js.Promise[
    /* import warning: ImportType.apply Failed type conversion: T['response'] */ js.Any
  ] = js.native
  @JSName("fetchQuery")
  def fetchQuery_variables[T /* <: OperationType */](
    environment: RelayModernEnvironment,
    taggedNode: GraphQLTaggedNode,
    variables: /* import warning: ImportType.apply Failed type conversion: T['variables'] */ js.Any,
    cacheConfig: CacheConfig
  ): js.Promise[
    /* import warning: ImportType.apply Failed type conversion: T['response'] */ js.Any
  ] = js.native
  def graphql(strings: js.Array[String]): GraphQLTaggedNode = js.native
  def readInlineData[T /* <: _RefType[_] */](fragment: GraphQLTaggedNode, ref: FragmentOrRegularProp[T]): T = js.native
  // ./subscription/requestRelaySubscription
  def requestSubscription(
    environment: typings.relayDashRuntime.relayDashRuntimeMod.Environment,
    config: GraphQLSubscriptionConfig[js.Object]
  ): Disposable = js.native
}

