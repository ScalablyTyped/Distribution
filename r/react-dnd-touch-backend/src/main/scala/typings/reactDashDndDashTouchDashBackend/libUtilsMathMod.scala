package typings.reactDashDndDashTouchDashBackend

import typings.reactDashDndDashTouchDashBackend.libInterfacesMod.AngleRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd-touch-backend/lib/utils/math", JSImport.Namespace)
@js.native
object libUtilsMathMod extends js.Object {
  def distance(x1: Double, y1: Double, x2: Double, y2: Double): Double = js.native
  def inAngleRanges(x1: Double, y1: Double, x2: Double, y2: Double): Boolean = js.native
  def inAngleRanges(x1: Double, y1: Double, x2: Double, y2: Double, angleRanges: js.Array[AngleRange]): Boolean = js.native
}

