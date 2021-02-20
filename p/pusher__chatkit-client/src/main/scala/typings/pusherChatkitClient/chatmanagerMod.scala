package typings.pusherChatkitClient

import org.scalablytyped.runtime.Instantiable1
import typings.pusherChatkitClient.currentuserMod.CurrentUser
import typings.pusherChatkitClient.hooksMod.RoomHook
import typings.pusherChatkitClient.hooksMod.RoomParams
import typings.pusherChatkitClient.hooksMod.RoomUserHook
import typings.pusherChatkitClient.hooksMod.UserParams
import typings.pusherChatkitClient.hooksMod.UserPresenceHook
import typings.pusherChatkitClient.hooksMod.UserPresenceState
import typings.pusherChatkitClient.roomMod.PusherRoom
import typings.pusherChatkitClient.userMod.PusherUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chatmanagerMod {
  
  @js.native
  trait ChatManager extends StObject {
    
    def connect(): js.Promise[CurrentUser] = js.native
    def connect(hooks: GlobalHooks): js.Promise[CurrentUser] = js.native
    
    def disablePushNotifications(): js.Promise[Unit] = js.native
    
    def getRoom(params: RoomParams): js.Promise[PusherRoom] = js.native
    
    def getUser(params: UserParams): js.Promise[PusherUser] = js.native
  }
  @JSImport("@pusher/chatkit-client/chatmanager", "ChatManager")
  @js.native
  val ChatManager: ChatManagerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@pusher/chatkit-client/chatmanager", "ChatManager")
  @js.native
  class ChatManagerCls protected ()
    extends typings.pusherChatkitClient.chatmanagerMod.ChatManager {
    def this(args: ChatManagerConstructorArgs) = this()
  }
  
  @JSImport("@pusher/chatkit-client/chatmanager", "TokenProvider")
  @js.native
  val TokenProvider: TokenProviderConstructor = js.native
  
  @js.native
  trait ChatManagerConstructor
    extends Instantiable1[
          /* args */ ChatManagerConstructorArgs, 
          typings.pusherChatkitClient.chatmanagerMod.ChatManager
        ]
  
  @js.native
  trait ChatManagerConstructorArgs extends StObject {
    
    var connectionTimeout: js.UndefOr[Double] = js.native
    
    var instanceLocator: String = js.native
    
    var logger: js.UndefOr[Logger] = js.native
    
    var userId: String = js.native
  }
  object ChatManagerConstructorArgs {
    
    @scala.inline
    def apply(instanceLocator: String, userId: String): ChatManagerConstructorArgs = {
      val __obj = js.Dynamic.literal(instanceLocator = instanceLocator.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChatManagerConstructorArgs]
    }
    
    @scala.inline
    implicit class ChatManagerConstructorArgsMutableBuilder[Self <: ChatManagerConstructorArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConnectionTimeout(value: Double): Self = StObject.set(x, "connectionTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionTimeoutUndefined: Self = StObject.set(x, "connectionTimeout", js.undefined)
      
      @scala.inline
      def setInstanceLocator(value: String): Self = StObject.set(x, "instanceLocator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      @scala.inline
      def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GlobalHooks extends StObject {
    
    def onAddedToRoom(room: PusherRoom): Unit = js.native
    @JSName("onAddedToRoom")
    var onAddedToRoom_Original: RoomHook = js.native
    
    def onNewReadCursor(room: PusherRoom, user: PusherUser): Unit = js.native
    @JSName("onNewReadCursor")
    var onNewReadCursor_Original: RoomUserHook = js.native
    
    def onPresenceChanged(state: UserPresenceState, user: PusherUser): Unit = js.native
    @JSName("onPresenceChanged")
    var onPresenceChanged_Original: UserPresenceHook = js.native
    
    def onRemovedFromRoom(room: PusherRoom): Unit = js.native
    @JSName("onRemovedFromRoom")
    var onRemovedFromRoom_Original: RoomHook = js.native
    
    def onRoomDeleted(room: PusherRoom): Unit = js.native
    @JSName("onRoomDeleted")
    var onRoomDeleted_Original: RoomHook = js.native
    
    def onRoomUpdated(room: PusherRoom): Unit = js.native
    @JSName("onRoomUpdated")
    var onRoomUpdated_Original: RoomHook = js.native
    
    def onUserJoinedRoom(room: PusherRoom, user: PusherUser): Unit = js.native
    @JSName("onUserJoinedRoom")
    var onUserJoinedRoom_Original: RoomUserHook = js.native
    
    def onUserLeftRoom(room: PusherRoom, user: PusherUser): Unit = js.native
    @JSName("onUserLeftRoom")
    var onUserLeftRoom_Original: RoomUserHook = js.native
    
    def onUserStartedTyping(room: PusherRoom, user: PusherUser): Unit = js.native
    @JSName("onUserStartedTyping")
    var onUserStartedTyping_Original: RoomUserHook = js.native
    
    def onUserStoppedTyping(room: PusherRoom, user: PusherUser): Unit = js.native
    @JSName("onUserStoppedTyping")
    var onUserStoppedTyping_Original: RoomUserHook = js.native
  }
  
  @js.native
  trait Logger extends StObject {
    
    def debug(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: js.Any
    ): Unit = js.native
    @JSName("debug")
    var debug_Original: LoggerFunction = js.native
    
    def error(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: js.Any
    ): Unit = js.native
    @JSName("error")
    var error_Original: LoggerFunction = js.native
    
    def info(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: js.Any
    ): Unit = js.native
    @JSName("info")
    var info_Original: LoggerFunction = js.native
    
    def verbose(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: js.Any
    ): Unit = js.native
    @JSName("verbose")
    var verbose_Original: LoggerFunction = js.native
    
    def warn(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: js.Any
    ): Unit = js.native
    @JSName("warn")
    var warn_Original: LoggerFunction = js.native
  }
  
  type LoggerFunction = js.Function1[/* args */ js.Any, Unit]
  
  @js.native
  trait TokenProviderConstructor
    extends Instantiable1[/* args */ TokenProviderConstructorArgs, js.Object]
  
  @js.native
  trait TokenProviderConstructorArgs extends StObject {
    
    var headers: js.UndefOr[js.Any] = js.native
    
    var queryParams: js.UndefOr[js.Any] = js.native
    
    var url: String = js.native
    
    var withCredentials: js.UndefOr[Boolean] = js.native
  }
  object TokenProviderConstructorArgs {
    
    @scala.inline
    def apply(url: String): TokenProviderConstructorArgs = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenProviderConstructorArgs]
    }
    
    @scala.inline
    implicit class TokenProviderConstructorArgsMutableBuilder[Self <: TokenProviderConstructorArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setQueryParams(value: js.Any): Self = StObject.set(x, "queryParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryParamsUndefined: Self = StObject.set(x, "queryParams", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
    }
  }
}
