package typings.reactNativeCommunityCliServerApi

import typings.reactNativeCommunityCliServerApi.anon.IsDebuggerConnected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-native-community/cli-server-api/build/websocket/debuggerProxyServer", JSImport.Namespace)
@js.native
object debuggerProxyServerMod extends js.Object {
  
  @js.native
  object default extends js.Object {
    
    var attachToServer: js.Function2[/* server */ Server, /* path */ String, IsDebuggerConnected] = js.native
  }
  
  type Server = typings.node.httpMod.Server | typings.node.httpsMod.Server
}
