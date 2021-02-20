package typings.reactDndTouchBackend

import typings.reactDndTouchBackend.interfacesMod.AngleRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mathMod {
  
  @JSImport("react-dnd-touch-backend/lib/utils/math", "distance")
  @js.native
  def distance(x1: Double, y1: Double, x2: Double, y2: Double): Double = js.native
  
  @JSImport("react-dnd-touch-backend/lib/utils/math", "inAngleRanges")
  @js.native
  def inAngleRanges(x1: Double, y1: Double, x2: Double, y2: Double): Boolean = js.native
  @JSImport("react-dnd-touch-backend/lib/utils/math", "inAngleRanges")
  @js.native
  def inAngleRanges(x1: Double, y1: Double, x2: Double, y2: Double, angleRanges: js.Array[AngleRange]): Boolean = js.native
}
