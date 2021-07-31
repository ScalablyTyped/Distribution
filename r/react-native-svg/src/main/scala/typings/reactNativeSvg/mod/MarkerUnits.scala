package typings.reactNativeSvg.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MarkerUnits extends StObject
@JSImport("react-native-svg", "MarkerUnits")
@js.native
object MarkerUnits extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[MarkerUnits & String] = js.native
  
  @js.native
  sealed trait STROKE_WIDTH
    extends StObject
       with MarkerUnits
  /* "strokeWidth" */ val STROKE_WIDTH: typings.reactNativeSvg.mod.MarkerUnits.STROKE_WIDTH & String = js.native
  
  @js.native
  sealed trait USER_SPACE_ON_USE
    extends StObject
       with MarkerUnits
  /* "userSpaceOnUse" */ val USER_SPACE_ON_USE: typings.reactNativeSvg.mod.MarkerUnits.USER_SPACE_ON_USE & String = js.native
}
