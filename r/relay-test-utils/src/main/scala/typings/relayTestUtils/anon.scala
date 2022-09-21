package typings.relayTestUtils

import org.scalablytyped.runtime.StringDictionary
import typings.relayRuntime.anon.Readonlykindmissingfieldl
import typings.relayRuntime.anon.Readonlykindmissingfieldt
import typings.relayRuntime.anon.Readonlykindrelayresolver
import typings.relayRuntime.relayDefaultHandlerProviderMod.HandlerProvider
import typings.relayRuntime.relayModernQueryExecutorMod.TaskScheduler
import typings.relayRuntime.relayNetworkTypesMod.Network
import typings.relayRuntime.relayResponseNormalizerMod.GetDataID
import typings.relayRuntime.relayRuntimeTypesMod.RenderPolicy
import typings.relayRuntime.relayStoreTypesMod.LogEvent
import typings.relayRuntime.relayStoreTypesMod.LogFunction
import typings.relayRuntime.relayStoreTypesMod.MissingFieldHandler
import typings.relayRuntime.relayStoreTypesMod.OperationLoader
import typings.relayRuntime.relayStoreTypesMod.OperationTracker
import typings.relayRuntime.relayStoreTypesMod.RequiredFieldLogger
import typings.relayRuntime.relayStoreTypesMod.Store
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait MockClientData extends StObject {
    
    var mockClientData: js.UndefOr[Boolean] = js.undefined
  }
  object MockClientData {
    
    inline def apply(): MockClientData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MockClientData]
    }
    
    extension [Self <: MockClientData](x: Self) {
      
      inline def setMockClientData(value: Boolean): Self = StObject.set(x, "mockClientData", value.asInstanceOf[js.Any])
      
      inline def setMockClientDataUndefined: Self = StObject.set(x, "mockClientData", js.undefined)
    }
  }
  
  /* Inlined std.Partial<relay-runtime.relay-runtime.EnvironmentConfig> */
  trait PartialEnvironmentConfig extends StObject {
    
    var UNSTABLE_defaultRenderPolicy: js.UndefOr[RenderPolicy | Null] = js.undefined
    
    var configName: js.UndefOr[String] = js.undefined
    
    var getDataID: js.UndefOr[GetDataID | Null] = js.undefined
    
    var handlerProvider: js.UndefOr[HandlerProvider | Null] = js.undefined
    
    var isServer: js.UndefOr[Boolean] = js.undefined
    
    var log: js.UndefOr[LogFunction | Null] = js.undefined
    
    var missingFieldHandlers: js.UndefOr[js.Array[MissingFieldHandler] | Null] = js.undefined
    
    var network: js.UndefOr[Network] = js.undefined
    
    var operationLoader: js.UndefOr[OperationLoader | Null] = js.undefined
    
    var operationTracker: js.UndefOr[OperationTracker | Null] = js.undefined
    
    var options: js.UndefOr[Any] = js.undefined
    
    var requiredFieldLogger: js.UndefOr[RequiredFieldLogger | Null] = js.undefined
    
    var scheduler: js.UndefOr[TaskScheduler | Null] = js.undefined
    
    var shouldProcessClientComponents: js.UndefOr[Boolean | Null] = js.undefined
    
    var store: js.UndefOr[Store] = js.undefined
    
    var treatMissingFieldsAsNull: js.UndefOr[Boolean] = js.undefined
  }
  object PartialEnvironmentConfig {
    
    inline def apply(): PartialEnvironmentConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialEnvironmentConfig]
    }
    
    extension [Self <: PartialEnvironmentConfig](x: Self) {
      
      inline def setConfigName(value: String): Self = StObject.set(x, "configName", value.asInstanceOf[js.Any])
      
      inline def setConfigNameUndefined: Self = StObject.set(x, "configName", js.undefined)
      
      inline def setGetDataID(value: (/* fieldValue */ StringDictionary[Any], /* typeName */ String) => Any): Self = StObject.set(x, "getDataID", js.Any.fromFunction2(value))
      
      inline def setGetDataIDNull: Self = StObject.set(x, "getDataID", null)
      
      inline def setGetDataIDUndefined: Self = StObject.set(x, "getDataID", js.undefined)
      
      inline def setHandlerProvider(value: /* handle */ String => Any): Self = StObject.set(x, "handlerProvider", js.Any.fromFunction1(value))
      
      inline def setHandlerProviderNull: Self = StObject.set(x, "handlerProvider", null)
      
      inline def setHandlerProviderUndefined: Self = StObject.set(x, "handlerProvider", js.undefined)
      
      inline def setIsServer(value: Boolean): Self = StObject.set(x, "isServer", value.asInstanceOf[js.Any])
      
      inline def setIsServerUndefined: Self = StObject.set(x, "isServer", js.undefined)
      
      inline def setLog(value: /* logEvent */ LogEvent => Unit): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
      
      inline def setLogNull: Self = StObject.set(x, "log", null)
      
      inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      inline def setMissingFieldHandlers(value: js.Array[MissingFieldHandler]): Self = StObject.set(x, "missingFieldHandlers", value.asInstanceOf[js.Any])
      
      inline def setMissingFieldHandlersNull: Self = StObject.set(x, "missingFieldHandlers", null)
      
      inline def setMissingFieldHandlersUndefined: Self = StObject.set(x, "missingFieldHandlers", js.undefined)
      
      inline def setMissingFieldHandlersVarargs(value: MissingFieldHandler*): Self = StObject.set(x, "missingFieldHandlers", js.Array(value*))
      
      inline def setNetwork(value: Network): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
      
      inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
      
      inline def setOperationLoader(value: OperationLoader): Self = StObject.set(x, "operationLoader", value.asInstanceOf[js.Any])
      
      inline def setOperationLoaderNull: Self = StObject.set(x, "operationLoader", null)
      
      inline def setOperationLoaderUndefined: Self = StObject.set(x, "operationLoader", js.undefined)
      
      inline def setOperationTracker(value: OperationTracker): Self = StObject.set(x, "operationTracker", value.asInstanceOf[js.Any])
      
      inline def setOperationTrackerNull: Self = StObject.set(x, "operationTracker", null)
      
      inline def setOperationTrackerUndefined: Self = StObject.set(x, "operationTracker", js.undefined)
      
      inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setRequiredFieldLogger(
        value: /* arg */ Readonlykindmissingfieldl | Readonlykindmissingfieldt | Readonlykindrelayresolver => Unit
      ): Self = StObject.set(x, "requiredFieldLogger", js.Any.fromFunction1(value))
      
      inline def setRequiredFieldLoggerNull: Self = StObject.set(x, "requiredFieldLogger", null)
      
      inline def setRequiredFieldLoggerUndefined: Self = StObject.set(x, "requiredFieldLogger", js.undefined)
      
      inline def setScheduler(value: TaskScheduler): Self = StObject.set(x, "scheduler", value.asInstanceOf[js.Any])
      
      inline def setSchedulerNull: Self = StObject.set(x, "scheduler", null)
      
      inline def setSchedulerUndefined: Self = StObject.set(x, "scheduler", js.undefined)
      
      inline def setShouldProcessClientComponents(value: Boolean): Self = StObject.set(x, "shouldProcessClientComponents", value.asInstanceOf[js.Any])
      
      inline def setShouldProcessClientComponentsNull: Self = StObject.set(x, "shouldProcessClientComponents", null)
      
      inline def setShouldProcessClientComponentsUndefined: Self = StObject.set(x, "shouldProcessClientComponents", js.undefined)
      
      inline def setStore(value: Store): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
      
      inline def setTreatMissingFieldsAsNull(value: Boolean): Self = StObject.set(x, "treatMissingFieldsAsNull", value.asInstanceOf[js.Any])
      
      inline def setTreatMissingFieldsAsNullUndefined: Self = StObject.set(x, "treatMissingFieldsAsNull", js.undefined)
      
      inline def setUNSTABLE_defaultRenderPolicy(value: RenderPolicy): Self = StObject.set(x, "UNSTABLE_defaultRenderPolicy", value.asInstanceOf[js.Any])
      
      inline def setUNSTABLE_defaultRenderPolicyNull: Self = StObject.set(x, "UNSTABLE_defaultRenderPolicy", null)
      
      inline def setUNSTABLE_defaultRenderPolicyUndefined: Self = StObject.set(x, "UNSTABLE_defaultRenderPolicy", js.undefined)
    }
  }
}
