package typings.reactNativeCommunityCliDebuggerUi

import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.serveStatic.mod.RequestHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildMiddlewareMod {
  
  @JSImport("@react-native-community/cli-debugger-ui/build/middleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def debuggerUIMiddleware(): RequestHandler[ServerResponse[IncomingMessage]] = ^.asInstanceOf[js.Dynamic].applyDynamic("debuggerUIMiddleware")().asInstanceOf[RequestHandler[ServerResponse[IncomingMessage]]]
}
