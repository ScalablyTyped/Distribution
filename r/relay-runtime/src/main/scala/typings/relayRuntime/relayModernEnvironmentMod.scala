package typings.relayRuntime

import typings.relayRuntime.anon.Readonlykindmissingfieldl
import typings.relayRuntime.anon.Readonlykindmissingfieldt
import typings.relayRuntime.relayDefaultHandlerProviderMod.HandlerProvider
import typings.relayRuntime.relayModernQueryExecutorMod.TaskScheduler
import typings.relayRuntime.relayNetworkTypesMod.Network
import typings.relayRuntime.relayStoreTypesMod.Environment
import typings.relayRuntime.relayStoreTypesMod.LogEvent
import typings.relayRuntime.relayStoreTypesMod.LogFunction
import typings.relayRuntime.relayStoreTypesMod.MissingFieldHandler
import typings.relayRuntime.relayStoreTypesMod.OperationLoader
import typings.relayRuntime.relayStoreTypesMod.OperationTracker
import typings.relayRuntime.relayStoreTypesMod.OptimisticUpdateFunction
import typings.relayRuntime.relayStoreTypesMod.RequiredFieldLogger
import typings.relayRuntime.relayStoreTypesMod.Store
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relayModernEnvironmentMod {
  
  @JSImport("relay-runtime/lib/store/RelayModernEnvironment", JSImport.Default)
  @js.native
  class default protected () extends RelayModernEnvironment {
    def this(config: EnvironmentConfig) = this()
  }
  
  @js.native
  trait EnvironmentConfig extends StObject {
    
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
    implicit class EnvironmentConfigMutableBuilder[Self <: EnvironmentConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfigName(value: String): Self = StObject.set(x, "configName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigNameUndefined: Self = StObject.set(x, "configName", js.undefined)
      
      @scala.inline
      def setHandlerProvider(value: /* handle */ String => js.Any): Self = StObject.set(x, "handlerProvider", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHandlerProviderNull: Self = StObject.set(x, "handlerProvider", null)
      
      @scala.inline
      def setHandlerProviderUndefined: Self = StObject.set(x, "handlerProvider", js.undefined)
      
      @scala.inline
      def setIsServer(value: Boolean): Self = StObject.set(x, "isServer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsServerUndefined: Self = StObject.set(x, "isServer", js.undefined)
      
      @scala.inline
      def setLog(value: /* logEvent */ LogEvent => Unit): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLogNull: Self = StObject.set(x, "log", null)
      
      @scala.inline
      def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      @scala.inline
      def setMissingFieldHandlers(value: js.Array[MissingFieldHandler]): Self = StObject.set(x, "missingFieldHandlers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMissingFieldHandlersNull: Self = StObject.set(x, "missingFieldHandlers", null)
      
      @scala.inline
      def setMissingFieldHandlersUndefined: Self = StObject.set(x, "missingFieldHandlers", js.undefined)
      
      @scala.inline
      def setMissingFieldHandlersVarargs(value: MissingFieldHandler*): Self = StObject.set(x, "missingFieldHandlers", js.Array(value :_*))
      
      @scala.inline
      def setNetwork(value: Network): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperationLoader(value: OperationLoader): Self = StObject.set(x, "operationLoader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperationLoaderNull: Self = StObject.set(x, "operationLoader", null)
      
      @scala.inline
      def setOperationLoaderUndefined: Self = StObject.set(x, "operationLoader", js.undefined)
      
      @scala.inline
      def setOperationTracker(value: OperationTracker): Self = StObject.set(x, "operationTracker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperationTrackerNull: Self = StObject.set(x, "operationTracker", null)
      
      @scala.inline
      def setOperationTrackerUndefined: Self = StObject.set(x, "operationTracker", js.undefined)
      
      @scala.inline
      def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setRequiredFieldLogger(value: /* arg */ Readonlykindmissingfieldl | Readonlykindmissingfieldt => Unit): Self = StObject.set(x, "requiredFieldLogger", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRequiredFieldLoggerNull: Self = StObject.set(x, "requiredFieldLogger", null)
      
      @scala.inline
      def setRequiredFieldLoggerUndefined: Self = StObject.set(x, "requiredFieldLogger", js.undefined)
      
      @scala.inline
      def setScheduler(value: TaskScheduler): Self = StObject.set(x, "scheduler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchedulerNull: Self = StObject.set(x, "scheduler", null)
      
      @scala.inline
      def setSchedulerUndefined: Self = StObject.set(x, "scheduler", js.undefined)
      
      @scala.inline
      def setStore(value: Store): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreatMissingFieldsAsNull(value: Boolean): Self = StObject.set(x, "treatMissingFieldsAsNull", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreatMissingFieldsAsNullUndefined: Self = StObject.set(x, "treatMissingFieldsAsNull", js.undefined)
    }
  }
  
  @js.native
  trait RelayModernEnvironment extends Environment {
    
    var configName: js.UndefOr[String | Null] = js.native
    
    def isRequestActive(requestIdentifier: String): Boolean = js.native
    
    def isServer(): Boolean = js.native
    
    def replaceUpdate(update: OptimisticUpdateFunction, newUpdate: OptimisticUpdateFunction): Unit = js.native
    
    def revertUpdate(update: OptimisticUpdateFunction): Unit = js.native
  }
}
