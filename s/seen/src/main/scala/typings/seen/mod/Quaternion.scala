package typings.seen.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("seen", "Quaternion")
@js.native
class Quaternion () extends StObject {
  
  def multiply(q: Point): this.type = js.native
  
  var q: Point = js.native
  
  def toMatrix(): Matrix = js.native
}
/* static members */
object Quaternion {
  
  @JSImport("seen", "Quaternion")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("seen", "Quaternion.axisAngle")
  @js.native
  def axisAngle(x: Double, y: Double, z: Double, angleRads: Double): Quaternion = js.native
  
  @JSImport("seen", "Quaternion.pixelsPerRadian")
  @js.native
  def pixelsPerRadian: Double = js.native
  @scala.inline
  def pixelsPerRadian_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pixelsPerRadian")(x.asInstanceOf[js.Any])
  
  @JSImport("seen", "Quaternion.pointAngle")
  @js.native
  def pointAngle(p: Point, angleRads: Double): Quaternion = js.native
  
  @JSImport("seen", "Quaternion.xyToTransform")
  @js.native
  def xyToTransform(x: Double, y: Double): Matrix = js.native
}
