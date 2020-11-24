package typings.reactNativeCommunityCliServerApi

import typings.reactNativeCommunityCliServerApi.anon.Broadcast
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-native-community/cli-server-api/build/websocket/messageSocketServer", JSImport.Namespace)
@js.native
object messageSocketServerMod extends js.Object {
  
  @js.native
  object default extends js.Object {
    
    var attachToServer: js.Function2[/* server */ Server, /* path */ String, Broadcast] = js.native
    
    var parseMessage: js.Function2[/* data */ String, /* binary */ js.Any, _] = js.native
  }
  
  type Server = typings.node.httpMod.Server | typings.node.httpsMod.Server
}
