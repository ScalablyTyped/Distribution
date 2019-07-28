package typings.reactDashNativeDashGoogleDashAnalyticsDashBridge.distModelsAnalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SessionState extends js.Object

@JSImport("react-native-google-analytics-bridge/dist/models/Analytics", "SessionState")
@js.native
object SessionState extends js.Object {
  @js.native
  sealed trait End extends SessionState
  
  @js.native
  sealed trait Start extends SessionState
  
  /* "end" */ val End: typings.reactDashNativeDashGoogleDashAnalyticsDashBridge.distModelsAnalyticsMod.SessionState.End with String = js.native
  /* "start" */ val Start: typings.reactDashNativeDashGoogleDashAnalyticsDashBridge.distModelsAnalyticsMod.SessionState.Start with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SessionState with String] = js.native
}

