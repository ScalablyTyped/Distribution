package typings.reactNativeCommunityCliServerApi

import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.reactNativeCommunityCliServerApi.anon.AttachToServer
import typings.reactNativeCommunityCliServerApi.anon.Broadcast
import typings.reactNativeCommunityCliServerApi.anon.IncomingMessagerawBodystr
import typings.reactNativeCommunityCliServerApi.anon.IsDebuggerConnected
import typings.reactNativeCommunityCliServerApi.anon.ReportEvent
import typings.reactNativeCommunityCliServerApi.debuggerProxyServerMod.Server
import typings.reactNativeCommunityCliServerApi.devToolsMiddlewareMod.LaunchDevToolsOptions
import typings.reactNativeCommunityCliServerApi.eventsSocketServerMod.MessageSocket
import typings.reactNativeCommunityCliServerApi.openStackFrameInEditorMiddlewareMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-native-community/cli-server-api/build", "createDevServerMiddleware")
  @js.native
  def createDevServerMiddleware(options: MiddlewareOptions): AttachToServer = js.native
  
  object debuggerProxyServer {
    
    @JSImport("@react-native-community/cli-server-api/build", "debuggerProxyServer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@react-native-community/cli-server-api/build", "debuggerProxyServer.attachToServer")
    @js.native
    def attachToServer: js.Function2[/* server */ Server, /* path */ String, IsDebuggerConnected] = js.native
    @scala.inline
    def attachToServer_=(x: js.Function2[/* server */ Server, /* path */ String, IsDebuggerConnected]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("attachToServer")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@react-native-community/cli-server-api/build", "devToolsMiddleware")
  @js.native
  def devToolsMiddleware(options: LaunchDevToolsOptions, isDebuggerConnected: js.Function0[Boolean]): js.Function2[/* _req */ IncomingMessage, /* res */ ServerResponse, Unit] = js.native
  
  object eventsSocketServer {
    
    @JSImport("@react-native-community/cli-server-api/build", "eventsSocketServer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@react-native-community/cli-server-api/build", "eventsSocketServer.attachToServer")
    @js.native
    def attachToServer: js.Function3[
        /* server */ typings.reactNativeCommunityCliServerApi.eventsSocketServerMod.Server, 
        /* path */ String, 
        /* messageSocket */ MessageSocket, 
        ReportEvent
      ] = js.native
    @scala.inline
    def attachToServer_=(
      x: js.Function3[
          /* server */ typings.reactNativeCommunityCliServerApi.eventsSocketServerMod.Server, 
          /* path */ String, 
          /* messageSocket */ MessageSocket, 
          ReportEvent
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("attachToServer")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@react-native-community/cli-server-api/build", "indexPageMiddleware")
  @js.native
  def indexPageMiddleware(req: IncomingMessage, res: ServerResponse, next: js.Function1[/* err */ js.UndefOr[js.Any], Unit]): Unit = js.native
  
  object messageSocketServer {
    
    @JSImport("@react-native-community/cli-server-api/build", "messageSocketServer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@react-native-community/cli-server-api/build", "messageSocketServer.attachToServer")
    @js.native
    def attachToServer: js.Function2[
        /* server */ typings.reactNativeCommunityCliServerApi.messageSocketServerMod.Server, 
        /* path */ String, 
        Broadcast
      ] = js.native
    @scala.inline
    def attachToServer_=(
      x: js.Function2[
          /* server */ typings.reactNativeCommunityCliServerApi.messageSocketServerMod.Server, 
          /* path */ String, 
          Broadcast
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("attachToServer")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-native-community/cli-server-api/build", "messageSocketServer.parseMessage")
    @js.native
    def parseMessage: js.Function2[/* data */ String, /* binary */ js.Any, js.Any] = js.native
    @scala.inline
    def parseMessage_=(x: js.Function2[/* data */ String, /* binary */ js.Any, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parseMessage")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@react-native-community/cli-server-api/build", "openStackFrameInEditorMiddleware")
  @js.native
  def openStackFrameInEditorMiddleware(options: Options): typings.connect.mod.Server = js.native
  
  @JSImport("@react-native-community/cli-server-api/build", "openURLMiddleware")
  @js.native
  val openURLMiddleware: typings.connect.mod.Server = js.native
  
  @JSImport("@react-native-community/cli-server-api/build", "rawBodyMiddleware")
  @js.native
  def rawBodyMiddleware(req: IncomingMessage, _res: ServerResponse, next: js.Function1[/* err */ js.UndefOr[js.Any], Unit]): Unit = js.native
  
  @JSImport("@react-native-community/cli-server-api/build", "securityHeadersMiddleware")
  @js.native
  def securityHeadersMiddleware(req: IncomingMessage, res: ServerResponse, next: js.Function1[/* err */ js.UndefOr[js.Any], Unit]): Unit = js.native
  
  @JSImport("@react-native-community/cli-server-api/build", "statusPageMiddleware")
  @js.native
  def statusPageMiddleware(_req: IncomingMessage, res: ServerResponse): Unit = js.native
  
  @JSImport("@react-native-community/cli-server-api/build", "systraceProfileMiddleware")
  @js.native
  def systraceProfileMiddleware(req: IncomingMessagerawBodystr, res: ServerResponse): Unit = js.native
  
  @js.native
  trait MiddlewareOptions extends StObject {
    
    var host: js.UndefOr[String] = js.native
    
    var port: Double = js.native
    
    var watchFolders: js.Array[String] = js.native
  }
  object MiddlewareOptions {
    
    @scala.inline
    def apply(port: Double, watchFolders: js.Array[String]): MiddlewareOptions = {
      val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any], watchFolders = watchFolders.asInstanceOf[js.Any])
      __obj.asInstanceOf[MiddlewareOptions]
    }
    
    @scala.inline
    implicit class MiddlewareOptionsMutableBuilder[Self <: MiddlewareOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWatchFolders(value: js.Array[String]): Self = StObject.set(x, "watchFolders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWatchFoldersVarargs(value: String*): Self = StObject.set(x, "watchFolders", js.Array(value :_*))
    }
  }
}
