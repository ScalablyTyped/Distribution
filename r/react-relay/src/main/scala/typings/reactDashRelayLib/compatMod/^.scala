package typings
package reactDashRelayLib.compatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-relay/compat", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val graphql: reactDashRelayLib.reactDashRelayMod.GraphqlInterface = js.native
  def applyOptimisticMutation(
    environment: reactDashRelayLib.compatMod.CompatEnvironment,
    config: relayDashRuntimeLib.relayDashRuntimeMod.OptimisticMutationConfig
  ): relayDashRuntimeLib.relayDashRuntimeMod.Disposable = js.native
  def commitMutation(
    environment: reactDashRelayLib.compatMod.CompatEnvironment,
    config: relayDashRuntimeLib.relayDashRuntimeMod.MutationConfig[_]
  ): relayDashRuntimeLib.relayDashRuntimeMod.Disposable = js.native
  def createFragmentContainer[T](
    Component: reactLib.reactMod.ReactNs.ComponentType[T],
    fragmentSpec: reactDashRelayLib.compatMod.GeneratedNodeMap
  ): reactDashRelayLib.compatMod.ReactFragmentComponent[T] = js.native
  def createFragmentContainer[T](
    Component: reactLib.reactMod.ReactNs.ComponentType[T],
    fragmentSpec: relayDashRuntimeLib.relayDashRuntimeMod.GraphQLTaggedNode
  ): reactDashRelayLib.compatMod.ReactFragmentComponent[T] = js.native
  def createPaginationContainer[T](
    Component: reactLib.reactMod.ReactNs.ComponentType[T],
    fragmentSpec: reactDashRelayLib.compatMod.GeneratedNodeMap,
    connectionConfig: reactDashRelayLib.reactDashRelayMod.ConnectionConfig[T]
  ): reactDashRelayLib.compatMod.ReactFragmentComponent[T] = js.native
  def createPaginationContainer[T](
    Component: reactLib.reactMod.ReactNs.ComponentType[T],
    fragmentSpec: relayDashRuntimeLib.relayDashRuntimeMod.GraphQLTaggedNode,
    connectionConfig: reactDashRelayLib.reactDashRelayMod.ConnectionConfig[T]
  ): reactDashRelayLib.compatMod.ReactFragmentComponent[T] = js.native
  def createRefetchContainer[T](
    Component: reactLib.reactMod.ReactNs.ComponentType[T],
    fragmentSpec: reactDashRelayLib.compatMod.GeneratedNodeMap,
    taggedNode: relayDashRuntimeLib.relayDashRuntimeMod.GraphQLTaggedNode
  ): reactDashRelayLib.compatMod.ReactFragmentComponent[T] = js.native
  def createRefetchContainer[T](
    Component: reactLib.reactMod.ReactNs.ComponentType[T],
    fragmentSpec: relayDashRuntimeLib.relayDashRuntimeMod.GraphQLTaggedNode,
    taggedNode: relayDashRuntimeLib.relayDashRuntimeMod.GraphQLTaggedNode
  ): reactDashRelayLib.compatMod.ReactFragmentComponent[T] = js.native
  def getFragment(q: java.lang.String): java.lang.String = js.native
  def getFragment(q: java.lang.String, v: relayDashRuntimeLib.relayDashRuntimeMod.Variables): java.lang.String = js.native
  def injectDefaultVariablesProvider(variablesProvider: reactDashRelayLib.compatMod.VariablesProvider): scala.Unit = js.native
}

