package typings.reduxStateSync

import typings.broadcastChannel.broadcastChannelMod.BroadcastChannelOptions
import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import typings.redux.mod.Middleware
import typings.redux.mod.Reducer
import typings.redux.mod.Store
import typings.std.BroadcastChannel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-state-sync", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createMessageListener(config: MessageListenerConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createMessageListener")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def createStateSyncMiddleware(): Middleware[js.Object, js.Any, Dispatch[AnyAction]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createStateSyncMiddleware")().asInstanceOf[Middleware[js.Object, js.Any, Dispatch[AnyAction]]]
  inline def createStateSyncMiddleware(config: Config): Middleware[js.Object, js.Any, Dispatch[AnyAction]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createStateSyncMiddleware")(config.asInstanceOf[js.Any]).asInstanceOf[Middleware[js.Object, js.Any, Dispatch[AnyAction]]]
  
  inline def generateUuidForAction(action: AnyAction): StampedAction = ^.asInstanceOf[js.Dynamic].applyDynamic("generateUuidForAction")(action.asInstanceOf[js.Any]).asInstanceOf[StampedAction]
  
  inline def initMessageListener(store: Store[js.Any, AnyAction]): Store[js.Any, AnyAction] = ^.asInstanceOf[js.Dynamic].applyDynamic("initMessageListener")(store.asInstanceOf[js.Any]).asInstanceOf[Store[js.Any, AnyAction]]
  
  inline def initStateWithPrevTab(store: Store[js.Any, AnyAction]): Store[js.Any, AnyAction] = ^.asInstanceOf[js.Dynamic].applyDynamic("initStateWithPrevTab")(store.asInstanceOf[js.Any]).asInstanceOf[Store[js.Any, AnyAction]]
  
  inline def isActionAllowed(config: Config): js.Function1[/* type */ String, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isActionAllowed")(config.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* type */ String, Boolean]]
  
  inline def isActionSynced(action: AnyAction): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isActionSynced")(action.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def withReduxStateSync(appReducer: Reducer[js.Any, AnyAction]): js.Function2[/* state */ js.Any, /* action */ AnyAction, Reducer[js.Any, AnyAction]] = ^.asInstanceOf[js.Dynamic].applyDynamic("withReduxStateSync")(appReducer.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* state */ js.Any, /* action */ AnyAction, Reducer[js.Any, AnyAction]]]
  inline def withReduxStateSync(
    appReducer: Reducer[js.Any, AnyAction],
    prepareInitialStateForStore: js.Function1[/* state */ js.Any, js.Any]
  ): js.Function2[/* state */ js.Any, /* action */ AnyAction, Reducer[js.Any, AnyAction]] = (^.asInstanceOf[js.Dynamic].applyDynamic("withReduxStateSync")(appReducer.asInstanceOf[js.Any], prepareInitialStateForStore.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* state */ js.Any, /* action */ AnyAction, Reducer[js.Any, AnyAction]]]
  
  trait Config extends StObject {
    
    var blacklist: js.UndefOr[js.Array[String]] = js.undefined
    
    var broadcastChannelOption: js.UndefOr[BroadcastChannelOptions] = js.undefined
    
    var channel: js.UndefOr[String] = js.undefined
    
    var predicate: js.UndefOr[js.Function1[/* action */ AnyAction, Boolean | Null]] = js.undefined
    
    var prepareState: js.UndefOr[js.Function1[/* state */ js.Any, js.Any]] = js.undefined
    
    var whitelist: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Config {
    
    inline def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setBlacklist(value: js.Array[String]): Self = StObject.set(x, "blacklist", value.asInstanceOf[js.Any])
      
      inline def setBlacklistUndefined: Self = StObject.set(x, "blacklist", js.undefined)
      
      inline def setBlacklistVarargs(value: String*): Self = StObject.set(x, "blacklist", js.Array(value :_*))
      
      inline def setBroadcastChannelOption(value: BroadcastChannelOptions): Self = StObject.set(x, "broadcastChannelOption", value.asInstanceOf[js.Any])
      
      inline def setBroadcastChannelOptionUndefined: Self = StObject.set(x, "broadcastChannelOption", js.undefined)
      
      inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
      
      inline def setPredicate(value: /* action */ AnyAction => Boolean | Null): Self = StObject.set(x, "predicate", js.Any.fromFunction1(value))
      
      inline def setPredicateUndefined: Self = StObject.set(x, "predicate", js.undefined)
      
      inline def setPrepareState(value: /* state */ js.Any => js.Any): Self = StObject.set(x, "prepareState", js.Any.fromFunction1(value))
      
      inline def setPrepareStateUndefined: Self = StObject.set(x, "prepareState", js.undefined)
      
      inline def setWhitelist(value: js.Array[String]): Self = StObject.set(x, "whitelist", value.asInstanceOf[js.Any])
      
      inline def setWhitelistUndefined: Self = StObject.set(x, "whitelist", js.undefined)
      
      inline def setWhitelistVarargs(value: String*): Self = StObject.set(x, "whitelist", js.Array(value :_*))
    }
  }
  
  @js.native
  trait MessageListenerConfig extends StObject {
    
    def allowed(action: AnyAction): Boolean = js.native
    
    var channel: BroadcastChannel = js.native
    
    def dispatch(action: AnyAction): Unit = js.native
    def dispatch(action: StampedAction): Unit = js.native
  }
  
  trait Stamp extends StObject {
    
    @JSName("$isSync")
    var $isSync: Boolean
    
    @JSName("$uuid")
    var $uuid: String
    
    @JSName("$wuid")
    var $wuid: String
  }
  object Stamp {
    
    inline def apply($isSync: Boolean, $uuid: String, $wuid: String): Stamp = {
      val __obj = js.Dynamic.literal($isSync = $isSync.asInstanceOf[js.Any], $uuid = $uuid.asInstanceOf[js.Any], $wuid = $wuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stamp]
    }
    
    extension [Self <: Stamp](x: Self) {
      
      inline def set$isSync(value: Boolean): Self = StObject.set(x, "$isSync", value.asInstanceOf[js.Any])
      
      inline def set$uuid(value: String): Self = StObject.set(x, "$uuid", value.asInstanceOf[js.Any])
      
      inline def set$wuid(value: String): Self = StObject.set(x, "$wuid", value.asInstanceOf[js.Any])
    }
  }
  
  trait StampedAction
    extends StObject
       with Stamp
       with AnyAction
  object StampedAction {
    
    inline def apply($isSync: Boolean, $uuid: String, $wuid: String, `type`: js.Any): StampedAction = {
      val __obj = js.Dynamic.literal($isSync = $isSync.asInstanceOf[js.Any], $uuid = $uuid.asInstanceOf[js.Any], $wuid = $wuid.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[StampedAction]
    }
  }
}
