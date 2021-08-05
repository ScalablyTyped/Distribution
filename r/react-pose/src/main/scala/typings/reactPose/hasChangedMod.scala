package typings.reactPose

import typings.reactPose.typesMod.CurrentPose
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hasChangedMod {
  
  @JSImport("react-pose/lib/utils/has-changed", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hasChanged(prev: CurrentPose, next: CurrentPose): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasChanged")(prev.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
