package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val ConnectionHandler: relayDashRuntimeLib.relayDashRuntimeMod.HandlerInterface = js.native
  val ROOT_ID: java.lang.String = js.native
  val ViewerHandler: relayDashRuntimeLib.relayDashRuntimeMod.HandlerInterface = js.native
  def commitLocalUpdate(
    environment: relayDashRuntimeLib.relayDashRuntimeMod.Environment,
    updater: relayDashRuntimeLib.relayDashRuntimeMod.StoreUpdater
  ): scala.Unit = js.native
  def commitRelayModernMutation[T /* <: relayDashRuntimeLib.relayDashRuntimeMod.OperationBase */](
    environment: relayDashRuntimeLib.relayDashRuntimeMod.Environment,
    // tslint:disable-next-line:no-unnecessary-generics
  config: relayDashRuntimeLib.relayDashRuntimeMod.MutationConfig[T]
  ): relayDashRuntimeLib.relayDashRuntimeMod.Disposable = js.native
  def fetchRelayModernQuery(
     // FIXME - $FlowFixMe in facebook source code
  environment: js.Any,
    taggedNode: relayDashRuntimeLib.relayDashRuntimeMod.GraphQLTaggedNode,
    variables: relayDashRuntimeLib.relayDashRuntimeMod.Variables
  ): js.Promise[_] = js.native
  def fetchRelayModernQuery(
     // FIXME - $FlowFixMe in facebook source code
  environment: js.Any,
    taggedNode: relayDashRuntimeLib.relayDashRuntimeMod.GraphQLTaggedNode,
    variables: relayDashRuntimeLib.relayDashRuntimeMod.Variables,
    cacheConfig: relayDashRuntimeLib.relayDashRuntimeMod.CacheConfig
  ): js.Promise[_] = js.native
  def requestRelaySubscription(
    environment: relayDashRuntimeLib.relayDashRuntimeMod.Environment,
    config: relayDashRuntimeLib.relayDashRuntimeMod.GraphQLSubscriptionConfig
  ): relayDashRuntimeLib.relayDashRuntimeMod.Disposable = js.native
}

