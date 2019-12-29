package typings.reactDashNativeDashGoogleDashAnalyticsDashBridge.distModelsAnalyticsMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SessionState with String] = js.native
  /* "end" */ @js.native
  object End extends TopLevel[End with String]
  
  /* "start" */ @js.native
  object Start extends TopLevel[Start with String]
  
}

