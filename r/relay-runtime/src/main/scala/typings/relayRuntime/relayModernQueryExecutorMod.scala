package typings.relayRuntime

import org.scalablytyped.runtime.StringDictionary
import typings.relayRuntime.relayNetworkTypesMod.GraphQLResponse
import typings.relayRuntime.relayObservableMod.RelayObservable
import typings.relayRuntime.relayObservableMod.Sink
import typings.relayRuntime.relayResponseNormalizerMod.GetDataID
import typings.relayRuntime.relayStoreTypesMod.OperationDescriptor
import typings.relayRuntime.relayStoreTypesMod.OperationLoader
import typings.relayRuntime.relayStoreTypesMod.OperationTracker
import typings.relayRuntime.relayStoreTypesMod.OptimisticResponseConfig
import typings.relayRuntime.relayStoreTypesMod.PublishQueue
import typings.relayRuntime.relayStoreTypesMod.RecordSourceSelectorProxy
import typings.relayRuntime.relayStoreTypesMod.SelectorStoreUpdater
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relayModernQueryExecutorMod {
  
  trait ExecuteConfig extends StObject {
    
    def getDataID(fieldValue: StringDictionary[js.Any], typeName: String): js.Any
    @JSName("getDataID")
    var getDataID_Original: GetDataID
    
    var operation: OperationDescriptor
    
    var operationLoader: OperationLoader
    
    var operationTracker: js.UndefOr[OperationTracker] = js.undefined
    
    var optimisticConfig: OptimisticResponseConfig
    
    var publishQueue: PublishQueue
    
    var scheduler: js.UndefOr[TaskScheduler] = js.undefined
    
    var sink: Sink[GraphQLResponse]
    
    var source: RelayObservable[GraphQLResponse]
    
    var updater: js.UndefOr[SelectorStoreUpdater[js.Object]] = js.undefined
  }
  object ExecuteConfig {
    
    @scala.inline
    def apply(
      getDataID: (/* fieldValue */ StringDictionary[js.Any], /* typeName */ String) => js.Any,
      operation: OperationDescriptor,
      operationLoader: OperationLoader,
      optimisticConfig: OptimisticResponseConfig,
      publishQueue: PublishQueue,
      sink: Sink[GraphQLResponse],
      source: RelayObservable[GraphQLResponse]
    ): ExecuteConfig = {
      val __obj = js.Dynamic.literal(getDataID = js.Any.fromFunction2(getDataID), operation = operation.asInstanceOf[js.Any], operationLoader = operationLoader.asInstanceOf[js.Any], optimisticConfig = optimisticConfig.asInstanceOf[js.Any], publishQueue = publishQueue.asInstanceOf[js.Any], sink = sink.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExecuteConfig]
    }
    
    @scala.inline
    implicit class ExecuteConfigMutableBuilder[Self <: ExecuteConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetDataID(value: (/* fieldValue */ StringDictionary[js.Any], /* typeName */ String) => js.Any): Self = StObject.set(x, "getDataID", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOperation(value: OperationDescriptor): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperationLoader(value: OperationLoader): Self = StObject.set(x, "operationLoader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperationTracker(value: OperationTracker): Self = StObject.set(x, "operationTracker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperationTrackerUndefined: Self = StObject.set(x, "operationTracker", js.undefined)
      
      @scala.inline
      def setOptimisticConfig(value: OptimisticResponseConfig): Self = StObject.set(x, "optimisticConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublishQueue(value: PublishQueue): Self = StObject.set(x, "publishQueue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScheduler(value: TaskScheduler): Self = StObject.set(x, "scheduler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchedulerUndefined: Self = StObject.set(x, "scheduler", js.undefined)
      
      @scala.inline
      def setSink(value: Sink[GraphQLResponse]): Self = StObject.set(x, "sink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource(value: RelayObservable[GraphQLResponse]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdater(value: (/* store */ RecordSourceSelectorProxy[js.Object], js.Object) => Unit): Self = StObject.set(x, "updater", js.Any.fromFunction2(value))
      
      @scala.inline
      def setUpdaterUndefined: Self = StObject.set(x, "updater", js.undefined)
    }
  }
  
  trait TaskScheduler extends StObject {
    
    def cancel(id: String): Unit
    
    def schedule(fn: js.Function0[Unit]): String
  }
  object TaskScheduler {
    
    @scala.inline
    def apply(cancel: String => Unit, schedule: js.Function0[Unit] => String): TaskScheduler = {
      val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel), schedule = js.Any.fromFunction1(schedule))
      __obj.asInstanceOf[TaskScheduler]
    }
    
    @scala.inline
    implicit class TaskSchedulerMutableBuilder[Self <: TaskScheduler] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: String => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSchedule(value: js.Function0[Unit] => String): Self = StObject.set(x, "schedule", js.Any.fromFunction1(value))
    }
  }
}
