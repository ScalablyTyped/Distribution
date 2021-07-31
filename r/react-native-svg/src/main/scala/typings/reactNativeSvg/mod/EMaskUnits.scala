package typings.reactNativeSvg.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EMaskUnits extends StObject
@JSImport("react-native-svg", "EMaskUnits")
@js.native
object EMaskUnits extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[EMaskUnits & String] = js.native
  
  @js.native
  sealed trait OBJECT_BOUNDING_BOX
    extends StObject
       with EMaskUnits
       with TMaskUnits
  /* "objectBoundingBox" */ val OBJECT_BOUNDING_BOX: typings.reactNativeSvg.mod.EMaskUnits.OBJECT_BOUNDING_BOX & String = js.native
  
  @js.native
  sealed trait USER_SPACE_ON_USE
    extends StObject
       with EMaskUnits
       with TMaskUnits
  /* "userSpaceOnUse" */ val USER_SPACE_ON_USE: typings.reactNativeSvg.mod.EMaskUnits.USER_SPACE_ON_USE & String = js.native
}
