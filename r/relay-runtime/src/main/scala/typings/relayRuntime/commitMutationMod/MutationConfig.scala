package typings.relayRuntime.commitMutationMod

import typings.relayRuntime.readerNodeMod.ReaderFragment
import typings.relayRuntime.relayConcreteNodeMod.ConcreteRequest
import typings.relayRuntime.relayDeclarativeMutationConfigMod.DeclarativeMutationConfig
import typings.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import typings.relayRuntime.relayNetworkTypesMod.PayloadError
import typings.relayRuntime.relayNetworkTypesMod.UploadableMap
import typings.relayRuntime.relayStoreTypesMod.RecordSourceSelectorProxy
import typings.relayRuntime.relayStoreTypesMod.SelectorStoreUpdater
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MutationConfig[TOperation /* <: MutationParameters */] extends js.Object {
  var configs: js.UndefOr[js.Array[DeclarativeMutationConfig]] = js.native
  var mutation: GraphQLTaggedNode = js.native
  var onCompleted: js.UndefOr[
    (js.Function2[
      /* import warning: importer.ImportType#apply Failed type conversion: TOperation['response'] */ /* response */ js.Any, 
      /* errors */ js.UndefOr[js.Array[PayloadError] | Null], 
      Unit
    ]) | Null
  ] = js.native
  var onError: js.UndefOr[(js.Function1[/* error */ Error, Unit]) | Null] = js.native
  var optimisticResponse: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TOperation['response'] */ js.Any
  ] = js.native
  var optimisticUpdater: js.UndefOr[
    (SelectorStoreUpdater[
      /* import warning: importer.ImportType#apply Failed type conversion: TOperation['response'] */ js.Any
    ]) | Null
  ] = js.native
  var updater: js.UndefOr[
    (SelectorStoreUpdater[
      /* import warning: importer.ImportType#apply Failed type conversion: TOperation['response'] */ js.Any
    ]) | Null
  ] = js.native
  var uploadables: js.UndefOr[UploadableMap | Null] = js.native
  var variables: /* import warning: importer.ImportType#apply Failed type conversion: TOperation['variables'] */ js.Any = js.native
}

object MutationConfig {
  @scala.inline
  def apply[/* <: typings.relayRuntime.commitMutationMod.MutationParameters */ TOperation](
    mutation: GraphQLTaggedNode,
    variables: /* import warning: importer.ImportType#apply Failed type conversion: TOperation['variables'] */ js.Any
  ): MutationConfig[TOperation] = {
    val __obj = js.Dynamic.literal(mutation = mutation.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutationConfig[TOperation]]
  }
  @scala.inline
  implicit class MutationConfigOps[Self <: MutationConfig[_], /* <: typings.relayRuntime.commitMutationMod.MutationParameters */ TOperation] (val x: Self with MutationConfig[TOperation]) extends AnyVal {
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
    def setVariables(
      value: /* import warning: importer.ImportType#apply Failed type conversion: TOperation['variables'] */ js.Any
    ): Self = this.set("variables", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfigsVarargs(value: DeclarativeMutationConfig*): Self = this.set("configs", js.Array(value :_*))
    @scala.inline
    def setConfigs(value: js.Array[DeclarativeMutationConfig]): Self = this.set("configs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigs: Self = this.set("configs", js.undefined)
    @scala.inline
    def setOnCompleted(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: TOperation['response'] */ /* response */ js.Any, /* errors */ js.UndefOr[js.Array[PayloadError] | Null]) => Unit
    ): Self = this.set("onCompleted", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnCompleted: Self = this.set("onCompleted", js.undefined)
    @scala.inline
    def setOnCompletedNull: Self = this.set("onCompleted", null)
    @scala.inline
    def setOnError(value: /* error */ Error => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    @scala.inline
    def setOnErrorNull: Self = this.set("onError", null)
    @scala.inline
    def setOptimisticResponse(
      value: /* import warning: importer.ImportType#apply Failed type conversion: TOperation['response'] */ js.Any
    ): Self = this.set("optimisticResponse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptimisticResponse: Self = this.set("optimisticResponse", js.undefined)
    @scala.inline
    def setOptimisticUpdater(
      value: (/* store */ RecordSourceSelectorProxy[
          /* import warning: importer.ImportType#apply Failed type conversion: TOperation['response'] */ js.Any
        ], /* import warning: importer.ImportType#apply Failed type conversion: TOperation['response'] */ js.Any) => Unit
    ): Self = this.set("optimisticUpdater", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOptimisticUpdater: Self = this.set("optimisticUpdater", js.undefined)
    @scala.inline
    def setOptimisticUpdaterNull: Self = this.set("optimisticUpdater", null)
    @scala.inline
    def setUpdater(
      value: (/* store */ RecordSourceSelectorProxy[
          /* import warning: importer.ImportType#apply Failed type conversion: TOperation['response'] */ js.Any
        ], /* import warning: importer.ImportType#apply Failed type conversion: TOperation['response'] */ js.Any) => Unit
    ): Self = this.set("updater", js.Any.fromFunction2(value))
    @scala.inline
    def deleteUpdater: Self = this.set("updater", js.undefined)
    @scala.inline
    def setUpdaterNull: Self = this.set("updater", null)
    @scala.inline
    def setUploadables(value: UploadableMap): Self = this.set("uploadables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUploadables: Self = this.set("uploadables", js.undefined)
    @scala.inline
    def setUploadablesNull: Self = this.set("uploadables", null)
  }
  
}

