package typings.reactDashNativeDashSvg.reactDashNativeDashSvgMod

import org.scalablytyped.runtime.TopLevel
import typings.reactDashNativeDashSvg.reactDashNativeDashSvgMod.MarkerUnits.STROKE_WIDTH
import typings.reactDashNativeDashSvg.reactDashNativeDashSvgMod.MarkerUnits.USER_SPACE_ON_USE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MarkerUnits extends js.Object

@JSImport("react-native-svg", "MarkerUnits")
@js.native
object MarkerUnits extends js.Object {
  @js.native
  sealed trait STROKE_WIDTH extends MarkerUnits
  
  @js.native
  sealed trait USER_SPACE_ON_USE extends MarkerUnits
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[MarkerUnits with String] = js.native
  /* "strokeWidth" */ @js.native
  object STROKE_WIDTH extends TopLevel[STROKE_WIDTH with String]
  
  /* "userSpaceOnUse" */ @js.native
  object USER_SPACE_ON_USE extends TopLevel[USER_SPACE_ON_USE with String]
  
}

