package typings
package reactDashRelayLib.compatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-relay/compat", JSImport.Namespace)
@js.native
object compatModMembers extends js.Object {
  val graphql: reactDashRelayLib.reactDashRelayMod.GraphqlInterface = js.native
  def applyOptimisticMutation(
    environment: CompatEnvironment,
    config: relayDashRuntimeLib.relayDashRuntimeMod.OptimisticMutationConfig
  ): relayDashRuntimeLib.relayDashRuntimeMod.Disposable = js.native
  def commitMutation(environment: CompatEnvironment, config: relayDashRuntimeLib.relayDashRuntimeMod.MutationConfig[_]): relayDashRuntimeLib.relayDashRuntimeMod.Disposable = js.native
  def createFragmentContainer[T](Component: reactLib.reactMod.ReactNs.ComponentType[T], fragmentSpec: GeneratedNodeMap): ReactFragmentComponent[T] = js.native
  def createFragmentContainer[T](
    Component: reactLib.reactMod.ReactNs.ComponentType[T],
    fragmentSpec: relayDashRuntimeLib.relayDashRuntimeMod.GraphQLTaggedNode
  ): ReactFragmentComponent[T] = js.native
  def createPaginationContainer[T](
    Component: reactLib.reactMod.ReactNs.ComponentType[T],
    fragmentSpec: GeneratedNodeMap,
    connectionConfig: reactDashRelayLib.reactDashRelayMod.ConnectionConfig[T]
  ): ReactFragmentComponent[T] = js.native
  def createPaginationContainer[T](
    Component: reactLib.reactMod.ReactNs.ComponentType[T],
    fragmentSpec: relayDashRuntimeLib.relayDashRuntimeMod.GraphQLTaggedNode,
    connectionConfig: reactDashRelayLib.reactDashRelayMod.ConnectionConfig[T]
  ): ReactFragmentComponent[T] = js.native
  def createRefetchContainer[T](
    Component: reactLib.reactMod.ReactNs.ComponentType[T],
    fragmentSpec: GeneratedNodeMap,
    taggedNode: relayDashRuntimeLib.relayDashRuntimeMod.GraphQLTaggedNode
  ): ReactFragmentComponent[T] = js.native
  def createRefetchContainer[T](
    Component: reactLib.reactMod.ReactNs.ComponentType[T],
    fragmentSpec: relayDashRuntimeLib.relayDashRuntimeMod.GraphQLTaggedNode,
    taggedNode: relayDashRuntimeLib.relayDashRuntimeMod.GraphQLTaggedNode
  ): ReactFragmentComponent[T] = js.native
  def getFragment(q: java.lang.String): java.lang.String = js.native
  def getFragment(q: java.lang.String, v: relayDashRuntimeLib.relayDashRuntimeMod.Variables): java.lang.String = js.native
  def injectDefaultVariablesProvider(variablesProvider: VariablesProvider): scala.Unit = js.native
}

