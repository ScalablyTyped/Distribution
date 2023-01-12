package typings.relayRuntime

import typings.relayRuntime.anon.Operation
import typings.relayRuntime.anon.Source
import typings.relayRuntime.anon.Updater
import typings.relayRuntime.libMultiActorEnvironmentActorIdentifierMod.ActorIdentifier
import typings.relayRuntime.libMutationsCommitMutationMod.MutationParameters
import typings.relayRuntime.libNetworkRelayNetworkTypesMod.GraphQLResponse
import typings.relayRuntime.libNetworkRelayNetworkTypesMod.PayloadData
import typings.relayRuntime.libNetworkRelayObservableMod.RelayObservable
import typings.relayRuntime.libStoreRelayStoreTypesMod.Environment
import typings.relayRuntime.libStoreRelayStoreTypesMod.ExecuteMutationConfig
import typings.relayRuntime.libStoreRelayStoreTypesMod.OperationAvailability
import typings.relayRuntime.libStoreRelayStoreTypesMod.OperationDescriptor
import typings.relayRuntime.libStoreRelayStoreTypesMod.OptimisticResponseConfig
import typings.relayRuntime.libStoreRelayStoreTypesMod.OptimisticUpdateFunction
import typings.relayRuntime.libStoreRelayStoreTypesMod.RecordSourceProxy
import typings.relayRuntime.libStoreRelayStoreTypesMod.SingularReaderSelector
import typings.relayRuntime.libStoreRelayStoreTypesMod.Snapshot
import typings.relayRuntime.libStoreRelayStoreTypesMod.StoreUpdater
import typings.relayRuntime.libUtilRelayRuntimeTypesMod.Disposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMultiActorEnvironmentMultiActorEnvironmentTypesMod {
  
  @js.native
  trait ActorEnvironment
    extends StObject
       with Environment {
    
    /**
      * Identifier of the actor for the current active environment
      */
    val actorIdentifier: ActorIdentifier = js.native
    
    /**
      * Optional. A human-readable identifier of the environment.
      * This value should be visible in the dev tools.
      */
    val configName: String | Null = js.native
    
    /**
      * Reference to the main MultActorEnvironment that handles
      * the network execution/and responsible for network integration
      */
    val multActorEnvironment: MultiActorEnvironment = js.native
  }
  
  trait MultiActorEnvironment extends StObject {
    
    /**
      * Apply an optimistic mutation response and/or updater. The mutation can be
      * reverted by calling `dispose()` on the returned value.
      */
    def applyMutation(actorEnvironment: ActorEnvironment, optimisticConfig: OptimisticResponseConfig[MutationParameters]): Disposable
    
    /**
      * Apply an optimistic update to the environment. The mutation can be reverted
      * by calling `dispose()` on the returned value.
      */
    def applyUpdate(actorEnvironment: ActorEnvironment, optimisticUpdate: OptimisticUpdateFunction): Disposable
    
    /**
      * Determine if the operation can be resolved with data in the store (i.e. no
      * fields are missing).
      *
      * Note that this operation effectively "executes" the selector against the
      * cache and therefore takes time proportional to the size/complexity of the
      * selector.
      */
    def check(actorEnvironment: ActorEnvironment, operation: OperationDescriptor): OperationAvailability
    
    /**
      * Commit store updates for each actor-specific environment known to MultActorEnvironment
      */
    def commitMultiActorUpdate(updater: MultiActorStoreUpdater): Unit
    
    /**
      * Commit a payload to the environment using the given operation selector.
      */
    def commitPayload(actorEnvironment: ActorEnvironment, operationDescriptor: OperationDescriptor, payload: PayloadData): Unit
    
    /**
      * Commit an updater to the environment. This mutation cannot be reverted and
      * should therefore not be used for optimistic updates. This is mainly
      * intended for updating fields from client schema extensions.
      */
    def commitUpdate(actorEnvironment: ActorEnvironment, updater: StoreUpdater): Unit
    
    /**
      * Send a query to the server with Observer semantics: one or more
      * responses may be returned (via `next`) over time followed by either
      * the request completing (`completed`) or an error (`error`).
      *
      * Note: Observables are lazy, so calling this method will do nothing until
      * the result is subscribed to: environment.execute({...}).subscribe({...}).
      */
    def execute(actorEnvironment: ActorEnvironment, config: Operation): RelayObservable[GraphQLResponse]
    
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
    def executeMutation(actorEnvironment: ActorEnvironment, config: ExecuteMutationConfig[MutationParameters]): RelayObservable[GraphQLResponse]
    
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
    def executeSubscription(actorEnvironment: ActorEnvironment, config: Updater): RelayObservable[GraphQLResponse]
    
    /**
      * Returns an Observable of GraphQLResponse resulting from executing the
      * provided Query or Subscription operation responses, the result of which is
      * then normalized and committed to the publish queue.
      *
      * Note: Observables are lazy, so calling this method will do nothing until
      * the result is subscribed to:
      * environment.executeWithSource({...}).subscribe({...}).
      */
    def executeWithSource(actorEnvironment: ActorEnvironment, arg: Source): RelayObservable[GraphQLResponse]
    
    /**
      * A factory of actor-specific environments.
      */
    def forActor(actorIdentifier: ActorIdentifier): ActorEnvironment
    
    /**
      * Returns true if a request is currently "active", meaning it's currently
      * actively receiving payloads or downloading modules, and has not received
      * a final payload yet. Note that a request might still be pending (or "in flight")
      * without actively receiving payload, for example a live query or an
      * active GraphQL subscription
      */
    def isRequestActive(actorEnvironment: ActorEnvironment, requestIdentifier: String): Boolean
    
    /**
      * Returns `true` if execute in the server environment
      */
    def isServer(): Boolean
    
    /**
      * Read the results of a selector from in-memory records in the store.
      */
    def lookup(actorEnvironment: ActorEnvironment, selector: SingularReaderSelector): Snapshot
    
    /**
      * Revert updates for the `update` function, and apply the `replacement` update.
      */
    def replaceUpdate(
      actorEnvironment: ActorEnvironment,
      update: OptimisticUpdateFunction,
      replacement: OptimisticUpdateFunction
    ): Unit
    
    /**
      * Ensure that all the records necessary to fulfill the given selector are
      * retained in-memory. The records will not be eligible for garbage collection
      * until the returned reference is disposed.
      */
    def retain(actorEnvironment: ActorEnvironment, operation: OperationDescriptor): Disposable
    
    /**
      * Revert updates for the `update` function.
      */
    def revertUpdate(actorEnvironment: ActorEnvironment, update: OptimisticUpdateFunction): Unit
    
    /**
      * Subscribe to changes to the results of a selector. The callback is called
      * when data has been committed to the store that would cause the results of
      * the snapshot's selector to change.
      */
    def subscribe(
      actorEnvironment: ActorEnvironment,
      snapshot: Snapshot,
      callback: js.Function1[/* snapshot */ Snapshot, Unit]
    ): Disposable
  }
  object MultiActorEnvironment {
    
    inline def apply(
      applyMutation: (ActorEnvironment, OptimisticResponseConfig[MutationParameters]) => Disposable,
      applyUpdate: (ActorEnvironment, OptimisticUpdateFunction) => Disposable,
      check: (ActorEnvironment, OperationDescriptor) => OperationAvailability,
      commitMultiActorUpdate: MultiActorStoreUpdater => Unit,
      commitPayload: (ActorEnvironment, OperationDescriptor, PayloadData) => Unit,
      commitUpdate: (ActorEnvironment, StoreUpdater) => Unit,
      execute: (ActorEnvironment, Operation) => RelayObservable[GraphQLResponse],
      executeMutation: (ActorEnvironment, ExecuteMutationConfig[MutationParameters]) => RelayObservable[GraphQLResponse],
      executeSubscription: (ActorEnvironment, Updater) => RelayObservable[GraphQLResponse],
      executeWithSource: (ActorEnvironment, Source) => RelayObservable[GraphQLResponse],
      forActor: ActorIdentifier => ActorEnvironment,
      isRequestActive: (ActorEnvironment, String) => Boolean,
      isServer: () => Boolean,
      lookup: (ActorEnvironment, SingularReaderSelector) => Snapshot,
      replaceUpdate: (ActorEnvironment, OptimisticUpdateFunction, OptimisticUpdateFunction) => Unit,
      retain: (ActorEnvironment, OperationDescriptor) => Disposable,
      revertUpdate: (ActorEnvironment, OptimisticUpdateFunction) => Unit,
      subscribe: (ActorEnvironment, Snapshot, js.Function1[/* snapshot */ Snapshot, Unit]) => Disposable
    ): MultiActorEnvironment = {
      val __obj = js.Dynamic.literal(applyMutation = js.Any.fromFunction2(applyMutation), applyUpdate = js.Any.fromFunction2(applyUpdate), check = js.Any.fromFunction2(check), commitMultiActorUpdate = js.Any.fromFunction1(commitMultiActorUpdate), commitPayload = js.Any.fromFunction3(commitPayload), commitUpdate = js.Any.fromFunction2(commitUpdate), execute = js.Any.fromFunction2(execute), executeMutation = js.Any.fromFunction2(executeMutation), executeSubscription = js.Any.fromFunction2(executeSubscription), executeWithSource = js.Any.fromFunction2(executeWithSource), forActor = js.Any.fromFunction1(forActor), isRequestActive = js.Any.fromFunction2(isRequestActive), isServer = js.Any.fromFunction0(isServer), lookup = js.Any.fromFunction2(lookup), replaceUpdate = js.Any.fromFunction3(replaceUpdate), retain = js.Any.fromFunction2(retain), revertUpdate = js.Any.fromFunction2(revertUpdate), subscribe = js.Any.fromFunction3(subscribe))
      __obj.asInstanceOf[MultiActorEnvironment]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MultiActorEnvironment] (val x: Self) extends AnyVal {
      
      inline def setApplyMutation(value: (ActorEnvironment, OptimisticResponseConfig[MutationParameters]) => Disposable): Self = StObject.set(x, "applyMutation", js.Any.fromFunction2(value))
      
      inline def setApplyUpdate(value: (ActorEnvironment, OptimisticUpdateFunction) => Disposable): Self = StObject.set(x, "applyUpdate", js.Any.fromFunction2(value))
      
      inline def setCheck(value: (ActorEnvironment, OperationDescriptor) => OperationAvailability): Self = StObject.set(x, "check", js.Any.fromFunction2(value))
      
      inline def setCommitMultiActorUpdate(value: MultiActorStoreUpdater => Unit): Self = StObject.set(x, "commitMultiActorUpdate", js.Any.fromFunction1(value))
      
      inline def setCommitPayload(value: (ActorEnvironment, OperationDescriptor, PayloadData) => Unit): Self = StObject.set(x, "commitPayload", js.Any.fromFunction3(value))
      
      inline def setCommitUpdate(value: (ActorEnvironment, StoreUpdater) => Unit): Self = StObject.set(x, "commitUpdate", js.Any.fromFunction2(value))
      
      inline def setExecute(value: (ActorEnvironment, Operation) => RelayObservable[GraphQLResponse]): Self = StObject.set(x, "execute", js.Any.fromFunction2(value))
      
      inline def setExecuteMutation(
        value: (ActorEnvironment, ExecuteMutationConfig[MutationParameters]) => RelayObservable[GraphQLResponse]
      ): Self = StObject.set(x, "executeMutation", js.Any.fromFunction2(value))
      
      inline def setExecuteSubscription(value: (ActorEnvironment, Updater) => RelayObservable[GraphQLResponse]): Self = StObject.set(x, "executeSubscription", js.Any.fromFunction2(value))
      
      inline def setExecuteWithSource(value: (ActorEnvironment, Source) => RelayObservable[GraphQLResponse]): Self = StObject.set(x, "executeWithSource", js.Any.fromFunction2(value))
      
      inline def setForActor(value: ActorIdentifier => ActorEnvironment): Self = StObject.set(x, "forActor", js.Any.fromFunction1(value))
      
      inline def setIsRequestActive(value: (ActorEnvironment, String) => Boolean): Self = StObject.set(x, "isRequestActive", js.Any.fromFunction2(value))
      
      inline def setIsServer(value: () => Boolean): Self = StObject.set(x, "isServer", js.Any.fromFunction0(value))
      
      inline def setLookup(value: (ActorEnvironment, SingularReaderSelector) => Snapshot): Self = StObject.set(x, "lookup", js.Any.fromFunction2(value))
      
      inline def setReplaceUpdate(value: (ActorEnvironment, OptimisticUpdateFunction, OptimisticUpdateFunction) => Unit): Self = StObject.set(x, "replaceUpdate", js.Any.fromFunction3(value))
      
      inline def setRetain(value: (ActorEnvironment, OperationDescriptor) => Disposable): Self = StObject.set(x, "retain", js.Any.fromFunction2(value))
      
      inline def setRevertUpdate(value: (ActorEnvironment, OptimisticUpdateFunction) => Unit): Self = StObject.set(x, "revertUpdate", js.Any.fromFunction2(value))
      
      inline def setSubscribe(value: (ActorEnvironment, Snapshot, js.Function1[/* snapshot */ Snapshot, Unit]) => Disposable): Self = StObject.set(x, "subscribe", js.Any.fromFunction3(value))
    }
  }
  
  type MultiActorStoreUpdater = js.Function3[
    /* actorIdentifier */ ActorIdentifier, 
    /* environment */ ActorEnvironment, 
    /* store */ RecordSourceProxy, 
    Unit
  ]
}
