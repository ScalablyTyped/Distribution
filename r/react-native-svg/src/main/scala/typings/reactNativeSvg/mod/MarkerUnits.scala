package typings.reactNativeSvg.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MarkerUnits extends StObject
@JSImport("react-native-svg", "MarkerUnits")
@js.native
object MarkerUnits extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[MarkerUnits with String] = js.native
  
  @js.native
  sealed trait STROKE_WIDTH extends MarkerUnits
  /* "strokeWidth" */ val STROKE_WIDTH: typings.reactNativeSvg.mod.MarkerUnits.STROKE_WIDTH with String = js.native
  
  @js.native
  sealed trait USER_SPACE_ON_USE extends MarkerUnits
  /* "userSpaceOnUse" */ val USER_SPACE_ON_USE: typings.reactNativeSvg.mod.MarkerUnits.USER_SPACE_ON_USE with String = js.native
}
