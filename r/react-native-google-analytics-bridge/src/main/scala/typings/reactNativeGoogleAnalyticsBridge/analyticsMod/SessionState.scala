package typings.reactNativeGoogleAnalyticsBridge.analyticsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SessionState extends js.Object
@JSImport("react-native-google-analytics-bridge/dist/models/Analytics", "SessionState")
@js.native
object SessionState extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SessionState with String] = js.native
  
  @js.native
  sealed trait End extends SessionState
  /* "end" */ @js.native
  object End extends TopLevel[End with String]
  
  @js.native
  sealed trait Start extends SessionState
  /* "start" */ @js.native
  object Start extends TopLevel[Start with String]
}
