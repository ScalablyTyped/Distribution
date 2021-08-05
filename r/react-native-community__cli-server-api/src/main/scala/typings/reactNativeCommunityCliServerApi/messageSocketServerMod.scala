package typings.reactNativeCommunityCliServerApi

import typings.reactNativeCommunityCliServerApi.anon.Broadcast
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageSocketServerMod {
  
  object default {
    
    @JSImport("@react-native-community/cli-server-api/build/websocket/messageSocketServer", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@react-native-community/cli-server-api/build/websocket/messageSocketServer", "default.attachToServer")
    @js.native
    def attachToServer: js.Function2[/* server */ Server, /* path */ String, Broadcast] = js.native
    inline def attachToServer_=(x: js.Function2[/* server */ Server, /* path */ String, Broadcast]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("attachToServer")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-native-community/cli-server-api/build/websocket/messageSocketServer", "default.parseMessage")
    @js.native
    def parseMessage: js.Function2[/* data */ String, /* binary */ js.Any, js.Any] = js.native
    inline def parseMessage_=(x: js.Function2[/* data */ String, /* binary */ js.Any, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parseMessage")(x.asInstanceOf[js.Any])
  }
  
  type Server = typings.node.httpMod.Server | typings.node.httpsMod.Server
}
