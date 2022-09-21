package typings.relayRuntime

import org.scalablytyped.runtime.StringDictionary
import typings.relayRuntime.actorIdentifierMod.ActorIdentifier
import typings.relayRuntime.anon.Operation
import typings.relayRuntime.anon.Readonlykindmissingfieldl
import typings.relayRuntime.anon.Readonlykindmissingfieldt
import typings.relayRuntime.anon.Readonlykindrelayresolver
import typings.relayRuntime.anon.Source
import typings.relayRuntime.anon.Updater
import typings.relayRuntime.commitMutationMod.MutationParameters
import typings.relayRuntime.multiActorEnvironmentTypesMod.ActorEnvironment
import typings.relayRuntime.multiActorEnvironmentTypesMod.MultiActorStoreUpdater
import typings.relayRuntime.relayDefaultHandlerProviderMod.HandlerProvider
import typings.relayRuntime.relayModernQueryExecutorMod.TaskScheduler
import typings.relayRuntime.relayNetworkTypesMod.GraphQLResponse
import typings.relayRuntime.relayNetworkTypesMod.Network
import typings.relayRuntime.relayNetworkTypesMod.PayloadData
import typings.relayRuntime.relayObservableMod.RelayObservable
import typings.relayRuntime.relayResponseNormalizerMod.GetDataID
import typings.relayRuntime.relayRuntimeTypesMod.Disposable
import typings.relayRuntime.relayRuntimeTypesMod.RenderPolicy
import typings.relayRuntime.relayStoreTypesMod.ExecuteMutationConfig
import typings.relayRuntime.relayStoreTypesMod.LogEvent
import typings.relayRuntime.relayStoreTypesMod.LogFunction
import typings.relayRuntime.relayStoreTypesMod.MissingFieldHandler
import typings.relayRuntime.relayStoreTypesMod.OperationAvailability
import typings.relayRuntime.relayStoreTypesMod.OperationDescriptor
import typings.relayRuntime.relayStoreTypesMod.OperationLoader
import typings.relayRuntime.relayStoreTypesMod.OptimisticResponseConfig
import typings.relayRuntime.relayStoreTypesMod.OptimisticUpdateFunction
import typings.relayRuntime.relayStoreTypesMod.RequiredFieldLogger
import typings.relayRuntime.relayStoreTypesMod.SingularReaderSelector
import typings.relayRuntime.relayStoreTypesMod.Snapshot
import typings.relayRuntime.relayStoreTypesMod.Store
import typings.relayRuntime.relayStoreTypesMod.StoreUpdater
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object multiActorEnvironmentMultiActorEnvironmentMod {
  
  @JSImport("relay-runtime/lib/multi-actor-environment/MultiActorEnvironment", "MultiActorEnvironment")
  @js.native
  open class MultiActorEnvironment protected ()
    extends StObject
       with typings.relayRuntime.multiActorEnvironmentTypesMod.MultiActorEnvironment {
    def this(config: MultiActorEnvironmentConfig) = this()
    
    /**
      * Apply an optimistic mutation response and/or updater. The mutation can be
      * reverted by calling `dispose()` on the returned value.
      */
    /* CompleteClass */
    override def applyMutation(actorEnvironment: ActorEnvironment, optimisticConfig: OptimisticResponseConfig[MutationParameters]): Disposable = js.native
    
    /**
      * Apply an optimistic update to the environment. The mutation can be reverted
      * by calling `dispose()` on the returned value.
      */
    /* CompleteClass */
    override def applyUpdate(actorEnvironment: ActorEnvironment, optimisticUpdate: OptimisticUpdateFunction): Disposable = js.native
    
    /**
      * Determine if the operation can be resolved with data in the store (i.e. no
      * fields are missing).
      *
      * Note that this operation effectively "executes" the selector against the
      * cache and therefore takes time proportional to the size/complexity of the
      * selector.
      */
    /* CompleteClass */
    override def check(actorEnvironment: ActorEnvironment, operation: OperationDescriptor): OperationAvailability = js.native
    
    /**
      * Commit store updates for each actor-specific environment known to MultActorEnvironment
      */
    /* CompleteClass */
    override def commitMultiActorUpdate(updater: MultiActorStoreUpdater): Unit = js.native
    
    /**
      * Commit a payload to the environment using the given operation selector.
      */
    /* CompleteClass */
    override def commitPayload(actorEnvironment: ActorEnvironment, operationDescriptor: OperationDescriptor, payload: PayloadData): Unit = js.native
    
    /**
      * Commit an updater to the environment. This mutation cannot be reverted and
      * should therefore not be used for optimistic updates. This is mainly
      * intended for updating fields from client schema extensions.
      */
    /* CompleteClass */
    override def commitUpdate(actorEnvironment: ActorEnvironment, updater: StoreUpdater): Unit = js.native
    
    /**
      * Send a query to the server with Observer semantics: one or more
      * responses may be returned (via `next`) over time followed by either
      * the request completing (`completed`) or an error (`error`).
      *
      * Note: Observables are lazy, so calling this method will do nothing until
      * the result is subscribed to: environment.execute({...}).subscribe({...}).
      */
    /* CompleteClass */
    override def execute(actorEnvironment: ActorEnvironment, config: Operation): RelayObservable[GraphQLResponse] = js.native
    
    /**
      * Returns an Observable of GraphQLResponse resulting from executing the
      * provided Mutation operation, the result of which is then normalized and
      * committed to the publish queue along with an optional optimistic response
      * or updater.
      *
      * Note: Observables are lazy, so calling this method will do nothing until
      * the result is subscribed to:
      * environment.executeMutation({...}).subscribe({...}).
      */
    /* CompleteClass */
    override def executeMutation(actorEnvironment: ActorEnvironment, config: ExecuteMutationConfig[MutationParameters]): RelayObservable[GraphQLResponse] = js.native
    
    /**
      * Send a subscription to the server with Observer semantics: one or more
      * responses may be returned (via `next`) over time followed by either
      * the request completing (`completed`) or an error (`error`).
      *
      * Networks/servers that support subscriptions may choose to hold the
      * subscription open indefinitely such that `complete` is not called.
      *
      * Note: Observables are lazy, so calling this method will do nothing until
      * the result is subscribed to: environment.executeSubscription({...}).subscribe({...}).
      */
    /* CompleteClass */
    override def executeSubscription(actorEnvironment: ActorEnvironment, config: Updater): RelayObservable[GraphQLResponse] = js.native
    
    /**
      * Returns an Observable of GraphQLResponse resulting from executing the
      * provided Query or Subscription operation responses, the result of which is
      * then normalized and committed to the publish queue.
      *
      * Note: Observables are lazy, so calling this method will do nothing until
      * the result is subscribed to:
      * environment.executeWithSource({...}).subscribe({...}).
      */
    /* CompleteClass */
    override def executeWithSource(actorEnvironment: ActorEnvironment, arg: Source): RelayObservable[GraphQLResponse] = js.native
    
    /**
      * A factory of actor-specific environments.
      */
    /* CompleteClass */
    override def forActor(actorIdentifier: ActorIdentifier): ActorEnvironment = js.native
    
    /**
      * Returns true if a request is currently "active", meaning it's currently
      * actively receiving payloads or downloading modules, and has not received
      * a final payload yet. Note that a request might still be pending (or "in flight")
      * without actively receiving payload, for example a live query or an
      * active GraphQL subscription
      */
    /* CompleteClass */
    override def isRequestActive(actorEnvironment: ActorEnvironment, requestIdentifier: String): Boolean = js.native
    
    /**
      * Returns `true` if execute in the server environment
      */
    /* CompleteClass */
    override def isServer(): Boolean = js.native
    
    /**
      * Read the results of a selector from in-memory records in the store.
      */
    /* CompleteClass */
    override def lookup(actorEnvironment: ActorEnvironment, selector: SingularReaderSelector): Snapshot = js.native
    
    /**
      * Revert updates for the `update` function, and apply the `replacement` update.
      */
    /* CompleteClass */
    override def replaceUpdate(
      actorEnvironment: ActorEnvironment,
      update: OptimisticUpdateFunction,
      replacement: OptimisticUpdateFunction
    ): Unit = js.native
    
    /**
      * Ensure that all the records necessary to fulfill the given selector are
      * retained in-memory. The records will not be eligible for garbage collection
      * until the returned reference is disposed.
      */
    /* CompleteClass */
    override def retain(actorEnvironment: ActorEnvironment, operation: OperationDescriptor): Disposable = js.native
    
    /**
      * Revert updates for the `update` function.
      */
    /* CompleteClass */
    override def revertUpdate(actorEnvironment: ActorEnvironment, update: OptimisticUpdateFunction): Unit = js.native
    
    /**
      * Subscribe to changes to the results of a selector. The callback is called
      * when data has been committed to the store that would cause the results of
      * the snapshot's selector to change.
      */
    /* CompleteClass */
    override def subscribe(
      actorEnvironment: ActorEnvironment,
      snapshot: Snapshot,
      callback: js.Function1[/* snapshot */ Snapshot, Unit]
    ): Disposable = js.native
  }
  
  /* Inlined std.Readonly<{  createConfigNameForActor :(actorIdentifier : relay-runtime.relay-runtime/lib/multi-actor-environment/ActorIdentifier.ActorIdentifier): string | null | undefined, createNetworkForActor (actorIdentifier : relay-runtime.relay-runtime/lib/multi-actor-environment/ActorIdentifier.ActorIdentifier): relay-runtime.relay-runtime/lib/network/RelayNetworkTypes.Network,   createStoreForActor :(actorIdentifier : relay-runtime.relay-runtime/lib/multi-actor-environment/ActorIdentifier.ActorIdentifier): relay-runtime.relay-runtime/lib/store/RelayStoreTypes.Store | null | undefined,   defaultRenderPolicy :relay-runtime.relay-runtime/lib/util/RelayRuntimeTypes.RenderPolicy | null | undefined,   getDataID :relay-runtime.relay-runtime/lib/store/RelayResponseNormalizer.GetDataID | undefined,   handlerProvider :relay-runtime.relay-runtime/lib/handlers/RelayDefaultHandlerProvider.HandlerProvider | undefined,   isServer :boolean | null | undefined,   logFn :relay-runtime.relay-runtime/lib/store/RelayStoreTypes.LogFunction | null | undefined,   missingFieldHandlers :std.ReadonlyArray<relay-runtime.relay-runtime/lib/store/RelayStoreTypes.MissingFieldHandler> | null | undefined,   operationLoader :relay-runtime.relay-runtime/lib/store/RelayStoreTypes.OperationLoader | null | undefined,   requiredFieldLogger :relay-runtime.relay-runtime/lib/store/RelayStoreTypes.RequiredFieldLogger | null | undefined,   scheduler :relay-runtime.relay-runtime/lib/store/RelayModernQueryExecutor.TaskScheduler | null | undefined,   shouldProcessClientComponents :boolean | null | undefined,   treatMissingFieldsAsNull :boolean | undefined}> */
  trait MultiActorEnvironmentConfig extends StObject {
    
    val createConfigNameForActor: js.UndefOr[(js.Function1[/* actorIdentifier */ ActorIdentifier, String]) | Null] = js.undefined
    
    def createNetworkForActor(actorIdentifier: ActorIdentifier): Network
    
    val createStoreForActor: js.UndefOr[(js.Function1[/* actorIdentifier */ ActorIdentifier, Store]) | Null] = js.undefined
    
    val defaultRenderPolicy: js.UndefOr[RenderPolicy | Null] = js.undefined
    
    val getDataID: js.UndefOr[GetDataID] = js.undefined
    
    val handlerProvider: js.UndefOr[HandlerProvider] = js.undefined
    
    val isServer: js.UndefOr[Boolean | Null] = js.undefined
    
    val logFn: js.UndefOr[LogFunction | Null] = js.undefined
    
    val missingFieldHandlers: js.UndefOr[js.Array[MissingFieldHandler] | Null] = js.undefined
    
    val operationLoader: js.UndefOr[OperationLoader | Null] = js.undefined
    
    val requiredFieldLogger: js.UndefOr[RequiredFieldLogger | Null] = js.undefined
    
    val scheduler: js.UndefOr[TaskScheduler | Null] = js.undefined
    
    val shouldProcessClientComponents: js.UndefOr[Boolean | Null] = js.undefined
    
    val treatMissingFieldsAsNull: js.UndefOr[Boolean] = js.undefined
  }
  object MultiActorEnvironmentConfig {
    
    inline def apply(createNetworkForActor: ActorIdentifier => Network): MultiActorEnvironmentConfig = {
      val __obj = js.Dynamic.literal(createNetworkForActor = js.Any.fromFunction1(createNetworkForActor))
      __obj.asInstanceOf[MultiActorEnvironmentConfig]
    }
    
    extension [Self <: MultiActorEnvironmentConfig](x: Self) {
      
      inline def setCreateConfigNameForActor(value: /* actorIdentifier */ ActorIdentifier => String): Self = StObject.set(x, "createConfigNameForActor", js.Any.fromFunction1(value))
      
      inline def setCreateConfigNameForActorNull: Self = StObject.set(x, "createConfigNameForActor", null)
      
      inline def setCreateConfigNameForActorUndefined: Self = StObject.set(x, "createConfigNameForActor", js.undefined)
      
      inline def setCreateNetworkForActor(value: ActorIdentifier => Network): Self = StObject.set(x, "createNetworkForActor", js.Any.fromFunction1(value))
      
      inline def setCreateStoreForActor(value: /* actorIdentifier */ ActorIdentifier => Store): Self = StObject.set(x, "createStoreForActor", js.Any.fromFunction1(value))
      
      inline def setCreateStoreForActorNull: Self = StObject.set(x, "createStoreForActor", null)
      
      inline def setCreateStoreForActorUndefined: Self = StObject.set(x, "createStoreForActor", js.undefined)
      
      inline def setDefaultRenderPolicy(value: RenderPolicy): Self = StObject.set(x, "defaultRenderPolicy", value.asInstanceOf[js.Any])
      
      inline def setDefaultRenderPolicyNull: Self = StObject.set(x, "defaultRenderPolicy", null)
      
      inline def setDefaultRenderPolicyUndefined: Self = StObject.set(x, "defaultRenderPolicy", js.undefined)
      
      inline def setGetDataID(value: (/* fieldValue */ StringDictionary[Any], /* typeName */ String) => Any): Self = StObject.set(x, "getDataID", js.Any.fromFunction2(value))
      
      inline def setGetDataIDUndefined: Self = StObject.set(x, "getDataID", js.undefined)
      
      inline def setHandlerProvider(value: /* handle */ String => Any): Self = StObject.set(x, "handlerProvider", js.Any.fromFunction1(value))
      
      inline def setHandlerProviderUndefined: Self = StObject.set(x, "handlerProvider", js.undefined)
      
      inline def setIsServer(value: Boolean): Self = StObject.set(x, "isServer", value.asInstanceOf[js.Any])
      
      inline def setIsServerNull: Self = StObject.set(x, "isServer", null)
      
      inline def setIsServerUndefined: Self = StObject.set(x, "isServer", js.undefined)
      
      inline def setLogFn(value: /* logEvent */ LogEvent => Unit): Self = StObject.set(x, "logFn", js.Any.fromFunction1(value))
      
      inline def setLogFnNull: Self = StObject.set(x, "logFn", null)
      
      inline def setLogFnUndefined: Self = StObject.set(x, "logFn", js.undefined)
      
      inline def setMissingFieldHandlers(value: js.Array[MissingFieldHandler]): Self = StObject.set(x, "missingFieldHandlers", value.asInstanceOf[js.Any])
      
      inline def setMissingFieldHandlersNull: Self = StObject.set(x, "missingFieldHandlers", null)
      
      inline def setMissingFieldHandlersUndefined: Self = StObject.set(x, "missingFieldHandlers", js.undefined)
      
      inline def setMissingFieldHandlersVarargs(value: MissingFieldHandler*): Self = StObject.set(x, "missingFieldHandlers", js.Array(value*))
      
      inline def setOperationLoader(value: OperationLoader): Self = StObject.set(x, "operationLoader", value.asInstanceOf[js.Any])
      
      inline def setOperationLoaderNull: Self = StObject.set(x, "operationLoader", null)
      
      inline def setOperationLoaderUndefined: Self = StObject.set(x, "operationLoader", js.undefined)
      
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
      
      inline def setTreatMissingFieldsAsNull(value: Boolean): Self = StObject.set(x, "treatMissingFieldsAsNull", value.asInstanceOf[js.Any])
      
      inline def setTreatMissingFieldsAsNullUndefined: Self = StObject.set(x, "treatMissingFieldsAsNull", js.undefined)
    }
  }
}
