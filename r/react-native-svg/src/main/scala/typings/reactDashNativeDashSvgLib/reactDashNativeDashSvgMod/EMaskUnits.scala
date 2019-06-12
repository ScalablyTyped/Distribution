package typings
package reactDashNativeDashSvgLib.reactDashNativeDashSvgMod

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
    extends reactDashNativeDashSvgLib.reactDashNativeDashSvgMod.EMaskUnits
       with reactDashNativeDashSvgLib.reactDashNativeDashSvgMod.TMaskUnits
  
  @js.native
  sealed trait USER_SPACE_ON_USE
    extends reactDashNativeDashSvgLib.reactDashNativeDashSvgMod.EMaskUnits
       with reactDashNativeDashSvgLib.reactDashNativeDashSvgMod.TMaskUnits
  
  /* "objectBoundingBox" */ val OBJECT_BOUNDING_BOX: OBJECT_BOUNDING_BOX with java.lang.String = js.native
  /* "userSpaceOnUse" */ val USER_SPACE_ON_USE: USER_SPACE_ON_USE with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    reactDashNativeDashSvgLib.reactDashNativeDashSvgMod.EMaskUnits with java.lang.String
  ] = js.native
}

