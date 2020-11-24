package typings.relayRuntime.relayModernEnvironmentMod

import typings.relayRuntime.anon.Readonlykindmissingfieldl
import typings.relayRuntime.anon.Readonlykindmissingfieldt
import typings.relayRuntime.relayDefaultHandlerProviderMod.HandlerProvider
import typings.relayRuntime.relayModernQueryExecutorMod.TaskScheduler
import typings.relayRuntime.relayNetworkTypesMod.Network
import typings.relayRuntime.relayStoreTypesMod.LogEvent
import typings.relayRuntime.relayStoreTypesMod.LogFunction
import typings.relayRuntime.relayStoreTypesMod.MissingFieldHandler
import typings.relayRuntime.relayStoreTypesMod.OperationLoader
import typings.relayRuntime.relayStoreTypesMod.OperationTracker
import typings.relayRuntime.relayStoreTypesMod.RequiredFieldLogger
import typings.relayRuntime.relayStoreTypesMod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvironmentConfig extends js.Object {
  
  val configName: js.UndefOr[String] = js.native
  
  val handlerProvider: js.UndefOr[HandlerProvider | Null] = js.native
  
  val isServer: js.UndefOr[Boolean] = js.native
  
  val log: js.UndefOr[LogFunction | Null] = js.native
  
  val missingFieldHandlers: js.UndefOr[js.Array[MissingFieldHandler] | Null] = js.native
  
  val network: Network = js.native
  
  val operationLoader: js.UndefOr[OperationLoader | Null] = js.native
  
  val operationTracker: js.UndefOr[OperationTracker | Null] = js.native
  
  val options: js.UndefOr[js.Any] = js.native
  
  val requiredFieldLogger: js.UndefOr[RequiredFieldLogger | Null] = js.native
  
  val scheduler: js.UndefOr[TaskScheduler | Null] = js.native
  
  val store: Store = js.native
  
  val treatMissingFieldsAsNull: js.UndefOr[Boolean] = js.native
}
object EnvironmentConfig {
  
  @scala.inline
  def apply(network: Network, store: Store): EnvironmentConfig = {
    val __obj = js.Dynamic.literal(network = network.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentConfig]
  }
  
  @scala.inline
  implicit class EnvironmentConfigOps[Self <: EnvironmentConfig] (val x: Self) extends AnyVal {
    
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
    def setNetwork(value: Network): Self = this.set("network", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStore(value: Store): Self = this.set("store", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigName(value: String): Self = this.set("configName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigName: Self = this.set("configName", js.undefined)
    
    @scala.inline
    def setHandlerProvider(value: /* handle */ String => js.Any): Self = this.set("handlerProvider", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHandlerProvider: Self = this.set("handlerProvider", js.undefined)
    
    @scala.inline
    def setHandlerProviderNull: Self = this.set("handlerProvider", null)
    
    @scala.inline
    def setIsServer(value: Boolean): Self = this.set("isServer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsServer: Self = this.set("isServer", js.undefined)
    
    @scala.inline
    def setLog(value: /* logEvent */ LogEvent => Unit): Self = this.set("log", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteLog: Self = this.set("log", js.undefined)
    
    @scala.inline
    def setLogNull: Self = this.set("log", null)
    
    @scala.inline
    def setMissingFieldHandlersVarargs(value: MissingFieldHandler*): Self = this.set("missingFieldHandlers", js.Array(value :_*))
    
    @scala.inline
    def setMissingFieldHandlers(value: js.Array[MissingFieldHandler]): Self = this.set("missingFieldHandlers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMissingFieldHandlers: Self = this.set("missingFieldHandlers", js.undefined)
    
    @scala.inline
    def setMissingFieldHandlersNull: Self = this.set("missingFieldHandlers", null)
    
    @scala.inline
    def setOperationLoader(value: OperationLoader): Self = this.set("operationLoader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperationLoader: Self = this.set("operationLoader", js.undefined)
    
    @scala.inline
    def setOperationLoaderNull: Self = this.set("operationLoader", null)
    
    @scala.inline
    def setOperationTracker(value: OperationTracker): Self = this.set("operationTracker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperationTracker: Self = this.set("operationTracker", js.undefined)
    
    @scala.inline
    def setOperationTrackerNull: Self = this.set("operationTracker", null)
    
    @scala.inline
    def setOptions(value: js.Any): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setRequiredFieldLogger(value: /* arg */ Readonlykindmissingfieldl | Readonlykindmissingfieldt => Unit): Self = this.set("requiredFieldLogger", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRequiredFieldLogger: Self = this.set("requiredFieldLogger", js.undefined)
    
    @scala.inline
    def setRequiredFieldLoggerNull: Self = this.set("requiredFieldLogger", null)
    
    @scala.inline
    def setScheduler(value: TaskScheduler): Self = this.set("scheduler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScheduler: Self = this.set("scheduler", js.undefined)
    
    @scala.inline
    def setSchedulerNull: Self = this.set("scheduler", null)
    
    @scala.inline
    def setTreatMissingFieldsAsNull(value: Boolean): Self = this.set("treatMissingFieldsAsNull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTreatMissingFieldsAsNull: Self = this.set("treatMissingFieldsAsNull", js.undefined)
  }
}
