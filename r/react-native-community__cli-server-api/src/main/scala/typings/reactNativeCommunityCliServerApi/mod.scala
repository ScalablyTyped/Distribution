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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-native-community/cli-server-api/build", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createDevServerMiddleware(options: MiddlewareOptions): AttachToServer = ^.asInstanceOf[js.Dynamic].applyDynamic("createDevServerMiddleware")(options.asInstanceOf[js.Any]).asInstanceOf[AttachToServer]
  
  object debuggerProxyServer {
    
    @JSImport("@react-native-community/cli-server-api/build", "debuggerProxyServer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@react-native-community/cli-server-api/build", "debuggerProxyServer.attachToServer")
    @js.native
    def attachToServer: js.Function2[/* server */ Server, /* path */ String, IsDebuggerConnected] = js.native
    inline def attachToServer_=(x: js.Function2[/* server */ Server, /* path */ String, IsDebuggerConnected]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("attachToServer")(x.asInstanceOf[js.Any])
  }
  
  inline def devToolsMiddleware(options: LaunchDevToolsOptions, isDebuggerConnected: js.Function0[Boolean]): js.Function2[/* _req */ IncomingMessage, /* res */ ServerResponse, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("devToolsMiddleware")(options.asInstanceOf[js.Any], isDebuggerConnected.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* _req */ IncomingMessage, /* res */ ServerResponse, Unit]]
  
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
    inline def attachToServer_=(
      x: js.Function3[
          /* server */ typings.reactNativeCommunityCliServerApi.eventsSocketServerMod.Server, 
          /* path */ String, 
          /* messageSocket */ MessageSocket, 
          ReportEvent
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("attachToServer")(x.asInstanceOf[js.Any])
  }
  
  inline def indexPageMiddleware(req: IncomingMessage, res: ServerResponse, next: js.Function1[/* err */ js.UndefOr[js.Any], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("indexPageMiddleware")(req.asInstanceOf[js.Any], res.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
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
    inline def attachToServer_=(
      x: js.Function2[
          /* server */ typings.reactNativeCommunityCliServerApi.messageSocketServerMod.Server, 
          /* path */ String, 
          Broadcast
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("attachToServer")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-native-community/cli-server-api/build", "messageSocketServer.parseMessage")
    @js.native
    def parseMessage: js.Function2[/* data */ String, /* binary */ js.Any, js.Any] = js.native
    inline def parseMessage_=(x: js.Function2[/* data */ String, /* binary */ js.Any, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parseMessage")(x.asInstanceOf[js.Any])
  }
  
  inline def openStackFrameInEditorMiddleware(options: Options): typings.connect.mod.Server = ^.asInstanceOf[js.Dynamic].applyDynamic("openStackFrameInEditorMiddleware")(options.asInstanceOf[js.Any]).asInstanceOf[typings.connect.mod.Server]
  
  @JSImport("@react-native-community/cli-server-api/build", "openURLMiddleware")
  @js.native
  val openURLMiddleware: typings.connect.mod.Server = js.native
  
  inline def rawBodyMiddleware(req: IncomingMessage, _res: ServerResponse, next: js.Function1[/* err */ js.UndefOr[js.Any], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rawBodyMiddleware")(req.asInstanceOf[js.Any], _res.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def securityHeadersMiddleware(req: IncomingMessage, res: ServerResponse, next: js.Function1[/* err */ js.UndefOr[js.Any], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("securityHeadersMiddleware")(req.asInstanceOf[js.Any], res.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def statusPageMiddleware(_req: IncomingMessage, res: ServerResponse): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("statusPageMiddleware")(_req.asInstanceOf[js.Any], res.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def systraceProfileMiddleware(req: IncomingMessagerawBodystr, res: ServerResponse): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("systraceProfileMiddleware")(req.asInstanceOf[js.Any], res.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait MiddlewareOptions extends StObject {
    
    var host: js.UndefOr[String] = js.undefined
    
    var port: Double
    
    var watchFolders: js.Array[String]
  }
  object MiddlewareOptions {
    
    inline def apply(port: Double, watchFolders: js.Array[String]): MiddlewareOptions = {
      val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any], watchFolders = watchFolders.asInstanceOf[js.Any])
      __obj.asInstanceOf[MiddlewareOptions]
    }
    
    extension [Self <: MiddlewareOptions](x: Self) {
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setWatchFolders(value: js.Array[String]): Self = StObject.set(x, "watchFolders", value.asInstanceOf[js.Any])
      
      inline def setWatchFoldersVarargs(value: String*): Self = StObject.set(x, "watchFolders", js.Array(value :_*))
    }
  }
}
