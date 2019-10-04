package typings.reactDashRelay.reactDashRelayMod

import typings.react.reactMod.ComponentType
import typings.react.reactMod.Context
import typings.reactDashRelay.Anon_Relay
import typings.reactDashRelay.Anon_RelayRelayPaginationProp
import typings.reactDashRelay.Anon_RelayRelayRefetchProp
import typings.relayDashRuntime.libMutationsApplyOptimisticMutationMod.OptimisticMutationConfig
import typings.relayDashRuntime.libMutationsCommitMutationMod.MutationConfig
import typings.relayDashRuntime.libMutationsCommitMutationMod.MutationParameters
import typings.relayDashRuntime.libQueryRelayModernGraphQLTagMod.GraphQLTaggedNode
import typings.relayDashRuntime.libStoreRelayModernEnvironmentMod.RelayModernEnvironment
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.RelayContext
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.StoreUpdater
import typings.relayDashRuntime.libSubscriptionRequestSubscriptionMod.GraphQLSubscriptionConfig
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.CacheConfig
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.Disposable
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.OperationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-relay", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val ReactRelayContext: Context[RelayContext | Null] = js.native
  def applyOptimisticMutation(
    environment: typings.relayDashRuntime.libStoreRelayStoreTypesMod.Environment,
    config: OptimisticMutationConfig
  ): Disposable = js.native
  def commitLocalUpdate(
    environment: typings.relayDashRuntime.libStoreRelayStoreTypesMod.Environment,
    updater: StoreUpdater
  ): Unit = js.native
  def commitMutation[TOperation /* <: MutationParameters */](
    environment: RelayModernEnvironment,
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
    environment: typings.relayDashRuntime.libStoreRelayStoreTypesMod.Environment,
    taggedNode: GraphQLTaggedNode,
    variables: /* import warning: ImportType.apply Failed type conversion: T['variables'] */ js.Any
  ): js.Promise[
    /* import warning: ImportType.apply Failed type conversion: T['response'] */ js.Any
  ] = js.native
  @JSName("fetchQuery")
  def fetchQuery_variables[T /* <: OperationType */](
    environment: typings.relayDashRuntime.libStoreRelayStoreTypesMod.Environment,
    taggedNode: GraphQLTaggedNode,
    variables: /* import warning: ImportType.apply Failed type conversion: T['variables'] */ js.Any,
    cacheConfig: CacheConfig
  ): js.Promise[
    /* import warning: ImportType.apply Failed type conversion: T['response'] */ js.Any
  ] = js.native
  def graphql(strings: js.Any): GraphQLTaggedNode = js.native
  def readInlineData[T /* <: _RefType[_] */](fragment: GraphQLTaggedNode, ref: FragmentOrRegularProp[T]): T = js.native
  def requestSubscription[TSubscriptionPayload](
    environment: typings.relayDashRuntime.libStoreRelayStoreTypesMod.Environment,
    // tslint:disable-next-line no-unnecessary-generics
  config: GraphQLSubscriptionConfig[TSubscriptionPayload]
  ): Disposable = js.native
}

