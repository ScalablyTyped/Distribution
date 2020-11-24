package typings.reactNativeCommunityCliServerApi

import typings.reactNativeCommunityCliServerApi.anon.ReportEvent
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-native-community/cli-server-api/build/websocket/eventsSocketServer", JSImport.Namespace)
@js.native
object eventsSocketServerMod extends js.Object {
  
  @js.native
  object default extends js.Object {
    
    var attachToServer: js.Function3[/* server */ Server, /* path */ String, /* messageSocket */ MessageSocket, ReportEvent] = js.native
  }
  
  type MessageSocket = ReturnType[
    js.Function3[
      /* server */ Server, 
      /* path */ String, 
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @react-native-community/cli-server-api.@react-native-community/cli-server-api/build/websocket/eventsSocketServer.MessageSocket */ /* messageSocket */ js.Object, 
      ReportEvent
    ]
  ]
  
  /**
    * The eventsSocket websocket listens at the 'events/` for websocket
    * connections, on which all Metro reports will be emitted.
    *
    * This is mostly useful for developer tools (clients) that wants to monitor Metro,
    * and the apps connected to Metro.
    *
    * The eventsSocket provides the following features:
    * - it reports any Metro event (that is reported through a reporter) to all clients
    * - it reports any console.log's (and friends) from the connected app to all clients
    *   (as client_log event)
    * - it allows connected clients to send commands through Metro to the connected app.
    *   This reuses the generic command mechanism.
    *   Two useful commands are 'reload' and 'devmenu'.
    */
  type Server = typings.node.httpMod.Server | typings.node.httpsMod.Server
}
