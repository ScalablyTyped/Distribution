package typings.reactNativeCommunityCliServerApi.mod

import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.reactNativeCommunityCliServerApi.devToolsMiddlewareMod.LaunchDevToolsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-native-community/cli-server-api/build", "devToolsMiddleware")
@js.native
object devToolsMiddleware extends js.Object {
  
  def apply(options: LaunchDevToolsOptions, isDebuggerConnected: js.Function0[Boolean]): js.Function2[/* _req */ IncomingMessage, /* res */ ServerResponse, Unit] = js.native
}
