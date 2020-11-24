package typings.reactNativeCommunityCliServerApi.mod

import typings.reactNativeCommunityCliServerApi.anon.ReportEvent
import typings.reactNativeCommunityCliServerApi.eventsSocketServerMod.MessageSocket
import typings.reactNativeCommunityCliServerApi.eventsSocketServerMod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-native-community/cli-server-api/build", "eventsSocketServer")
@js.native
object eventsSocketServer extends js.Object {
  
  var attachToServer: js.Function3[/* server */ Server, /* path */ String, /* messageSocket */ MessageSocket, ReportEvent] = js.native
}
