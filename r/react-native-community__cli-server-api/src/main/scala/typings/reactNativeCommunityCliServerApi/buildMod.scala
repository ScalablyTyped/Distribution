package typings.reactNativeCommunityCliServerApi

import typings.connect.mod.Server
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.reactNativeCommunityCliServerApi.anon.DebuggerProxyEndpoint
import typings.reactNativeCommunityCliServerApi.anon.RawBody
import typings.reactNativeCommunityCliServerApi.buildDevToolsMiddlewareMod.LaunchDevToolsOptions
import typings.reactNativeCommunityCliServerApi.buildOpenStackFrameInEditorMiddlewareMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildMod {
  
  @JSImport("@react-native-community/cli-server-api/build", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createDevServerMiddleware(options: MiddlewareOptions): DebuggerProxyEndpoint = ^.asInstanceOf[js.Dynamic].applyDynamic("createDevServerMiddleware")(options.asInstanceOf[js.Any]).asInstanceOf[DebuggerProxyEndpoint]
  
  inline def devToolsMiddleware(options: LaunchDevToolsOptions, isDebuggerConnected: js.Function0[Boolean]): js.Function2[/* _req */ IncomingMessage, /* res */ ServerResponse[IncomingMessage], Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("devToolsMiddleware")(options.asInstanceOf[js.Any], isDebuggerConnected.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* _req */ IncomingMessage, /* res */ ServerResponse[IncomingMessage], Unit]]
  
  inline def indexPageMiddleware(
    req: IncomingMessage,
    res: ServerResponse[IncomingMessage],
    next: js.Function1[/* err */ js.UndefOr[Any], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("indexPageMiddleware")(req.asInstanceOf[js.Any], res.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def openStackFrameInEditorMiddleware(options: Options): Server = ^.asInstanceOf[js.Dynamic].applyDynamic("openStackFrameInEditorMiddleware")(options.asInstanceOf[js.Any]).asInstanceOf[Server]
  
  @JSImport("@react-native-community/cli-server-api/build", "openURLMiddleware")
  @js.native
  val openURLMiddleware: Server = js.native
  
  inline def rawBodyMiddleware(
    req: IncomingMessage,
    _res: ServerResponse[IncomingMessage],
    next: js.Function1[/* err */ js.UndefOr[Any], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rawBodyMiddleware")(req.asInstanceOf[js.Any], _res.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def securityHeadersMiddleware(
    req: IncomingMessage,
    res: ServerResponse[IncomingMessage],
    next: js.Function1[/* err */ js.UndefOr[Any], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("securityHeadersMiddleware")(req.asInstanceOf[js.Any], res.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def statusPageMiddleware(_req: IncomingMessage, res: ServerResponse[IncomingMessage]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("statusPageMiddleware")(_req.asInstanceOf[js.Any], res.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def systraceProfileMiddleware(req: IncomingMessage & RawBody, res: ServerResponse[IncomingMessage]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("systraceProfileMiddleware")(req.asInstanceOf[js.Any], res.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
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
      
      inline def setWatchFoldersVarargs(value: String*): Self = StObject.set(x, "watchFolders", js.Array(value*))
    }
  }
}
