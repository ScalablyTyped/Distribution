package typings.reduxPersist

import org.scalablytyped.runtime.StringDictionary
import typings.redux.mod.StoreEnhancer
import typings.redux.mod.StoreEnhancerStoreCreator
import typings.reduxPersist.anon.Persist
import typings.reduxPersist.reduxPersistBooleans.`false`
import typings.reduxPersist.reduxPersistStrings.persistSlashREGISTER
import typings.reduxPersist.reduxPersistStrings.persistSlashREHYDRATE
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type MigrationManifest = StringDictionary[js.Function1[/* state */ PersistedState, PersistedState]]
  
  /**
    * @desc
    * `HSS` means HydratedSubState
    * `ESS` means EndSubState
    * `S` means State
    * `RS` means RawState
    */
  @js.native
  trait PersistConfig[S, RS, HSS, ESS] extends StObject {
    
    var blacklist: js.UndefOr[js.Array[String]] = js.native
    
    var debug: js.UndefOr[Boolean] = js.native
    
    /**
      * @desc Used for migrations.
      */
    var getStoredState: js.UndefOr[
        js.Function1[/* config */ PersistConfig[S, RS, HSS, ESS], js.Promise[PersistedState]]
      ] = js.native
    
    var key: String = js.native
    
    /**
      * @deprecated keyPrefix is going to be removed in v6.
      */
    var keyPrefix: js.UndefOr[String] = js.native
    
    var migrate: js.UndefOr[PersistMigrate] = js.native
    
    var serialize: js.UndefOr[Boolean] = js.native
    
    var stateReconciler: js.UndefOr[`false` | StateReconciler[S]] = js.native
    
    var storage: Storage = js.native
    
    var throttle: js.UndefOr[Double] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
    
    var transforms: js.UndefOr[js.Array[Transform[HSS, ESS, S, RS]]] = js.native
    
    var version: js.UndefOr[Double] = js.native
    
    var whitelist: js.UndefOr[js.Array[String]] = js.native
    
    var writeFailHandler: js.UndefOr[js.Function1[/* err */ Error, Unit]] = js.native
  }
  object PersistConfig {
    
    @scala.inline
    def apply[S, RS, HSS, ESS](key: String, storage: Storage): PersistConfig[S, RS, HSS, ESS] = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any])
      __obj.asInstanceOf[PersistConfig[S, RS, HSS, ESS]]
    }
    
    @scala.inline
    implicit class PersistConfigMutableBuilder[Self <: PersistConfig[_, _, _, _], S, RS, HSS, ESS] (val x: Self with (PersistConfig[S, RS, HSS, ESS])) extends AnyVal {
      
      @scala.inline
      def setBlacklist(value: js.Array[String]): Self = StObject.set(x, "blacklist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlacklistUndefined: Self = StObject.set(x, "blacklist", js.undefined)
      
      @scala.inline
      def setBlacklistVarargs(value: String*): Self = StObject.set(x, "blacklist", js.Array(value :_*))
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setGetStoredState(value: /* config */ PersistConfig[S, RS, HSS, ESS] => js.Promise[PersistedState]): Self = StObject.set(x, "getStoredState", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetStoredStateUndefined: Self = StObject.set(x, "getStoredState", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyPrefix(value: String): Self = StObject.set(x, "keyPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyPrefixUndefined: Self = StObject.set(x, "keyPrefix", js.undefined)
      
      @scala.inline
      def setMigrate(value: (/* state */ PersistedState, /* currentVersion */ Double) => js.Promise[PersistedState]): Self = StObject.set(x, "migrate", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMigrateUndefined: Self = StObject.set(x, "migrate", js.undefined)
      
      @scala.inline
      def setSerialize(value: Boolean): Self = StObject.set(x, "serialize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSerializeUndefined: Self = StObject.set(x, "serialize", js.undefined)
      
      @scala.inline
      def setStateReconciler(value: `false` | StateReconciler[S]): Self = StObject.set(x, "stateReconciler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateReconcilerFunction4(
        value: (/* inboundState */ js.Any, S, S, /* config */ PersistConfig[S, js.Any, js.Any, js.Any]) => S
      ): Self = StObject.set(x, "stateReconciler", js.Any.fromFunction4(value))
      
      @scala.inline
      def setStateReconcilerUndefined: Self = StObject.set(x, "stateReconciler", js.undefined)
      
      @scala.inline
      def setStorage(value: Storage): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrottle(value: Double): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrottleUndefined: Self = StObject.set(x, "throttle", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setTransforms(value: js.Array[Transform[HSS, ESS, S, RS]]): Self = StObject.set(x, "transforms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformsUndefined: Self = StObject.set(x, "transforms", js.undefined)
      
      @scala.inline
      def setTransformsVarargs(value: (Transform[HSS, ESS, S, RS])*): Self = StObject.set(x, "transforms", js.Array(value :_*))
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      
      @scala.inline
      def setWhitelist(value: js.Array[String]): Self = StObject.set(x, "whitelist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWhitelistUndefined: Self = StObject.set(x, "whitelist", js.undefined)
      
      @scala.inline
      def setWhitelistVarargs(value: String*): Self = StObject.set(x, "whitelist", js.Array(value :_*))
      
      @scala.inline
      def setWriteFailHandler(value: /* err */ Error => Unit): Self = StObject.set(x, "writeFailHandler", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWriteFailHandlerUndefined: Self = StObject.set(x, "writeFailHandler", js.undefined)
    }
  }
  
  type PersistMigrate = js.Function2[/* state */ PersistedState, /* currentVersion */ Double, js.Promise[PersistedState]]
  
  @js.native
  trait PersistState extends StObject {
    
    var rehydrated: Boolean = js.native
    
    var version: Double = js.native
  }
  object PersistState {
    
    @scala.inline
    def apply(rehydrated: Boolean, version: Double): PersistState = {
      val __obj = js.Dynamic.literal(rehydrated = rehydrated.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[PersistState]
    }
    
    @scala.inline
    implicit class PersistStateMutableBuilder[Self <: PersistState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRehydrated(value: Boolean): Self = StObject.set(x, "rehydrated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  type PersistedState = js.UndefOr[Persist]
  
  @js.native
  trait Persistoid extends StObject {
    
    def flush(): js.Promise[_] = js.native
    
    def update(state: js.Object): Unit = js.native
  }
  object Persistoid {
    
    @scala.inline
    def apply(flush: () => js.Promise[_], update: js.Object => Unit): Persistoid = {
      val __obj = js.Dynamic.literal(flush = js.Any.fromFunction0(flush), update = js.Any.fromFunction1(update))
      __obj.asInstanceOf[Persistoid]
    }
    
    @scala.inline
    implicit class PersistoidMutableBuilder[Self <: Persistoid] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFlush(value: () => js.Promise[_]): Self = StObject.set(x, "flush", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUpdate(value: js.Object => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * A persistor is a redux store unto itself, allowing you to purge stored state, flush all
    * pending state serialization and immediately write to disk
    */
  @js.native
  trait Persistor extends StObject {
    
    def dispatch(action: PersistorAction): PersistorAction = js.native
    
    def flush(): js.Promise[_] = js.native
    
    def getState(): PersistorState = js.native
    
    def pause(): Unit = js.native
    
    def persist(): Unit = js.native
    
    def purge(): js.Promise[_] = js.native
    
    def subscribe(callback: PersistorSubscribeCallback): js.Function0[_] = js.native
  }
  object Persistor {
    
    @scala.inline
    def apply(
      dispatch: PersistorAction => PersistorAction,
      flush: () => js.Promise[_],
      getState: () => PersistorState,
      pause: () => Unit,
      persist: () => Unit,
      purge: () => js.Promise[_],
      subscribe: PersistorSubscribeCallback => js.Function0[_]
    ): Persistor = {
      val __obj = js.Dynamic.literal(dispatch = js.Any.fromFunction1(dispatch), flush = js.Any.fromFunction0(flush), getState = js.Any.fromFunction0(getState), pause = js.Any.fromFunction0(pause), persist = js.Any.fromFunction0(persist), purge = js.Any.fromFunction0(purge), subscribe = js.Any.fromFunction1(subscribe))
      __obj.asInstanceOf[Persistor]
    }
    
    @scala.inline
    implicit class PersistorMutableBuilder[Self <: Persistor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDispatch(value: PersistorAction => PersistorAction): Self = StObject.set(x, "dispatch", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFlush(value: () => js.Promise[_]): Self = StObject.set(x, "flush", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetState(value: () => PersistorState): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPause(value: () => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPersist(value: () => Unit): Self = StObject.set(x, "persist", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPurge(value: () => js.Promise[_]): Self = StObject.set(x, "purge", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSubscribe(value: PersistorSubscribeCallback => js.Function0[_]): Self = StObject.set(x, "subscribe", js.Any.fromFunction1(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reduxPersist.typesMod.RehydrateAction
    - typings.reduxPersist.typesMod.RegisterAction
  */
  trait PersistorAction extends StObject
  object PersistorAction {
    
    @scala.inline
    def RegisterAction(key: String, `type`: persistSlashREGISTER): typings.reduxPersist.typesMod.RegisterAction = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reduxPersist.typesMod.RegisterAction]
    }
    
    @scala.inline
    def RehydrateAction(key: String, `type`: persistSlashREHYDRATE): typings.reduxPersist.typesMod.RehydrateAction = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reduxPersist.typesMod.RehydrateAction]
    }
  }
  
  @js.native
  trait PersistorOptions extends StObject {
    
    var enhancer: js.UndefOr[StoreEnhancer[_, js.Object]] = js.native
  }
  object PersistorOptions {
    
    @scala.inline
    def apply(): PersistorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PersistorOptions]
    }
    
    @scala.inline
    implicit class PersistorOptionsMutableBuilder[Self <: PersistorOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnhancer(
        value: /* next */ StoreEnhancerStoreCreator[js.Object, js.Object] => StoreEnhancerStoreCreator[_, js.Object]
      ): Self = StObject.set(x, "enhancer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEnhancerUndefined: Self = StObject.set(x, "enhancer", js.undefined)
    }
  }
  
  @js.native
  trait PersistorState extends StObject {
    
    var bootstrapped: Boolean = js.native
    
    var registry: js.Array[String] = js.native
  }
  object PersistorState {
    
    @scala.inline
    def apply(bootstrapped: Boolean, registry: js.Array[String]): PersistorState = {
      val __obj = js.Dynamic.literal(bootstrapped = bootstrapped.asInstanceOf[js.Any], registry = registry.asInstanceOf[js.Any])
      __obj.asInstanceOf[PersistorState]
    }
    
    @scala.inline
    implicit class PersistorStateMutableBuilder[Self <: PersistorState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBootstrapped(value: Boolean): Self = StObject.set(x, "bootstrapped", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegistry(value: js.Array[String]): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegistryVarargs(value: String*): Self = StObject.set(x, "registry", js.Array(value :_*))
    }
  }
  
  type PersistorSubscribeCallback = js.Function0[js.Any]
  
  @js.native
  trait RegisterAction extends PersistorAction {
    
    var key: String = js.native
    
    var `type`: persistSlashREGISTER = js.native
  }
  object RegisterAction {
    
    @scala.inline
    def apply(key: String, `type`: persistSlashREGISTER): RegisterAction = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RegisterAction]
    }
    
    @scala.inline
    implicit class RegisterActionMutableBuilder[Self <: RegisterAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: persistSlashREGISTER): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RehydrateAction extends PersistorAction {
    
    var err: js.UndefOr[RehydrateErrorType | Null] = js.native
    
    var key: String = js.native
    
    var payload: js.UndefOr[js.Object | Null] = js.native
    
    var `type`: persistSlashREHYDRATE = js.native
  }
  object RehydrateAction {
    
    @scala.inline
    def apply(key: String, `type`: persistSlashREHYDRATE): RehydrateAction = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RehydrateAction]
    }
    
    @scala.inline
    implicit class RehydrateActionMutableBuilder[Self <: RehydrateAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErr(value: RehydrateErrorType): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrNull: Self = StObject.set(x, "err", null)
      
      @scala.inline
      def setErrUndefined: Self = StObject.set(x, "err", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayload(value: js.Object): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayloadNull: Self = StObject.set(x, "payload", null)
      
      @scala.inline
      def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
      
      @scala.inline
      def setType(value: persistSlashREHYDRATE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type RehydrateErrorType = js.Any
  
  type StateReconciler[S] = js.Function4[
    /* inboundState */ js.Any, 
    /* state */ S, 
    /* reducedState */ S, 
    /* config */ PersistConfig[S, js.Any, js.Any, js.Any], 
    S
  ]
  
  @js.native
  trait Storage extends StObject {
    
    def getItem(key: String, args: js.Any*): js.Any = js.native
    
    def removeItem(key: String, args: js.Any*): js.Any = js.native
    
    def setItem(key: String, value: js.Any, args: js.Any*): js.Any = js.native
  }
  object Storage {
    
    @scala.inline
    def apply(
      getItem: (String, /* repeated */ js.Any) => js.Any,
      removeItem: (String, /* repeated */ js.Any) => js.Any,
      setItem: (String, js.Any, /* repeated */ js.Any) => js.Any
    ): Storage = {
      val __obj = js.Dynamic.literal(getItem = js.Any.fromFunction2(getItem), removeItem = js.Any.fromFunction2(removeItem), setItem = js.Any.fromFunction3(setItem))
      __obj.asInstanceOf[Storage]
    }
    
    @scala.inline
    implicit class StorageMutableBuilder[Self <: Storage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetItem(value: (String, /* repeated */ js.Any) => js.Any): Self = StObject.set(x, "getItem", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRemoveItem(value: (String, /* repeated */ js.Any) => js.Any): Self = StObject.set(x, "removeItem", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetItem(value: (String, js.Any, /* repeated */ js.Any) => js.Any): Self = StObject.set(x, "setItem", js.Any.fromFunction3(value))
    }
  }
  
  @js.native
  trait Transform[HSS, ESS, S, RS] extends StObject {
    
    var in: TransformInbound[HSS, ESS, S] = js.native
    
    var out: TransformOutbound[ESS, HSS, RS] = js.native
  }
  object Transform {
    
    @scala.inline
    def apply[HSS, ESS, S, RS](
      in: (HSS, /* keyof S */ /* key */ String, S) => ESS,
      out: (ESS, /* keyof RS */ /* key */ String, RS) => HSS
    ): Transform[HSS, ESS, S, RS] = {
      val __obj = js.Dynamic.literal(in = js.Any.fromFunction3(in), out = js.Any.fromFunction3(out))
      __obj.asInstanceOf[Transform[HSS, ESS, S, RS]]
    }
    
    @scala.inline
    implicit class TransformMutableBuilder[Self <: Transform[_, _, _, _], HSS, ESS, S, RS] (val x: Self with (Transform[HSS, ESS, S, RS])) extends AnyVal {
      
      @scala.inline
      def setIn(value: (HSS, /* keyof S */ /* key */ String, S) => ESS): Self = StObject.set(x, "in", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOut(value: (ESS, /* keyof RS */ /* key */ String, RS) => HSS): Self = StObject.set(x, "out", js.Any.fromFunction3(value))
    }
  }
  
  /**
    * @desc
    * `SS` means SubState
    * `ESS` means EndSubState
    * `S` means State
    */
  type TransformInbound[SS, ESS, S] = js.Function3[/* subState */ SS, /* keyof S */ /* key */ String, /* state */ S, ESS]
  
  /**
    * @desc
    * `SS` means SubState
    * `HSS` means HydratedSubState
    * `RS` means RawState
    */
  type TransformOutbound[SS, HSS, RS] = js.Function3[/* state */ SS, /* keyof RS */ /* key */ String, /* rawState */ RS, HSS]
  
  @js.native
  trait WebStorage extends Storage {
    
    /**
      * @desc Fetches key and returns item in a promise.
      */
    def getItem(key: String): js.Promise[String | Null] = js.native
    
    /**
      * @desc Removes value for key.
      */
    def removeItem(key: String): js.Promise[Unit] = js.native
    
    /**
      * @desc Sets value for key and returns item in a promise.
      */
    def setItem(key: String, item: String): js.Promise[Unit] = js.native
  }
  object WebStorage {
    
    @scala.inline
    def apply(
      getItem: String => js.Promise[String | Null],
      removeItem: String => js.Promise[Unit],
      setItem: (String, String) => js.Promise[Unit]
    ): WebStorage = {
      val __obj = js.Dynamic.literal(getItem = js.Any.fromFunction1(getItem), removeItem = js.Any.fromFunction1(removeItem), setItem = js.Any.fromFunction2(setItem))
      __obj.asInstanceOf[WebStorage]
    }
    
    @scala.inline
    implicit class WebStorageMutableBuilder[Self <: WebStorage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetItem(value: String => js.Promise[String | Null]): Self = StObject.set(x, "getItem", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveItem(value: String => js.Promise[Unit]): Self = StObject.set(x, "removeItem", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetItem(value: (String, String) => js.Promise[Unit]): Self = StObject.set(x, "setItem", js.Any.fromFunction2(value))
    }
  }
}
