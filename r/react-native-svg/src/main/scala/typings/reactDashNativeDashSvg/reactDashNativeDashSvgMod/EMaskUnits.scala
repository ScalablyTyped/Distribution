package typings.reactDashNativeDashSvg.reactDashNativeDashSvgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EMaskUnits extends js.Object

@JSImport("react-native-svg", "EMaskUnits")
@js.native
object EMaskUnits extends js.Object {
  @js.native
  sealed trait OBJECT_BOUNDING_BOX
    extends EMaskUnits
       with TMaskUnits
  
  @js.native
  sealed trait USER_SPACE_ON_USE
    extends EMaskUnits
       with TMaskUnits
  
  /* "objectBoundingBox" */ val OBJECT_BOUNDING_BOX: typings.reactDashNativeDashSvg.reactDashNativeDashSvgMod.EMaskUnits.OBJECT_BOUNDING_BOX with String = js.native
  /* "userSpaceOnUse" */ val USER_SPACE_ON_USE: typings.reactDashNativeDashSvg.reactDashNativeDashSvgMod.EMaskUnits.USER_SPACE_ON_USE with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[EMaskUnits with String] = js.native
}

