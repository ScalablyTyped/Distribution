package typings.reactNativeCommunityCliServerApi

import typings.reactNativeCommunityCliServerApi.anon.ReportEvent
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createEventsSocketEndpointMod {
  
  @JSImport("@react-native-community/cli-server-api/build/websocket/createEventsSocketEndpoint", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(broadcast: js.Function2[/* method */ String, /* params */ js.UndefOr[Record[String, Any]], Unit]): ReportEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(broadcast.asInstanceOf[js.Any]).asInstanceOf[ReportEvent]
}
