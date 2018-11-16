package typings
package reactDashNativeDashGoogleDashAnalyticsDashBridgeLib.distModelsAnalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SessionState extends js.Object

@JSImport("react-native-google-analytics-bridge/dist/models/Analytics", "SessionState")
@js.native
object SessionState extends js.Object {
  @js.native
  sealed trait End
    extends reactDashNativeDashGoogleDashAnalyticsDashBridgeLib.distModelsAnalyticsMod.SessionState
  
  @js.native
  sealed trait Start
    extends reactDashNativeDashGoogleDashAnalyticsDashBridgeLib.distModelsAnalyticsMod.SessionState
  
  /* "end" */ val End: End with java.lang.String = js.native
  /* "start" */ val Start: Start with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    reactDashNativeDashGoogleDashAnalyticsDashBridgeLib.distModelsAnalyticsMod.SessionState with java.lang.String
  ] = js.native
}

