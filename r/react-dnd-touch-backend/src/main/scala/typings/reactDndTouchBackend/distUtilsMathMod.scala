package typings.reactDndTouchBackend

import typings.reactDndTouchBackend.distInterfacesMod.AngleRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsMathMod {
  
  @JSImport("react-dnd-touch-backend/dist/utils/math", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def distance(x1: Double, y1: Double, x2: Double, y2: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def inAngleRanges(x1: Double, y1: Double, x2: Double, y2: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("inAngleRanges")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def inAngleRanges(x1: Double, y1: Double, x2: Double, y2: Double, angleRanges: js.Array[AngleRange]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("inAngleRanges")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], angleRanges.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
