package typings
package reactDashRelayLib.reactDashRelayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-relay", JSImport.Namespace)
@js.native
object reactDashRelayModMembers extends js.Object {
  val graphql: GraphqlInterface = js.native
  def FragmentVariablesGetter(prevVars: relayDashRuntimeLib.relayDashRuntimeMod.Variables, totalCount: scala.Double): relayDashRuntimeLib.relayDashRuntimeMod.Variables = js.native
  def RelayQL(strings: js.Array[java.lang.String], substitutions: js.Any*): relayDashRuntimeLib.relayDashRuntimeMod.RelayConcreteNode = js.native
  def commitLocalUpdate(
    environment: relayDashRuntimeLib.relayDashRuntimeMod.Environment,
    updater: relayDashRuntimeLib.relayDashRuntimeMod.StoreUpdater
  ): scala.Unit = js.native
  def commitMutation[T /* <: relayDashRuntimeLib.relayDashRuntimeMod.OperationBase */](
    environment: relayDashRuntimeLib.relayDashRuntimeMod.Environment,
    // tslint:disable-next-line:no-unnecessary-generics
  config: relayDashRuntimeLib.relayDashRuntimeMod.MutationConfig[T]
  ): relayDashRuntimeLib.relayDashRuntimeMod.Disposable = js.native
  def createFragmentContainer[P](Component: reactLib.reactMod.ReactNs.ComponentType[P], fragmentSpec: GeneratedNodeMap): RelayContainer[P] = js.native
  def createFragmentContainer[P](
    Component: reactLib.reactMod.ReactNs.ComponentType[P],
    fragmentSpec: relayDashRuntimeLib.relayDashRuntimeMod.GraphQLTaggedNode
  ): RelayContainer[P] = js.native
  def createPaginationContainer[P](
    Component: reactLib.reactMod.ReactNs.ComponentType[P],
    fragmentSpec: GeneratedNodeMap,
    connectionConfig: ConnectionConfig[P]
  ): RelayContainer[P] = js.native
  def createPaginationContainer[P](
    Component: reactLib.reactMod.ReactNs.ComponentType[P],
    fragmentSpec: relayDashRuntimeLib.relayDashRuntimeMod.GraphQLTaggedNode,
    connectionConfig: ConnectionConfig[P]
  ): RelayContainer[P] = js.native
  def createRefetchContainer[P](
    Component: reactLib.reactMod.ReactNs.ComponentType[P],
    fragmentSpec: GeneratedNodeMap,
    taggedNode: relayDashRuntimeLib.relayDashRuntimeMod.GraphQLTaggedNode
  ): RelayContainer[P] = js.native
  def createRefetchContainer[P](
    Component: reactLib.reactMod.ReactNs.ComponentType[P],
    fragmentSpec: relayDashRuntimeLib.relayDashRuntimeMod.GraphQLTaggedNode,
    taggedNode: relayDashRuntimeLib.relayDashRuntimeMod.GraphQLTaggedNode
  ): RelayContainer[P] = js.native
  def fetchQuery(
     // FIXME - $FlowFixMe in facebook source code
  environment: js.Any,
    taggedNode: relayDashRuntimeLib.relayDashRuntimeMod.GraphQLTaggedNode,
    variables: relayDashRuntimeLib.relayDashRuntimeMod.Variables
  ): js.Promise[_] = js.native
  def fetchQuery(
     // FIXME - $FlowFixMe in facebook source code
  environment: js.Any,
    taggedNode: relayDashRuntimeLib.relayDashRuntimeMod.GraphQLTaggedNode,
    variables: relayDashRuntimeLib.relayDashRuntimeMod.Variables,
    cacheConfig: relayDashRuntimeLib.relayDashRuntimeMod.CacheConfig
  ): js.Promise[_] = js.native
  def requestSubscription(
    environment: relayDashRuntimeLib.relayDashRuntimeMod.Environment,
    config: relayDashRuntimeLib.relayDashRuntimeMod.GraphQLSubscriptionConfig
  ): relayDashRuntimeLib.relayDashRuntimeMod.Disposable = js.native
}

