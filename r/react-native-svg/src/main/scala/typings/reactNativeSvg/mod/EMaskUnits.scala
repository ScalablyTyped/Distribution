package typings.reactNativeSvg.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EMaskUnits extends js.Object
@JSImport("react-native-svg", "EMaskUnits")
@js.native
object EMaskUnits extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[EMaskUnits with String] = js.native
  
  @js.native
  sealed trait OBJECT_BOUNDING_BOX
    extends EMaskUnits
       with TMaskUnits
  /* "objectBoundingBox" */ @js.native
  object OBJECT_BOUNDING_BOX extends TopLevel[OBJECT_BOUNDING_BOX with String]
  
  @js.native
  sealed trait USER_SPACE_ON_USE
    extends EMaskUnits
       with TMaskUnits
  /* "userSpaceOnUse" */ @js.native
  object USER_SPACE_ON_USE extends TopLevel[USER_SPACE_ON_USE with String]
}
