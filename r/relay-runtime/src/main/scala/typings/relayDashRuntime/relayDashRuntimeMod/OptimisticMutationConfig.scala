package typings.relayDashRuntime.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptimisticMutationConfig extends js.Object {
  var configs: js.UndefOr[js.Array[DeclarativeMutationConfig] | Null] = js.undefined
  var mutation: GraphQLTaggedNode
  var optimisticResponse: js.UndefOr[js.Object] = js.undefined
  var optimisticUpdater: js.UndefOr[SelectorStoreUpdater[_] | Null] = js.undefined
  var variables: Variables
}

object OptimisticMutationConfig {
  @scala.inline
  def apply(
    mutation: GraphQLTaggedNode,
    variables: Variables,
    configs: js.Array[DeclarativeMutationConfig] = null,
    optimisticResponse: js.Object = null,
    optimisticUpdater: SelectorStoreUpdater[_] = null
  ): OptimisticMutationConfig = {
    val __obj = js.Dynamic.literal(mutation = mutation.asInstanceOf[js.Any], variables = variables)
    if (configs != null) __obj.updateDynamic("configs")(configs)
    if (optimisticResponse != null) __obj.updateDynamic("optimisticResponse")(optimisticResponse)
    if (optimisticUpdater != null) __obj.updateDynamic("optimisticUpdater")(optimisticUpdater)
    __obj.asInstanceOf[OptimisticMutationConfig]
  }
}

