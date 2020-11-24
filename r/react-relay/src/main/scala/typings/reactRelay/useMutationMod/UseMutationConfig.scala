package typings.reactRelay.useMutationMod

import typings.relayRuntime.commitMutationMod.MutationParameters
import typings.relayRuntime.relayDeclarativeMutationConfigMod.DeclarativeMutationConfig
import typings.relayRuntime.relayNetworkTypesMod.PayloadError
import typings.relayRuntime.relayNetworkTypesMod.UploadableMap
import typings.relayRuntime.relayRuntimeTypesMod.VariablesOf
import typings.relayRuntime.relayStoreTypesMod.RecordSourceSelectorProxy
import typings.relayRuntime.relayStoreTypesMod.SelectorStoreUpdater
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseMutationConfig[TMutation /* <: MutationParameters */] extends js.Object {
  
  var configs: js.UndefOr[js.Array[DeclarativeMutationConfig]] = js.native
  
  var onCompleted: js.UndefOr[
    js.Function2[
      /* import warning: importer.ImportType#apply Failed type conversion: TMutation['response'] */ /* response */ js.Any, 
      /* errors */ js.Array[PayloadError], 
      Unit | Null
    ]
  ] = js.native
  
  var onError: js.UndefOr[js.Function1[/* error */ Error, Unit | Null]] = js.native
  
  var onUnsubscribe: js.UndefOr[js.Function0[Unit | Null]] = js.native
  
  var optimisticResponse: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TMutation['rawResponse'] */ js.Any
  ] = js.native
  
  var optimisticUpdater: js.UndefOr[
    (SelectorStoreUpdater[
      /* import warning: importer.ImportType#apply Failed type conversion: TMutation['response'] */ js.Any
    ]) | Null
  ] = js.native
  
  var updater: js.UndefOr[
    (SelectorStoreUpdater[
      /* import warning: importer.ImportType#apply Failed type conversion: TMutation['response'] */ js.Any
    ]) | Null
  ] = js.native
  
  var uploadables: js.UndefOr[UploadableMap] = js.native
  
  var variables: VariablesOf[TMutation] = js.native
}
object UseMutationConfig {
  
  @scala.inline
  def apply[TMutation /* <: MutationParameters */](variables: VariablesOf[TMutation]): UseMutationConfig[TMutation] = {
    val __obj = js.Dynamic.literal(variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseMutationConfig[TMutation]]
  }
  
  @scala.inline
  implicit class UseMutationConfigOps[Self <: UseMutationConfig[_], TMutation /* <: MutationParameters */] (val x: Self with UseMutationConfig[TMutation]) extends AnyVal {
    
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
    def setVariables(value: VariablesOf[TMutation]): Self = this.set("variables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigsVarargs(value: DeclarativeMutationConfig*): Self = this.set("configs", js.Array(value :_*))
    
    @scala.inline
    def setConfigs(value: js.Array[DeclarativeMutationConfig]): Self = this.set("configs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigs: Self = this.set("configs", js.undefined)
    
    @scala.inline
    def setOnCompleted(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: TMutation['response'] */ /* response */ js.Any, /* errors */ js.Array[PayloadError]) => Unit | Null
    ): Self = this.set("onCompleted", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnCompleted: Self = this.set("onCompleted", js.undefined)
    
    @scala.inline
    def setOnError(value: /* error */ Error => Unit | Null): Self = this.set("onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    
    @scala.inline
    def setOnUnsubscribe(value: () => Unit | Null): Self = this.set("onUnsubscribe", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnUnsubscribe: Self = this.set("onUnsubscribe", js.undefined)
    
    @scala.inline
    def setOptimisticResponse(
      value: /* import warning: importer.ImportType#apply Failed type conversion: TMutation['rawResponse'] */ js.Any
    ): Self = this.set("optimisticResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptimisticResponse: Self = this.set("optimisticResponse", js.undefined)
    
    @scala.inline
    def setOptimisticUpdater(
      value: (/* store */ RecordSourceSelectorProxy[
          /* import warning: importer.ImportType#apply Failed type conversion: TMutation['response'] */ js.Any
        ], /* import warning: importer.ImportType#apply Failed type conversion: TMutation['response'] */ js.Any) => Unit
    ): Self = this.set("optimisticUpdater", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOptimisticUpdater: Self = this.set("optimisticUpdater", js.undefined)
    
    @scala.inline
    def setOptimisticUpdaterNull: Self = this.set("optimisticUpdater", null)
    
    @scala.inline
    def setUpdater(
      value: (/* store */ RecordSourceSelectorProxy[
          /* import warning: importer.ImportType#apply Failed type conversion: TMutation['response'] */ js.Any
        ], /* import warning: importer.ImportType#apply Failed type conversion: TMutation['response'] */ js.Any) => Unit
    ): Self = this.set("updater", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteUpdater: Self = this.set("updater", js.undefined)
    
    @scala.inline
    def setUpdaterNull: Self = this.set("updater", null)
    
    @scala.inline
    def setUploadables(value: UploadableMap): Self = this.set("uploadables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadables: Self = this.set("uploadables", js.undefined)
  }
}
