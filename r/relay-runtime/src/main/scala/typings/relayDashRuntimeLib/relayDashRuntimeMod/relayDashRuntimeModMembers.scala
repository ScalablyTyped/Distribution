package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime", JSImport.Namespace)
@js.native
object relayDashRuntimeModMembers extends js.Object {
  val ConnectionHandler: HandlerInterface = js.native
  val ROOT_ID: java.lang.String = js.native
  val ViewerHandler: HandlerInterface = js.native
  def commitLocalUpdate(environment: Environment, updater: StoreUpdater): scala.Unit = js.native
  def commitRelayModernMutation[T /* <: OperationBase */](
    environment: Environment,
    // tslint:disable-next-line:no-unnecessary-generics
  config: MutationConfig[T]
  ): Disposable = js.native
  def fetchRelayModernQuery(
     // FIXME - $FlowFixMe in facebook source code
  environment: js.Any,
    taggedNode: GraphQLTaggedNode,
    variables: Variables
  ): stdLib.Promise[_] = js.native
  def fetchRelayModernQuery(
     // FIXME - $FlowFixMe in facebook source code
  environment: js.Any,
    taggedNode: GraphQLTaggedNode,
    variables: Variables,
    cacheConfig: CacheConfig
  ): stdLib.Promise[_] = js.native
  def requestRelaySubscription(environment: Environment, config: GraphQLSubscriptionConfig): Disposable = js.native
}

