package typings.relayRuntime.applyOptimisticMutationMod

import typings.relayRuntime.readerNodeMod.ReaderFragment
import typings.relayRuntime.relayConcreteNodeMod.ConcreteRequest
import typings.relayRuntime.relayDeclarativeMutationConfigMod.DeclarativeMutationConfig
import typings.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import typings.relayRuntime.relayRuntimeTypesMod.Variables
import typings.relayRuntime.relayStoreTypesMod.RecordSourceSelectorProxy
import typings.relayRuntime.relayStoreTypesMod.SelectorStoreUpdater
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptimisticMutationConfig extends js.Object {
  var configs: js.UndefOr[js.Array[DeclarativeMutationConfig] | Null] = js.native
  var mutation: GraphQLTaggedNode = js.native
  var optimisticResponse: js.UndefOr[js.Object] = js.native
  var optimisticUpdater: js.UndefOr[SelectorStoreUpdater[js.Object] | Null] = js.native
  var variables: Variables = js.native
}

object OptimisticMutationConfig {
  @scala.inline
  def apply(mutation: GraphQLTaggedNode, variables: Variables): OptimisticMutationConfig = {
    val __obj = js.Dynamic.literal(mutation = mutation.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptimisticMutationConfig]
  }
  @scala.inline
  implicit class OptimisticMutationConfigOps[Self <: OptimisticMutationConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMutationFunction0(value: () => ReaderFragment | ConcreteRequest): Self = this.set("mutation", js.Any.fromFunction0(value))
    @scala.inline
    def setMutation(value: GraphQLTaggedNode): Self = this.set("mutation", value.asInstanceOf[js.Any])
    @scala.inline
    def setVariables(value: Variables): Self = this.set("variables", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfigsVarargs(value: DeclarativeMutationConfig*): Self = this.set("configs", js.Array(value :_*))
    @scala.inline
    def setConfigs(value: js.Array[DeclarativeMutationConfig]): Self = this.set("configs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigs: Self = this.set("configs", js.undefined)
    @scala.inline
    def setConfigsNull: Self = this.set("configs", null)
    @scala.inline
    def setOptimisticResponse(value: js.Object): Self = this.set("optimisticResponse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptimisticResponse: Self = this.set("optimisticResponse", js.undefined)
    @scala.inline
    def setOptimisticUpdater(value: (/* store */ RecordSourceSelectorProxy[js.Object], js.Object) => Unit): Self = this.set("optimisticUpdater", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOptimisticUpdater: Self = this.set("optimisticUpdater", js.undefined)
    @scala.inline
    def setOptimisticUpdaterNull: Self = this.set("optimisticUpdater", null)
  }
  
}

