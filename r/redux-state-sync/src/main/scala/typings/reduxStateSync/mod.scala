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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-state-sync", "createMessageListener")
  @js.native
  def createMessageListener(config: MessageListenerConfig): Unit = js.native
  
  @JSImport("redux-state-sync", "createStateSyncMiddleware")
  @js.native
  def createStateSyncMiddleware(): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
  @JSImport("redux-state-sync", "createStateSyncMiddleware")
  @js.native
  def createStateSyncMiddleware(config: Config): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
  
  @JSImport("redux-state-sync", "generateUuidForAction")
  @js.native
  def generateUuidForAction(action: AnyAction): StampedAction = js.native
  
  @JSImport("redux-state-sync", "initMessageListener")
  @js.native
  def initMessageListener(store: Store[_, AnyAction]): Store[_, AnyAction] = js.native
  
  @JSImport("redux-state-sync", "initStateWithPrevTab")
  @js.native
  def initStateWithPrevTab(store: Store[_, AnyAction]): Store[_, AnyAction] = js.native
  
  @JSImport("redux-state-sync", "isActionAllowed")
  @js.native
  def isActionAllowed(config: Config): js.Function1[/* type */ String, Boolean] = js.native
  
  @JSImport("redux-state-sync", "isActionSynced")
  @js.native
  def isActionSynced(action: AnyAction): Boolean = js.native
  
  @JSImport("redux-state-sync", "withReduxStateSync")
  @js.native
  def withReduxStateSync(appReducer: Reducer[_, AnyAction]): js.Function2[/* state */ js.Any, /* action */ AnyAction, Reducer[_, AnyAction]] = js.native
  @JSImport("redux-state-sync", "withReduxStateSync")
  @js.native
  def withReduxStateSync(
    appReducer: Reducer[_, AnyAction],
    prepareInitialStateForStore: js.Function1[/* state */ js.Any, _]
  ): js.Function2[/* state */ js.Any, /* action */ AnyAction, Reducer[_, AnyAction]] = js.native
  
  @js.native
  trait Config extends StObject {
    
    var blacklist: js.UndefOr[js.Array[String]] = js.native
    
    var broadcastChannelOption: js.UndefOr[BroadcastChannelOptions] = js.native
    
    var channel: js.UndefOr[String] = js.native
    
    var predicate: js.UndefOr[js.Function1[/* action */ AnyAction, Boolean | Null]] = js.native
    
    var prepareState: js.UndefOr[js.Function1[/* state */ js.Any, _]] = js.native
    
    var whitelist: js.UndefOr[js.Array[String]] = js.native
  }
  object Config {
    
    @scala.inline
    def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlacklist(value: js.Array[String]): Self = StObject.set(x, "blacklist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlacklistUndefined: Self = StObject.set(x, "blacklist", js.undefined)
      
      @scala.inline
      def setBlacklistVarargs(value: String*): Self = StObject.set(x, "blacklist", js.Array(value :_*))
      
      @scala.inline
      def setBroadcastChannelOption(value: BroadcastChannelOptions): Self = StObject.set(x, "broadcastChannelOption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBroadcastChannelOptionUndefined: Self = StObject.set(x, "broadcastChannelOption", js.undefined)
      
      @scala.inline
      def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
      
      @scala.inline
      def setPredicate(value: /* action */ AnyAction => Boolean | Null): Self = StObject.set(x, "predicate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPredicateUndefined: Self = StObject.set(x, "predicate", js.undefined)
      
      @scala.inline
      def setPrepareState(value: /* state */ js.Any => _): Self = StObject.set(x, "prepareState", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPrepareStateUndefined: Self = StObject.set(x, "prepareState", js.undefined)
      
      @scala.inline
      def setWhitelist(value: js.Array[String]): Self = StObject.set(x, "whitelist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWhitelistUndefined: Self = StObject.set(x, "whitelist", js.undefined)
      
      @scala.inline
      def setWhitelistVarargs(value: String*): Self = StObject.set(x, "whitelist", js.Array(value :_*))
    }
  }
  
  @js.native
  trait MessageListenerConfig extends StObject {
    
    def allowed(action: AnyAction): Boolean = js.native
    
    var channel: BroadcastChannel = js.native
    
    def dispatch(action: AnyAction): Unit = js.native
    def dispatch(action: StampedAction): Unit = js.native
  }
  
  @js.native
  trait Stamp extends StObject {
    
    @JSName("$isSync")
    var $isSync: Boolean = js.native
    
    @JSName("$uuid")
    var $uuid: String = js.native
    
    @JSName("$wuid")
    var $wuid: String = js.native
  }
  object Stamp {
    
    @scala.inline
    def apply($isSync: Boolean, $uuid: String, $wuid: String): Stamp = {
      val __obj = js.Dynamic.literal($isSync = $isSync.asInstanceOf[js.Any], $uuid = $uuid.asInstanceOf[js.Any], $wuid = $wuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stamp]
    }
    
    @scala.inline
    implicit class StampMutableBuilder[Self <: Stamp] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$isSync(value: Boolean): Self = StObject.set(x, "$isSync", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$uuid(value: String): Self = StObject.set(x, "$uuid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$wuid(value: String): Self = StObject.set(x, "$wuid", value.asInstanceOf[js.Any])
    }
  }
  
  type StampedAction = Stamp with AnyAction
}
