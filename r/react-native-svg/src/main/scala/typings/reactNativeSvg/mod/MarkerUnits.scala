package typings.reactNativeSvg.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MarkerUnits extends js.Object
@JSImport("react-native-svg", "MarkerUnits")
@js.native
object MarkerUnits extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[MarkerUnits with String] = js.native
  
  @js.native
  sealed trait STROKE_WIDTH extends MarkerUnits
  /* "strokeWidth" */ @js.native
  object STROKE_WIDTH extends TopLevel[STROKE_WIDTH with String]
  
  @js.native
  sealed trait USER_SPACE_ON_USE extends MarkerUnits
  /* "userSpaceOnUse" */ @js.native
  object USER_SPACE_ON_USE extends TopLevel[USER_SPACE_ON_USE with String]
}
