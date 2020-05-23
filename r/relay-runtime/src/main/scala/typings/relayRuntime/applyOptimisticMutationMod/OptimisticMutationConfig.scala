package typings.relayRuntime.applyOptimisticMutationMod

import typings.relayRuntime.relayDeclarativeMutationConfigMod.DeclarativeMutationConfig
import typings.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import typings.relayRuntime.relayRuntimeTypesMod.Variables
import typings.relayRuntime.relayStoreTypesMod.RecordSourceSelectorProxy
import typings.relayRuntime.relayStoreTypesMod.SelectorStoreUpdater
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptimisticMutationConfig extends js.Object {
  var configs: js.UndefOr[js.Array[DeclarativeMutationConfig] | Null] = js.undefined
  var mutation: GraphQLTaggedNode
  var optimisticResponse: js.UndefOr[js.Object] = js.undefined
  var optimisticUpdater: js.UndefOr[SelectorStoreUpdater[js.Object] | Null] = js.undefined
  var variables: Variables
}

object OptimisticMutationConfig {
  @scala.inline
  def apply(
    mutation: GraphQLTaggedNode,
    variables: Variables,
    configs: js.UndefOr[Null | js.Array[DeclarativeMutationConfig]] = js.undefined,
    optimisticResponse: js.Object = null,
    optimisticUpdater: js.UndefOr[Null | ((/* store */ RecordSourceSelectorProxy[js.Object], js.Object) => Unit)] = js.undefined
  ): OptimisticMutationConfig = {
    val __obj = js.Dynamic.literal(mutation = mutation.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    if (!js.isUndefined(configs)) __obj.updateDynamic("configs")(configs.asInstanceOf[js.Any])
    if (optimisticResponse != null) __obj.updateDynamic("optimisticResponse")(optimisticResponse.asInstanceOf[js.Any])
    if (!js.isUndefined(optimisticUpdater)) __obj.updateDynamic("optimisticUpdater")(if (optimisticUpdater != null) js.Any.fromFunction2(optimisticUpdater.asInstanceOf[(/* store */ RecordSourceSelectorProxy[js.Object], js.Object) => Unit]) else null)
    __obj.asInstanceOf[OptimisticMutationConfig]
  }
}

