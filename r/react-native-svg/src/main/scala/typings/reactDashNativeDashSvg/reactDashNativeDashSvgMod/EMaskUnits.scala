package typings.reactDashNativeDashSvg.reactDashNativeDashSvgMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[EMaskUnits with String] = js.native
  /* "objectBoundingBox" */ @js.native
  object OBJECT_BOUNDING_BOX extends TopLevel[OBJECT_BOUNDING_BOX with String]
  
  /* "userSpaceOnUse" */ @js.native
  object USER_SPACE_ON_USE extends TopLevel[USER_SPACE_ON_USE with String]
  
}

